package game;

import java.awt.*;

public class Grid {
    public static final int TILE_SIZE = 10;
    private int row;
    private int col;
    private int randomizer=(int)(Math.random()*64+1);

    public Grid(){
        this.row=row;
        this.col=col;
    }

    public void render(Graphics g){
        for (int x = 0; x<64;x++){
            for (int y = 0; y<64;y++){

                boardGrid(g);
            }
        }
    }
    //draw border between different squares
    private void boardGrid(Graphics g){
        g.setColor(Color.BLACK);
        for(int i = 0; i <=630; i+= 10){
            for (int j = 0; j<= 630; j += 10){
                g.drawRect(i,j,10,10);
            }
        }
    }
}