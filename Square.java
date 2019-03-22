import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square
{
	int xPosition;
    int yPosition;

    ImageIcon white = new ImageIcon("empty1.png");
    ImageIcon black = new ImageIcon("empty2.png");
    ImageIcon selectedSquare = new ImageIcon("selected.png");
    ImageIcon redPiece = new ImageIcon("red.png");
    ImageIcon redKing = new ImageIcon("red-king.png");
    ImageIcon whitePiece = new ImageIcon("white.png");
    ImageIcon whiteKing = new ImageIcon("white-king.png");
    JButton btnSquare = new JButton();
    JButton btnPiece = new JButton();
    public boolean isWhite;
    public boolean pieceHere;
    
    public Square(int x, int y, boolean isW)
    {
        xPosition = x;
        yPosition = y;
        isWhite = isW;

        if (isWhite == true)
        {
            btnSquare.setIcon(white);
            //for rows 0,1,2, check black/white, put red if white

            for (y = 0; y < 3; y++)
            {
                
                if (b < 3 || b > 4)
                {
                    pieceHere = true;
                }
                else
                {
                    pieceHere = false;
                }
            }
            
        }
        else
        {
            btnSquare.setIcon(black);
        }
    }

    public JButton getButton()
    {
        return btnSquare;
    }

    public JButton getPiece()
    {
        return btnPiece;
    }

    public static void main(String[] args)
    {

    }
}