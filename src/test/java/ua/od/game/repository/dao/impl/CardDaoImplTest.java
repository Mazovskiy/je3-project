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
        }
        if (!cards.isEmpty())
        assertTrue(true);
    }
}

