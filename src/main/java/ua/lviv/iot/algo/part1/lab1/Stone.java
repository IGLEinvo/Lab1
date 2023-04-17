package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public abstract class Stone {
    private String name;
    private String color;
    private double weight;
    private double cost;
    public abstract float getFullPrice();

    public String getHeaders() {
        return "name, color, weight, cost";
    }

    public String toCSV() {
        return name + ',' + color + ',' + weight + ',' + cost;
    }
}

