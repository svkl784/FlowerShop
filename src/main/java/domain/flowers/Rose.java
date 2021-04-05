package domain.flowers;

import domain.enums.LeavesSize;

import java.util.Objects;

public class Rose extends Flowers {
    private boolean thorns;

    public Rose() {
    }

    public Rose(String nameFlower, String colorBud, LeavesSize leavesSize, int lengthStem,
                String dateWhenRipped, int priceFlower, boolean thorns) {
        super(nameFlower, colorBud, leavesSize, lengthStem, dateWhenRipped, priceFlower);
        this.thorns = thorns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rose rose = (Rose) o;
        return thorns == rose.thorns;
    }

    @Override
    public int hashCode() {
        return Objects.hash(thorns);
    }

    @Override
    public String toString() {
        return "------------------------Rose------------------------" + "\n" +
                super.toString() + "\n" +
                "Thorns:" + thorns + "\n";
    }

    @Override
    public void grow() {
        System.out.println("Roses don't grow very fast!");
    }

    public boolean isThorns() {
        return thorns;
    }

    public void setThorns(boolean thorns) {
        this.thorns = thorns;
    }


}
