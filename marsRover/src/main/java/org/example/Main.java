package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        marsRover marsRover= new marsRover();

        //NEW
        Rover rover= new Rover();

        String plataeuString=InputParser.getUserPlateauSize();
        String getPositionString= InputParser.getPosition();
        String getInstructionsString= InputParser.getInstructions();

        //-----------Rover input parser ------------
        InputParser parser= new InputParser(plataeuString, getInstructionsString, getPositionString);

        rover.position= parser.position;

        rover.plateauSize= parser.plateauSize;

        for (Instruction instruction : parser.instructions){
            if (instruction.equals(Instruction.L) || instruction.equals(Instruction.R) ){
                rover.rotate(instruction);
            }
            else if (instruction.equals(Instruction.M)) {
                rover.move();
            }
        }

        System.out.println(rover.position + " current position");


//        Scanner scanner= new Scanner(System.in);
//
//        //Plateau input-------------------------------
//        boolean isPlateauNumber=true;
////        String firstPlatSize= "";
////        String secondPlatSize= "";
//
//        int firstPlatSize= 0;
//        int secondPlatSize= 0;
//
//        while(isPlateauNumber){
//            try{
//                System.out.println("enter how high u want ur plat size to be ");
////                    firstPlatSize= String.valueOf(scanner.nextInt());
//                    firstPlatSize= scanner.nextInt();
//                System.out.println("enter how wide u want ur plat size to be ");
////                    secondPlatSize= String.valueOf(scanner.nextInt());
//                    secondPlatSize=scanner.nextInt();
//                isPlateauNumber= false;
//
//            }catch (InputMismatchException e){
//                System.out.println("Invalid Input.");
//                System.out.println("Please try again.");
//                scanner.next();
//            }
//        }
//
//        marsRover.plateauSize= firstPlatSize + " " + secondPlatSize;
//        System.out.println(marsRover.plateauSize);
//
////        to pass on to input parser can we not do below
////        PlateauSize plateauSize= new PlateauSize(firstPlatSize, secondPlatSize);
////        InputParser inputParser= new InputParser();





        //Starting Position-------------------------------

//        boolean isCoordInput=true;
//        String firstCoord= "";
//        String secondCoord= "";
//        String facePointing= "";
//
//        while(isCoordInput){
//            try{
//                System.out.println("enter the X co-ordinate of your starting position");
//                firstCoord= String.valueOf(scanner.nextInt());
//                System.out.println("enter the Y co-ordinate of your starting position");
//                secondCoord= String.valueOf(scanner.nextInt());
//
//                // clear Buffer
//                scanner.nextLine();
//
//                //Enter input starting position
//                System.out.println("enter the face direction of your starting position (N,S,E,W)");
//                facePointing= scanner.next();
//                if (facePointing.length() == 1 && facePointing.substring(0,1).equalsIgnoreCase("N") || facePointing.substring(0,1).equalsIgnoreCase("S")
//                || facePointing.substring(0,1).equalsIgnoreCase("E") || facePointing.substring(0,1).equalsIgnoreCase("W")
//                )
//
//                {
//                    isCoordInput= false;
//                }
//                else {
//                    System.out.println("input face direction is wrong try again");
//                }
//
//
//            }catch (InputMismatchException e){
//                System.out.println("Invalid Inputs.");
//                System.out.println("Please try again.");
//                scanner.nextLine();
//            }
//        }
//
//        marsRover.facePosition= facePointing;
//        marsRover.coordX= Integer.parseInt(firstCoord);
//        marsRover.coordY= Integer.parseInt(secondCoord);
//
//        marsRover.position= marsRover.coordX + " " + marsRover.coordY + " " + marsRover.facePosition;

//        System.out.println("enter the directions you want to move e.g. (MLLR)");
//        marsRover.directions= scanner.next();

//        marsRover.move();
//
//        System.out.println(marsRover.position);


//        System.out.println("enter the directions you want to move e.g. (MLLR)");
//
//        String directions = "LRRMR";
//        for (int i = 0; i < directions.length() ; i++) {
//            String direction = directions.substring(i, i + 1);
//
//            if (direction.equals("M")) {
//                rover.move();
//            } else if (direction.equals("L") || direction.equals("R")) {
//                rover.rotate(Instruction.valueOf(directions));
//            }
//        }










    }

}