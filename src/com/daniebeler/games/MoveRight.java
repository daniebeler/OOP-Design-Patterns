package com.daniebeler.games;

public class MoveRight implements MoveStrategy{

    private float x, y, speed;

    public MoveRight(float x, float y, float speed){
        super();
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void update(int delta){
        if(this.x > 800 || this.x < 0){
            speed *= -1;
        }

        this.x += delta * speed;
    }

}
