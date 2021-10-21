package com.croc.task4;


public class Circle extends Figure {



    public Circle(int x1, int y1, int r) {
        this.x1 = x1;
        this.y1 = y1;
        this.R = r;
    }


    @Override
    public int getX1() {
        return x1;
    }

    @Override
    public int getY1() {
        return y1;
    }

    @Override
    public int getR() {
        return R;
    }

    @Override
    public String toString() {
        return  String.format("C (%d, %d) %d", getX1(), getY1(), getR());
    }

}
