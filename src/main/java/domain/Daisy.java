package domain;
import domain.enums.LeavesSize;
import java.util.Objects;

public class Daisy extends Flowers {
    private boolean manyPetals;

    public Daisy() {
    }

    public Daisy(String nameFlower, String colorBud, LeavesSize leavesSize, int lengthStem,
                 String dateWhenRipped, int priceFlower, boolean manyPetals) {
        super(nameFlower, colorBud, leavesSize, lengthStem, dateWhenRipped, priceFlower);
        this.manyPetals = manyPetals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Daisy daisy = (Daisy) o;
        return manyPetals == daisy.manyPetals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manyPetals);
    }

    @Override
    public String toString() {
        return "----------------------Daisy----------------------" + "\n" +
                super.toString() + "\n" +
                "ManyPetals:" + manyPetals + "\n";
    }

    @Override
    public void grow() {
        System.out.println("Daisies grow fast!");
    }

    public boolean getManyPetals() {
        return manyPetals;
    }

    public void setManyPetals(boolean manyPetals) {
        this.manyPetals = manyPetals;
    }

}
