package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import chess.Board;
import chess.pieces.Pawn;
import org.junit.jupiter.api.Test;

public class BoardTest {

    @Test
    public void create() throws Exception {
        Board board = new Board();

        Pawn white = new Pawn(Pawn.WHITE);
        board.add(white);
        assertEquals(1, board.size());
        assertEquals(white, board.findPawn(0));

        Pawn black = new Pawn(Pawn.BLACK);
        board.add(black);
        assertEquals(2, board.size());
        assertEquals(black, board.findPawn(1));
    }
}
