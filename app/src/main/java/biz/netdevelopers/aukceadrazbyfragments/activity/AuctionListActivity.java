package biz.netdevelopers.aukceadrazbyfragments.activity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.concurrent.ExecutionException;

import biz.netdevelopers.aukceadrazbyfragments.R;
import biz.netdevelopers.aukceadrazbyfragments.fragments.AuctionDetailFragment;
import biz.netdevelopers.aukceadrazbyfragments.fragments.AuctionListFragment;
import biz.netdevelopers.aukceadrazbyfragments.model.VasmajetekProvider;

/**
 * An activity representing a list of Auctions. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link biz.netdevelopers.aukceadrazbyfragments.activity.AuctionDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 * <p/>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link biz.netdevelopers.aukceadrazbyfragments.fragments.AuctionListFragment} and the item details
 * (if present) is a {@link biz.netdevelopers.aukceadrazbyfragments.fragments.AuctionDetailFragment}.
 * <p/>
 * This activity also implements the required
 * {@link biz.netdevelopers.aukceadrazbyfragments.fragments.AuctionListFragment.Callbacks} interface
 * to listen for item selections.
 */
public class AuctionListActivity extends Activity
        implements AuctionListFragment.Callbacks {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auction_list);

        if (savedInstanceState == null ) {
            VasmajetekProvider vmp = new VasmajetekProvider(this);
            try {
                vmp.getAll();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (findViewById(R.id.auction_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-large and
            // res/values-sw600dp). If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;

            // In two-pane mode, list items should be given the
            // 'activated' state when touched.
            ((AuctionListFragment) getFragmentManager()
                    .findFragmentById(R.id.auction_list))
                    .setActivateOnItemClick(true);
        }

        // TODO: If exposing deep links into your app, handle intents here.
    }

    /**
     * Callback method from {@link AuctionListFragment.Callbacks}
     * indicating that the item with the given ID was selected.
     */
    @Override
    public void onItemSelected(String id) {
        if (mTwoPane) {
            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(AuctionDetailFragment.ARG_ITEM_ID, id);
            AuctionDetailFragment fragment = new AuctionDetailFragment();
            fragment.setArguments(arguments);
            getFragmentManager().beginTransaction()
                    .replace(R.id.auction_detail_container, fragment)
                    .commit();

        } else {
            // In single-pane mode, simply start the detail activity
            // for the selected item ID.
            Intent detailIntent = new Intent(this, AuctionDetailActivity.class);
            detailIntent.putExtra(AuctionDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_filters) {

            Intent intent = new Intent(this, Filtry.class);
            startActivity(intent);

            return true;
        } else if (id == R.id.action_setting) {

            Intent intent = new Intent(this, Nastaveni.class);
            startActivity(intent);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
