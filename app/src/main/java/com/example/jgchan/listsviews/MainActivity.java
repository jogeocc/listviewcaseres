package com.example.jgchan.listsviews;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {
    //Lista de string  temporal
    String [] listaContacto ={
                                "ALberto Chauble, 999 999 99 99, albero@gmail.com",
                                "Sheila Manzanero, 999 999 99 99, albero@gmail.com",
                                "José Luis Gonzales Arias, 999 999 99 99, albero@gmail.com",
                                "Iruhary Moreno, 999 999 99 99, albero@gmail.com",
                                "ALberto Chauble, 999 999 99 99, albero@gmail.com",
                                "Sheila Manzanero, 999 999 99 99, albero@gmail.com",
                                "José Luis Gonzales Arias, 999 999 99 99, albero@gmail.com",
                                 "José Luis Gonzales Arias, 999 999 99 99, albero@gmail.com",
                                    "Iruhary Moreno, 999 999 99 99, albero@gmail.com",
                                    "ALberto Chauble, 999 999 99 99, albero@gmail.com",
                                    "Sheila Manzanero, 999 999 99 99, albero@gmail.com",
                                    "José Luis Gonzales Arias, 999 999 99 99, albero@gmail.com",
                                                        "Iruhary Moreno, 999 999 99 99, albero@gmail.com"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        setListAdapter(new ArrayAdapter<String>(this,
                                                android.R.layout.simple_list_item_1,
                                                listaContacto));

    }


}
