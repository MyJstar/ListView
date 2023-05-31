package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] values = {"apple1","banana1", "blueberry1", "manggo1", "chery1",
                "apple2" ,"banana2", "blueberry2", "manggo2", "chery2",
                "apple3" ,"banana3", "blueberry3", "manggo3", "chery3",
                "apple4" ,"banana4", "blueberry4", "manggo4", "chery4",
                "apple5" ,"banana5", "blueberry5", "manggo5", "chery5"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,values);
        ListView listView = findViewById(R.id.ListView);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                String str = (String) adapterView.getAdapter().getItem(pos);
                Toast.makeText(getApplicationContext(),str+"가 선택었습니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}