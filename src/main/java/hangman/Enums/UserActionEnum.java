package hangman.Enums;

public enum UserActionEnum {
    START(1), EXIT(2);

    private final int action;

    UserActionEnum(int action) {
        this.action = action;
    }

    public int getAction() {
        return action;
    }

    public static UserActionEnum fromInt(int action) throws IllegalArgumentException {
        for (UserActionEnum actionEnum : UserActionEnum.values()) {
            if (actionEnum.getAction() == action) {
                return actionEnum;
            }
        }
        throw new IllegalArgumentException("Invalid action: " + action);
    }
}
