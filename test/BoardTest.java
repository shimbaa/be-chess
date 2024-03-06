package test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import chess.Board;
import chess.pieces.Color;
import chess.pieces.Pawn;
import org.junit.jupiter.api.Test;

public class BoardTest {

    @Test
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
    void initialize() throws Exception {
        Board board = new Board();
        board.initialize();
        assertThat(board.getPawnsResultFromColor(Color.WHITE)).isEqualTo("pppppppp");
        assertThat(board.getPawnsResultFromColor(Color.BLACK)).isEqualTo("PPPPPPPP");
    }
}
