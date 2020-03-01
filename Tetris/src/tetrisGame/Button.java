package tetrisGame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Button implements ActionListener
{
    private String button;

    public Button(String button) {
	this.button = button;

    }

    @Override public void actionPerformed(final ActionEvent e) {
	if (button == "Start") {

	} else {
	    System.out.print("Quit");
	}
    }
}

