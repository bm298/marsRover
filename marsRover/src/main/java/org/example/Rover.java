package org.example;

public class Rover {

    Position position;
    PlateauSize plateauSize;

    public void move(){
        switch (position.facing) {
            case CompassDirection.N:
                if (this.checkYBoundary(this.position.Y+1)) {
                    position.Y += 1;
                }
                break;

            case CompassDirection.S:
                if (this.checkYBoundary(this.position.Y-1)) {
                    position.Y -= 1;
                }
                break;

            case CompassDirection.E:
                if (this.checkXBoundary(this.position.X+1)) {
                    position.X += 1;
                }
                break;

            case CompassDirection.W:
                if (this.checkXBoundary(this.position.X-1)) {
                    position.X -= 1;
                }
                break;
        }
    }

    public void rotate(Instruction instruction){
        switch (position.facing) {
            case CompassDirection.N:
                if (instruction.equals(Instruction.R)){
                    position.facing = CompassDirection.E;
                } else if (instruction.equals(Instruction.L)) {
                    position.facing = CompassDirection.W;
                }
                break;

            case CompassDirection.E:
                if (instruction.equals(Instruction.R)){
                    position.facing = CompassDirection.S;
                } else if (instruction.equals(Instruction.L)) {
                    position.facing = CompassDirection.N;
                }
                break;

            case CompassDirection.S:
                if (instruction.equals(Instruction.R)){
                    position.facing = CompassDirection.W;
                } else if (instruction.equals(Instruction.L)) {
                    position.facing = CompassDirection.E;
                }
                break;

            case CompassDirection.W:
                if (instruction.equals(Instruction.R)){
                    position.facing = CompassDirection.N;
                } else if (instruction.equals(Instruction.L)) {
                    position.facing = CompassDirection.S;
                }
                break;
        }
    }

    public boolean checkXBoundary(int newX){

        int Xmax= plateauSize.width;
        int Xmin= 0;

        if (Xmax < newX || newX< Xmin) {
            System.out.println("co-ord X is out of bounds...!");
            return false;
        }
        return true;
    }

    public boolean checkYBoundary(int newY) {
        int Ymax = plateauSize.height;
        int Ymin= 0;

        if (Ymax < newY || newY < Ymin) {
            System.out.println("co-ord Y is out of bounds...!");
            return false;
        }
        return true;
    }


}
