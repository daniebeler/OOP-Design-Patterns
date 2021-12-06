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

        CircleActor ca1 = new CircleActor();
        CircleActor ca2 = new CircleActor();

        OvalActor oa1 = new OvalActor();
        OvalActor oa2 = new OvalActor();

        RectActor ra1 = new RectActor();
        RectActor ra2 = new RectActor();

        this.actors.add(player);
        this.actors.add(ca1);
        this.actors.add(ca2);
        this.actors.add(oa1);
        this.actors.add(oa2);
        this.actors.add(ra1);
        this.actors.add(ra2);

        for (int i = 0; i < 10; i++){
            Actor actor = RandomActorFactory.getRandomActor();
            this.actors.add(actor);
        }

        this.player.addObserver(ca1);
        this.player.addObserver(ca2);
        this.player.addObserver(oa1);
        this.player.addObserver(oa2);
        this.player.addObserver(ra1);
        this.player.addObserver(ra2);


        CounterSingleton cs1 = CounterSingleton.getInstance();
        CounterSingleton cs2 = CounterSingleton.getInstance();

        cs1.increase();
        cs2.increase();

        System.out.println("CounterSingleton 1: " + cs1.getCounter());
        System.out.println("CounterSingleton 2: " + cs2.getCounter());
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
