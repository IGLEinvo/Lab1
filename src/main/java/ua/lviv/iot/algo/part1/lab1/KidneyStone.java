package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString(callSuper=true)
public class KidneyStone extends Stone {
    public boolean state;
    public KidneyStone(String name, String color, double weight, double cost, boolean state)
    {
        super(name, color, weight, cost);
        this.state = state;
    }
    @Override
    public float getFullPrice() {
        return 0;
    }
    @Override
    public String getHeaders() {
        return super.getHeaders() + ", state";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ',' + state;
    }
}