package com.daniebeler.games;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class RectActor extends AbstractActor implements Observer{

    private Color color;

    @Override
    public void inform() {
        this.color = Color.pink;
    }

    public RectActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
        this.color = Color.white;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.drawRect(moveStrategy.getX(), moveStrategy.getY(), 50, 50);
        graphics.setColor(Color.white);
    }
}
