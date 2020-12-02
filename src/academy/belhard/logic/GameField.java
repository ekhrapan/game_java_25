package academy.belhard.logic;

import academy.belhard.util.GamerSymbolUtil;

import static academy.belhard.logic.GameResult.*;

public class GameField {
    private final static int FIELD_SIZE = 3;
    private Boolean[][] field;

    public GameField() {
        field = new Boolean[FIELD_SIZE][FIELD_SIZE];
    }

    public boolean fillCell(boolean value, int raw, int col) {
        if (field[raw][col] == null) {
            field[raw][col] = value;

            return true;
        }

        return false;
    }

    public void printField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {

                String symbol = GamerSymbolUtil.convert(field[i][j]);

                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public GameResult gameResult() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            if (field[i][0] != null && field[i][0] == field[i][1] && field[i][1] == field[i][2]) {
                if (field[i][0]) {
                    return X_WINS;
                }

                return ZERO_WINS;
            }

            if (field[0][i] != null && field[0][i] == field[1][i] && field[1][i] == field[2][i]) {
                if (field[0][i]) {
                    return X_WINS;
                }

                return ZERO_WINS;
            }
        }

        if (field[0][0] != null && field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
            if (field[0][0]) {
                return X_WINS;
            }

            return ZERO_WINS;
        }

        if (field[0][2] != null && field[0][2] == field[1][1] && field[1][1] == field[2][0]) {
            if (field[0][2]) {
                return X_WINS;
            }

            return ZERO_WINS;
        }

        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (field[i][j] == null) {
                    return NOT_FINISHED;
                }
            }
        }

        return DRAW;
    }

}
