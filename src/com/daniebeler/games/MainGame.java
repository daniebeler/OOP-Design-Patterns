package com.daniebeler.games;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {

    private List<Actor> actors;
    private Player player;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        this.player = new Player();

        MoveStrategy ms1 = new MoveVertical(0, 0, 0.3f);
        CircleActor ca1 = new CircleActor(ms1);
        MoveStrategy ms2 = new MoveHorizontal(500, 100, 0.3f);
        CircleActor ca2 = new CircleActor(ms2);

        MoveStrategy ms3 = new MoveDiagonal(100, 200, 0.1f);
        OvalActor oa1 = new OvalActor(ms3);
        MoveStrategy ms4 = new MoveDiagonal(600, 300, 0.3f);
        OvalActor oa2 = new OvalActor(ms4);

        MoveStrategy ms5 = new MoveVertical(500, 200, 0.1f);
        RectActor ra1 = new RectActor(ms5);
        MoveStrategy ms6 = new MoveHorizontal(300, 200, 0.2f);
        RectActor ra2 = new RectActor(ms6);

        this.actors.add(player);
        this.actors.add(ca1);
        this.actors.add(ca2);
        this.actors.add(oa1);
        this.actors.add(oa2);
        this.actors.add(ra1);
        this.actors.add(ra2);

/*        this.actors.add(new Snowflakes(Snowflakes.size.small));
        this.actors.add(new Snowflakes(Snowflakes.size.big));
        this.actors.add(new Snowflakes(Snowflakes.size.small));
        this.actors.add(new Snowflakes(Snowflakes.size.small));*/

        this.player.addObserver(ca1);
        this.player.addObserver(ca2);
        this.player.addObserver(oa1);
        this.player.addObserver(oa2);
        this.player.addObserver(ra1);
        this.player.addObserver(ra2);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors){
            actor.update(gameContainer, delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors){
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
