package ua.lviv.iot.algo.part1.lab1;
public class Main {
    public static void main(String[] args) {
        PreciousStone stone1 = new PreciousStone("sapphire", 1, "blue", 3, 1000);

        PreciousStone stone2 = new PreciousStone("Emerald", 4, "Green", 3, 3000);

        PreciousStone stone3 = PreciousStone.getInstance();
        PreciousStone stone4 = PreciousStone.getInstance();

        PreciousStone[] stones = {stone1, stone2, stone3, stone4};
        for (PreciousStone stone : stones) {
            System.out.println(stone.toString());
        }
    }
}

