package tetrisGame;

/**
 * Created by gurra on 4/19/16.
 */
import java.util.*;

public class Board {

    private SquareType[][] squares;
    private int height;
    private int width;
    private  Poly fallingPoly;
    private int fallingPolyX;
    private int fallingPolyY;

    public int fallingPolyX() {
        return fallingPolyX;
    }

    public int fallingPolyY() {
        return fallingPolyY;
    }

    public Board(int height, int width) {
        this.height = height;
        this.width = width;
        this.squares = new SquareType[height][width];
        for (int i=0; i < height; i++){
            for(int j=0; j < width; j++){
                squares[i][j] = SquareType.T;
            }
        }
        Poly fallingPoly = null;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public SquareType whatSquareType(int x, int y){
        return squares[x][y];

    }

    public Board randomBoard(Board board) {
        SquareType[] types = SquareType.values();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int a = new Random().nextInt(8);
                squares[i][j] = types[a];
            }
        }
        return board;
    }

}
