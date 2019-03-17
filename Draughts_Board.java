import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Draughts_Board
{
        private JFrame board = new JFrame("Draughts");
        private JPanel panel = new JPanel();

        ImageIcon white = new ImageIcon("empty1.png");
        ImageIcon black = new ImageIcon("empty2.png");

        GridLayout grid = new GridLayout(8,8);

        //JButton b = new JButton(white);
        //JButton w = new JButton(black);

        private JButton[][]buttons;
        private final int SIZE = 8;
 
    public Draughts_Board()
    {
        board.add(panel);
        board.setSize(800,800);
        panel.setSize(800,800);

        panel.setLayout(grid);

        //panel.add(b);
        //panel.add(w);
        //b.setSize(100,100);
        //w.setSize(100,100);
        buttons = new JButton[SIZE][SIZE];
        addButtons();

        board.setTitle("Draughts!");
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setVisible(true);

        panel.setVisible(true);
        
    }

    public void addButtons()
    {
        for (int a = 0; a < SIZE; a++)
        {
            for (int b = 0; b < SIZE; b++)
            {
                if((a+b)%2 != 0){
                    buttons[a][b] = new JButton(white);
                    panel.add(buttons[a][b]);
                }
                else{
                    buttons[a][b] = new JButton(black);
                    panel.add(buttons[a][b]);
                }
            }
        }    
    }

    public static void main(String[] args)
    {
        Draughts_Board board = new Draughts_Board();
    }
}