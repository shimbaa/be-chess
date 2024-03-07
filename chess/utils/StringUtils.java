package chess.utils;

public class StringUtils {

    private static final String NEW_LINE = System.getProperty("line.separator");

    public static String appendNewLine(String target) {
        return target + NEW_LINE;
    }

    private StringUtils() {}
}
