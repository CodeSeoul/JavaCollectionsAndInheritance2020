package org.codeseoul.java.pen;

public class FountainPen extends Pen {
    public FountainPen(String inkColor) {
        super(inkColor);
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing in ye old style " + this.inkColor + " ink!");
    }
}
