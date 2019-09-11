package com.example.ieee04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Kulupler extends AppCompatActivity {
final List<Modelkulup> liste = new ArrayList<Modelkulup>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kulupler);
        liste.add(new Modelkulup("pes",1));
        liste.add(new Modelkulup("aess",2));
        liste.add(new Modelkulup("cs",3));
        liste.add(new Modelkulup("wie",5));
        liste.add(new Modelkulup("emb",6));
        liste.add(new Modelkulup("eab",7));
        Adaptorkulup yeniadaptor=new Adaptorkulup(Kulupler.this,liste);
        ListView kulupler=(ListView)findViewById(R.id.listee);
        kulupler.setAdapter(yeniadaptor);
        kulupler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             //   Toast.makeText(getApplicationContext(),liste.get(position).getIsim(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Kulupler.this,Kulupler2.class);
                intent.putExtra("kulup",liste.get(position).getIsim());
                startActivity(intent);
            }
        });
    }
}
