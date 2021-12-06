package com.daniebeler.games;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import java.util.Random;

public class Snowflakes implements Actor{

    private int width;
    private int height;
    private float x;
    private float y;
    private float speed;
    Random random;

    private size siz;
    public enum size{
        small, medium, big
    }

    public Snowflakes (size siz){
        super();
        this.random = new Random();
        this.x = random.nextInt(800) + 1;
        this.siz = siz;

        if(this.siz == size.small){
            this.width = 10;
        }
    }

    @Override
    public void update(GameContainer gc, int delta) {

    }

    @Override
    public void render(Graphics graphics) {

    }
}
