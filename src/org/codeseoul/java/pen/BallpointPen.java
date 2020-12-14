package org.codeseoul.java.pen;

public class BallpointPen extends Pen {
    private int thickness;

    public BallpointPen(String inkColor, int thickness) {
        super(inkColor);
        this.thickness = thickness;
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing in " + this.inkColor + " ink with " + this.thickness + "mm thickness!");
    }
}
