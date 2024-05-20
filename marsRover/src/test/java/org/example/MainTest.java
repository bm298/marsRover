package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {

        marsRover marsRover= new marsRover("5 5", "2 4 N", "ML");
        marsRover.move();

        assertEquals("0 4 S", marsRover.position);

    }
}