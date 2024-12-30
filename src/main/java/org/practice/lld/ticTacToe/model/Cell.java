package org.practice.lld.ticTacToe.model;

public class Cell {
    int x;
    int y;
    Piece piece;
    public Cell(int x,int y)
    {
        this.x = x;
        this.y = y;
        piece = null;
    }

    public void setPiece(Piece piece)
    {
        this.piece = piece;
    }

    public boolean isFree()
    {
        return piece == null;
    }
}
