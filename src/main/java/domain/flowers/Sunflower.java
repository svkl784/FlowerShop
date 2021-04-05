package domain.flowers;

import domain.enums.LeavesSize;

import java.util.Objects;

public class Sunflower extends Flowers {
    private boolean sunflowerSeeds;

    public Sunflower() {
    }

    public Sunflower(String nameFlower, String colorBud, LeavesSize leavesSize, int lengthStem,
                     String dateWhenRipped, int priceFlower, boolean sunflowerSeeds) {
        super(nameFlower, colorBud, leavesSize, lengthStem, dateWhenRipped, priceFlower);
        this.sunflowerSeeds = sunflowerSeeds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sunflower sunflower = (Sunflower) o;
        return sunflowerSeeds == sunflower.sunflowerSeeds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sunflowerSeeds);
    }

    @Override
    public String toString() {
        return "--------------------------Sunflower----------------------" + "\n" +
                super.toString() + "\n" +
                "SunflowerSeeds:" + sunflowerSeeds + "\n";
    }

    @Override
    public void grow() {
        System.out.println("Sunflowers grow slowly!");
    }

    public boolean isSunflowerSeeds() {
        return sunflowerSeeds;
    }

    public void setSunflowerSeeds(boolean sunflowerSeeds) {
        this.sunflowerSeeds = sunflowerSeeds;
    }

}
