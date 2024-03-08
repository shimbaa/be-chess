package chess;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private final Map<Integer, Rank> pieces = new HashMap<>(32);

    public int size() {
        return this.pieces.size();
    }

    public void initialize() {
        initRank8();

        initRank7();

        initBlankRanks();

        initRank2();

        initRank1();
    }

    private void initRank1() {
        pieces.put(1, Rank.createRank1());
    }

    private void initRank2() {
        pieces.put(2, Rank.createRank2());
    }

    private void initBlankRanks() {
        //빈칸들 만들기
        for (int i = 3; i < 7; i++) {
            pieces.put(i, Rank.createBlankRank());
        }
    }

    private void initRank7() {
        pieces.put(7, Rank.createRank7());
    }

    private void initRank8() {
        pieces.put(8, Rank.createRank8());
    }

//    public int pieceCount() {
//        return (int) pieces.values().stream()
//                .filter(rank -> !rank.isBlankRank())
//                .reduce(0, Rank::pieceCount)
//                .count();
//    }

//    public String showBoard() {
//        StringBuilder sb = new StringBuilder();
//        for (List<Piece> rank : pieces) {
//            for (Piece piece : rank) {
//                sb.append(piece.getRepresentation(piece.getColor()));
//            }
//            appendNewLine(sb);
//        }
//        return sb.toString();
//    }
}