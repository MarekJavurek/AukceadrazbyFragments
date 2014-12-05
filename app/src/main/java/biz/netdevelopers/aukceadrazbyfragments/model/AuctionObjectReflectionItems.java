package biz.netdevelopers.aukceadrazbyfragments.model;

import java.util.HashMap;

public class AuctionObjectReflectionItems {

    public static HashMap<String, String> AORI = new HashMap<String, String>();

    static {
        AORI.put("Interní ID", "offer_id");
        AORI.put("Název", "advert_name");
        AORI.put("Typ", "advert_type");
        AORI.put("Kraj", "locality_nuts");
        AORI.put("Vyvolávací cena", "advert_price");
        AORI.put("Verze", "version");
        AORI.put("Funkce", "advert_function");
        AORI.put("", "");
        AORI.put("", "");
    }
}
