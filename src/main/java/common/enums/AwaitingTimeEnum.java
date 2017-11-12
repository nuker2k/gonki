package common.enums;


public enum AwaitingTimeEnum {

    TEN_SECONDS("10"),
    TWENTY_SECONDS("20"),
    THIRTY_SECONDS("30"),
    FORTY_FIVE_SECONDS("45"),
    ONE_MINUTE("60");

    private String value;

    AwaitingTimeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Integer getAmountOfSeconds() {
        return Integer.parseInt(value);
    }
}
