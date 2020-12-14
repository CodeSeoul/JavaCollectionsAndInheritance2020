package org.codeseoul.java.pen;

public class Pen {
    protected String inkColor;

    public Pen(String inkColor) {
        this.inkColor = inkColor;
    }

    public void draw() {
        System.out.println("I'm drawing with " + this.inkColor + " ink!");
    }
}
