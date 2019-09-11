package com.ieee.ieee04;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Takvim extends AppCompatActivity {
    private CalendarView tarih;
    private TextView yazi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takvim);
        tarih=findViewById(R.id.calendarView);
        yazi=findViewById(R.id.yazi);
        tarih.setDate(1554637151275L);
        yazi.setTextColor(Color.BLACK);
        Log.d("takvim", String.valueOf(tarih.getDate()));
        DatabaseReference db = FirebaseDatabase.getInstance().getReference().child("takvim");
        db.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(final DataSnapshot dataSnapshot) {
                tarih.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
                    @Override
                    public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                        Log.d("sonuc", String.valueOf(tarih.getDate()));
                        Log.d("sonuc",String.valueOf(month));
                        yazi.setText("Bu tarihte etkinlik yok");
                        Log.d("sonuc",String.valueOf(dayOfMonth));
                        for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren()){
                            String günd = dataSnapshot1.child("gün").getValue().toString();
                            String ayd =dataSnapshot1.child("ay").getValue().toString();
                            String aciklamad =  dataSnapshot1.child("aciklama").getValue().toString();
                            Log.d("sonuc2",günd);
                            Log.d("sonuc2",ayd);
                            Log.d("sonuc2",aciklamad);
                            int günd2= Integer.parseInt(günd);
                            int ayd2=Integer.parseInt(ayd);
                            if(günd2==dayOfMonth){
                                if(ayd2==month) {
                                    Log.d("sonuc3", "basarili2");
                                    Log.d("sonuc3", aciklamad);
                                    yazi.setText(aciklamad);
                                }
                            }
                        }
                    }
                });
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
