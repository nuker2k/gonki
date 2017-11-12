package common.enums;


public enum GamePrivacyEnum {

    OPEN_GAME("normal"),
    GAME_WITH_FRIENDS("private"),
    PRIVATE_GAME("practice");

    private String value;

    GamePrivacyEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
