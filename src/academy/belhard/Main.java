package academy.belhard;

import static academy.belhard.GameResult.NOT_FINISHED;

public class Main {

    /**
     * 1. Игровое поле
     * 2. Крестики и нолики
     * 3. Игроки
     * 4. Ходы
     * 5. Способ ввода
     * 6. Алгоритм победы
     */

    public static void main(String[] args) {
        GameField gameField = new GameField();

        boolean gamer = true;
        while ( != NOT_FINISHED) {
            Step step = new Step(gamer);

            System.out.println("Ход игрока " + GamerSymbolUtil.convert(step.getGamer()));
            step.fillStep();

            gameField.fillCell(step.getGamer(), step.getRaw(), step.getCol());
            gameField.printField();

            gamer = !gamer;
        }
    }
}
