package chess.pieces;

import static chess.pieces.Color.*;
import static chess.pieces.Representation.*;

import java.util.Map;

public enum Name {
    PAWN(Map.of(
            WHITE, PAWN_WHITE,
            BLACK, PAWN_BLACK)),
    KNIGHT(Map.of(
            WHITE, KNIGHT_WHITE,
            BLACK, KNIGHT_BLACK)),
    ROOK(Map.of(
            WHITE, ROOK_WHITE,
            BLACK, ROOK_BLACK)),
    BISHOP(Map.of(
            WHITE, BISHOP_WHITE,
            BLACK, BISHOP_BLACK)),
    QUEEN(Map.of(
            WHITE, QUEEN_WHITE,
            BLACK, QUEEN_BLACK)),
    KING(Map.of(
            WHITE, KING_WHITE,
            BLACK, KING_BLACK)),

    BLANK(Map.of(
            BLANK_COLOR, BLANK_REPRESENTATION));

    private final Map<Color, Representation> representation;

    Name(Map<Color, Representation> representation) {
        this.representation = representation;
    }

    public Representation findRepresentation(Color color) {
        return this.representation.get(color);
    }
}
