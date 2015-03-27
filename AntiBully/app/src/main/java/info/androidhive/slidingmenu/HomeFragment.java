package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private Button btn_reset;
    public static final String PREFS_NAME = "MyPreferencesFile";
    private SharedPreferences pref;
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        pref = this.getActivity().getSharedPreferences(PREFS_NAME, 0);
        btn_reset = (Button)rootView.findViewById(R.id.btn_reset);
        btn_reset.setOnClickListener(this);

        return rootView;


    }



    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_reset:
                Toast toast = Toast.makeText(getActivity(), "Funciona!",Toast.LENGTH_SHORT);
                toast.show();
                pref.edit().clear().commit();

                break;

        }
    }
}
