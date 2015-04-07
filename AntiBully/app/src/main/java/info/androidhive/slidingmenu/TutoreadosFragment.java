package info.androidhive.slidingmenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import info.androidhive.slidingmenu.Entity.Tutoreado;

public class TutoreadosFragment extends android.app.ListFragment {

    // Array of strings storing country names
    String[] countries = new String[] {
            "India",
            "Pakistan",
            "Sri Lanka",
            "China",
            "Bangladesh",
            "Nepal",
            "Afghanistan",
            "North Korea",
            "South Korea",
            "Japan"
    };

    // Array of integers points to images stored in /res/drawable/
    int[] flags = new int[]{
            R.drawable.ic_foros,
            R.drawable.ic_foros,
            R.drawable.ic_foros,
            R.drawable.ic_foros,
            R.drawable.ic_foros,
            R.drawable.ic_foros,
            R.drawable.ic_foros,
            R.drawable.ic_foros,
            R.drawable.ic_foros,
            R.drawable.ic_foros
    };

    // Array of strings to store currencies
    String[] currency = new String[]{
            "Indian Rupee",
            "Pakistani Rupee",
            "Sri Lankan Rupee",
            "Renminbi",
            "Bangladeshi Taka",
            "Nepalese Rupee",
            "Afghani",
            "North Korean Won",
            "South Korean Won",
            "Japanese Yen"
    };

    private Vector<Tutoreado> tt = new Vector<Tutoreado>();



    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        //Código de debug -Eliminar para la versión final
        // Tutoreado


                //fin del código de debug

        for(int i=0;i<10;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", "Nombre : Daniel ");
            hm.put("cur","Apellido : Sánchez ");
            hm.put("flag", Integer.toString(flags[i]));
            hm.put("grad", "Grado : 4");
            hm.put("grup", "Grupo : a");


            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = { "flag","txt","cur", "grad", "grup"};

        // Ids of views in listview_layout
        int[] to = { R.id.flag,R.id.txt,R.id.cur, R.id.grad, R.id.grup};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.fragment_tutoreados_list, from, to);

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
