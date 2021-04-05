package domain.enums;

public enum LeavesSize {
    BIG("Big"),
    MIDDLE ("Middle"),
    SMALL ("Small");
    private String leavesSize;

    LeavesSize(String petalSize) {
        this.leavesSize = petalSize;
    }

    @Override
    public String toString() {
        return leavesSize;
    }

    public String getLeavesSize() {
        return leavesSize;
    }
}
