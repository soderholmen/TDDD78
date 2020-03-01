package se.liu.ida.gusso811.tddd78.lab4;

/**
 * Created by gurra on 4/14/16.
 */
public class GameBoard {
    private enum CellType {
        EMPTY(false), TREE(true), BUILDING(true), ROCK(true),
        POWERUP(false), BORDER(true);

        public final boolean isObstacle;

        CellType(final boolean isObstacle) {
            this.isObstacle = isObstacle;
        }


    }
    public enum Move {
        DOWN(0,1), UP(0,-1), RIGHT(1,0), LEFT(-1,0);

        public final int deltaX;
        public final int deltaY;

        Move(final int deltaX, final int deltaY) {
            this.deltaX = deltaX;
            this.deltaY = deltaY;
        }
    }

    private CellType[][] cells;
    private int currentX, currentY;

    public GameBoard(int width, int height) {
        this.cells = new CellType[height][width];
        this.currentX = width / 2;
        this.currentY = height / 2;
    }

    public boolean hasObstical(int x, int y) {
        if (cells[y][x].isObstacle){
            return true;
        }
        else {
            return false;

        }

    }
    public void move(Move move){

        if (canMove(move)){
            currentX = currentX + move.deltaX;
            currentY = currentY + move.deltaY;
        }
    }
    public boolean canMove(Move move) {
        if (hasObstical(currentY + move.deltaY, currentX + move.deltaX)){
            return false;
        }
        else{
            return true;
        }
    }
    /*
    public void moveDown() {
        if (canMoveDown()) {
            currentY++;
        }
    }

    public void moveUp() {
        if (canMoveUp()) {
            currentY--;
        }
    }

    public void moveRight() {
        if (canMoveRight()) {
            currentX++;
        }
    }

    public void moveLeft() {
        if (canMoveLeft()) {
            currentX--;
        }
    }



    public boolean canMoveRight() {
        if (hasObstical(currentY, currentX + 1)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean canMoveLeft() {
        if (hasObstical(currentY, currentX - 1)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean canMoveDown() {
        if (hasObstical(currentY + 1, currentX)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean canMoveUp() {
        if (hasObstical(currentY - 1, currentX)) {
            return false;
        } else {
            return true;
        }
    }
*/


}