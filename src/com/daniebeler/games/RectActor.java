package com.daniebeler.games;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class RectActor extends AbstractActor implements Observer{

    private Color color;

    @Override
    public void inform() {
        this.color = Color.pink;
    }

    public RectActor() {
        super(new MoveDiagonal(new Random().nextInt(800), new Random().nextInt(600), 0.1f + new Random().nextFloat() * (1 - 0.1f)));
        this.color = Color.white;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.drawRect(moveStrategy.getX(), moveStrategy.getY(), 50, 50);
        graphics.setColor(Color.white);
    }
}
