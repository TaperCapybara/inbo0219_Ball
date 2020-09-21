package ru.mirea.inbo0219.pr1.Ball;
import java.lang.*;

public class Ball {
    private int radius;
    private String colour;

    public Ball (int radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }

    public Ball (int radius){
        this.radius = radius;
        this.colour = "White";
    }

    public Ball (){
        this.radius = 1;
        this. colour = "White";
    }

    public void setRadius (int radius){
        this.radius = radius;
    }

    public void setColour (String colour) {
        this.colour = colour;
    }

    public int getRadius (){
        return this.radius;
    }

    public String getColour (){
        return this.colour;
    }

    @Override
    public String toString () {
        return this.colour + ", radius - " + this.radius;
    }
}
