package com.df.whisky;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.df.whisky.models.Distillery;

import java.util.List;

public class DestileriaAdapter extends BaseAdapter {
    protected Activity activity;
    protected List<Distillery> listaDestilerias;

    public DestileriaAdapter(Activity activity, List<Distillery> listaDestilerias) {
        this.activity = activity;
        this.listaDestilerias = listaDestilerias;
    }

    @Override
    public int getCount() {
        return listaDestilerias.size();
    }

    @Override
    public Object getItem(int position) {
        return listaDestilerias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.destileria_item,null);
        }
        Distillery distillery = listaDestilerias.get(position);
        TextView nombreDestileria = view.findViewById(R.id.txtNameDestileria);
        nombreDestileria.setText(distillery.getNombreDestileria());
        return view;
    }
}
