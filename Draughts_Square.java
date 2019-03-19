import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Draughts_Square extends Draughts_Board
{
    ImageIcon white = new ImageIcon("empty1.png");                                   //Sets the variable "white" to the Empty1 image.
    ImageIcon black = new ImageIcon("empty2.png"); 
    ImageIcon redPiece = new ImageIcon("red.png");
    ImageIcon redKing = new ImageIcon("red-king.png");
    ImageIcon whitePiece = new ImageIcon("white.png");
    ImageIcon whiteKing = new ImageIcon("white-king.png");
    JButton whiteP = new JButton(white);
    JButton blackP = new JButton(black);
    JButton selected = new JButton(selected);

    static final int empty = 0;
    static final int redPiece = 1;
    static final int redKing = 2;
    static final int whitePiece = 3;
    static final int whiteKing = 4;

    public Draughts_Board()
    {
        private int xpos = x;
        private int ypos = y;

        for (int row = 0; row < SIZE; row++)
        {
            for (int col = 0; col < SIZE; col++)
            {
                if(row % 2 == col % 2)
                {
                    if (row < 3)
                    board[row][col] = whitePiece;
                    else if (row > 4)
                    board[row][col] = redPiece;
                    else
                    board[row][col] = empty;
                }
                else
                {
                    board[row][col] = empty;
                }
            }
        }

        }
    }


    public JButton getwhite
    {
        return whiteP;
    }
    

    public JButton getblack
    {
        return blackP;
    }

    public static void main(String[] args)
    {

    }
}