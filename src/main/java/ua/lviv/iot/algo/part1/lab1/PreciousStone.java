package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper=true)
public class PreciousStone extends Stone {
    private float carat;
    private float clarity;
    private float pricePerCarat;

    public PreciousStone(String name, String color, double weight, double cost ,float carat, float clarity, float pricePerCarat) {
        super(name, color, weight, cost);
        this.carat = carat;
        this.clarity = clarity;
        this.pricePerCarat = pricePerCarat;
    }

    public float getTotalPrice() {
        return pricePerCarat * carat;
    }

    public void increaseClarity() {
        clarity++;
    }

    public void increasePrice(double percentage) {
        pricePerCarat *= (1 + percentage / 100);
    }

    public float getFullPrice() {
        return getTotalPrice();
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", carat, clarity, pricePerCarat";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ',' + carat + ',' + clarity + ',' + pricePerCarat;
    }
}
