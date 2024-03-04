package test;

import static org.assertj.core.api.Assertions.*;

import main.Pawn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PawnTest {

    @Test
    @DisplayName("폰 생성시 입력받은 색상 값")
    public void create() {
        String black = "black";
        String white = "white";

        verifyPawn(black);
        verifyPawn(white);
    }

    private void verifyPawn(final String color) {
        Pawn pawn = new Pawn(color);
        assertThat(pawn.getColor()).isEqualTo(color);
    }
}