package com.daniebeler.games;

public class MoveDiagonal implements MoveStrategy{

    private float x, y, speedX, speedY;

    public MoveDiagonal(float x, float y, float speed){
        super();
        this.x = x;
        this.y = y;
        this.speedX = speed;
        this.speedY = speed;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void update(int delta){
        if(this.x > 800 || this.x < 0){
            speedX *= -1;
        }

        if(this.y > 600 || this.y < 0){
            speedY *= -1;
        }

        this.y += delta * speedY;
        this.x += delta * speedX;
    }
}
