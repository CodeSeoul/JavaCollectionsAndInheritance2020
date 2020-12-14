package org.codeseoul.java;

import org.codeseoul.java.pen.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Pen> penCollection = new ArrayList<>();
        penCollection.add(new BallpointPen("black", 3));
        penCollection.add(new FountainPen("blue"));

        for (Pen currentPen : penCollection) {
            currentPen.draw();
        }

        Map<String, Pen> smartPenCollection = new HashMap<>();
        smartPenCollection.put("fancy pen", penCollection.get(1));
        smartPenCollection.put("work pen", penCollection.get(0));

        smartPenCollection.get("fancy pen").draw();

//        same as above, just storing the pen into a variable before using it
//        Pen myFountainPen = smartPenCollection.get("fancy pen");
//        myFountainPen.draw();
    }
}
