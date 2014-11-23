package biz.netdevelopers.aukceadrazbyfragments;

import java.net.URL;

// trida reprezentujici stahovanou polozku ve tride DownloadFilesTask
// nestacilo dat jako marametr String ale musel jsem vytvořit tuto třídu, protožr
// předávám URL a cílové umístění souboru což jsou 2 položky...
public class DownloadFilesTaskObject {
    private URL url;
    private String destination; // ex.: "/sdcard/file_name.extension"

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
