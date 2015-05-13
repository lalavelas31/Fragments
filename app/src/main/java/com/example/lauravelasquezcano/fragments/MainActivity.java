package com.example.lauravelasquezcano.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        WonderWoman fragment=new WonderWoman();
        fragmentTransaction.add(android.R.id.content,fragment).commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        //noinspection SimplifiableIfStatement
        if (id == R.id.m_wonder_woman) {
            WonderWoman fragment=new WonderWoman();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }

        if(id==R.id.m_batman){
            Batman fragment=new Batman();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }

        return super.onOptionsItemSelected(item);
    }
}
