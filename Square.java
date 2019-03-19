import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square
{
    ImageIcon white = new ImageIcon("empty1.png");                                   //Sets the variable "white" to the Empty1 image.
    ImageIcon black = new ImageIcon("empty2.png");
    ImageIcon selectedSquare = new ImageIcon("selected.png");
    ImageIcon redPiece = new ImageIcon("red.png");
    ImageIcon redKing = new ImageIcon("red-king.png");
    ImageIcon whitePiece = new ImageIcon("white.png");
    ImageIcon whiteKing = new ImageIcon("white-king.png");
    JButton whiteP = new JButton(white);
    JButton blackP = new JButton(black);
    JButton selected = new JButton(selected);

    public Square(int x, int y)
    {

    }

    public static void main(String[] args)
    {

    }
}