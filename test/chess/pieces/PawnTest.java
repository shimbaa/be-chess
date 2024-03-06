package test.chess.pieces;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import chess.pieces.Pawn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PawnTest {

    @Test
    @DisplayName("폰 생성시 입력받은 색상 값")
    public void create() {
        verifyPawn(Pawn.BLACK_COLOR, Pawn.BLACK_REPRESENTATION);
        verifyPawn(Pawn.WHITE_COLOR, Pawn.WHITE_REPRESENTATION);
    }

    private void verifyPawn(final String color, final char representation) {
        Pawn pawn = new Pawn(color, representation);
        assertThat(pawn.getColor()).isEqualTo(color);
    }

    @Test
    @DisplayName("폰 생성시 지정된 색상값이 없다면 white가 기본값이어야 한다")
    public void create_기본생성자() throws Exception {
        Pawn pawn = new Pawn();
        assertEquals(Pawn.WHITE_COLOR, pawn.getColor());
        assertThat(pawn.getRepresentation()).isEqualTo(Pawn.WHITE_REPRESENTATION);
    }
}