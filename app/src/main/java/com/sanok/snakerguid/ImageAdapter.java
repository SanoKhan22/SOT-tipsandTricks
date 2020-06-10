package com.sanok.snakerguid;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter extends PagerAdapter {

    private Context mContext;
    private int[] mimgids = new int[]{R.drawable.gp_1,R.drawable.gp_2,R.drawable.gp_3,R.drawable.gp_4,R.drawable.gp_5,R.drawable.gp_6,R.drawable.gp_7,R.drawable.gp_8,R.color.colorPrimaryDark};

    ImageAdapter(Context context){
        mContext = context;

    }
    @Override
    public int getCount() {
        return mimgids.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mimgids[position]);
        container.addView(imageView,0);
        return imageView;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
