package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MineralsTest {
    @Test
    public void testMineralsConstructor() {
        Minerals stone = new Minerals("Quartz", "white", 1.5, 5.0, "Silicate");
        assertEquals("Quartz", stone.getName());
        assertEquals("white", stone.getColor());
        assertEquals(1.5, stone.getWeight(), 0.01);
        assertEquals(5.0, stone.getCost(), 0.01);
        assertEquals("Silicate", stone.getType());
    }
    @Test
    public void testMineralsToString() {
        Minerals stone = new Minerals("Quartz", "white", 1.5, 5.0, "Silicate");
        String expected = "Minerals(super=Stone(name=Quartz, color=white, weight=1.5, cost=5.0), type=Silicate)";
        assertEquals(expected, stone.toString());
    }
    @Test
    public void testMineralsGetFullPrice() {
        Minerals stone = new Minerals("Quartz", "white", 1.5, 5.0, "Silicate");
        assertEquals(0, stone.getFullPrice(), 0.01);
    }
    @Test
    public void testMineralsType() {
        Minerals stone = new Minerals("Quartz", "white", 1.5, 5.0, "Silicate");
        stone.setType("Oxide");
        assertEquals("Oxide", stone.getType());
    }
    @Test
    public void testNoArgsConstructor() {
        Minerals mineral = new Minerals();
        assertNotNull(mineral);
    }

    @Test
    public void testAllArgsConstructor() {
        Minerals mineral = new Minerals("mineral1", "red", 1.0, 15.0, "amethyst");
        assertNotNull(mineral);
        assertEquals("mineral1", mineral.getName());
        assertEquals("red", mineral.getColor());
        assertEquals(1.0, mineral.getWeight(), 0.01);
        assertEquals(15.0, mineral.getCost(), 0.01);
        assertEquals("amethyst", mineral.getType());
    }

    @Test
    public void testSettersAndGetters() {
        Minerals mineral = new Minerals();
        mineral.setName("mineral2");
        mineral.setColor("green");
        mineral.setWeight(2.0);
        mineral.setCost(25.0);
        mineral.setType("emerald");
        assertEquals("mineral2", mineral.getName());
        assertEquals("green", mineral.getColor());
        assertEquals(2.0, mineral.getWeight(), 0.01);
        assertEquals(25.0, mineral.getCost(), 0.01);
        assertEquals("emerald", mineral.getType());
    }

    @Test
    public void testToString() {
        Minerals mineral = new Minerals("mineral1", "red", 1.0, 15.0, "amethyst");
        String expectedString = "Minerals(super=Stone(name=mineral1, color=red, weight=1.0, cost=15.0), type=amethyst)";
        assertEquals(expectedString, mineral.toString());
    }
}