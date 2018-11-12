package ua.od.game.repository.dao.impl;

import ua.od.game.model.CardEntity;
import ua.od.game.repository.dao.CardDao;

import ua.od.game.repository.helper.SqlHelper;

import java.sql.ResultSet;
import java.util.*;

/**
 * @author by Mazovskiy Mihail
 */
public class CardDaoImpl implements CardDao {

    private final String GET_CARD_LIST_QUERY = new StringBuilder()
            .append("SELECT card_product.card_id, card_group_id, card.name, card.description, ")
                    .append("GROUP_CONCAT(DISTINCT card_product.p1_building_id) AS p1_building_id, ")
                    .append("GROUP_CONCAT(card_product.p1_building_number) AS p1_building_number, ")
                    .append("GROUP_CONCAT(DISTINCT card_product.p2_building_id) AS p2_building_id, ")
                    .append("GROUP_CONCAT(card_product.p2_building_number) AS p2_building_number, ")
                    .append("GROUP_CONCAT(DISTINCT card_product.p1_upgrade_id) AS p1_upgrade_id, ")
                    .append("GROUP_CONCAT(card_product.p1_upgrade_number) AS p1_upgrade_number, ")
                    .append("GROUP_CONCAT(DISTINCT card_product.p2_upgrade_id) AS p2_upgrade_id, ")
                    .append("GROUP_CONCAT(card_product.p2_upgrade_number) AS p2_upgrade_number, ")
                    .append("GROUP_CONCAT(DISTINCT card_product.p1_resource_id) AS p1_resource_id, ")
                    .append("GROUP_CONCAT(card_product.p1_resource_number) AS p1_resource_number, ")
                    .append("GROUP_CONCAT(DISTINCT card_product.p2_resource_id) AS p2_resource_id, ")
                    .append("GROUP_CONCAT( card_product.p2_resource_number) AS p2_resource_number, ")
                    .append("GROUP_CONCAT(DISTINCT card_product.necessary_building_id) AS necessary_building_id, ")
                    .append("GROUP_CONCAT(card_product.necessary_building_number) AS necessary_building_number, ")
                    .append("GROUP_CONCAT(DISTINCT card_product.necessary_upgrade_id) AS necessary_upgrade_id, ")
                    .append("GROUP_CONCAT(card_product.necessary_upgrade_number) AS necessary_upgrade_number ")
            .append("FROM card_product LEFT JOIN card ON card_product.card_id = card.id GROUP BY card_id")
            .toString();

    public List<CardEntity> getAllCardList() {
        return SqlHelper.prepareStatement(GET_CARD_LIST_QUERY, statementForRoomList -> {
            ResultSet cardResultSet = statementForRoomList.executeQuery();
            List<CardEntity> card = new LinkedList<>();
            while (cardResultSet.next()) {
                card.add(new CardEntity() {{
                    setCardId(cardResultSet.getInt("card_id"));
                    setGroupId(cardResultSet.getInt("card_group_id"));
                    setName(cardResultSet.getString("name"));
                    setDescription(cardResultSet.getString("description"));

                    String[] parsedP1BuildingId = cardResultSet.getString("p1_building_id").split(",");
                    String[] parsedP1BuildingNumber = cardResultSet.getString("p1_building_number").split(",");
                    setP1Buildings(parseToMap(parsedP1BuildingId, parsedP1BuildingNumber));
                }});
            }
            return card;
        });
    }

    private Map parseToMap(String[] parsedP1BuildingId, String[] parsedP1BuildingNumber) {
        Integer iterator = 0;
        Map<Integer, Float> map = new HashMap<>();
        while (iterator < parsedP1BuildingId.length) {
            map.put(Integer.parseInt(parsedP1BuildingId[iterator]),
                    Float.parseFloat(parsedP1BuildingNumber[iterator]));
        }
        return (map);
    }
}
