package game;

import message.Message;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    JPanel upPanel=new JPanel();
    JLabel numberID=new JLabel("Phone ID: "+idReader());
    public String PHONE_ID;

    public Game(){
        this.setSize(670, 750);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1,2));
        this.add(upPanel);

        //idReader();
        upPanel.add(numberID);
        upPanel.setLocation(20,730);
        
        setVisible(true);
    }
    public void paint(Graphics g) {
        //visualize board
        super.paint(g);
        for (int row = 4; row < 68; row++) {
            for (int col = 4; col < 68; col++) {
                Grid tile = new Grid();
                tile.render(g);
            }
        }

    }
    //paint tiles
    public String idReader(){
        int type=(int)(Math.random()*5+1);

        switch (type) {
            case 1:
                PHONE_ID = "J763287TXY";
                break;

            case 2:
                PHONE_ID = "F83USL00IZ";
                break;

            case 3:
                PHONE_ID = "M993HS0NRR";
                break;

            case 4:
                PHONE_ID = "A1234JSIWN";
                break;

            case 5:
                PHONE_ID = "V92UDJHP09";
                break;
        }
        return PHONE_ID;
    }
}
