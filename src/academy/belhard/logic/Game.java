package academy.belhard.logic;

import academy.belhard.util.GamerSymbolUtil;

import static academy.belhard.logic.GameResult.NOT_FINISHED;

public class Game {
    private GameField gameField;
    private GameResult result;
    private boolean gamer;

    public Game() {
        gameField = new GameField();
        result = NOT_FINISHED;
        gamer = true;
    }

    public void start() {
        boolean gamer = true;

        while (result == NOT_FINISHED) {
            Step step = new Step(gamer);

            System.out.println("Ход игрока " + GamerSymbolUtil.convert(step.getGamer()));
            step.fillStep();

            boolean cellFilled = gameField.fillCell(step.getGamer(), step.getRaw(), step.getCol());
            gameField.printField();

            changeGamer(cellFilled);

            result = gameField.gameResult();
        }

        System.out.println(result);
    }

    private void changeGamer(boolean cellFilled) {
        if (cellFilled) {
            gamer = !gamer;
        } else {
            System.out.println("Эта ячейка уже заполнена");
        }
    }
}
