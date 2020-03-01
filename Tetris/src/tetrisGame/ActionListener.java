package tetrisGame;


import javafx.event.ActionEvent;

import java.util.EventListener;

public interface ActionListener extends EventListener {
    public void actionPerformed(ActionEvent e);
}