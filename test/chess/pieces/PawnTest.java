package test.chess.pieces;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import chess.pieces.Color;
import chess.pieces.Pawn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PawnTest {

    @Test
    @DisplayName("폰 생성시 입력받은 색상 값")
    void create() {
        verifyPawn(Color.BLACK, Pawn.BLACK_REPRESENTATION);
        verifyPawn(Color.WHITE, Pawn.WHITE_REPRESENTATION);
    }

    private void verifyPawn(final Color color, final char representation) {
        Pawn pawn = new Pawn(color, representation);
        assertThat(pawn.getColor()).isEqualTo(color);
    }

    @Test
    @DisplayName("폰 생성시 지정된 색상값이 없다면 white가 기본값이어야 한다")
    void create_기본생성자() throws Exception {
        Pawn pawn = new Pawn();
        assertEquals(Color.WHITE, pawn.getColor());
        assertThat(pawn.getRepresentation()).isEqualTo(Pawn.WHITE_REPRESENTATION);
    }
}