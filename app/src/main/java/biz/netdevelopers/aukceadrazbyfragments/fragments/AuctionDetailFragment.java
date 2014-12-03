package biz.netdevelopers.aukceadrazbyfragments.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import biz.netdevelopers.aukceadrazbyfragments.activity.AuctionListActivity;
import biz.netdevelopers.aukceadrazbyfragments.interfaces.INotifyTaskCompleted;
import biz.netdevelopers.aukceadrazbyfragments.model.AuctionObject;
import biz.netdevelopers.aukceadrazbyfragments.R;
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

        if (getArguments().containsKey(ARG_ITEM_ID)) {

            id = getArguments().getString(ARG_ITEM_ID);

            VasmajetekProvider vmp = new VasmajetekProvider(getActivity(), this);
            vmp.getOne(id);

            //mItem = VasmajetekProvider.ITEM_MAP.get(id);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_auction_detail, container, false);

        // Show the dummy content as text in a TextView.
        /*
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.auction_detail_name)).setText(mItem.getAdvert_name());
            ((TextView) rootView.findViewById(R.id.auction_detail_price)).setText(String.valueOf(mItem.getAdvert_price()));
        }
        */
        return rootView;
    }

    @Override
    public void DataChanged(ArrayList<AuctionObject> list) {
        mItem = list.get(0);
        LinearLayout linearLayout = (LinearLayout) getView().findViewById(R.id.linear_detail_layout);

        Method[] methods = AuctionObject.class.getMethods();
        for(Method method : methods){
            if(isGetter(method)){
                TextView txt1 = new TextView(getActivity());
                try {
                    txt1.setText(String.valueOf(method.invoke(mItem)));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                linearLayout.addView(txt1);
            }
        }
    }

    public static boolean isGetter(Method method){
        if(!method.getName().startsWith("get"))      return false;
        if(method.getParameterTypes().length != 0)   return false;
        if(void.class.equals(method.getReturnType()))return false;
        return true;
    }
}
