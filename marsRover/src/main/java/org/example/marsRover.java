package org.example;

public class marsRover {

    String plateauSize;
    String facePosition;
    int coordX;
    int coordY;
    String position;
    String directions;

    public marsRover(){

    }

    public marsRover(String plateauSize, String position, String directions){
        this.position= position;
        this.plateauSize= plateauSize;
        this.directions=directions;
        this.coordX= Integer.parseInt(position.substring(0, 1));
        this.coordY= Integer.parseInt(position.substring(2,3));
        this.facePosition= String.valueOf(position.charAt(4));
    }

    public void move(){

        for (int i = 0; i < directions.length(); i++) {
            switch (facePosition.toUpperCase()) {
                case "N":
                    if (String.valueOf(directions.charAt(i)).equals("M") && checkY(coordY +1)) {
                       coordY+=  1;
                    }
                    else if (String.valueOf(directions.charAt(i)).equals("L")) {
                        facePosition="W";
                    }
                    break;

                case "S":
                    if (String.valueOf(directions.charAt(i)).equals("M") && checkY(coordY -1)){
                      coordY -= 1;
                    }
                    else if (String.valueOf(directions.charAt(i)).equals("L")) {
                        facePosition="E";
                    }
                    break;

                case "E":
                    if (String.valueOf(directions.charAt(i)).equals("M")&& checkX(coordX +1)) {
                    coordX += 1;
                    }
                    else if (String.valueOf(directions.charAt(i)).equals("L")) {
                        facePosition="N";
                    }
                    break;

                case "W":
                    if (String.valueOf(directions.charAt(i)).equals("M") && checkX(coordX -1)){
                       coordX-= 1;
                    }
                    else if (String.valueOf(directions.charAt(i)).equals("L")) {
                        facePosition="S";
                    }
                    break;

                default:
                    System.out.println("unknown move try again...");
                    break;
            }
        }
        position = coordX + " " +coordY + " " + facePosition;
    }

    public Boolean checkX(int newX){
        int Xmax= Integer.parseInt(plateauSize.substring(0,1));
        int Xmin= 0;

        if (Xmax < newX || newX< Xmin) {
            System.out.println("co-ord X is out of bounds...!");
            return false;
        }
        return true;
    }

    public boolean checkY(int newY) {
        int Ymax = Integer.parseInt(plateauSize.substring(2, 3));
        int Ymin= 0;

        if (Ymax < newY || newY < Ymin) {
            System.out.println("co-ord Y is out of bounds...!");
            return false;
        }
        return true;
    }




}
