package main;

import java.awt.Graphics;

import main.entity.Player;

public class Game {

    private Player player;

    public Game() {
        player = new Player(100, 100); // Starting position
    }

    public void update(boolean up, boolean down, boolean left, boolean right) {
        player.move(up, down, left, right);
    }

    public void draw(Graphics g) {
        player.draw(g);
    }
}