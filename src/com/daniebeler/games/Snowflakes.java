package com.daniebeler.games;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import java.util.Random;

public class Snowflakes extends AbstractActor implements Observer{

    private int width;
    private int height;
    private float x;
    private float y;
    private float speed;
    Random random;

    private Color color;

    private size siz;

    @Override
    public void inform() {

    }

    public enum size{
        small, medium, big
    }

    public Snowflakes(MoveStrategy moveStrategy) {
        super(moveStrategy);
        this.color = Color.white;
        this.random = new Random();
        this.x = random.nextInt(800) + 1;
        this.siz = siz;

        if(this.siz == size.small){
            this.width = 10;
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.drawRect(moveStrategy.getX(), moveStrategy.getY(), 50, 50);
        graphics.setColor(Color.white);
    }
}
