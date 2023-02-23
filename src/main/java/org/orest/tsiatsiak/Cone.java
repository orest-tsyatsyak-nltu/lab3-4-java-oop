package org.orest.tsiatsiak;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Cone implements Solid {

    private final double R;

    private final double H;

    private final double volume;

    private final double basisArea;

    private final double fullArea;

    protected String color;

    private double transparency;

    {
        color = "Grey";
        transparency = 100;
    }

    public Cone(double basisRadius, double height) {
        R = basisRadius;
        H = height;
        volume = (1 / 3.) * PI * pow(R, 2) * H;
        basisArea = PI * pow(R, 2);
        fullArea = PI * R * (R + sqrt(pow(H, 2) + pow(R, 2)));
    }

    public Cone(double basisRadius, double height, String color) {
        this(basisRadius, height);
        this.color = color;
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

    protected void changeTransparency(double transparency){
        if(transparency < 0){
            throw new IllegalArgumentException("Transparency can not be less then 0");
        }
        this.transparency = transparency;
    }

    public String getColor() {
        return color;
    }

}
