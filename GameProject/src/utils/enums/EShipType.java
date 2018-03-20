package utils.enums;

public enum EShipType {

    ONE_POLE(1),
    TWO_POLE(2),
    THREE_POLE(3),
    FOUR_POLE(4);

    private int fragmentsCount;

    private EShipType(int fragmentsCount) {
        this.fragmentsCount = fragmentsCount;
    }

    public int getFragmentsCount() {
        return fragmentsCount;
    }
}


