package org.example;


public class Position {

    CompassDirection facing;
    int X;
    int Y;

    public Position(int x, int y, CompassDirection facing) {
        this.X = x;
        this.Y = y;
        this.facing = facing;
    }

    @Override
    public String toString(){
        return this.X +" "+ this.Y+" "+ this.facing.toString();
    }

}
