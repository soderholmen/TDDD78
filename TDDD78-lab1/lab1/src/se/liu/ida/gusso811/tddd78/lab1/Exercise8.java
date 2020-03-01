package se.liu.ida.gusso811.tddd78.lab1;

import javax.swing.*;

/**
 * Created by gurra on 1/28/16.
 */
public class Exercise8 {
    public static void main(String[] args) {
        while(true){
            if (askUser("Quit?") || askUser("Really?")) {
                break;
            }
        }

    }
    public static boolean askUser(String question){
        return JOptionPane.showConfirmDialog(null, question, "",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

    }
}
