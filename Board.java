import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board
{
    public static void main(String[] args)
    {
        JFrame board = new JFrame("Draughts");
        JPanel panel = new JPanel();

        GridLayout grid = new GridLayout(8,8);

        board.setSize(800,800);
        panel.setSize(800,800);
        panel.setLayout(grid);

        final int SIZE = 8;

        board.setTitle("Draughts");
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setVisible(true);


        Square[][] buttons = new Square[SIZE][SIZE];

        for (int a = 0; a < SIZE; a++)
        {
            for (int b = 0; b < SIZE; b++)
            {
                       System.out.println(a+" "+b+" "+SIZE);
                if((a+b)%2 != 0)
                {
                    buttons[a][b] = new Square(a, b, false);
                    panel.add(buttons[a][b].getButton());
                }
                else
                {
                    buttons[a][b] = new Square(a, b, true);
                    panel.add(buttons[a][b].getButton());
                }               
            }
        }  

        board.add(panel);
        panel.setVisible(true); 

 
    }
}