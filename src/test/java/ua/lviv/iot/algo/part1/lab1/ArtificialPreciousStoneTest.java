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
    @Test
    public void testNoArgsConstructor() {
        ArtificialPreciousStone aps = new ArtificialPreciousStone();
        assertNotNull(aps);
    }

    @Test
    public void testAllArgsConstructor() {
        ArtificialPreciousStone aps = new ArtificialPreciousStone("stone1", "blue", 2.5, 50.0, "lab1", 5.0f, 10.0f);
        assertNotNull(aps);
        assertEquals("stone1", aps.getName());
        assertEquals("blue", aps.getColor());
        assertEquals(2.5, aps.getWeight(), 0.01);
        assertEquals(50.0, aps.getCost(), 0.01);
        assertEquals("lab1", aps.getLabName());
        assertEquals(5.0f, aps.getWeightInGrams(), 0.01);
        assertEquals(10.0f, aps.getPricePerGram(), 0.01);
    }

    @Test
    public void testSettersAndGetters() {
        ArtificialPreciousStone aps = new ArtificialPreciousStone();
        aps.setName("stone2");
        aps.setColor("green");
        aps.setWeight(1.5);
        aps.setCost(30.0);
        aps.setLabName("lab2");
        aps.setWeightInGrams(10.0f);
        aps.setPricePerGram(20.0f);
        assertEquals("stone2", aps.getName());
        assertEquals("green", aps.getColor());
        assertEquals(1.5, aps.getWeight(), 0.01);
        assertEquals(30.0, aps.getCost(), 0.01);
        assertEquals("lab2", aps.getLabName());
        assertEquals(10.0f, aps.getWeightInGrams(), 0.01);
        assertEquals(20.0f, aps.getPricePerGram(), 0.01);
    }

    @Test
    public void testToString() {
        ArtificialPreciousStone aps = new ArtificialPreciousStone("stone1", "blue", 2.5, 50.0, "lab1", 5.0f, 10.0f);
        String expectedString = "ArtificialPreciousStone(super=Stone(name=stone1, color=blue, weight=2.5, cost=50.0), labName=lab1, weightInGrams=5.0, pricePerGram=10.0)";
        assertEquals(expectedString, aps.toString());
    }
}
