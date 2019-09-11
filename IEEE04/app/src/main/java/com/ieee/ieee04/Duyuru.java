package com.ieee.ieee04;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Duyuru extends AppCompatActivity {
    final List<sınıf> kisiler=new ArrayList<sınıf>();
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duyuru);
        final ListView listView = (ListView) findViewById(R.id.liste);
        yeniadaptor adaptor = new yeniadaptor(Duyuru.this,kisiler);
        listView.setAdapter(adaptor);
        DatabaseReference db = FirebaseDatabase.getInstance().getReference().child("duyurular");
        db.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren()){
                    String aciklama = dataSnapshot1.child("aciklama").getValue().toString();
                    String konu =dataSnapshot1.child("isim").getValue().toString();
                    String durum =  dataSnapshot1.child("durum").getValue().toString();
                    kisiler.add(new sınıf(konu,durum,aciklama));
                    Log.d("durum", durum);
                }
                yeniadaptor yeniadaptor =new yeniadaptor(Duyuru.this,kisiler);
                listView.setAdapter(yeniadaptor);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w("hata","hata:"+databaseError.getDetails());
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             //  Toast.makeText(getApplicationContext(),kisiler.get(position).getAciklama(),Toast.LENGTH_LONG).show();
                LayoutInflater layoutInflater =(LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                final View popup=layoutInflater.inflate(R.layout.popup,null);
                final PopupWindow popupWindow = new PopupWindow(
                        popup,
                        840,
                        800);
                Button kapama = popup.findViewById(R.id.pbuton);
                RelativeLayout relativeLayout = popup.findViewById(R.id.parkaplan);
                final LinearLayout linearLayout = findViewById(R.id.larkaplan);
                TextView pkonu = (TextView) popup.findViewById(R.id.pkonu);
                TextView paciklama = (TextView) popup.findViewById(R.id.paciklama);
                pkonu.setText(kisiler.get(position).getIsim());
                paciklama.setText(kisiler.get(position).getAciklama());
                linearLayout.setBackgroundColor(Color.rgb(105,105,105));
                relativeLayout.setBackgroundColor(Color.rgb(240,240,240));
                ImageView presim = popup.findViewById(R.id.presim);
                presim.setImageResource(R.drawable.ieee);
                popupWindow.setElevation(50);
                popupWindow.showAtLocation(parent,Gravity.CENTER,0,0);
                kapama.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                        linearLayout.setBackgroundColor(Color.rgb(255,255,255));
                    }
                });
                popupWindow.showAsDropDown(kapama, 750, 250);
            }
        });

    }
}
