package tetrisGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Gustaf on 2016-04-19.
 */
public class TetrisFrame_v1 extends JFrame {

    private Board board;
    private JTextPane textArea;

    public TetrisFrame_v1(Board board, String windowName) throws HeadlessException {
        super(windowName);
        this.board = board;
        this.textArea = new JTextPane();
        this.setLayout(new BorderLayout());
        this.add(textArea, BorderLayout.CENTER);
        board.randomBoard(board);
        textArea.setText(BoardToTextConverter.convertToText(board));
        textArea.setFont(new Font("Monospaced",Font.PLAIN,20));
        this.pack(); this.setVisible(true);
    }

    public void changeContent(){
        board.randomBoard(board);
        textArea.setText(BoardToTextConverter.convertToText(board));



    }

}
