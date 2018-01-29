package com.rekarcell.customcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;

import com.rekarcell.customcheck.Adapter.CheckUnchekAdapter;
import com.rekarcell.customcheck.Model.ModelClassCheckUnchek;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<ModelClassCheckUnchek> list = new ArrayList<ModelClassCheckUnchek>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(new ModelClassCheckUnchek(R.drawable.download,"Item 1"));
        list.add(new ModelClassCheckUnchek(R.drawable.download1,"Item 2"));
        list.add(new ModelClassCheckUnchek(R.drawable.download2,"Item 3"));
        list.add(new ModelClassCheckUnchek(R.drawable.download3,"Item 4"));
        list.add(new ModelClassCheckUnchek(R.drawable.download4,"Item 5"));





        CheckUnchekAdapter adapter = new CheckUnchekAdapter(getApplicationContext(),list);

        listView = (ListView)findViewById(R.id.listview_1);
        listView.setAdapter(adapter);

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),"position: "+parent,Toast.LENGTH_LONG).show();

            }
        });*/


    }
}
