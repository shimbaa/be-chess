package chess.pieces;

public enum Representation {
    PAWN_BLACK('P'), PAWN_WHITE('p'),
    KNIGHT_BLACK('N'), KNIGHT_WHITE('n'),
    ROOK_BLACK('R'), ROOK_WHITE('r'),
    BISHOP_BLACK('B'), BISHOP_WHITE('b'),
    QUEEN_BLACK('Q'), QUEEN_WHITE('q'),
    KING_BLACK('K'), KING_WHITE('k');

    public final char label;

    Representation(char label) {
        this.label = label;
    }
}
