package com.salma.customlistviewlow_performance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Mad> mads;
    private MadsAdapter madsAdapter;
    private ListView listView;


    public MainActivity() {
        mads = new ArrayList<Mad>();
        mads.add(new Mad(R.drawable.boy, "Ashraf", "Ahmed Ashraf"));
        mads.add(new Mad(R.drawable.boy, "Gomaa", "Ahmed Gomaa"));
        mads.add(new Mad(R.drawable.boy, "Kamal", "Ahmed kamal"));
        mads.add(new Mad(R.drawable.boy, "Amr", "Amr Hesham"));
        mads.add(new Mad(R.drawable.boy, "Arafa", "Abdelrahman Arafa"));
        mads.add(new Mad(R.drawable.girl, "Aya", "Aya Mohamed"));
        mads.add(new Mad(R.drawable.girl, "Esraa", "Esraa Hamed"));
        mads.add(new Mad(R.drawable.girl, "Mai", "Mai Alaa"));
        mads.add(new Mad(R.drawable.girl, "Nouran", "Nouran Amr"));
        mads.add(new Mad(R.drawable.girl, "Radya", "Radya Abdelkerem"));
        mads.add(new Mad(R.drawable.girl, "Rokaya", "Rokaya Ismael"));
        mads.add(new Mad(R.drawable.girl, "Sahar", "Sahar Hany"));
        mads.add(new Mad(R.drawable.girl, "Salma", "Salma Atef"));
        mads.add(new Mad(R.drawable.girl, "Salma", "Salma Salah"));
        mads.add(new Mad(R.drawable.girl, "Yasmin", "Yasmin Ayman"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.madsList);
        madsAdapter = new MadsAdapter(getApplicationContext(), mads);
        listView.setAdapter(madsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, parent.getAdapter().getItem(position).toString(), Toast.LENGTH_LONG).show();
            }
        });


    }
}
