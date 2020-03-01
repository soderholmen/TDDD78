package tetrisGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by gurra on 4/19/16.
 */
public final class BoardTest {

    private static int boardHeight = 30;
    private static int boardWidth = 50;

    public static void main(String[] args) {
        Board test = new Board(boardHeight, boardWidth);
        Window window = new Window(test);

        /*
        final Action doOneStep = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                frame.changeContent();
            }
        };
        final Timer clockTimer = new Timer(1000, doOneStep);
        clockTimer.setCoalesce(true);
        clockTimer.start();
*/
    }
}
