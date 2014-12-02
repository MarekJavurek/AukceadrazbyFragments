package biz.netdevelopers.aukceadrazbyfragments.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import biz.netdevelopers.aukceadrazbyfragments.model.AuctionObject;
import biz.netdevelopers.aukceadrazbyfragments.R;

public class AuctionAdapter extends ArrayAdapter<AuctionObject> {

    public AuctionAdapter(Context context, ArrayList<AuctionObject> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        AuctionObject auction = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_auction, parent, false);
        }


        TextView A_name = (TextView) convertView.findViewById(R.id.auction_name);
        TextView A_id = (TextView) convertView.findViewById(R.id.auction_id);
        TextView A_price = (TextView) convertView.findViewById(R.id.auction_price);
        TextView A_kraj = (TextView) convertView.findViewById(R.id.auction_kraj);
        TextView A_typ = (TextView) convertView.findViewById(R.id.auction_type);

        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("cs", "CZ"));

        A_name.setText(auction.getAdvert_name());
        A_id.setText("ID: " + String.valueOf(auction.getOffer_id()));
        A_price.setText("Cena: " + format.format(Double.valueOf(auction.getAdvert_price())));
        A_kraj.setText("Kraj: " + auction.getLocality_nuts());
        A_typ.setText("Typ: " + String.valueOf(auction.getAdvert_type()));

        return convertView;
    }
}
