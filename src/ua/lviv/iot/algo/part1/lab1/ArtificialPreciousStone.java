package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString(callSuper=true)
public class ArtificialPreciousStone extends Stone {
    private String labName;
    private float weightInGrams;
    private float pricePerGram;

    public ArtificialPreciousStone(String name, String color, double weight, double cost , String labName, float weightInGrams, float pricePerGramr) {
        super(name, color, weight, cost);
        this.labName = labName;
        this.weightInGrams = weightInGrams;
        this.pricePerGram = pricePerGram;
    }
    @Override
    public float getFullPrice() {
        return weightInGrams * pricePerGram;
    }
}
