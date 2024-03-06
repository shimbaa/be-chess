package chess;

import chess.pieces.Color;
import chess.pieces.Pawn;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private static final String EMPTY_PIECES_REPRESENTATION = "........\n";

    private final List<Pawn> pawns = new ArrayList<>();

    public void add(final Pawn pawn) {
        this.pawns.add(pawn);
    }

    public int size() {
        return this.pawns.size();
    }

    public Pawn findPawn(final int number) {
        return this.pawns.get(number);
    }

    public void initialize() {
        initPawnFromColor(Color.WHITE, Pawn.WHITE_REPRESENTATION);
        initPawnFromColor(Color.BLACK, Pawn.BLACK_REPRESENTATION);
    }

    private void initPawnFromColor(Color color, char representation) {
        for (int i = 0; i < 8; i++) {
            add(new Pawn(color, representation));
        }
    }

    public String getPawnsResultFromColor(Color color) {
        StringBuilder sb = new StringBuilder();
        this.pawns.stream()
                .filter(pawn -> pawn.getColor().equals(color))
                .map(Pawn::getRepresentation)
                .forEach(sb::append);

        return sb.toString();
    }

    public void print() {
        String outputFormat = getChessPrintFormat();
        System.out.println(outputFormat);
    }

    private String getChessPrintFormat() {
        StringBuilder sb = new StringBuilder();
        sb.append(EMPTY_PIECES_REPRESENTATION);
        sb.append(getPawnsResultFromColor(Color.BLACK)).append("\n");
        sb.append(EMPTY_PIECES_REPRESENTATION);
        sb.append(EMPTY_PIECES_REPRESENTATION);
        sb.append(EMPTY_PIECES_REPRESENTATION);
        sb.append(EMPTY_PIECES_REPRESENTATION);
        sb.append(getPawnsResultFromColor(Color.WHITE)).append("\n");
        sb.append(EMPTY_PIECES_REPRESENTATION);
        return sb.toString();
    }
}
