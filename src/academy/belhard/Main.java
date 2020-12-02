package academy.belhard;

import academy.belhard.logic.Game;

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
        Game game = new Game();
        game.start();
    }
}
