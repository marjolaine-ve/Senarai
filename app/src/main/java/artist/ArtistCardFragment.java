package artist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.marjolainevericel.senarai.R;

public class ArtistCardFragment extends Fragment {

    private static String mName;


    /***************************************************
     * INIT
     ***************************************************/
    public ArtistCardFragment() { }
    public static ArtistCardFragment newInstance(String name) {
        ArtistCardFragment fragment = new ArtistCardFragment();

        mName = name;

        return fragment;
    }


    /***************************************************
     * VIEW
     ***************************************************/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.card_artist, container, false);

        ((TextView) view.findViewById(R.id.artist_card_name)).setText(mName);

        return view;
    }
}
