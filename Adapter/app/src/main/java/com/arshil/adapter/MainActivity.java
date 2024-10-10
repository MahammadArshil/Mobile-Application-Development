package com.arshil.adapter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    String [] color={"Red","Blue","Green","White","Black","Grey","Purple"};
    int[] colorImage={R.drawable.red,R.drawable.blue,R.drawable.green,R.drawable.white,R.drawable.black,R.drawable.grey,R.drawable.purple};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=(ListView) findViewById(R.id.list_view_1);
        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
        for (int i=0;i<color.length;i++)
        {
            HashMap<String,String> hashMap=new HashMap<>();
            hashMap.put("name",color[i]);
            hashMap.put("image",colorImage[i]+"");
            arrayList.add(hashMap);
        }
        String[] from={"name","image"};
        int[] to={R.id.textView,R.id.imageView};

        SimpleAdapter simpleAdapter=new SimpleAdapter(this,arrayList,R.layout.list_view_items,from,to);
        listview.setAdapter(simpleAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),color[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}