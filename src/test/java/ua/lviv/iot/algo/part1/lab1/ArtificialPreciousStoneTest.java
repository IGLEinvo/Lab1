package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArtificialPreciousStoneTest {

    @Test
    public void testGetFullPrice() {
        ArtificialPreciousStone stone = new ArtificialPreciousStone("Diamond", "Colorless", 1.0, 1000.0, "Lab1", 2.5f, 100.0f);
        float expectedFullPrice = 250.0f;
        float actualFullPrice = stone.getFullPrice();
        assertEquals(expectedFullPrice, actualFullPrice, 0.001f);
    }

}
