import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Point;
/**
*@author Jack Holden - 34725091
*@version 1.0
 * Represents the individual squares of the game "Draughts"
 * which are then taken by the Board GUI.
 **/
public class Square implements ActionListener
{
    /**
     * This creates and empty border for the buttons.
     **/
    Border borderE = BorderFactory.createEmptyBorder();

    /**
     * This sets the variables to int.
     **/
	int xPosition;
    int yPosition;
    
    /**
     *This is where all of the variables are declared. 
     **/
    ImageIcon white = new ImageIcon("empty.png");
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

    /**
     * This calls the action performer
     * @param e This allows the code to access the properties of "ActionEvent"
     **/
    public void actionPerformed(ActionEvent e)
    {
    /**
     * When the action is performed, the position in the array is displayed.
     **/
        System.out.println(xPosition+" "+yPosition+" ");
    }

    /**
     * This is the Square class, where squares are generated based on values.
     * @param x This is the x-coordinate of the array.
     * @param y This is the y-coordinate of the array.
     * @param isW This is the boolean to decide if the position is a white square or not.
     **/
    public Square(int x, int y, boolean isW)
    {
        /**
        * This sets various variables to a simpler, easier to type
        * way for ease of use. 
        **/
        xPosition = x;
        yPosition = y;
        isWhite = isW;

        /**
        * This sets the border of the buttons to borderless as declared above.
        **/
        btnSquare.setBorder(borderE);
        btnPiece.setBorder(borderE);

        /**
        * This sets the square to white if isWhite is true. 
        **/
        if (isWhite == true)
        {
            btnSquare.setIcon(white);
            whitePosition.setLocation(x,y);

            /**
             *If the y-coordinate is less than or equal to 2,
             * then it sets the icon of the square to a red piece. 
             **/
                if (y <= 2)
                {
                    pieceHere = redPieceHere;
                    btnSquare.setIcon(redPiece);
                }
                /**
                *If the y-coordinate is greater than or equal to 5,
                * then it sets the icon of the square to a white piece. 
                **/
                else if(y >= 5)
                {
                    pieceHere = whitePieceHere;
                    btnSquare.setIcon(whitePiece);
                }
                /**
                 * Otherwise the square is unchanged.
                 **/
                else
                {
                    pieceHere = blankSpace;
                } 
        }
        /**
         * Then the square is set to a black image.
         **/
        else
        {
            btnSquare.setIcon(black);
        }
        /**
         * This sets up the actionListener on the btnSquare.
         **/
        btnSquare.addActionListener(this);
    }

    /**
     * This is the return class for getButton.
     **/
    public JButton getButton()
    {
        return btnSquare;
    }

    public static void main(String[] args)
    {
        
    }
}