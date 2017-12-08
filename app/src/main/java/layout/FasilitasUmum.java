package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nomadnesia.sawase.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FasilitasUmum extends Fragment {


    public FasilitasUmum() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fasilitas_umum, container, false);
    }

}
