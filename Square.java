import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square
{
    ImageIcon white = new ImageIcon("empty1.png");
    ImageIcon black = new ImageIcon("empty2.png");
    ImageIcon selectedSquare = new ImageIcon("selected.png");
    ImageIcon redPiece = new ImageIcon("red.png");
    ImageIcon redKing = new ImageIcon("red-king.png");
    ImageIcon whitePiece = new ImageIcon("white.png");
    ImageIcon whiteKing = new ImageIcon("white-king.png");

    final int SIZE = 8; 

    public Square()
    {
       /* for (int a = 0; a < SIZE; a++)                                                   //When a is less than 8, add one.
        {
            for (int b = 0; b < SIZE; b++)                                               //When b is less than 8, add one.
            {
                if((a+b)%2 != 0){                                                        //If a + b remainder 2 is not equal to 0.
                    buttons[a][b] = new JButton();                                       //Add a new white button.
                    panel.add(buttons[a][b]);
                }
                else{
                    buttons[a][b] = new JButton();                                  //Otherwise, add a black button.
                    panel.add(buttons[a][b]);
                }               
            }
        }*/
    }

    public static void main(String[] args)
    {

    }
}