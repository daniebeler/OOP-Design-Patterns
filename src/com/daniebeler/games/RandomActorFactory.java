package com.daniebeler.games;

import java.util.Random;

public class RandomActorFactory {

    public static Actor getRandomActor(){
        Random random = new Random();
        int number = random.nextInt(3);
        if(number == 0){
            return new CircleActor();
        }
        else if (number == 1){
            return new RectActor();
        }
        else if (number == 2){
            return new OvalActor();
        }

        return new CircleActor();
    }
}
