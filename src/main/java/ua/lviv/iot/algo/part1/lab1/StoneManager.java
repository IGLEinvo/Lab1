package ua.lviv.iot.algo.part1.lab1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StoneManager {
    private final List<Stone> stones = new ArrayList<>();

    public void addStone(final Stone stone) {
        stones.add(stone);
    }

    public List<Stone> findAllWithWeightGreaterThan(double weight) {
        return stones.stream()
                .filter(stone -> stone.getWeight() > weight)
                .collect(Collectors.toList());
    }

    public List<Stone> findAllWithCostGreaterThan(double cost) {
        return stones.stream()
                .filter(stone -> stone.getCost() > cost)
                .collect(Collectors.toList());
    }
}

