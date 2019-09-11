package com.ieee.ieee04;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class yeniadaptor extends BaseAdapter {
    private LayoutInflater  layoutInflater;
    private List<com.ieee.ieee04.sınıf> sınıf;
    public yeniadaptor(Activity activity,List<com.ieee.ieee04.sınıf> sınıf){
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.sınıf = sınıf;
    }
    public int getCount(){
        return sınıf.size();
    }
    public Object getItem(int i){
        return sınıf.get(i);
    }
    public long getItemId(int i){
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view = layoutInflater.inflate(R.layout.listem,null);
        TextView isimler = (TextView) view.findViewById(R.id.isimsoyisim);
        ImageView resimler = (ImageView) view.findViewById(R.id.simge);
        TextView aciklama = (TextView) view.findViewById(R.id.aciklama);
        com.ieee.ieee04.sınıf kisiler = sınıf.get(position);
        isimler.setText(kisiler.getIsim());
        aciklama.setText(kisiler.getAciklama());
        if("1".equals(kisiler.getDurum())){
            resimler.setImageResource(R.drawable.duyuru3);
        }
        else{
            resimler.setImageResource(R.drawable.acil3);
        }
        return view;
    }
}
