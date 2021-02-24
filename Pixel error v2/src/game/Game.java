package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame implements ActionListener{
    JPanel rightPanel=new JPanel();
    JPanel leftPanel=new JPanel();
    JLabel numberID=new JLabel("Phone ID: "+idReader());
    public String PHONE_ID;

    JButton nextButton;

    public Game(){
        this.setSize(820, 680);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(leftPanel);
        this.add(rightPanel);

        rightPanel.add(numberID);
        rightPanel.setSize(200,30);
        rightPanel.setLocation(10,10);
        //leftPanel.add(paint(g));

        nextButton =new JButton();
        nextButton.setText("Next");
        nextButton.setSize(100,30);
        nextButton.setLocation(700,250);
        nextButton.addActionListener(this);

        this.add(nextButton);

        this.setVisible(true);
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

    //serial number
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==nextButton){
            new Game();
        }
    }
}
