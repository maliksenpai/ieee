package com.ieee.ieee04;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton duyurular = (ImageButton) findViewById(R.id.Duyurular);
        duyurular.setBackgroundColor(Color.rgb(255,165,0));
        TextView duyurularyazi= findViewById(R.id.Duyurularyazi);
        duyurularyazi.setTextColor(Color.WHITE);
        ImageButton haberler = (ImageButton) findViewById(R.id.Haberler);
        haberler.setBackgroundColor(Color.rgb(255,0,0));
        TextView haberleryazi= (TextView) findViewById(R.id.Haberleryazi);
        haberleryazi.setTextColor(Color.WHITE);
        ImageButton kollar = (ImageButton) findViewById(R.id.Kollar);
        kollar.setBackgroundColor(Color.rgb(0, 204, 255));
        TextView kollaryazi= (TextView) findViewById(R.id.Kollaryazi);
        kollaryazi.setTextColor(Color.WHITE);
        ImageButton takvim = (ImageButton) findViewById(R.id.takvim);
        takvim.setBackgroundColor(Color.rgb(0,31,63));
        TextView takvimyazi = (TextView) findViewById(R.id.Takvimyazi);
        takvimyazi.setTextColor(Color.WHITE);
        haberler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Yakında...", Toast.LENGTH_SHORT).show();
            }
        });
        duyurular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(internet()) {
                    Intent intent = new Intent(MainActivity.this, Duyuru.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "İnternet bağlantınızı kontrol edin", Toast.LENGTH_SHORT).show();
                }
            }
        });
        kollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Kulupler.class);
                    startActivity(intent);
            }
        });
        takvim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(internet()) {
                    Intent intent = new Intent(MainActivity.this, Takvim.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "İnternet bağlantınızı kontrol edin", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    protected boolean internet(){
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

}
