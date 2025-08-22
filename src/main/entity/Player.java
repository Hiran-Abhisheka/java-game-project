package main.entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import utils.AssetLoader;

public class Player {

    private int x, y;
    private final int speed = 4;
    private BufferedImage sprite;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        sprite = AssetLoader.loadImage("/assets/characters/player/Swordman_lvl2_walk_with_shadow.png");
    }

    public void move(boolean up, boolean down, boolean left, boolean right) {
        if (up) y -= speed;
        if (down) y += speed;
        if (left) x -= speed;
        if (right) x += speed;
    }

    public void draw(Graphics g) {
        if (sprite != null) {
            g.drawImage(sprite, x, y, null);
        }
    }
}