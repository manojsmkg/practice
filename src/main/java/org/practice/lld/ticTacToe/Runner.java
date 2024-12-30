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

        /*Sample I/0
        Piece has Symbol; SymbolX and SymbolO extends Symbol
        Players has Piece; PieceX and PieceO extends Piece (Constructor injection for symbol)
        Cell has Piece;
        Board has Cells;
        Game has Board;
        Game has Players


        Patterns Used :
        > Task :org.practice.lld.ticTacToe.model.Runner.main()
        ___
        ___
        ___
        Turn of Manoj, Please Enter position of your piece:
        0 0
        X __
        ___
        ___
        Turn of Akhil, Please Enter position of your piece:
        0 2
        X _O
        ___
        ___
        Turn of Manoj, Please Enter position of your piece:
        1 0
        X _O
        X __
        ___
        Turn of Akhil, Please Enter position of your piece:
        1 1
        X _O
        X O _
        ___
        Turn of Manoj, Please Enter position of your piece:
        2 2
        X _O
        X O _
        __X
        Turn of Akhil, Please Enter position of your piece:
        2 0
        Disconnected from the target VM, address: 'localhost:54836', transport: 'socket'
        X _O
        X O _
        O _X
        Congratulations, Akhil has won!!!
         */

    }

}
