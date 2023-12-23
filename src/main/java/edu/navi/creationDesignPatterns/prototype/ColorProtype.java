package edu.navi.creationDesignPatterns.prototype;

import java.util.HashMap;
import java.util.HashSet;

public class ColorProtype {

    public static HashMap<String, Color> COLOR_HASMAP = new HashMap<>(){{
       put("BLACK", new Black());
        put("RED", new Red());
    }};

    public static Color getColorPrototype(String color) throws CloneNotSupportedException {
         return ((Color) COLOR_HASMAP.get(color).clone());
    }
}
