package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString(callSuper=true)
public class Minerals extends Stone {
    public String type;
    public Minerals(String name, String color, double weight, double cost, String type)
    {
        super(name, color, weight, cost);
        this.type = type;
    }
    @Override
    public float getFullPrice() {
        return 0;
    }
}