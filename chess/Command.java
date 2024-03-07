package chess;

import java.util.Arrays;

public enum Command {
    START("start"),
    END("end");
    private static final String INVALID_INPUT = "start 또는 end 만 입력해주세요.";
    private final String label;

    Command(String label) {
        this.label = label;
    }

    public static Command from(String input) {
        return Arrays.stream(values())
                .filter(command -> command.label.equals(input))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(INVALID_INPUT));
    }

    public boolean isStart() {
        return this == START;
    }

    public boolean isEnd() {
        return this == END;
    }
}
