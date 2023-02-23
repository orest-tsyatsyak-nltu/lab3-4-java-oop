package org.orest.tsiatsiak;

public class Lab3ConsoleApplication {

    public static void main(String[] args) {
        Solid pyramid = new SquarePyramid(5, 10);
        Solid cone = new Cone(5, 10);
        System.out.println("Square pyramid volume: " + pyramid.getVolume());
        System.out.println("Square pyramid basis area: " + pyramid.getBasisArea());
        System.out.println("Square pyramid full area: " + pyramid.getFullArea() + "\n");
        System.out.println("Number of sides in square pyramid = " + SquarePyramid.NUMBER_OF_BASIS_SIDES);
        System.out.println("Cone volume: " + cone.getVolume());
        System.out.println("Cone basis area: " + cone.getBasisArea());
        System.out.println("Cone full area: " + cone.getFullArea());
    }

}
