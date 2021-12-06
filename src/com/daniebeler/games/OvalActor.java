package com.daniebeler.games;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class OvalActor extends AbstractActor implements Observer{

    private Color color;

    public OvalActor() {
        super(new MoveDiagonal(new Random().nextInt(800), new Random().nextInt(600), 0.1f + new Random().nextFloat() * (1 - 0.1f)));
        this.color = Color.white;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.fillOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 80, 50);
        graphics.setColor(Color.white);

    }

    public void inform(){
        this.color = Color.orange;
    }
}
