package com.example.android.activebartest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        if (toolbar != null) {
            toolbar.setTitle("Title Test");
            setSupportActionBar(toolbar);
        }
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        menu.add(Menu.NONE,0,1,"menu1");
//        menu.add(Menu.NONE,0,3,"menu2");
//        menu.add(Menu.NONE,0,2,"menu3");
        getMenuInflater().inflate(R.menu.menu_list, menu);
        return  true;
    }
}
