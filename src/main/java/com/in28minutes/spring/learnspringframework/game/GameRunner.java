package com.in28minutes.spring.learnspringframework.game;

public class GameRunner {
    private SuperContraGame game;

    public GameRunner(SuperContraGame game) {
        this.game=game;
    }

    public void run() {
        this.game.up();
        this.game.down();
        this.game.right();
        this.game.left();
    }
}
