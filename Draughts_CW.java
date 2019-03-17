import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class draughtsCW
{


    public static class gameBoard
    {
        JFrame board = new JFrame("Draughts");
        JPanel back = new JPanel();
    }

    public board()
    {
        board.setSize();
        back.setSize();
        board.setTitle("Draughts!");
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setVisible(true);
        back.setVisible(true);
    }



}