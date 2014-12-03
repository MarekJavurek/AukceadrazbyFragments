AukceadrazbyFragments
=====================
Mobilní Android aplikace k portálu Vasmajetek.cz. Využívá API serveru Vasmajetek.cz a částečně vlastního API (netdevelopers.biz).

Školní projekt
============
autoři:
 - Marek Javůrek
 - Jindřich Urbánek

Testování
============
 - Požádat o pozici BETA testera - https://plus.google.com/communities/112391682119618374671
 - Stáhnout z Google Play - https://play.google.com/store/apps/details?id=com.peanee.aukceadrazby

Vývoj aplikací pro mobilní zařízení - Témata projektů
============
Bude se jednat o mobilní apliaci k portálu Vášmajetek.cz. Server poskytuje API dokumentaci k získávání dat.

Pro zobrazení detailu se data načítají přímo z API Vášmajetek.cz. K načtení dat aktuálních aukcí a dražeb jsem v vytvořil vlastní webservice (PHP - Nette a MySQL), která načítá data z API Vášmajetek.cz, optimalizuje a cachuje je aby Anroid aplikace stahovala veškerá potřebná data v jednom HTTP requestu s co nejmenší datovou náročností.

Porovnání API
 - Vášmajetek.cz: http://cml.vasmajetek.cz/rest/offers/active/
 - Vlastní: http://netdevelopers.biz/_da/download.php

Struktura a funkce aplikace:
 - Hlavní aktivita se seznameme aktuálních dražeb a aukcí (po kliknutí se zobrazí detail)
 - Aktivita s detailem položky
 - Aktivita kde se nastavuje filtrování dat (typ, kategorie, cena, lokalita, název)
 - Optimalizace UI pro tablety (využití fragmentů)
 - Pokud aplikace po zapnutí nemá přístup k internetu, načte se databáze od minule
