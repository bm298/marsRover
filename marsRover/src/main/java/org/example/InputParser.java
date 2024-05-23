package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

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

    public static String getInstructions(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the directions you want to move e.g. (MLLR)");
        String directions= scanner.next();

        return directions;
    }

    public static String getPosition(){

        Scanner scanner= new Scanner(System.in);

        boolean isCoordInput=true;
        String firstCoord= "";
        String secondCoord= "";
        String facePointing= "";

        while(isCoordInput){
            try{
                System.out.println("enter the X co-ordinate of your starting position");
                firstCoord= String.valueOf(scanner.nextInt());
                System.out.println("enter the Y co-ordinate of your starting position");
                secondCoord= String.valueOf(scanner.nextInt());

//                    if (secondCoord && firstCoord.length()<2 ){}

                // clear Buffer
                scanner.nextLine();

                //Enter input starting position
                System.out.println("enter the face direction of your starting position (N,S,E,W)");
                facePointing= scanner.next();
                if (facePointing.length() == 1 && facePointing.substring(0,1).equalsIgnoreCase("N") || facePointing.substring(0,1).equalsIgnoreCase("S")
                        || facePointing.substring(0,1).equalsIgnoreCase("E") || facePointing.substring(0,1).equalsIgnoreCase("W")
                )

                {
                    isCoordInput= false;
                }
                else {
                    System.out.println("input face direction is wrong try again");
                }


            }catch (InputMismatchException e){
                System.out.println("Invalid Inputs.");
                System.out.println("Please try again.");
                scanner.nextLine();
            }
        }

        String facePosition= facePointing;
        int coordX= Integer.parseInt(firstCoord);
        int coordY= Integer.parseInt(secondCoord);

        return coordX + " " + coordY + " " + facePosition;

    }

    public static String getUserPlateauSize(){
        System.out.println("calling get user plataeu");

        Scanner scanner= new Scanner(System.in);

        //Plateau input-------------------------------
        boolean isPlateauNumber=true;
//        String firstPlatSize= "";
//        String secondPlatSize= "";

        int firstPlatSize= 0;
        int secondPlatSize= 0;

        while(isPlateauNumber){
            try{
                System.out.println("enter how wide u want ur plat size to be ");
//                    firstPlatSize= String.valueOf(scanner.nextInt());
                firstPlatSize= scanner.nextInt();
                System.out.println("enter how high u want ur plat size to be ");
//                    secondPlatSize= String.valueOf(scanner.nextInt());
                secondPlatSize=scanner.nextInt();
                isPlateauNumber= false;

            }catch (InputMismatchException e){
                System.out.println("Invalid Input.");
                System.out.println("Please try again.");
                scanner.next();
            }
        }

        return firstPlatSize + " " + secondPlatSize;


    }

}
