package com.alfarises.studikasus;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class cuciAdapter extends RecyclerView.Adapter<cuciView> {

    private static final int LENGTH = 3;

    private final String[] mPlaces;
    private final String[] mPlaceDesc;
    private final Drawable[] mPlacePictures;

    public cuciAdapter(Context context) {
        Resources resources = context.getResources();
        mPlaces = resources.getStringArray(R.array.jenis);
        mPlaceDesc = resources.getStringArray(R.array.harga);
        TypedArray a = resources.obtainTypedArray(R.array.picture);
        mPlacePictures = new Drawable[a.length()];
        for (int i = 0; i < mPlacePictures.length; i++) {
            mPlacePictures[i] = a.getDrawable(i);
        }
        a.recycle();
    }

    @Override
    public cuciView onCreateViewHolder(ViewGroup parent, int viewType) {
        return new cuciView(LayoutInflater.from(parent.getContext()), parent);
    }

    @Override
    public void onBindViewHolder(cuciView holder, int position) {
        holder.picture.setImageDrawable(mPlacePictures[position % mPlacePictures.length]);
        holder.name.setText(mPlaces[position % mPlaces.length]);
        holder.description.setText(mPlaceDesc[position % mPlaceDesc.length]);
    }

    @Override
    public int getItemCount() {
        return LENGTH;
    }
}