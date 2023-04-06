package ua.lviv.iot.algo.part1.lab1;
import org.junit.Test;
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

}
