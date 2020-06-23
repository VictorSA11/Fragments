package com.example.fragments;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;

public class MainActivity extends Activity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
               Fragment FragmentoSeleccionado = null;

                switch (pos){
                    case 0:
                        FragmentoSeleccionado  = new ListaFragmento();
                        break;
                    case 1:
                        FragmentoSeleccionado  = new GridFragmento();

                }
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
               // transaction.replace(R.id.fragmento,FragmentoSeleccionado);
                transaction.commit();


            }

        });
    }
}