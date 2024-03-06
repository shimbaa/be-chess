package chess;

import chess.pieces.Color;
import java.util.Scanner;

public class Game {

    private static Board board;
    private static final String EMPTY_PIECES_REPRESENTATION = "........\n";

    public static void main(String[] args) {

        Command command;
        do {
            command = getCommand();

            if (command.isStart()) {
                board = new Board();
                board.initialize();

                print();
                break;
            }

        } while (!command.isEnd());
    }

    private static void print() {
        StringBuilder sb = new StringBuilder();
        sb.append(EMPTY_PIECES_REPRESENTATION);
        sb.append(board.getPawnsResultFromColor(Color.BLACK)).append("\n");
        sb.append(EMPTY_PIECES_REPRESENTATION);
        sb.append(EMPTY_PIECES_REPRESENTATION);
        sb.append(EMPTY_PIECES_REPRESENTATION);
        sb.append(EMPTY_PIECES_REPRESENTATION);
        sb.append(board.getPawnsResultFromColor(Color.WHITE)).append("\n");
        sb.append(EMPTY_PIECES_REPRESENTATION);
        System.out.println(sb);
    }

    private static Command getCommand() {
        Scanner scanner = new Scanner(System.in);
        String commandInput;
        Command command;
        try {
            commandInput = scanner.nextLine();
            command = Command.from(commandInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getCommand();
        }
        return command;
    }
}
