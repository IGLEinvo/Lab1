package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoneManagerTest {
    @Test
    public void testFindAllWithWeightGreaterThan() {
        var manager = new StoneManager();

        manager.addStone(new PreciousStone("sapphire", "blue", 0.5,1000 , 1, 3, 1000));
        manager.addStone(new ArtificialPreciousStone("Lab1", 0.5f, 500));
        manager.addStone(new PreciousStone("diamond", "colorless",0.2, 2000, 2, 4, 2000));
        manager.addStone(new ArtificialPreciousStone("Lab2", 1, 1000));
        manager.addStone(new Minerals("peat", "brown", 1,10 ,"fuel ores"));
        manager.addStone(new Minerals("rock salt", "colorless", 100,1 ,"not ores"));
        manager.addStone(new KidneyStone("cystyn stone", "orange", 0.01,0 ,true));
        manager.addStone(new KidneyStone("uric stone", "grey", 0.1,0 ,false));
        double weightGreaterThan = 0.4;
        var results = manager.findAllWithWeightGreaterThan(weightGreaterThan);
        assertEquals(3, results.size());
        assertTrue(results.stream().allMatch(stone -> stone.getWeight() > weightGreaterThan));}
    @Test public void testFindAllWithCostGreaterThan() {
        var manager = new StoneManager();

        manager.addStone(new PreciousStone("sapphire", "blue", 0.5,1000 , 1, 3, 1000));
        manager.addStone(new ArtificialPreciousStone("Lab1", 0.5f, 500));
        manager.addStone(new PreciousStone("diamond", "colorless",0.2, 2000, 2, 4, 2000));
        manager.addStone(new ArtificialPreciousStone("Lab2", 1, 1000));
        manager.addStone(new Minerals("peat", "brown", 1,10 ,"fuel ores"));
        manager.addStone(new Minerals("rock salt", "colorless", 100,1 ,"not ores"));
        manager.addStone(new KidneyStone("cystyn stone", "orange", 0.01,0 ,true));
        manager.addStone(new KidneyStone("uric stone", "grey", 0.1,0 ,false));
        double costGreaterThan = 500;
        var results = manager.findAllWithCostGreaterThan(costGreaterThan);
        assertEquals(2, results.size());
        assertTrue(results.stream().allMatch(stone -> stone.getCost() > costGreaterThan));
    }
}

