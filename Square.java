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
    JButton btnSqaure;// = new JButton();
    //JButton blackSquare = new JButton();
    boolean isWhite = false;

    public Square(int x, int y, boolean isW)
    {
        xPosition = x;
        yPosition = y;
        isWhite = isW;

        JButton btnSqaure = new JButton();

        if (isWhite == true)
        {
            btnSqaure.setIcon(white);
        }
        else
        {
            btnSqaure.setIcon(black);
        }
        
    }

    public JButton getButton()
    {
        return btnSqaure;
    }

    public static void main(String[] args)
    {

    }
}