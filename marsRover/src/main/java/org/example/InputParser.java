package org.example;

public class InputParser {

    PlateauSize plateauSize;
    Instruction[] instructions;
    Position position;

    public InputParser(String plateauSize, String instructions, String position) {

        int height= Integer.parseInt(plateauSize.substring(0,1));
        int width= Integer.parseInt(plateauSize.substring(2,3));

        this.plateauSize= new PlateauSize(width,height);

        int x= Integer.parseInt(position.substring(0,1));
        int y= Integer.parseInt(position.substring(2,3));
        CompassDirection facing= CompassDirection.valueOf(position.substring(4,5));

        this.position= new Position(x,y,facing);
       this.instructions= new Instruction[instructions.length()];

        for (int i = 0; i < instructions.length(); i++) {
            this.instructions[i]= Instruction.valueOf(instructions.substring(i,i+1));
        }
    }

    public static void getUserPlateauSize(){
        System.out.println("calling get user plataeu");
    }




}
