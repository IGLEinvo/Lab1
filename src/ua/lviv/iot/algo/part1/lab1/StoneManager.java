package ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StoneManager {
    public static final List<Stone> stones = new ArrayList<>();

    public static void addStone(final Stone stone) {
        stones.add(stone);
    }

    public static List<Stone> findAllWithWeightGreaterThan(double weight) {
        return stones.stream()
                .filter(stone -> stone.getWeight() > weight)
                .collect(Collectors.toList());
    }

    public static List<Stone> findAllWithCostGreaterThan(double cost) {
        return stones.stream()
                .filter(stone -> stone.getCost() > cost)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {


        stones.add(new PreciousStone("sapphire", "blue", 0.5,1000 , 1, 3, 1000));
        stones.add(new ArtificialPreciousStone("Lab1", 0.5f, 500));
        stones.add(new PreciousStone("diamond", "colorless",0.2, 2000, 2, 4, 2000));
        stones.add(new ArtificialPreciousStone("Lab2", 1, 1000));
        stones.add(new Minerals("peat", "brown", 1,10 ,"fuel ores"));
        stones.add(new Minerals("rock salt", "colorless", 100,1 ,"not ores"));
        stones.add(new KidneyStone("cystyn stone", "orange", 0.01,0 ,true));
        stones.add(new KidneyStone("uric stone", "grey", 0.1,0 ,false));
        
        double weightGreaterThan = 0.4;
        var w = findAllWithWeightGreaterThan(weightGreaterThan);
        for(var we : w){
            System.out.println("\nВажчі за "+ weightGreaterThan +":" + we);
        }
        double costGreaterThan = 500;
        var c = findAllWithCostGreaterThan(costGreaterThan);
        for(var co : c){
            System.out.println("\nДорожчі за "+ costGreaterThan +":" + co);
        }
    }
}



