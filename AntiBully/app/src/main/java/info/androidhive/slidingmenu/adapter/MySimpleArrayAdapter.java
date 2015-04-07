package info.androidhive.slidingmenu.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import info.androidhive.slidingmenu.R;

/**
 * Created by Daniel on 03/04/15.
 */
public class MySimpleArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;

    public MySimpleArrayAdapter(Context context, String[] values) {
        super(context, R.layout.fragment_tutoreados, values);
        this.context = context;
        this.values = values;
    }
}
