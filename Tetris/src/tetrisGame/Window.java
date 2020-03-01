package tetrisGame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

import java.awt.*;
import net.miginfocom.swing.MigLayout;



public class Window
{
    private JFrame window;
    private Board board;

    public Window(Board board) {
	this.board = board;
	this.window = new JFrame("Tetris");
	final JButton start = new JButton("Start");
	final JButton quit = new JButton("Quit");
	JPanel contentPane = new JPanel();
	contentPane.setOpaque(true);
	contentPane.setBackground(Color.RED.darker().darker());
	contentPane.setBorder(
			BorderFactory.createEmptyBorder(5, 5, 5, 5));
	start.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e)
	            {
			contentPane.removeAll();
			contentPane.add();
			contentPane.revalidate();
			contentPane.repaint();
	            }
	        });
	quit.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e)
		    {
			int optionPane = JOptionPane.showOptionDialog(null, "u sure?", "Quit" ,   JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
			if ( optionPane == JOptionPane.YES_OPTION){
			    System.exit(0);
			}
		    }
	        });
	contentPane.setLayout(new MigLayout());
	contentPane.add(start,"wrap" );
	contentPane.add(quit);
	window.pack();
	window.setLocationByPlatform(true);
	window.setContentPane(contentPane);
	window.setVisible(true);
    }

}
