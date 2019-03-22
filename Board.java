import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
*@author Jack Holden - 34725091
*@version 1.0
 * Represents the board of the game "Draughts"
 * where the GUI is displayed, creating the
 * board.
 **/
public class Board
{
    /**
     * This is the Board class.
     **/
    public Board()
    {
        /**
         * Creates a new JFrame for the game, and a 
         * new JPanel.
         **/
        JFrame board = new JFrame("Draughts");
        JPanel panel = new JPanel();

        /**
         * Sets a grid layout with the name "grid".
         **/
        GridLayout grid = new GridLayout(8,8);

        /**
         * This sets the sizes of the board and panel, and sets 
         * the layout of the panel to the aforementioned grid.
         **/
        board.setSize(800,800);
        panel.setSize(800,800);
        panel.setLayout(grid);

        /**
         * This sets the title of the board to "Draughts"
         * and ensures that the GUI is closed when exited.
         **/
        board.setTitle("Draughts");
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         * This sets the variable SIZE to 8.
         **/
        final int SIZE = 8;

        /**
         * This creates a 2D array, called buttons calling
         * variables from Square using the SIZE variable 
         * declared previously.
         **/
        Square[][] buttons = new Square[SIZE][SIZE];

        /**
         * This loop sets the variable a to 0, then as long as it is
         * below SIZE (8), it will increment by 1.
         **/
        for (int a = 0; a < SIZE; a++)
        {
            /**
             * This loop sets the b variable to 0, then as long as it is
             * below SIZE (8), it will increment by 1.
             **/
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
        
        /**
        * This sets the board's content pane to Panel,
        * and then sets the board's visibility to true.
        **/

        board.setContentPane(panel);
        board.setVisible(true);
    }
    public static void main(String[] args)
    {
        /**
         * This creates the board.
         */
        Board board = new Board();
    }  
}