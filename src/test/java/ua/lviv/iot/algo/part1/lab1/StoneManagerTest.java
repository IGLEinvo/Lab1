package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class
StoneManagerTest {

    private StoneManager manager;

    @BeforeEach
    void setUp() {
        manager = new StoneManager();
        manager.addStone(new PreciousStone("sapphire", "blue", 0.5, 1000, 1, 3, 1000));
        manager.addStone(new ArtificialPreciousStone("Lab1", 0.5f, 500));
        manager.addStone(new PreciousStone("diamond", "colorless", 0.2, 2000, 2, 4, 2000));
        manager.addStone(new ArtificialPreciousStone("Lab2", 1, 1000));
        manager.addStone(new Minerals("peat", "brown", 1, 10, "fuel ores"));
        manager.addStone(new Minerals("rock salt", "colorless", 100, 1, "not ores"));
        manager.addStone(new KidneyStone("cystyn stone", "orange", 0.01, 0, true));
        manager.addStone(new KidneyStone("uric stone", "grey", 0.1, 0, false));
        manager.addStone(new PreciousStone("kamin", "grey", 0.3, 500, 0 , 3, 1000));
    }

    @Test
    void testFindAllWithWeightGreaterThan() {
        double weightGreaterThan = 0.4;
        List<Stone> foundStones = manager.findAllWithWeightGreaterThan(weightGreaterThan);
        assertEquals(3, foundStones.size());

        for (var stone : foundStones) {
            assertTrue(stone.getWeight() > weightGreaterThan);
        }
    }

    @Test
    void testFindAllWithCostGreaterThan() {
        double costGreaterThan = 500;
        List<Stone> foundStones = manager.findAllWithCostGreaterThan(costGreaterThan);
        assertEquals(2, foundStones.size());
        for (var stone : foundStones) {
            assertTrue(stone.getCost() > costGreaterThan);
        }
    }
}


