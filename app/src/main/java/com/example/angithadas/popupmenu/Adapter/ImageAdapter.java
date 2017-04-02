package com.example.angithadas.popupmenu.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.angithadas.popupmenu.R;


/**
 * Created by angitha on 28/3/17.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    ImageView imageViewAndroid;

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.sample0, R.drawable.sample1,
            R.drawable.sample2, R.drawable.sample3,
            R.drawable.sample4, R.drawable.sample5,
            R.drawable.sample6, R.drawable.sample7,
            R.drawable.sample8, R.drawable.sample9,
            R.drawable.sample0, R.drawable.sample1,
            R.drawable.sample2, R.drawable.sample3,
            R.drawable.sample4, R.drawable.sample5,
            R.drawable.sample6, R.drawable.sample7,
            R.drawable.sample8, R.drawable.sample9,
            R.drawable.sample0, R.drawable.sample1,
            R.drawable.sample2, R.drawable.sample3,
            R.drawable.sample4, R.drawable.sample5,
            R.drawable.sample6, R.drawable.sample7,
            R.drawable.sample8, R.drawable.sample9
    };

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }


    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        gridViewAndroid = inflater.inflate(R.layout.grids, null);
        imageViewAndroid = (ImageView) gridViewAndroid.findViewById(R.id.gridview_image);
        imageViewAndroid.setScaleType(ImageView.ScaleType.FIT_XY);
        imageViewAndroid.setSelected(true);

        imageViewAndroid.setImageResource(mThumbIds[position]);
        return imageViewAndroid;
    }
}
