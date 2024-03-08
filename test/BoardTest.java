package test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import chess.Board;
import chess.pieces.Color;
import chess.pieces.Pawn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BoardTest {

    @Test
    @DisplayName("보드에 추가한 Pawn은 인덱스를 통해 조회할 수 있어야 한다")
    void create() throws Exception {
        Board board = new Board();

        Pawn white = new Pawn(Color.WHITE, Pawn.WHITE_REPRESENTATION);
        board.add(white);
        assertEquals(1, board.size());
        assertEquals(white, board.findPawn(0));

        Pawn black = new Pawn(Color.BLACK, Pawn.BLACK_REPRESENTATION);
        board.add(black);
        assertEquals(2, board.size());
        assertEquals(black, board.findPawn(1));
    }

    @Test
    @DisplayName("보드를 초기화 한 상태에서 기물의 개수는 32개 여야 한다")
    void pieceCount() {
        board.initialize();
        assertThat(board.pieceCount()).isEqualTo(32);
    }
}
