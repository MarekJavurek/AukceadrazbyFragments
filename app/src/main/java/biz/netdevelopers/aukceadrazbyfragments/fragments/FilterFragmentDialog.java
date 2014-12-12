package biz.netdevelopers.aukceadrazbyfragments.fragments;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.Button;
import biz.netdevelopers.aukceadrazbyfragments.R;
import biz.netdevelopers.aukceadrazbyfragments.UI.MultiSelectionSpinner;
import biz.netdevelopers.aukceadrazbyfragments.activity.AuctionListActivity;
import biz.netdevelopers.aukceadrazbyfragments.activity.FiltersActivity;

public class FilterFragmentDialog extends DialogFragment implements View.OnClickListener {

    MultiSelectionSpinner f_kraje;
    MultiSelectionSpinner f_typ;


    public static FilterFragmentDialog newInstance(int num) {
        FilterFragmentDialog f = new FilterFragmentDialog();
        f.setCancelable(false);
        return f;
    }

    @Override
    public void onStart() {
        super.onStart();

        String[] kunda = {"Hl. m. Praha", "Středočeský", "Jihočeský", "Plzeňský", "Ústecký", "Královéhradecký", "Vysočina", "Olomoucký", "Moravskoslezský"};
        f_kraje = (MultiSelectionSpinner) getView().findViewById(R.id.f_kraje);
        f_kraje.setItems(kunda);

        String[] array = {"Aukce", "Dražba", "Prodej"};
        f_typ = (MultiSelectionSpinner) getView().findViewById(R.id.f_typ);
        f_typ.setItems(array);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        getDialog().setTitle("Nastavení filtrů");

        View view = inflater.inflate(R.layout.activity_filters, null);

        Button b = (Button) view.findViewById(R.id.button1);
        b.setOnClickListener(this);

        return view;
    }

    public void onClickCancel(View v) {
        this.dismiss();
    }

    public void onClick(View v) {
        String s = "Vybrané typy: " + f_typ.getSelectedItemsAsString() + ", Vybrané kraje: " + f_kraje.getSelectedItemsAsString();

        AuctionListActivity fa = (AuctionListActivity) getActivity();
        fa.UpdateFilters(f_kraje.getSelectedStrings(), f_typ.getSelectedStrings());

        this.dismiss();
    }
}