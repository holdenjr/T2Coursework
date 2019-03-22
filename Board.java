import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Represents the board of the game "Draughts"
 * where the GUI is displayed, creating the
 * board.
 */
public class Board
{
    public Board()
    {
        /**
         * Creates a new JFrame for the game, and a 
         * new JPanel.
         */
        JFrame board = new JFrame("Draughts");
        JPanel panel = new JPanel();

        /**
         * Sets a grid layout with the name "grid".
         * @param 8 This is the x-coordinate.
         * @param 8 This is the y-coordinate.
         */
        GridLayout grid = new GridLayout(8,8);

        /**
         * This sets the sizes of the board and panel, and sets 
         * the layout of the panel to the aforementioned grid.
         * @param 800 sets the x-length of the board.
         * @param 800 sets the y-length of the board.
         * @param 800 sets the x-length of the panel.
         * @param 800 sets the y-length of the panel.
         */
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