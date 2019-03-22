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
    boolean checkerP;
    public boolean isWhite;
    
    public Square(int x, int y, boolean isW, int checkerPiece)
    {
        xPosition = x;
        yPosition = y;
        isWhite = isW;
        checkerPiece = piece;

        if (isWhite == true)
        {
            btnSquare.setIcon(white);
            
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

    public static void main(String[] args)
    {

    }
}