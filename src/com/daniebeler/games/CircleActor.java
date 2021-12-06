package com.daniebeler.games;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor implements Actor, Observer{

    private MoveStrategy moveStrategy;
    private Color color;

    public CircleActor(MoveStrategy mr){
        super();
        this.moveStrategy = mr;
        this.color = Color.white;
    }


    @Override
    public void update(GameContainer gc, int delta) {
        moveStrategy.update(delta);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.drawOval(this.moveStrategy.getX(), moveStrategy.getY(), 50, 50);
        graphics.setColor(Color.white);
    }

    @Override
    public void inform() {
        this.color = color.pink;
    }
}
