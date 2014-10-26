package playlists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.marjolainevericel.senarai.R;


public class PlaylistsAdapter extends ArrayAdapter<PlaylistCustom> {

    private final LayoutInflater mInflater;

    public PlaylistsAdapter(Context context, int resource) {
        super(context, resource);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null)
        {
            view = mInflater.inflate(android.R.layout.simple_list_item_2, parent, false);
        }
        else
        {
            view = convertView;
        }

        PlaylistCustom playlist = getItem(position);

        // View's elements
        ((TextView) view.findViewById(android.R.id.text1)).setText(playlist.getTitle());
        ((TextView) view.findViewById(android.R.id.text2)).setText(playlist.getDescription());

        return view;
    }
}
