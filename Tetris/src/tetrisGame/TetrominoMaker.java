package tetrisGame;

import java.util.Random;

/**
 * Created by gurra on 4/19/16.
 */
public final class TetrominoMaker {


    public static int getNumberOfTypes() {
        return SquareType.values().length;
    }

    public static Poly getPoly() {
        SquareType[][][] witchSquare = new SquareType[][][]{
                squareI(), squareO(),squareT(),squareS(),squareZ(),squareJ(),squareL()
        };
        int n = new Random().nextInt(TetrominoMaker.getNumberOfTypes());
        return new Poly(witchSquare[n]);
    }


    public static SquareType[][] squareI() {
        return new SquareType[][]{
                {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY},
                {SquareType.I, SquareType.I, SquareType.I, SquareType.I},
                {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY},
                {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY}
        };
    }

    public static SquareType[][] squareO() {
        return new SquareType[][]{
                {SquareType.O, SquareType.O},
                {SquareType.O, SquareType.O}
        };
    }

    public static SquareType[][] squareT() {
        return new SquareType[][]{
                {SquareType.EMPTY, SquareType.T, SquareType.EMPTY},
                {SquareType.T, SquareType.T, SquareType.T},
                {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY}
        };
    }

    public static SquareType[][] squareS() {
        return new SquareType[][]{
                {SquareType.EMPTY, SquareType.S, SquareType.S},
                {SquareType.S, SquareType.S, SquareType.EMPTY},
                {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY}
        };
    }

    public static SquareType[][] squareZ() {
        return new SquareType[][]{
                {SquareType.Z, SquareType.Z, SquareType.EMPTY},
                {SquareType.EMPTY, SquareType.Z, SquareType.Z},
                {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY}
        };
    }

    public static SquareType[][] squareJ() {
        return new SquareType[][]{
                {SquareType.J, SquareType.EMPTY, SquareType.EMPTY},
                {SquareType.J, SquareType.J, SquareType.J},
                {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY}
        };
    }

    public static SquareType[][] squareL() {
        return new SquareType[][]{
                {SquareType.EMPTY, SquareType.EMPTY, SquareType.L},
                {SquareType.L, SquareType.L, SquareType.L},
                {SquareType.EMPTY, SquareType.EMPTY, SquareType.EMPTY}
        };
    }
}

