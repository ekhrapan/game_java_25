package academy.belhard;

public class GameField {
    private final static int FIELD_SIZE = 3;
    private Boolean[][] field;

    public GameField() {
        field = new Boolean[FIELD_SIZE][FIELD_SIZE];
    }

    public void fillCell(boolean value, int raw, int col) {
        if (field[raw][col] == null) {
            field[raw][col] = value;
        }
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

}
