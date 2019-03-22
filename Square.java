import javax.swing.*;
import javax.swing.border.*;
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
    Border borderE = BorderFactory.createEmptyBorder();
    public boolean isWhite;
    public int pieceHere;
    
    public Square(int x, int y, boolean isW)
    {
        xPosition = x;
        yPosition = y;
        isWhite = isW;
        int redPieceHere = 1;
        int whitePieceHere = 2;
        int blankSpace = 0;

        btnSquare.setBorder(borderE);

        if (isWhite == true)
        {
            
            btnSquare.setIcon(white);
            //for rows 0,1,2, check black/white, put red if white


            for (y = 0; y < 8; y++)
            {
                
                if (y < 3)
                {
                    pieceHere = 1;
                    btnPiece.setIcon(redPiece);

                }
                else if(y > 4)
                {
                    pieceHere = 2;
                    btnPiece.setIcon(whitePiece);
                }
                else
                {
                    pieceHere = 0;
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