package biz.netdevelopers.aukceadrazbyfragments.model;

import java.util.HashMap;

public class Typy {

    public static HashMap<Integer, String> TYPY = new HashMap<Integer, String>();

    static {
        TYPY.put(1, "Prodej");
        TYPY.put(3, "Dražba");
        TYPY.put(4, "Aukce");
    }

}
