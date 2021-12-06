package com.daniebeler.games;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class CircleActor extends AbstractActor implements Observer{

    private Color color;

    public CircleActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
        this.color = Color.white;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.drawOval(this.moveStrategy.getX(), moveStrategy.getY(), 50, 50);
        graphics.setColor(Color.white);
    }

    @Override
    public void inform() {
        this.color = Color.pink;
    }
}
