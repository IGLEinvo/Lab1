package ua.lviv.iot.algo.part1.lab1;

//
import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class PreciousStone {
    private String name;
    private float carat;
    private String color;
    private float clarity;
    private float pricePerCarat;
    private static PreciousStone instance;

    public PreciousStone(String name, float carat, String color, float clarity, float pricePerCarat) {
        this.name = name;
        this.carat = carat;
        this.color = color;
        this.clarity = clarity;
        this.pricePerCarat = pricePerCarat;
    }
    @Override
    public String toString() {
        return "Name: " + this.name + ", Carat: " + this.carat + ", Color: " + this.color +
                ", Clarity: " + this.clarity + ", Price per carat: " + this.pricePerCarat;
    }

    public float getTotalPrice(){
        return pricePerCarat * carat;
    }
    public void increaseClarity(){
        clarity++;
    }
    public void increasePrice(double percentage){
        pricePerCarat *=(1 + percentage/100);
    }
    public static PreciousStone getInstance() {
        if (instance == null) {
            instance = new PreciousStone("sapphire", 1, "blue", 3, 1000);
        }
        return instance;
    }
}
