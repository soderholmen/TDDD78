package tetrisGame;

/**
 * Created by gurra on 4/19/16.
 */
public final class BoardToTextConverter {

    public static String convertToText(Board board) {
        StringBuilder boardstring = new StringBuilder();
        for (int i = 0; i < board.getHeight(); i++) {
            for (int j = 0; j < board.getWidth(); j++) {
                switch (board.whatSquareType(i, j)) {
                    case EMPTY:
                        boardstring.append(" ");
                        break;
                    case I:
                        boardstring.append("@");
                        break;
                    case O:
                        boardstring.append("£");
                        break;
                    case T:
                        boardstring.append("$");
                        break;
                    case S:
                        boardstring.append("€");
                        break;
                    case Z:
                        boardstring.append("¥");
                        break;
                    case J:
                        boardstring.append("{");
                        break;
                    case L:
                        boardstring.append("[");
                        break;
                }
            }
            boardstring.append("\n");
        }
        String resultat = boardstring.toString();
        return resultat;

    }
}