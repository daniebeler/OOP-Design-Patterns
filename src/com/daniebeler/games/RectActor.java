package com.daniebeler.games;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor implements Actor, Observer{

    private MoveStrategy moveStrategy;
    private Color color;

    @Override
    public void inform() {
        this.color = color.pink;
    }

    public RectActor (MoveStrategy mr){
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
        graphics.drawRect(moveStrategy.getX(), moveStrategy.getY(), 50, 50);
        graphics.setColor(Color.white);
    }
}
