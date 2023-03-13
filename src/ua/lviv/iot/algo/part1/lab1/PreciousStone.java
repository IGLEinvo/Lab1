package ua.lviv.iot.algo.part1.lab1;

//
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
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
