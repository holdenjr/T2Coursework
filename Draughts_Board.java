import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Draughts_Board
{
        private JFrame board = new JFrame("Draughts");                                   //Creates the Frame, and names it Draughts.
        private JPanel panel = new JPanel();                                             //Creates the panel.

        ImageIcon white = new ImageIcon("empty1.png");                                   //Sets the variable "white" to the Empty1 image.
        ImageIcon black = new ImageIcon("empty2.png");                                   //Sets the variable "black" to the Empty2 image.

        GridLayout grid = new GridLayout(8,8);                                           //Declares the grid layout of 8x8.

        //JButton b = new JButton(white);
        //JButton w = new JButton(black);

        private JButton[][]buttons;                                                      //Creates the button array.
        private final int SIZE = 8;                                                      //Sets the word "SIZE" as 8.
 
    public Draughts_Board()
    {
        board.add(panel);                                                                //Adds the panel to the board.
        board.setSize(800,800);                                                          //Sets the size of the board.
        panel.setSize(800,800);                                                          //Sets the size of the panel.

        panel.setLayout(grid);                                                           //Sets the panel to the layout of "grid".

        //panel.add(b);
        //panel.add(w);
        //b.setSize(100,100);
        //w.setSize(100,100);
        buttons = new JButton[SIZE][SIZE];                                               //Sets the size of the "buttons" array.
        addButtons();

        board.setTitle("Draughts!");                                                     //Sets the title of the board as "Draughts!".
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                            //Closes the board upon exit.
        board.setVisible(true);                                                          //Sets the board so that it is visible.

        panel.setVisible(true);                                                          //Sets the panel so that it is visible.  
    }

    public void addButtons()
    {
        for (int a = 0; a < SIZE; a++)                                                   //When a is less than 8, add one.
        {
            for (int b = 0; b < SIZE; b++)                                               //When b is less than 8, add one.
            {
                if((a+b)%2 != 0){                                                        //If a + b remainder 2 is not equal to 0.
                    buttons[a][b] = new JButton(white);                                  //Add a new white button.
                    panel.add(buttons[a][b]);
                }
                else{
                    buttons[a][b] = new JButton(black);                                  //Otherwise, add a black button.
                    panel.add(buttons[a][b]);
                }
            }
        }    
    }

    public static void main(String[] args)
    {
        Draughts_Board board = new Draughts_Board();                                    //This creates the board.
    }
}