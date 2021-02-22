package game;

import java.awt.*;

public class Grid {
    public static final int TILE_SIZE = 10;
    private int row;
    private int col;

    public Grid(){
        this.row=row;
        this.col=col;
    }

    public void render(Graphics g){
        for (int x = 0; x<64;x++){
            for (int y = 0; y<64;y++){
                getColor(g);
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
    private void getColor(Graphics g){
        int randomizer=(int)(Math.random()*6+1);

        if (randomizer==1){
            typeA();
        }
        if (randomizer==2){
            typeA();
        }
        if (randomizer==3){
            typeA();
        }
        if (randomizer==4){
            typeA();
        }
        if (randomizer==5){
            typeA();
        }
        if (randomizer==6){
            typeA();
        }
    }

    private Color typeA(){
        boolean isRowEven  = (row % 2 == 0);
        boolean isRowOdd   = !isRowEven;
        boolean isColEven  = (col % 2 == 0);
        boolean isColOdd   = !isColEven;

        if(isRowEven && isColEven   ) return Color.BLUE;
        if(isRowEven && isColOdd    ) return Color.GREEN;
        if(isRowOdd  && isColEven   ) return Color.RED;
        return Color.RED;
    }
}