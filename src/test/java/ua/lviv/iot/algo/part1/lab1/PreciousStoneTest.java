package ua.lviv.iot.algo.part1.lab1;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class PreciousStoneTest {

    @Test
    public void testGetTotalPrice() {
        PreciousStone stone = new PreciousStone("Diamond", "Colorless", 1.0, 1000.0, 1.0f, 0.75f, 5000.0f);
        float expectedTotalPrice = 5000.0f;
        float actualTotalPrice = stone.getTotalPrice();
        assertEquals(expectedTotalPrice, actualTotalPrice, 0.001f);
    }

    @Test
    public void testIncreaseClarity() {
        PreciousStone stone = new PreciousStone("Diamond", "Colorless", 1.0, 1000.0, 1.0f, 0.75f, 5000.0f);
        float expectedClarity = 1.75f;
        stone.increaseClarity();
        float actualClarity = stone.getClarity();
        assertEquals(expectedClarity, actualClarity, 0.001f);
    }

    @Test
    public void testIncreasePrice() {
        PreciousStone stone = new PreciousStone("Diamond", "Colorless", 1.0, 1000.0, 1.0f, 0.75f, 5000.0f);
        float expectedPrice = 5250.0f;
        stone.increasePrice(5.0);
        float actualPrice = stone.getPricePerCarat();
        assertEquals(expectedPrice, actualPrice, 0.001f);
    }

    @Test
    public void testGetFullPrice() {
        PreciousStone stone = new PreciousStone("Diamond", "Colorless", 1.0, 1000.0, 1.0f, 0.75f, 5000.0f);
        float expectedFullPrice = 5000.0f;
        float actualFullPrice = stone.getFullPrice();
        assertEquals(expectedFullPrice, actualFullPrice, 0.001f);
    }
    @Test
    public void testNoArgsConstructor() {
        PreciousStone stone = new PreciousStone();
        Assertions.assertNotNull(stone);
    }

    @Test
    public void testAllArgsConstructor() {
        PreciousStone preciousStone = new PreciousStone("diamond", "colorless", 0.2, 2000, 2, 4, 2000);
        assertEquals("diamond", preciousStone.getName());
        assertEquals("colorless", preciousStone.getColor());
        assertEquals(0.2, preciousStone.getWeight(), 0.001);
        assertEquals(2000, preciousStone.getCost(), 0.001);
        assertEquals(2, preciousStone.getCarat(), 0.001);
        assertEquals(4, preciousStone.getClarity(), 0.001);
        assertEquals(2000, preciousStone.getPricePerCarat(), 0.001);
    }

    @Test
    public void testSettersAndGetters() {
        PreciousStone stone = new PreciousStone();
        stone.setName("Ruby");
        stone.setColor("Red");
        stone.setWeight(1.0);
        stone.setCost(500.0);
        stone.setCarat(0.5f);
        stone.setClarity(0.8f);
        stone.setPricePerCarat(1000.0f);

        Assertions.assertEquals("Ruby", stone.getName());
        Assertions.assertEquals("Red", stone.getColor());
        Assertions.assertEquals(1.0, stone.getWeight());
        Assertions.assertEquals(500.0, stone.getCost());
        Assertions.assertEquals(0.5f, stone.getCarat());
        Assertions.assertEquals(0.8f, stone.getClarity());
        Assertions.assertEquals(1000.0f, stone.getPricePerCarat());
    }

    @Test
    public void testToString() {
        PreciousStone stone = new PreciousStone("Emerald", "Green", 3.0, 2000, 1.5f, 0.9f, 3000.0f);
        String expected = "PreciousStone(super=Stone(name=Emerald, color=Green, weight=3.0, cost=2000.0), carat=1.5, clarity=0.9, pricePerCarat=3000.0)";
        String actual = stone.toString();
        Assertions.assertEquals(expected, actual);
    }
}
