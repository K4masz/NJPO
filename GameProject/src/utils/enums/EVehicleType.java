package utils.enums;

public enum EVehicleType {
    TWO_ELEMENT(2),
    THREE_ELEMENT(3),
    FOUR_ELEMENT(4);

    private int fragmentsCount;

    private EVehicleType(int fragmentsCount) {
        this.fragmentsCount = fragmentsCount;
    }

    public int getFragmentsCount() {
        return fragmentsCount;
    }
}
