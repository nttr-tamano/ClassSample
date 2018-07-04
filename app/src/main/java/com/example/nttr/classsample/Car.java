package com.example.nttr.classsample;

/**
 * Created by nttr on 2018/01/17.
 */

public class Car {
    protected String info;  // private  : 継承したクラスのメソッド内で変数としてアクセスできない
    protected int speed;    // protected: 継承したクラスのメソッド内で変数としてアクセスできる

    // default constructor
    public Car() {          // publicクラスのメソッドは書かなくてもpublicらしい
        this.info = "赤";
        this.speed = 0;
    }

    // constructor
    public Car(String color) {
        this.info = color;
        this.speed = 0;
    }

    public void speedUp() {
        this.speed += 50;
    }

    public void speedDown() {
        this.speed -= 50 ;
    }

    int getSpeed() {
        return this.speed;
    }

    String getInfo() {
        return this.info;
    }

}
