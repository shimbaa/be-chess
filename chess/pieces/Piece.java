package chess.pieces;

public class Piece {
    private final Name name;
    private final Color color;

    private Piece(Name name, Color color) {
        this.name = name;
        this.color = color;
    }

    public static Piece createWhitePawn() {
        return new Piece(Name.PAWN, Color.WHITE);
    }

    public static Piece createBlackPawn() {
        return new Piece(Name.PAWN, Color.BLACK);
    }

    public static Piece createWhiteKnight() {
        return new Piece(Name.KNIGHT, Color.WHITE);
    }
    public static Piece createBlackKnight() {
        return new Piece(Name.KNIGHT, Color.BLACK);
    }

    public static Piece createWhiteRook() {
        return new Piece(Name.ROOK, Color.WHITE);
    }

    public static Piece createBlackRook() {
        return new Piece(Name.ROOK, Color.BLACK);
    }

    public static Piece createWhiteBishop() {
        return new Piece(Name.BISHOP, Color.WHITE);
    }

    public static Piece createBlackBishop() {
        return new Piece(Name.BISHOP, Color.BLACK);
    }

    public static Piece createWhiteQueen() {
        return new Piece(Name.QUEEN, Color.WHITE);
    }

    public static Piece createBlackQueen() {
        return new Piece(Name.QUEEN, Color.BLACK);
    }

    public static Piece createWhiteKing() {
        return new Piece(Name.KING, Color.WHITE);
    }

    public static Piece createBlackKing() {
        return new Piece(Name.KING, Color.BLACK);
    }

    public Color getColor() {
        return this.color;
    }

    public Representation getRepresentation() {
        return this.name.findRepresentation(color);
    }

    public boolean isWhite() {
        return this.color == Color.WHITE;
    }

    public boolean isBlack() {
        return this.color == Color.BLACK;
    }
}
