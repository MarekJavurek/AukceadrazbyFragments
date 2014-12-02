package biz.netdevelopers.aukceadrazbyfragments.model;

import java.util.HashMap;
import java.util.Map;

public class Kraje {

    public static Map<String, String> KRAJE = new HashMap<String, String>();

    static {
        KRAJE.put("CZ010", "Hlavní město Praha");
        KRAJE.put("CZ020", "Středočeský kraj");
        KRAJE.put("CZ031", "Jihočeský kraj");
        KRAJE.put("CZ032", "Plzeňský kraj");
        KRAJE.put("CZ041", "Karlovarský kraj");
        KRAJE.put("CZ042", "Ústecký kraj");
        KRAJE.put("CZ051", "Liberecký kraj");
        KRAJE.put("CZ052", "Královéhradecký kraj");
        KRAJE.put("CZ053", "Pardubický kraj");
        KRAJE.put("CZ063", "Kraj Vysočina");
        KRAJE.put("CZ064", "Jihomoravský kraj");
        KRAJE.put("CZ071", "Olomoucký kraj");
        KRAJE.put("CZ072", "Zlínský kraj");
        KRAJE.put("CZ080", "Moravskoslezský kraj");
    }

}
