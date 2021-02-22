package game;

import message.Message;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    public Game(){
        this.setSize(670, 670);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
    }
    public void paint(Graphics g) {
        //visualize board
        super.paint(g);
        for (int row = 0; row < 64; row++) {
            for (int col = 0; col < 64; col++) {
                Grid tile = new Grid();
                tile.render(g);
            }
        }

    }
}
