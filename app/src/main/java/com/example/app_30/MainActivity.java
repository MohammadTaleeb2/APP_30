package com.example.app_30;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import data.Book;
import data.BookDa;

public class MainActivity extends AppCompatActivity {
    private Spinner spnLang ;
    private Button btnShow ;
    private ListView lstBooks ;
    private BookDa items ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setUpViews() ;
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lang = spnLang.getSelectedItem().toString() ;
                ArrayAdapter<Book> adapter1 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,items.getBooks(lang)) ;
                lstBooks.setAdapter(adapter1);
            }
        });

    }

    private void setUpViews() {
        spnLang = findViewById(R.id.spnLang) ;
        btnShow = findViewById(R.id.btnShow) ;
        lstBooks = findViewById(R.id.lstBook) ;
        items = new BookDa() ;

        ArrayList<String> lang = new ArrayList<>() ;
        lang.add("java") ;
        lang.add("C") ;
        lang.add("Dart") ;
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,lang) ;
        spnLang.setAdapter(adapter);





    }


}