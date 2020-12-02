package academy.belhard.test;

import academy.belhard.logic.GameField;
import academy.belhard.logic.GameResult;

import static academy.belhard.logic.GameResult.X_WINS;

public class GameResultTest {

    public static void main(String[] args) {
        GameField gf1 = new GameField();
        gf1.fillCell(true, 0, 0);
        gf1.fillCell(true, 0, 1);
        gf1.fillCell(true, 0, 2);

        GameResult r1 = gf1.gameResult();
        if (r1 == X_WINS) {
            System.out.println("TEST 1 SUCCESS!!!");
        } else {
            System.out.println("TEST 1 ERROR!!!");
        }

        GameField gf2 = new GameField();
        gf2.fillCell(true, 1, 0);
        gf2.fillCell(true, 1, 1);
        gf2.fillCell(true, 1, 2);

        GameResult r2 = gf2.gameResult();
        if (r2 == X_WINS) {
            System.out.println("TEST 2 SUCCESS!!!");
        } else {
            System.out.println("TEST 2 ERROR!!!");
        }
    }
}
