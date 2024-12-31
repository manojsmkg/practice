package org.practice.lld.ticTacToe.model;



public class Board {
    int size;
    Cell[][] cells;
    Piece winner;

    public Board(int size)
    {
        this.size = size;
        cells = new Cell[this.size][this.size ];
        for(int i = 0 ; i<this.size;i++)
        {
            for(int j=0;j<this.size;j++)
                cells[i][j] = new Cell(i,j);
        }
        winner = null;
    }

    public boolean insertPiece(int x,int y, Piece piece)
    {
        if(!(x>=0 && x<size && y>=0 && y<size)) return false;
        if(cells[x][y].isFree())
        {
            cells[x][y].setPiece(piece);
            return true;
        }
        return false;
    }
    public int getCells()
    {
        return this.size*this.size;
    }

    public void printBoard()
    {
        for(int i=0;i<this.size;i++)
        {
            for(int j=0;j<this.size;j++)
            {
               if(cells[i][j].isFree()) System.out.print("_");
               else System.out.print(cells[i][j].piece.symbol.symbol+ " ");
            }
            System.out.println(" ");
        }
    }



    public boolean isWinnerAvailable()
    {
        //rows
        for (int i = 0; i < size; i++)
        {
            boolean rows = true;
            if(!cells[i][0].isFree())
            {
                Piece startPiece = cells[i][0].piece;
                for(int j=0;j<size;j++)
                {
                    if (!cells[i][j].isFree() && startPiece.equals(cells[i][j].piece)) rows = rows && true;
                    else rows = false;
                }
                if(rows) {
                    winner = startPiece;
                    return true;
                }
            }
        }
        //columns
        for (int i = 0; i < size; i++)
        {
            boolean columns = true;
            if(!cells[0][i].isFree())
            {
                Piece startPiece = cells[0][i].piece;
                for(int j=0;j<size;j++)
                {
                    if (!cells[j][i].isFree() && startPiece.equals(cells[j][i].piece)) columns = columns && true;
                    else columns = false;
                }
                if(columns) {
                    winner = startPiece;
                    return true;
                }
            }
        }

        boolean leftDiag = true;
        //left diagonal check
        if(!cells[0][0].isFree())
        {
            Piece startPiece = cells[0][0].piece;
            for(int i=0;i<size;i++)
                {
                    if (!cells[i][i].isFree() && startPiece.equals(cells[i][i].piece)) leftDiag = leftDiag && true;
                    else leftDiag = false;
                }
            if(leftDiag) {
                    winner = startPiece;
                    return true;
                }
        }
        boolean rightDiag = true;
        //left diagonal check
        if(!cells[0][this.size-1].isFree())
        {
            Piece startPiece = cells[0][this.size-1].piece;
            for(int i=0;i<size;i++)
            {
                if (!cells[i][this.size-1-i].isFree() && startPiece.equals(cells[i][this.size-1-i].piece)) rightDiag = rightDiag && true;
                else rightDiag = false;
            }
            if(rightDiag) {
                winner = startPiece;
                return true;
            }
        }

        return false;
    }


}
