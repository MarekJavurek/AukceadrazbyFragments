package biz.netdevelopers.aukceadrazbyfragments.model;

import java.lang.String;
import com.google.gson.annotations.SerializedName;


public class AuctionObject {

    @Override
    public String toString() {
        return this.advert_name;
    }

    // TODO nutno doplnit všechny ostatní parametry
    private int offer_id; // offer_id: 94345,
    private String advert_name; // advert_name: "Rodinný dům ve Vraném nad Vltavou okres Praha - západ",
    private int advert_type; // advert_type: 2,
    private String locality_nuts; // locality_nuts: "CZ0",
    private int advert_price; // advert_price: 990000,

    public int getOffer_id() {
        return offer_id;
    }
    public void setOffer_id(int offer_id) {
        this.offer_id = offer_id;
    }
    public String getAdvert_name() {
        return advert_name;
    }
    public void setAdvert_name(String advert_name) {
        this.advert_name = advert_name;
    }
    public int getAdvert_type() {
        return advert_type;
    }
    public void setAdvert_type(int advert_type) {
        this.advert_type = advert_type;
    }
    public String getLocality_nuts() {
        return locality_nuts;
    }
    public void setLocality_nuts(String locality_nuts) {
        this.locality_nuts = locality_nuts;
    }
    public int getAdvert_price() {
        return advert_price;
    }
    public void setAdvert_price(int advert_price) {
        this.advert_price = advert_price;
    }

    // TODO dalsi parametry pro detail


    public String getSeller_ico() {
        return seller_ico;
    }

    public void setSeller_ico(String seller_ico) {
        this.seller_ico = seller_ico;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getAdvert_function() {
        return advert_function;
    }

    public void setAdvert_function(int advert_function) {
        this.advert_function = advert_function;
    }

    public int getAdvert_subtype() {
        return advert_subtype;
    }

    public void setAdvert_subtype(int advert_subtype) {
        this.advert_subtype = advert_subtype;
    }

    public String getAdvert_original_source() {
        return advert_original_source;
    }

    public void setAdvert_original_source(String advert_original_source) {
        this.advert_original_source = advert_original_source;
    }

    public String getAuction_date() {
        return auction_date;
    }

    public void setAuction_date(String auction_date) {
        this.auction_date = auction_date;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public String getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(String updated_time) {
        this.updated_time = updated_time;
    }

    public String getCancelled() {
        return cancelled;
    }

    public void setCancelled(String cancelled) {
        this.cancelled = cancelled;
    }

    @SerializedName("version")
    public int version; // version: 7,

    @SerializedName("advert_function")
    public int advert_function; // advert_function: 3,

    @SerializedName("advert_subtype")
    public int advert_subtype; // advert_subtype: 37,

    @SerializedName("advert_original_source")
    public String advert_original_source; // advert_original_source: "CADR",

    @SerializedName("auction_date")
    public String auction_date; // auction_date: "2014-10-29T00:00:00+01:00",

    @SerializedName("created_time")
    public String created_time; // created_time: "2014-08-27T02:00:03+02:00",

    @SerializedName("updated_time")
    public String updated_time; // updated_time: "2014-11-03T02:00:11+01:00",

    @SerializedName("cancelled")
    public String cancelled; // cancelled: "0",

    @SerializedName("seller_ico")
    public String seller_ico; // seller_ico: "48396389",


}


    /*
proposer_ico: "24784877",
advert_price_currency: 1,
vm_url: null,
auction_advertisement: "http://www.centralniadresa.cz/cadr/cadr04004Prepare.do;jsessionid=AAAAaN5Jv2lzKpgELXBv6Q?znackaInzeratu=10950242DV01",
auction_date_tour: "2014-10-15 14:30:00",
auction_date_tour2: "2014-10-16 10:30:00",
auction_kind: "1",
auction_place: "nezadáno",
auction_repeated: "0",
auction_tour_address: null,
building_type: "2",
condition: "2",
description: "Jedná se o samostatně stojící rodinný dům , nepodsklepený, s jedním nadzemním podlažím a podkrovím. Má sklonitou střechu, okna dřevěná špaletová, fasáda břízolitová. V domě se nacházejí dva byty - v přízemí 2+1 a podkrovní 4+kk. Tři místnosti jsou velmi malé. WC je splachovací ve špatném stavu, vytápění elektrickými přímotopy. Stáří domu je 60 let, v letech 1999 byla provedena částečná rekonstrukce a v roce 2010 byl zmodernizován podkrovní byt. ",
estate_area: "563",
expert_opinion: null,
file: null,
file_caption: null,
image: null,
image_caption: null,
is_auction: "0",
is_eauction: null,
locality_city: "Vrané nad Vltavou",
locality_co: null,
locality_cp: "276",
locality_katastr: null,
locality_latitude: "49.931881944444",
locality_longitude: "14.374030277778",
locality_ulice: "Ve Strouze",
notes: null,
parcela_druh: null,
parcela_kmen: null,
parcela_pododdeleni: null,
price_auction_principal: "285000",
price_expert_report: "1950000",
price_minimum_bid: "5000",
proposer_name: "Private Capital Invest a.s.",
realitycz_id: null,
result_hash: "2246111",
ruian: "12844187",
ruian_district: "3210",
ruian_municipality: "539848",
ruian_municipality_part: "185311",
seller_address: "Sokolská, 77900 Olomouc",
seller_contact_name: null,
seller_mail: "drazby@drazby.net",
seller_name: "Dražby.net s.r.o.",
seller_phone: "585 204 525",
usable_area: null,
vm_auction_dateplace_tour: null,
vm_conditions: null,
vm_debtor: null,
vm_id: null,
vm_multiauction: null,
vm_url_info: null,
vm_url_source: "http://www.centralniadresa.cz/cadr/cadr02003Prepare.do?znackaZakazky=10950242",
zinfo_billing: null
    */
