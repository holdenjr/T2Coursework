import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Point;

public class Square
{
    Border borderE = BorderFactory.createEmptyBorder();

	int xPosition;
    int yPosition;

    ImageIcon white = new ImageIcon("empty1.png");
    ImageIcon black = new ImageIcon("empty2.png");
    ImageIcon selectedSquare = new ImageIcon("selected.png");
    ImageIcon redPiece = new ImageIcon("red.png");
    ImageIcon redKing = new ImageIcon("red-king.png");
    ImageIcon whitePiece = new ImageIcon("white.png");
    ImageIcon whiteKing = new ImageIcon("white-king.png");
    JButton btnSquare = new JButton();
    JButton btnPiece = new JButton();
    Point whitePosition = new Point();
    public boolean isWhite;
    public String pieceHere;    

    String redPieceHere = "RED";
    String whitePieceHere = "WHITE";
    String blankSpace = "NULL";

    public void setLocation(int x, int y)
    {

    }
    public Square(int x, int y, boolean isW)
    {
        xPosition = x;
        yPosition = y;
        isWhite = isW;

        btnSquare.setBorder(borderE);
        btnPiece.setBorder(borderE);

        if (isWhite == true)
        {
            btnSquare.setIcon(white);
            whitePosition.setLocation(x,y);
            System.out.println(whitePosition.getLocation());

            //for rows 0,1,2, check black/white, put red if white
            //for rows 5,6,7, check if white, put white piece if white

                if (y <= 2)
                {
                    pieceHere = redPieceHere;
                    btnSquare.setIcon(redPiece);
                }
                else if(y >= 5)
                {
                    pieceHere = whitePieceHere;
                    btnSquare.setIcon(whitePiece);
                }
                else
                {
                    pieceHere = blankSpace;
                }
            
        }
        else
        {
            btnSquare.setIcon(black);
        }
    }

    public JButton getButton()
    {
        return btnSquare;
    }

    public static void main(String[] args)
    {

    }
}