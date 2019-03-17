import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Draughts_Board
{
        JFrame board = new JFrame("Draughts");
        JPanel panel = new JPanel();
        ImageIcon white = new ImageIcon("empty1.png");
        JButton b = new JButton(white);
        ImageIcon black = new ImageIcon("empty2.png");
        JButton w = new JButton(black);
        GridLayout grid = new GridLayout(8,8);

    public Draughts_Board()
    {
        board.add(panel);
        board.setSize(800,800);
        panel.setSize(800,800);

        panel.setLayout(grid);

        panel.add(b);
        panel.add(w);
        b.setSize(100,100);
        w.setSize(100,100);


        board.setTitle("Draughts!");
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setVisible(true);
        
        panel.setVisible(true);
    }

    public static void main(String[] args)
    {
        Draughts_Board board = new Draughts_Board();
    }
}