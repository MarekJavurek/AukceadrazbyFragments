package biz.netdevelopers.aukceadrazbyfragments.model;

import java.lang.String;
import com.google.gson.annotations.SerializedName;


public class AuctionObject {

    @Override
    public String toString() {
        return this.advert_name;
    }

    // zakladni parametry

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

    // dalsi parametry

    @SerializedName("version")
    public String version; // version: 7,

    @SerializedName("advert_function")
    public String advert_function; // advert_function: 3,

    @SerializedName("advert_subtype")
    public String advert_subtype; // advert_subtype: 37,

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

    @SerializedName("proposer_ico")
    public String proposer_ico; // proposer_ico: "24784877",

    @SerializedName("advert_price_currency")
    public String advert_price_currency; // advert_price_currency: 1,

    @SerializedName("vm_url")
    public String vm_url; // vm_url: null,

    @SerializedName("auction_advertisement")
    public String auction_advertisement; // auction_advertisement: "http://www.centralniadresa.cz/cadr/cadr04004Prepare.do;jsessionid=AAAAaN5Jv2lzKpgELXBv6Q?znackaInzeratu=10950242DV01",

    @SerializedName("auction_date_tour")
    public String auction_date_tour; // auction_date_tour: "2014-10-15 14:30:00",

    @SerializedName("auction_date_tour2")
    public String auction_date_tour2; // auction_date_tour2: "2014-10-16 10:30:00",

    @SerializedName("auction_kind")
    public String auction_kind; // auction_kind: "1",

    @SerializedName("auction_place")
    public String auction_place; // auction_place: "nezadáno",

    @SerializedName("auction_repeated")
    public String auction_repeated; // auction_repeated: "0",

    @SerializedName("auction_tour_address")
    public String auction_tour_address; // auction_tour_address: null,

    @SerializedName("building_type")
    public String building_type; // building_type: "2",

    @SerializedName("condition")
    public String condition; // condition: "2",

    @SerializedName("description")
    public String description; // description: "Jedná se o samostatně stojící rodinný dům , nepodsklepený, s jedním nadzemním podlažím a podkrovím. Má sklonitou střechu, okna dřevěná špaletová, fasáda břízolitová. V domě se nacházejí dva byty - v přízemí 2+1 a podkrovní 4+kk. Tři místnosti jsou velmi malé. WC je splachovací ve špatném stavu, vytápění elektrickými přímotopy. Stáří domu je 60 let, v letech 1999 byla provedena částečná rekonstrukce a v roce 2010 byl zmodernizován podkrovní byt. ",

    @SerializedName("estate_area")
    public String estate_area; // estate_area: "563",

    @SerializedName("expert_opinion")
    public String expert_opinion; // expert_opinion: null,

    @SerializedName("file")
    public String file; // file: null,

    @SerializedName("file_caption")
    public String file_caption; // file_caption: null,

    @SerializedName("image")
    public String[] image; // image: null,

    @SerializedName("image_caption")
    public String[] image_caption; // image_caption: null,

    @SerializedName("is_auction")
    public String is_auction; // is_auction: "0",

    @SerializedName("is_eauction")
    public String is_eauction; // is_eauction: null,

    @SerializedName("locality_city")
    public String locality_city; // locality_city: "Vrané nad Vltavou",

    @SerializedName("locality_co")
    public String locality_co; // locality_co: null,

    @SerializedName("locality_cp")
    public String locality_cp; // locality_cp: "276",

    @SerializedName("locality_katastr")
    public String locality_katastr; // locality_katastr: null,

    @SerializedName("locality_latitude")
    public String locality_latitude; // locality_latitude: "49.931881944444",

    @SerializedName("locality_longitude")
    public String locality_longitude; // locality_longitude: "14.374030277778",

    @SerializedName("locality_ulice")
    public String locality_ulice; // locality_ulice: "Ve Strouze",

    @SerializedName("notes")
    public String notes; // notes: null,

    @SerializedName("parcela_druh")
    public String parcela_druh; // parcela_druh: null,

    @SerializedName("parcela_kmen")
    public String parcela_kmen; // parcela_kmen: null,

    @SerializedName("parcela_pododdeleni")
    public String parcela_pododdeleni; // parcela_pododdeleni: null,

    @SerializedName("price_auction_principal")
    public String price_auction_principal; // price_auction_principal: "285000",

    @SerializedName("price_expert_report")
    public String price_expert_report; // price_expert_report: "1950000",

    @SerializedName("price_minimum_bid")
    public String price_minimum_bid; // price_minimum_bid: "5000",

    @SerializedName("proposer_name")
    public String proposer_name; // proposer_name: "Private Capital Invest a.s.",

    @SerializedName("realitycz_id")
    public String realitycz_id; // realitycz_id: null,

    @SerializedName("result_hash")
    public String result_hash; // result_hash: "2246111",

    @SerializedName("ruian")
    public String ruian; // ruian: "12844187",

    @SerializedName("ruian_district")
    public String ruian_district; // ruian_district: "3210",

    @SerializedName("ruian_municipality")
    public String ruian_municipality; // ruian_municipality: "539848",

    @SerializedName("ruian_municipality_part")
    public String ruian_municipality_part; // ruian_municipality_part: "185311",

    @SerializedName("seller_address")
    public String seller_address; // seller_address: "Sokolská, 77900 Olomouc",

    @SerializedName("seller_contact_name")
    public String seller_contact_name; // seller_contact_name: null,

    @SerializedName("seller_mail")
    public String seller_mail; // seller_mail: "drazby@drazby.net",

    @SerializedName("seller_name")
    public String seller_name; // seller_name: "Dražby.net s.r.o.",

    @SerializedName("seller_phone")
    public String seller_phone; // seller_phone: "585 204 525",

    @SerializedName("usable_area")
    public String usable_area; // usable_area: null,

    @SerializedName("vm_auction_dateplace_tour")
    public String vm_auction_dateplace_tour; // vm_auction_dateplace_tour: null,

    @SerializedName("vm_conditions")
    public String vm_conditions; // vm_conditions: null,

    @SerializedName("vm_debtor")
    public String vm_debtor; // vm_debtor: null,

    @SerializedName("vm_id")
    public String vm_id; // vm_id: null,

    @SerializedName("vm_multiauction")
    public String vm_multiauction; // vm_multiauction: null,

    @SerializedName("vm_url_info")
    public String vm_url_info; // vm_url_info: null,

    @SerializedName("vm_url_source")
    public String vm_url_source; // vm_url_source: "http://www.centralniadresa.cz/cadr/cadr02003Prepare.do?znackaZakazky=10950242",

    @SerializedName("zinfo_billing")
    public String zinfo_billing; // zinfo_billing: null

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAdvert_function() {
        return advert_function;
    }

    public void setAdvert_function(String advert_function) {
        this.advert_function = advert_function;
    }

    public String getAdvert_subtype() {
        return advert_subtype;
    }

    public void setAdvert_subtype(String advert_subtype) {
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

    public String getSeller_ico() {
        return seller_ico;
    }

    public void setSeller_ico(String seller_ico) {
        this.seller_ico = seller_ico;
    }

    public String getProposer_ico() {
        return proposer_ico;
    }

    public void setProposer_ico(String proposer_ico) {
        this.proposer_ico = proposer_ico;
    }

    public String getAdvert_price_currency() {
        return advert_price_currency;
    }

    public void setAdvert_price_currency(String advert_price_currency) {
        this.advert_price_currency = advert_price_currency;
    }

    public String getVm_url() {
        return vm_url;
    }

    public void setVm_url(String vm_url) {
        this.vm_url = vm_url;
    }

    public String getAuction_advertisement() {
        return auction_advertisement;
    }

    public void setAuction_advertisement(String auction_advertisement) {
        this.auction_advertisement = auction_advertisement;
    }

    public String getAuction_date_tour() {
        return auction_date_tour;
    }

    public void setAuction_date_tour(String auction_date_tour) {
        this.auction_date_tour = auction_date_tour;
    }

    public String getAuction_date_tour2() {
        return auction_date_tour2;
    }

    public void setAuction_date_tour2(String auction_date_tour2) {
        this.auction_date_tour2 = auction_date_tour2;
    }

    public String getAuction_kind() {
        return auction_kind;
    }

    public void setAuction_kind(String auction_kind) {
        this.auction_kind = auction_kind;
    }

    public String getAuction_place() {
        return auction_place;
    }

    public void setAuction_place(String auction_place) {
        this.auction_place = auction_place;
    }

    public String getAuction_repeated() {
        return auction_repeated;
    }

    public void setAuction_repeated(String auction_repeated) {
        this.auction_repeated = auction_repeated;
    }

    public String getAuction_tour_address() {
        return auction_tour_address;
    }

    public void setAuction_tour_address(String auction_tour_address) {
        this.auction_tour_address = auction_tour_address;
    }

    public String getBuilding_type() {
        return building_type;
    }

    public void setBuilding_type(String building_type) {
        this.building_type = building_type;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEstate_area() {
        return estate_area;
    }

    public void setEstate_area(String estate_area) {
        this.estate_area = estate_area;
    }

    public String getExpert_opinion() {
        return expert_opinion;
    }

    public void setExpert_opinion(String expert_opinion) {
        this.expert_opinion = expert_opinion;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFile_caption() {
        return file_caption;
    }

    public void setFile_caption(String file_caption) {
        this.file_caption = file_caption;
    }

    public String[] getImage() {
        return image;
    }

    public void setImage(String[] image) {
        this.image = image;
    }

    public String[] getImage_caption() {
        return image_caption;
    }

    public void setImage_caption(String[] image_caption) {
        this.image_caption = image_caption;
    }

    public String getIs_auction() {
        return is_auction;
    }

    public void setIs_auction(String is_auction) {
        this.is_auction = is_auction;
    }

    public String getIs_eauction() {
        return is_eauction;
    }

    public void setIs_eauction(String is_eauction) {
        this.is_eauction = is_eauction;
    }

    public String getLocality_city() {
        return locality_city;
    }

    public void setLocality_city(String locality_city) {
        this.locality_city = locality_city;
    }

    public String getLocality_co() {
        return locality_co;
    }

    public void setLocality_co(String locality_co) {
        this.locality_co = locality_co;
    }

    public String getLocality_cp() {
        return locality_cp;
    }

    public void setLocality_cp(String locality_cp) {
        this.locality_cp = locality_cp;
    }

    public String getLocality_katastr() {
        return locality_katastr;
    }

    public void setLocality_katastr(String locality_katastr) {
        this.locality_katastr = locality_katastr;
    }

    public String getLocality_latitude() {
        return locality_latitude;
    }

    public void setLocality_latitude(String locality_latitude) {
        this.locality_latitude = locality_latitude;
    }

    public String getLocality_longitude() {
        return locality_longitude;
    }

    public void setLocality_longitude(String locality_longitude) {
        this.locality_longitude = locality_longitude;
    }

    public String getLocality_ulice() {
        return locality_ulice;
    }

    public void setLocality_ulice(String locality_ulice) {
        this.locality_ulice = locality_ulice;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getParcela_druh() {
        return parcela_druh;
    }

    public void setParcela_druh(String parcela_druh) {
        this.parcela_druh = parcela_druh;
    }

    public String getParcela_kmen() {
        return parcela_kmen;
    }

    public void setParcela_kmen(String parcela_kmen) {
        this.parcela_kmen = parcela_kmen;
    }

    public String getParcela_pododdeleni() {
        return parcela_pododdeleni;
    }

    public void setParcela_pododdeleni(String parcela_pododdeleni) {
        this.parcela_pododdeleni = parcela_pododdeleni;
    }

    public String getPrice_auction_principal() {
        return price_auction_principal;
    }

    public void setPrice_auction_principal(String price_auction_principal) {
        this.price_auction_principal = price_auction_principal;
    }

    public String getPrice_expert_report() {
        return price_expert_report;
    }

    public void setPrice_expert_report(String price_expert_report) {
        this.price_expert_report = price_expert_report;
    }

    public String getPrice_minimum_bid() {
        return price_minimum_bid;
    }

    public void setPrice_minimum_bid(String price_minimum_bid) {
        this.price_minimum_bid = price_minimum_bid;
    }

    public String getProposer_name() {
        return proposer_name;
    }

    public void setProposer_name(String proposer_name) {
        this.proposer_name = proposer_name;
    }

    public String getRealitycz_id() {
        return realitycz_id;
    }

    public void setRealitycz_id(String realitycz_id) {
        this.realitycz_id = realitycz_id;
    }

    public String getResult_hash() {
        return result_hash;
    }

    public void setResult_hash(String result_hash) {
        this.result_hash = result_hash;
    }

    public String getRuian() {
        return ruian;
    }

    public void setRuian(String ruian) {
        this.ruian = ruian;
    }

    public String getRuian_district() {
        return ruian_district;
    }

    public void setRuian_district(String ruian_district) {
        this.ruian_district = ruian_district;
    }

    public String getRuian_municipality() {
        return ruian_municipality;
    }

    public void setRuian_municipality(String ruian_municipality) {
        this.ruian_municipality = ruian_municipality;
    }

    public String getRuian_municipality_part() {
        return ruian_municipality_part;
    }

    public void setRuian_municipality_part(String ruian_municipality_part) {
        this.ruian_municipality_part = ruian_municipality_part;
    }

    public String getSeller_address() {
        return seller_address;
    }

    public void setSeller_address(String seller_address) {
        this.seller_address = seller_address;
    }

    public String getSeller_contact_name() {
        return seller_contact_name;
    }

    public void setSeller_contact_name(String seller_contact_name) {
        this.seller_contact_name = seller_contact_name;
    }

    public String getSeller_mail() {
        return seller_mail;
    }

    public void setSeller_mail(String seller_mail) {
        this.seller_mail = seller_mail;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public String getSeller_phone() {
        return seller_phone;
    }

    public void setSeller_phone(String seller_phone) {
        this.seller_phone = seller_phone;
    }

    public String getUsable_area() {
        return usable_area;
    }

    public void setUsable_area(String usable_area) {
        this.usable_area = usable_area;
    }

    public String getVm_auction_dateplace_tour() {
        return vm_auction_dateplace_tour;
    }

    public void setVm_auction_dateplace_tour(String vm_auction_dateplace_tour) {
        this.vm_auction_dateplace_tour = vm_auction_dateplace_tour;
    }

    public String getVm_conditions() {
        return vm_conditions;
    }

    public void setVm_conditions(String vm_conditions) {
        this.vm_conditions = vm_conditions;
    }

    public String getVm_debtor() {
        return vm_debtor;
    }

    public void setVm_debtor(String vm_debtor) {
        this.vm_debtor = vm_debtor;
    }

    public String getVm_id() {
        return vm_id;
    }

    public void setVm_id(String vm_id) {
        this.vm_id = vm_id;
    }

    public String getVm_multiauction() {
        return vm_multiauction;
    }

    public void setVm_multiauction(String vm_multiauction) {
        this.vm_multiauction = vm_multiauction;
    }

    public String getVm_url_info() {
        return vm_url_info;
    }

    public void setVm_url_info(String vm_url_info) {
        this.vm_url_info = vm_url_info;
    }

    public String getVm_url_source() {
        return vm_url_source;
    }

    public void setVm_url_source(String vm_url_source) {
        this.vm_url_source = vm_url_source;
    }

    public String getZinfo_billing() {
        return zinfo_billing;
    }

    public void setZinfo_billing(String zinfo_billing) {
        this.zinfo_billing = zinfo_billing;
    }
}
