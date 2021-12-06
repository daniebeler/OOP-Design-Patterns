package com.daniebeler.games;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class OvalActor implements Actor, Observer{

    private MoveStrategy moveStrategy;
    private Color color;

    public OvalActor (MoveStrategy mv){
        super();
        this.moveStrategy = mv;
        this.color = Color.white;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        moveStrategy.update(delta);
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
