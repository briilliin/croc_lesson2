package com.croc.task5;

public class Circle extends Figure{


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
    public boolean isPointInside(int x, int y){
        if(Math.pow(x, 2) + Math.pow(y, 2) >= Math.pow(R, 2)){
            return true;
        }
        return false;
    }

    @Override
    public void move(int dx, int dy) {
        this.x1+=dx;
        this.y1+=dy;
    }

    @Override
    public String toString() {
        return  String.format("C (%d, %d) %d", getX1(), getY1(), getR());
    }





}
