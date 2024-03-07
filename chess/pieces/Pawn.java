package chess.pieces;

public class Pawn {

    public static final char WHITE_REPRESENTATION = 'p';
    public static final char BLACK_REPRESENTATION = 'P';

    private final Color color;
    private final char representation;

    public Pawn(Color color, char representation) {
        this.color = color;
        this.representation = representation;
    }

    public Pawn() {
        this.color = Color.WHITE;
        this.representation = WHITE_REPRESENTATION;
    }

    public Color getColor() {
        return color;
    }

    public char getRepresentation() {
        return representation;
    }
}
