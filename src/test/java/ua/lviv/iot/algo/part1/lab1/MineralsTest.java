package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

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

}