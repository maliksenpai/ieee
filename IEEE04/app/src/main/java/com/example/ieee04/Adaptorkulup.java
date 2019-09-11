package com.example.ieee04;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptorkulup extends BaseAdapter{
    private LayoutInflater layoutInflater;
    private List<Modelkulup> liste;
    public Adaptorkulup(Activity activity, List<Modelkulup> Modelkulup ){
        layoutInflater=(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.liste= Modelkulup;
    }
    public int getCount(){
        return liste.size();
    }
    public Object getItem(int i){
        return liste.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public long getItemid(int i){
        return i;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view = layoutInflater.inflate(R.layout.kulupler_listview, null);
        ImageView resim = view.findViewById(R.id.foto);
        TextView yazi = view.findViewById(R.id.isim);
        Modelkulup modelkulup = liste.get(position);
       // yazi.setText(modelkulup.getIsim());
        if (modelkulup.getFoto() == 1) {
            resim.setImageResource(R.drawable.pes);
        } else if (modelkulup.getFoto() == 2) {
            resim.setImageResource(R.drawable.aess);
        } else if (modelkulup.getFoto() ==3) {
            resim.setImageResource(R.drawable.cs35);
        } else if (modelkulup.getFoto()==4){
            resim.setImageResource(R.drawable.comsoc5);
        } else if(modelkulup.getFoto()==5){
            resim.setImageResource(R.drawable.wie5);
        } else if(modelkulup.getFoto()==6){
            resim.setImageResource(R.drawable.emb5);
        } else if(modelkulup.getFoto()==7){
            resim.setImageResource(R.drawable.eab5);
        }
        return view;
    }
}
