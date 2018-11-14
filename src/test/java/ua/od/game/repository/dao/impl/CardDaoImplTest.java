package ua.od.game.repository.dao.impl;


import org.junit.Before;
import org.junit.Test;
import ua.od.game.model.CardEntity;
import ua.od.game.repository.dao.DbTest;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * @author Mazovskiy Mihail
 */

public class CardDaoImplTest extends DbTest {
    CardDaoImpl cardDao;

    @Before
    public void init() {
        cardDao = new CardDaoImpl();
    }

    @Test
    public void getRoomListTest() {
        List<CardEntity> cards = cardDao.getAllCardList();
        for (int i = 0; i < cards.size(); i++) {
            System.out.print(cards.get(i).getCardId() + " ");
            System.out.print(cards.get(i).getGroupId() + " ");
            System.out.print(cards.get(i).getName() + " ");
            System.out.println(cards.get(i).getDescription()+ " ");
            System.out.print("P 1 Buildings: " + cards.get(i).getP1Buildings().keySet() + " ");
            System.out.println(cards.get(i).getP1Buildings().values() + " ");
            System.out.print("P 2 Buildings: " + cards.get(i).getP2Buildings().keySet() + " ");
            System.out.println(cards.get(i).getP2Buildings().values() + " ");
            System.out.print("P 1 Resources: " + cards.get(i).getP1Resources().keySet() + " ");
            System.out.println(cards.get(i).getP1Resources().values() + " ");
            System.out.print("P 1 Resources: " + cards.get(i).getP2Resources().keySet() + " ");
            System.out.println(cards.get(i).getP2Resources().values() + " ");
            System.out.print("P 1 Upgrades: " + cards.get(i).getP1Upgrades().keySet() + " ");
            System.out.println(cards.get(i).getP1Upgrades().values() + " ");
            System.out.print("P 2 Upgrades: " + cards.get(i).getP2Upgrades().keySet() + " ");
            System.out.println(cards.get(i).getP2Upgrades().values() + " ");
            System.out.print("Necessary Buildings: " + cards.get(i).getNecessaryBuildings().keySet() + " ");
            System.out.println(cards.get(i).getNecessaryBuildings().values() + " ");
            System.out.print("Necessary Upgrades: " + cards.get(i).getNecessaryUpgrades().keySet() + " ");
            System.out.println(cards.get(i).getNecessaryUpgrades().values() + " ");
            System.out.println();
        }
        if (!cards.isEmpty())
        assertTrue(true);
    }
}

