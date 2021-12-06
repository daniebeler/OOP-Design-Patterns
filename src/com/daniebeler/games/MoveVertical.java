package com.daniebeler.games;

public class MoveVertical implements MoveStrategy {

    private float x, y, speed;

    public MoveVertical(float x, float y, float speed){
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
        if(this.y > 600 || this.y < 0){
            speed *= -1;
        }

        this.y += delta * speed;
    }
}
