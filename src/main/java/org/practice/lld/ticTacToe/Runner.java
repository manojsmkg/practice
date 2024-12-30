package org.practice.lld.ticTacToe;

import org.practice.lld.ticTacToe.model.*;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args)
    {
        Board board = new Board(3);
        Player player1 = new Player("Manoj",new PieceX());
        Player player2 = new Player("Akhil",new PieceO());
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);

        Game game = new Game(board,players);
        Piece piece = game.startGame();
        if(piece == null)
        {
            System.out.println("No more moves");
        }
        else
        {
            for (Player player : players) {
                if (piece.equals(player.piece))
                    System.out.println("Congratulations, " + player.name + " has won!!!");
            }
        }

    }

}
