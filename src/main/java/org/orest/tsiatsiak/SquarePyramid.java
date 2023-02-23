package org.orest.tsiatsiak;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SquarePyramid extends Solid {

    private final double A;

    private final double H;

    private final double volume;

    private final double basisArea;

    private final double fullArea;

    public SquarePyramid(double basisSideLength, double height) {
        A = basisSideLength;
        H = height;
        volume = (1 / 3.) * pow(A, 2) * H;
        basisArea = pow(A, 2);
        fullArea = pow(A, 2) + 2 * A * sqrt(pow(A/2., 2) + pow(H,2));
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public double getBasisArea() {
        return basisArea;
    }

    @Override
    public double getFullArea() {
        return fullArea;
    }

}
