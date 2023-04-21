package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KidneyStoneTest {
    @Test
    public void testKidneyStoneIsState() {
        KidneyStone kidneyStone1 = new KidneyStone("Calcium Oxalate", "brown", 2.5, 50.0, true);
        assertTrue(kidneyStone1.isState());

        KidneyStone kidneyStone2 = new KidneyStone("Calcium Phosphate", "white", 1.5, 25.0, false);
        assertFalse(kidneyStone2.isState());
    }
    @Test
    public void testKidneyStoneGetFullPrice() {
        KidneyStone kidneyStone = new KidneyStone("Calcium Oxalate", "brown", 2.5, 50.0, true);
        float expected = 0.0f; // Значення, повернене за замовчуванням, так як метод не реалізований
        assertEquals(expected, kidneyStone.getFullPrice(), 0.01);
    }

    @Test
    public void testNoArgsConstructor() {
        KidneyStone stone = new KidneyStone();
        assertNotNull(stone);
    }

    @Test
    public void testAllArgsConstructor() {
        KidneyStone stone = new KidneyStone("stone1", "white", 1.5, 10.0, true);
        assertNotNull(stone);
        assertEquals("stone1", stone.getName());
        assertEquals("white", stone.getColor());
        assertEquals(1.5, stone.getWeight(), 0.01);
        assertEquals(10.0, stone.getCost(), 0.01);
        assertTrue(stone.isState());
    }

    @Test
    public void testSettersAndGetters() {
        KidneyStone stone = new KidneyStone();
        stone.setName("stone2");
        stone.setColor("black");
        stone.setWeight(2.0);
        stone.setCost(20.0);
        stone.setState(false);
        assertEquals("stone2", stone.getName());
        assertEquals("black", stone.getColor());
        assertEquals(2.0, stone.getWeight(), 0.01);
        assertEquals(20.0, stone.getCost(), 0.01);
        assertFalse(stone.isState());
    }

    @Test
    public void testToString() {
        KidneyStone stone = new KidneyStone("stone1", "white", 1.5, 10.0, true);
        String expectedString = "KidneyStone(super=Stone(name=stone1, color=white, weight=1.5, cost=10.0), state=true)";
        assertEquals(expectedString, stone.toString());
    }
    @Test
    public void testKidneyStoneConstructor() {
        KidneyStone kidneyStone = new KidneyStone("Calcium Oxalate", "brown", 2.5, 50.0, true);
        assertEquals("Calcium Oxalate", kidneyStone.getName());
        assertEquals("brown", kidneyStone.getColor());
        assertEquals(2.5, kidneyStone.getWeight(), 0.01);
        assertEquals(50.0, kidneyStone.getCost(), 0.01);
        assertTrue(kidneyStone.isState());
    }
    @Test
    public void testKidneyStoneToString() {
        KidneyStone kidneyStone = new KidneyStone("Calcium Oxalate", "brown", 2.5, 50.0, true);
        String expected = "KidneyStone(super=Stone(name=Calcium Oxalate, color=brown, weight=2.5, cost=50.0), state=true)";
        assertEquals(expected, kidneyStone.toString());
    }
}