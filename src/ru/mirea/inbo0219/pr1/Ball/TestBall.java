package ru.mirea.inbo0219.pr1.Ball;
import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball (5, "Red");
        Ball b2 = new Ball (12, "Green");
        Ball b3 = new Ball (10);
        Ball b4 = new Ball();
        b3.setColour("Yellow");
        System.out.println(b3.toString());
        System.out.println(b1);
    }
}
