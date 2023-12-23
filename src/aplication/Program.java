package src.aplication;

import src.boardgame.Board;
import src.boardgame.Position;
import src.chess.ChessMatch;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

       ChessMatch chessMatch = new ChessMatch();

       UI.printBoard(chessMatch.getPieces());

    }
}

