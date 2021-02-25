package game;

import message.Message;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Grid extends JFrame implements MouseListener {
    public static final int TILE_SIZE = 10;
    private int randomizer = (int) (Math.random() * 5 + 1);
    private Color faceColor= Color.BLACK;

    private int row;
    private int col;
    private Color color;
    private static int clicks = 0;
    private static int defects = 0;
    private static int pixelChecked=0;
    private static int phonesChecked=0;
    private int phonesBroken=0;

    private boolean isRowEven = (row % 2 == 0);
    private boolean isRowOdd = !isRowEven;
    private boolean isColEven = (col % 2 == 0);
    private boolean isColOdd = !isColEven;

    public Grid(int row, int col) {
        this.row = row;
        this.col = col;
        this.color=color;

        this.addMouseListener(this);
    }

    public void render(Graphics g) {
        int tileX = this.col * TILE_SIZE;
        int tileY = this.row * TILE_SIZE;
        g.fillRect(tileX, tileY, TILE_SIZE, TILE_SIZE);
        
        if (randomizer == 1) {
            getTileColor1(g);
        }
        if (randomizer == 2) {
            getTileColor2(g);
        }
        if (randomizer == 3) {
            getTileColor3(g);
        }
        if (randomizer == 4) {
            getTileColor4(g);
        }
        if (randomizer == 5) {
            getTileColor5(g);
        }
    }

    //tile randomizer
    public void getTileColor1(Graphics g) {
        if (isRowEven && isColEven) {g.setColor(Color.RED);}
        if (isRowEven && isColOdd) {g.setColor(Color.GREEN);}
        g.setColor(Color.BLUE);
    }
    public void getTileColor2(Graphics g) {
        if(isRowEven && isColEven && randomizer==2){g.setColor(Color.GREEN);}
        if(isRowEven && isColOdd && randomizer==2) {g.setColor(Color.BLUE);}
        g.setColor(Color.RED);
    }
    public void getTileColor3(Graphics g) {
        if(isRowEven && isColEven && randomizer==2){g.setColor(Color.RED);}
        if(isRowEven && isColOdd && randomizer==2) {g.setColor(Color.BLUE);}
        g.setColor(Color.GREEN);
    }
    public void getTileColor4(Graphics g) {
        if(isRowEven && isColEven && randomizer==2){g.setColor(Color.BLUE);}
        if(isRowEven && isColOdd && randomizer==2) {g.setColor(Color.GREEN);}
        g.setColor(Color.RED);
    }
    public void getTileColor5(Graphics g) {
        if(isRowEven && isColEven && randomizer==2){g.setColor(Color.GREEN);}
        if(isRowEven && isColOdd && randomizer==2) {g.setColor(Color.RED);}
        g.setColor(Color.BLUE);
    }

//status of pixel(burned/to burn)
    public void showStatus(){
        int status=(int)(Math.random()*3+1);
        if (status==1){
            isBurned();
            defects++;
            pixelChecked++;
        }
        if (status==2){
            isAboutToBurn();
            pixelChecked++;
            defects++;
        }
        pixelChecked++;
    }

    public boolean isBurned(){
        faceColor=Color.BLACK;
        return true;
    }
    public boolean isAboutToBurn(){
        faceColor=Color.BLACK;
        return true;
    }

    public boolean isThePhoneBroken(){
        if (defects>=32 && pixelChecked==64){
            Message.render(this,"Attention!","Phone is broken!");
            phonesChecked++;
            phonesBroken++;
            return true;
        }
        Message.render(this,"Check","Phone is working!");
        phonesChecked++;
        return false;
    }

    public void operationOver(){
        int workingPhones=5-phonesBroken;
        if (phonesChecked==5){
            Message.render(this,"Attention!","Phone check is complete!");
            System.out.print("Broken phones: "+phonesBroken+"\n Working phones: "+workingPhones);
        }
    }

        @Override
    public void mouseClicked(MouseEvent e) {
        for (int clicks=0; clicks<=3; clicks++){
            showStatus();
            clicks=0;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}