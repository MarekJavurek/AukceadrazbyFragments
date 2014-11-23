package biz.netdevelopers.aukceadrazbyfragments.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import biz.netdevelopers.aukceadrazbyfragments.AuctionObject;
import biz.netdevelopers.aukceadrazbyfragments.R;

public class AuctionAdapter extends ArrayAdapter<AuctionObject> {

    public AuctionAdapter(Context context, ArrayList<AuctionObject> users) {
        super(context, 0, users);
    }

    int mSelectedItem = 1;



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        AuctionObject user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_auction, parent, false);
        }

        if (position == mSelectedItem) {
            convertView.setBackgroundColor(5);
        }

        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.auction_name);
        TextView tvHome = (TextView) convertView.findViewById(R.id.auction_price);
        // Populate the data into the template view using the data object
        tvName.setText(user.getAdvert_name());
        tvHome.setText("ID: " + String.valueOf(user.getOffer_id()));
        // Return the completed view to render on screen
        return convertView;
    }
}
