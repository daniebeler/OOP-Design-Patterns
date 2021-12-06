package com.daniebeler.games;

import org.newdawn.slick.GameContainer;

import org.newdawn.slick.*;

public interface Actor {

    public void update(GameContainer gc, int delta);

    public void render(Graphics graphics);
}
