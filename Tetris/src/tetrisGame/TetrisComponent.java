package tetrisGame;

import javax.swing.*;
import java.awt.*;

public class TetrisComponent extends JComponent {

    private Board board;

    public TetrisComponent(final Board board) {
	this.board = board;
    }


    protected void paintComponent(Graphics g) {
	super.paintComponent(g);

       }
}
