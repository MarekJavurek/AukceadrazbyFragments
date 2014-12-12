package biz.netdevelopers.aukceadrazbyfragments.fragments;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

import biz.netdevelopers.aukceadrazbyfragments.DownloadImageTask;
import biz.netdevelopers.aukceadrazbyfragments.R;
import biz.netdevelopers.aukceadrazbyfragments.Utilities;
import biz.netdevelopers.aukceadrazbyfragments.interfaces.INotifyTaskCompleted;
import biz.netdevelopers.aukceadrazbyfragments.model.AuctionObject;
import biz.netdevelopers.aukceadrazbyfragments.model.AuctionObjectReflectionItems;
import biz.netdevelopers.aukceadrazbyfragments.model.VasmajetekProvider;

public class AuctionDetailFragment extends Fragment implements INotifyTaskCompleted {

    public static final String ARG_ITEM_ID = "item_id";
    private AuctionObject mItem;

    public AuctionDetailFragment() {
    }

    String id;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Utilities u = new Utilities(getActivity());

        View rootView;

        if (u.isOnline()) {
            if (getArguments().containsKey(ARG_ITEM_ID)) {

                id = getArguments().getString(ARG_ITEM_ID);

                VasmajetekProvider vmp = new VasmajetekProvider(getActivity(), this);
                vmp.getOne(id);

                //mItem = VasmajetekProvider.ITEM_MAP.get(id);
            }

            rootView = inflater.inflate(R.layout.fragment_auction_detail, container, false);

        } else {
            rootView = inflater.inflate(R.layout.layout_no_connection, container, false);
        }

        return rootView;
    }


    @Override
    public void DataChanged(ArrayList<AuctionObject> list) {
        mItem = list.get(0);
        LinearLayout linearLayout = (LinearLayout) getView().findViewById(R.id.linear_detail_layout);

        if (mItem != null) {


            Utilities u = new Utilities(getActivity());

            if ((u.loadBoolSettings("nastaveni_3g") && u.Is3G()) || (u.IsWiFi()))
            {
                updateImages();
            }

            NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("cs", "CZ"));

            ((TextView) linearLayout.findViewById(R.id.d_nazev)).setText(mItem.getAdvert_name());
            ((TextView) linearLayout.findViewById(R.id.d_cena)).setText("Vyvolávací cena: " + format.format(Double.valueOf(mItem.getAdvert_price())));
            ((TextView) linearLayout.findViewById(R.id.d_datum)).setText(mItem.getAuction_date());
            ((TextView) linearLayout.findViewById(R.id.d_popis)).setText(mItem.getDescription());
        }

        for (Map.Entry<String, String> entry : AuctionObjectReflectionItems.AORI.entrySet()) {
            TextView txt1 = new TextView(getActivity());

            View v = new View(getActivity());
            v.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, 1));
            v.setBackgroundColor(Color.rgb(51, 51, 51));

            try {
                txt1.setText(entry.getKey() + ": " + String.valueOf(Utilities.getValueOf(mItem, entry.getValue())));
            } catch (Exception e) {
                e.printStackTrace();
            }

            linearLayout.addView(txt1);
            linearLayout.addView(v);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        for (DownloadImageTask a : dtast) {
            a.cancel(true);
        }

    }

    ArrayList<DownloadImageTask> dtast;

    private void updateImages() {
        LinearLayout img_linearLayout = (LinearLayout) getView().findViewById(R.id.d_obrazky);

        dtast = new ArrayList<DownloadImageTask>();

        if (mItem.getImage() != null) {

            for (int i = 0; i < mItem.getImage().length; i++) {

                DownloadImageTask dit = new DownloadImageTask(getActivity(), img_linearLayout) {

                    @Override
                    protected void onPostExecute(Bitmap result) {
                        super.onPostExecute(result);

                        if (result != null) {
                            ImageView img = new ImageView(getActivity());

                            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                            lp.setMargins(0, 0, 10, 0);
                            img.setLayoutParams(lp);

                            img.setImageBitmap(Utilities.getResizedBitmap(result, 600, 600));
                            id.addView(img);
                        }
                    }
                };

                dtast.add(dit);

                dit.execute(mItem.getImage()[i]);

            }
        }


    }

}
