import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler;

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
    JButton whiteSquare = new JButton(white);
    JButton blackSquare = new JButton(black);
    boolean isWhite;

    public  Square(int x, int y, boolean isW)
    {
        xPosition = x;
        yPosition = y;
        isWhite = isW;
    }

    public JButton getButton()
    {
        if (isWhite == true)
        {
            return whiteSquare;
        }
        else
        {
            return blackSquare;
        }
    }

    public static void main(String[] args)
    {

    }
}