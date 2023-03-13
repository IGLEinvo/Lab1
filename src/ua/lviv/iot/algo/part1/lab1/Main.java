package ua.lviv.iot.algo.part1.lab1;
//
public class Main {
    public static void main(String[] args) {
        PreciousStone[] stones ={
        new PreciousStone(),
         new PreciousStone  ("sapphire", 1, "blue", 3, 1000),

         PreciousStone.getInstance(),
         PreciousStone.getInstance()
    };

        for (PreciousStone stone : stones) {
            System.out.println(stone.toString());
        }
    }
}
