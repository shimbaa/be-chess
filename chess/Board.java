package chess;

import static chess.utils.StringUtils.*;

import chess.pieces.Color;
import chess.pieces.Piece;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private static final String EMPTY_PIECES_REPRESENTATION = "........";

    private final List<Piece> pieces = new ArrayList<>();

    public void add(final Piece piece) {
        this.pieces.add(piece);
    }

    public int size() {
        return this.pieces.size();
    }

    public Piece findPawn(final int number) {
        return this.pieces.get(number);
    }

    public void initialize() {
        initPawn();
    }

    private void initPawn() {
        for (int i = 0; i < 8; i++) {
            add(Piece.createWhitePawn());
            add(Piece.createBlackPawn());
        }
    }

    public String getPawnsResultFromColor(Color color) {
        StringBuilder sb = new StringBuilder();
        this.pieces.stream()
                .filter(piece -> piece.getColor().equals(color))
                .map(Piece::getRepresentation)
                .forEach(sb::append);

        return sb.toString();
    }

    public void print() {
        String outputFormat = getChessPrintFormat();
        System.out.print(outputFormat);
    }

    private String getChessPrintFormat() {
        StringBuilder sb = new StringBuilder();
        sb.append(appendNewLine(EMPTY_PIECES_REPRESENTATION));
        sb.append(appendNewLine(getPawnsResultFromColor(Color.BLACK)));
        sb.append(appendNewLine(EMPTY_PIECES_REPRESENTATION));
        sb.append(appendNewLine(EMPTY_PIECES_REPRESENTATION));
        sb.append(appendNewLine(EMPTY_PIECES_REPRESENTATION));
        sb.append(appendNewLine(EMPTY_PIECES_REPRESENTATION));
        sb.append(appendNewLine(getPawnsResultFromColor(Color.WHITE)));
        sb.append(appendNewLine(EMPTY_PIECES_REPRESENTATION));
        return sb.toString();
    }
}