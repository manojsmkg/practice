package org.practice.lld.ticTacToe.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    List<Player> players;
    Board board;

    public Game(Board board, ArrayList<Player> players)
    {
        this.board = board;
        this.players = players;
    }

    public Piece startGame()
    {
        Scanner scanner = new Scanner(System.in);
        int totalCells = board.getCells();
        board.printBoard();
        while(totalCells>0) {
            for (Player player : this.players) {
                System.out.println("Turn of " + player.name + ", Please Enter position of your piece: ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                while (!(board.insertPiece(x, y, player.piece))) {
                    System.out.println("Invalid coordinates, please enter again");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                }
                totalCells--;
                if (board.isWinnerAvailable()) return board.winner;
                if (totalCells <= 0) break;
                board.printBoard();
            }
        }
        return null;
    }

}
