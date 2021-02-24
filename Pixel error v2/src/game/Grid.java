package game;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Grid implements MouseListener {
    public static final int TILE_SIZE = 10;
    private int row;
    private int col;
    private Color color;
    private static int clicks=0;
    private static int defects=0;

    public Grid(){
        this.row        = row;
        this.col        = col;
        this.color      = color;
    }
    public void render(Graphics g) {

        int tileX = this.col * TILE_SIZE;
        int tileY = this.row * TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(tileX, tileY, TILE_SIZE, TILE_SIZE);
    }

    //grid setup
    private void getColor(Graphics g){
        int randomizer=(int)(Math.random()*6+1);
        if (randomizer==1){
            typeA(g);
        }
        if (randomizer==2){
            typeA(g);
        }
        if (randomizer==3){
            typeA(g);
        }
        if (randomizer==4){
            typeA(g);
        }
        if (randomizer==5){
            typeA(g);
        }
        if (randomizer==6){
            typeA(g);
        }
        typeA(g);
    }

    private void typeA(Graphics g){
        boolean isRowEven  = (row % 2 == 0);
        boolean isRowOdd   = !isRowEven;
        boolean isColEven  = (col % 2 == 0);
        boolean isColOdd   = !isColEven;

        if(isRowEven && isColEven) {
            g.setColor(Color.GREEN);
        }
        if(isRowEven && isColOdd) {g.setColor(Color.RED);}
        if(isRowOdd  && isColEven) {g.setColor(Color.BLUE);}
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (int clicks=0; clicks<=3; clicks++){
            if (clicks==3){
                //showStatus(g);
                clicks=0;
            }
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