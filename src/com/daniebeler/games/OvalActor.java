package com.daniebeler.games;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class OvalActor extends AbstractActor implements Observer{

    private Color color;

    public OvalActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
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
