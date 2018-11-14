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

    private final String GET_CARD_LIST_QUERY = "SELECT * " +
            "FROM card_product JOIN card ON card_product.card_id = card.id " +
            "ORDER by card_id";

    public List<CardEntity> getAllCardList() {
        return SqlHelper.prepareStatement(GET_CARD_LIST_QUERY, statementForRoomList -> {
            ResultSet cardResultSet = statementForRoomList.executeQuery();
            List<CardEntity> card = new LinkedList<>();
            while (cardResultSet.next()) {
                Integer currentCardId = cardResultSet.getInt("card_id");
                card.add(new CardEntity() {{
                    setCardId(cardResultSet.getInt("card_id"));
                    setGroupId(cardResultSet.getInt("card_group_id"));
                    setName(cardResultSet.getString("name"));
                    setDescription(cardResultSet.getString("description"));
                    Map<Integer,Float> tempP1Buildings = new HashMap<>();
                    Map<Integer,Float> tempP2Buildings = new HashMap<>();
                    Map<Integer,Float> tempP1Resources = new HashMap<>();
                    Map<Integer,Float> tempP2Resources = new HashMap<>();
                    Map<Integer,Float> tempP1Upgrades = new HashMap<>();
                    Map<Integer,Float> tempP2Upgrades = new HashMap<>();
                    Map<Integer,Float> tempNecessaryBuildings = new HashMap<>();
                    Map<Integer,Float> tempNecessaryUpgrades = new HashMap<>();
                    while (currentCardId.equals(cardResultSet.getInt("card_id")) && cardResultSet.next()) {
                        cardResultSet.previous();
                        tempP1Buildings.put(cardResultSet.getInt("p1_building_id"),
                                cardResultSet.getFloat("p1_building_number"));
                        tempP2Buildings.put(cardResultSet.getInt("p2_building_id"),
                                cardResultSet.getFloat("p2_building_number"));
                        tempP1Resources.put(cardResultSet.getInt("p1_resource_id"),
                                cardResultSet.getFloat("p1_resource_number"));
                        tempP2Resources.put(cardResultSet.getInt("p2_resource_id"),
                                cardResultSet.getFloat("p2_resource_number"));
                        tempP1Upgrades.put(cardResultSet.getInt("p1_upgrade_id"),
                                cardResultSet.getFloat("p1_upgrade_number"));
                        tempP2Upgrades.put(cardResultSet.getInt("p2_upgrade_id"),
                                cardResultSet.getFloat("p2_upgrade_number"));
                        tempNecessaryBuildings.put(cardResultSet.getInt("necessary_building_id"),
                                cardResultSet.getFloat("necessary_building_number"));
                        tempNecessaryUpgrades.put(cardResultSet.getInt("necessary_upgrade_id"),
                                cardResultSet.getFloat("necessary_upgrade_number"));
                        cardResultSet.next();
                    }
                    cardResultSet.previous();
                    setP1Buildings(tempP1Buildings);
                    setP2Buildings(tempP2Buildings);
                    setP1Resources(tempP1Resources);
                    setP2Resources(tempP2Resources);
                    setP1Upgrades(tempP1Upgrades);
                    setP2Upgrades(tempP2Upgrades);
                    setNecessaryBuildings(tempNecessaryBuildings);
                    setNecessaryUpgrades(tempNecessaryUpgrades);
                    }});
            }
            return card;
        });
    }
}
