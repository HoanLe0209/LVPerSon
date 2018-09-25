package com.example.admin.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Person> objects;
    PersonAddapter adt ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objects = new ArrayList<>();

        objects.add(new Person("Lê",30 ,R.mipmap.ic_launcher));
        objects.add(new Person("Lê",30 ,R.mipmap.ic_launcher));
        objects.add(new Person("Lê",30 ,R.mipmap.ic_launcher));
        objects.add(new Person("Lê",30 ,R.mipmap.ic_launcher));
        objects.add(new Person("Lê",30 ,R.mipmap.ic_launcher));
        objects.add(new Person("Lê",30 ,R.mipmap.ic_launcher));
        objects.add(new Person("Lê",30 ,R.mipmap.ic_launcher));

        adt = new PersonAddapter(MainActivity.this,R.layout.person,objects);
        lv.setAdapter(adt);
    }
}
