package com.df.whisky;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.df.whisky.models.Whisky;

import java.util.List;

public class WhiskyAdapter extends BaseAdapter {
    protected Activity activity;
    protected List<Whisky> listaWhiskys;

    public WhiskyAdapter(Activity activity, List<Whisky> listaWhiskys) {
        this.activity = activity;
        this.listaWhiskys = listaWhiskys;
    }

    @Override
    public int getCount() {
        return listaWhiskys.size();
    }

    @Override
    public Object getItem(int position) {
        return listaWhiskys.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.wisky_item,null);
        }
        Whisky whisky = listaWhiskys.get(position);
        TextView nombreWhisky = view.findViewById(R.id.txtNameWhisky);
        nombreWhisky.setText(whisky.getNombreWisky());
        return view;
    }
}
