package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KidneyStoneTest {
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


}