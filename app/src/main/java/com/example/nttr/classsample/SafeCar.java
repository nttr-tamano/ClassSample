package com.example.nttr.classsample;

/**
 * Created by nttr on 2018/01/17.
 */

public class SafeCar extends Car {
    public SafeCar() {
        super();
    }

    public SafeCar(String color) {
        super(color);
    }

    @Override
    public void speedUp() {
        super.speedUp();
        if (this.speed > 100) {
            this.speed = 100;
        }
    }

    @Override
    public void speedDown() {
        super.speedDown();
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    @Override
    int getSpeed() {
        return super.getSpeed();
    }
}
