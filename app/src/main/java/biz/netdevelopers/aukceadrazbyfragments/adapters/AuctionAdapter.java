package biz.netdevelopers.aukceadrazbyfragments.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import biz.netdevelopers.aukceadrazbyfragments.model.AuctionObject;
import biz.netdevelopers.aukceadrazbyfragments.R;

public class AuctionAdapter extends ArrayAdapter<AuctionObject> {

    public AuctionAdapter(Context context, ArrayList<AuctionObject> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        AuctionObject auction = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_auction, parent, false);
        }

        // Lookup view for data population
        TextView Advert_name = (TextView) convertView.findViewById(R.id.auction_name);
        TextView Offer_id = (TextView) convertView.findViewById(R.id.auction_price);
        // Populate the data into the template view using the data object
        Advert_name.setText(auction.getAdvert_name());
        Offer_id.setText("ID: " + String.valueOf(auction.getOffer_id()));
        // Return the completed view to render on screen
        return convertView;
    }
}
