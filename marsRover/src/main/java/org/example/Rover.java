package org.example;

public class Rover {

    Position position;

    public void move(){
        switch (position.facing) {
            case CompassDirection.N:
                position.Y+=1;
                break;

            case CompassDirection.S:
                position.Y-=1;
                break;

            case CompassDirection.E:
                position.X+=1;
                break;

            case CompassDirection.W:
                position.X-=1;
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

}
