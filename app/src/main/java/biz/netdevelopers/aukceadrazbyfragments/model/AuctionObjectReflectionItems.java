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
        AORI.put("Kategorie", "advert_subtype");
        AORI.put("Zdrojový server", "advert_original_source");
        AORI.put("Datum dražby", "auction_date");
        AORI.put("Čas vytvoření", "created_time");
        AORI.put("Čas poslední změny", "updated_time");
        AORI.put("zrušená dražba/prodej", "cancelled");
        AORI.put("ičo prodejce", "seller_ico");
        AORI.put("ičo navrhovatele", "proposer_ico");
        AORI.put("Měna dražby", "advert_price_currency");
        AORI.put("odkaz na Vasmajetek.cz", "vm_url");
        AORI.put("url dražební vyhlášky", "auction_advertisement");
        AORI.put("Datum prohlídky před dražbou", "auction_date_tour");
        AORI.put("datum druhé prohlídky před dražbou", "auction_date_tour2");
        AORI.put("Druh aukce", "auction_kind");
        AORI.put("místo konání dražby", "auction_place");
        AORI.put("Opakovaná dražba?", "auction_repeated");
        AORI.put("Adresa prohlídky před dražbou ", "auction_tour_address");
        AORI.put("Typ budovy", "building_type");
        AORI.put("Stav", "condition");
        //AORI.put("Slovní popis nabízeného předmětu", "description");
        //AORI.put("", "estate_area");
        AORI.put("Plocha pozemku (m2)", "expert_opinion");
        //AORI.put("", "file");
        //AORI.put("", "file_caption");
        //AORI.put("", "image");
        //AORI.put("", "image_caption");
        AORI.put("aukce?", "is_auction");
        AORI.put("elektronické aukce?", "is_eauction");
        AORI.put("Lokalita", "locality_city");
        AORI.put("cislo orientacni", "locality_co");
        AORI.put("cislo popisne", "locality_cp");
        AORI.put("Katastální území ", "locality_katastr");
        AORI.put("Zeměpisná šířka", "locality_latitude");
        AORI.put("Zeměpisná délka", "locality_longitude");
        AORI.put("Název ulice", "locality_ulice");
        AORI.put("Poznamky", "notes");
        AORI.put("Druh parcely", "parcela_druh");
        AORI.put("Kmenové číslo parcely", "parcela_kmen");
        AORI.put("Pořadové číslo v rámci kmenové parcely", "parcela_pododdeleni");
        AORI.put("drazebni jistina", "price_auction_principal");
        AORI.put("cena stanovená odhadcem", "price_expert_report");
        AORI.put("Minimální výše příhozu", "price_minimum_bid");
        AORI.put("Název navrhovatele", "proposer_name");
        AORI.put("id generované systémem na reality.cz", "realitycz_id");
        //AORI.put("", "result_hash");
        AORI.put("Kod adresniho mista z ciselniku systemu ruian.cz", "ruian");
        AORI.put("Kod okresu z ciselniku systemu ruian.cz", "ruian_district");
        AORI.put("Kod obce z ciselniku systemu ruian.cz", "ruian_municipality");
        AORI.put("Kod casti obce z ciselniku systemu ruian.cz", "ruian_municipality_part");
        AORI.put("Adresa prodejce", "seller_address");
        AORI.put("jméno prodejce (kontaktní osoba)", "seller_contact_name");
        AORI.put("mail kontaktní osoby", "seller_mail");
        AORI.put("jméno prodejce (instituce)", "seller_name");
        AORI.put("telefon kontaktní osoby", "seller_phone");
        AORI.put("vnitrni uzitna plocha", "usable_area");
        //AORI.put("", "vm_auction_dateplace_tour");
        //AORI.put("", "vm_conditions");
        //AORI.put("", "vm_debtor");
        //AORI.put("", "vm_id");
        //AORI.put("", "vm_multiauction");
        //AORI.put("Url adresa nabídky", "vm_url_info");
        AORI.put("Zdroj (pokud byla dražba odněkud stažena..)", "vm_url_source");
        //AORI.put("", "zinfo_billing");


    }
}
