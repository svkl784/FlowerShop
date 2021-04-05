package domain;
import domain.enums.LeavesSize;
import domain.interfaces.FlowersService;
import java.util.Objects;

public abstract class Flowers implements FlowersService {
    private String nameFlower;
    private String colorBud;
    private LeavesSize leavesSize;
    private int lengthStem;
    private String dateWhenRipped;
    private int priceFlower;

    public Flowers() {
    }

    public Flowers(String nameFlower, String colorBud, LeavesSize leavesSize,
                   int lengthStem, String dateWhenRipped, int priceFlower) {
        this.nameFlower = nameFlower;
        this.colorBud = colorBud;
        this.leavesSize = leavesSize;
        this.lengthStem = lengthStem;
        this.dateWhenRipped = dateWhenRipped;
        this.priceFlower = priceFlower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flowers flowers = (Flowers) o;
        return lengthStem == flowers.lengthStem &&
                priceFlower == flowers.priceFlower &&
                Objects.equals(nameFlower, flowers.nameFlower) &&
                Objects.equals(colorBud, flowers.colorBud) &&
                leavesSize == flowers.leavesSize
                && Objects.equals(dateWhenRipped, flowers.dateWhenRipped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFlower, colorBud, leavesSize, lengthStem, dateWhenRipped, priceFlower);
    }

    @Override
    public String toString() {
        return "NameFlower: " + nameFlower + "\n" +
                "ColorBud: " + colorBud + "\n" +
                "PetalSize: " + leavesSize + "\n" +
                "LengthStem:" + lengthStem + "\n"+
                "DateWhenRipped:" + dateWhenRipped + "\n"+
                "PriceFlower:" + priceFlower;
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        this.nameFlower = nameFlower;
    }

    public String getColorBud() {
        return colorBud;
    }

    public void setColorBud(String colorBud) {
        this.colorBud = colorBud;
    }

    public LeavesSize getLeavesSize() {
        return leavesSize;
    }

    public void setLeavesSize(LeavesSize leavesSize) {
        this.leavesSize = leavesSize;
    }

    public int getLengthStem() {
        return lengthStem;
    }

    public void setLengthStem(int lengthStem) {
        this.lengthStem = lengthStem;
    }

    public String getDateWhenRipped() {
        return dateWhenRipped;
    }

    public void setDateWhenRipped(String dateWhenRipped) {
        this.dateWhenRipped = dateWhenRipped;
    }

    public int getPriceFlower() {
        return priceFlower;
    }

    public void setPriceFlower(int priceFlower) {
        this.priceFlower = priceFlower;
    }
}
