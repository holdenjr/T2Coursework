import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board
{

    public Board()
    {
        JFrame board = new JFrame("Draughts");
        JPanel panel = new JPanel();

        GridLayout grid = new GridLayout(8,8);

        board.setSize(800,800);
        panel.setSize(800,800);
        panel.setLayout(grid);

        board.setTitle("Draughts");
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final int SIZE = 8;
        Square[][] buttons = new Square[SIZE][SIZE];

        for (int a = 0; a < SIZE; a++)
        {
            for (int b = 0; b < SIZE; b++)
            {
                if((a+b)%2 != 0)
                {
                    buttons[a][b] = new Square(b, a, true);
                    panel.add(buttons[a][b].getButton());
                    //panel.add(buttons[a][b].getPiece());
                }
                else
                {
                    buttons[a][b] = new Square(b, a, false);
                    panel.add(buttons[a][b].getButton());
                }               
            }
        }  

        board.setContentPane(panel);
        board.setVisible(true);
    }
    public static void main(String[] args)
    {
        Board board = new Board();
    }  
}