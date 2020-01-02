package com.example.computershortcutkey.Office;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class MsofficeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MsofficeAdapter recyclerViewAdapter;

    ArrayList<Msofficemodel> lstBook ;

    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msoffice);





            toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.office_toolbar);
            toolbar.setTitle("Ms Office Shortcut Keys");
            setSupportActionBar(toolbar);


            lstBook = new ArrayList<>();
        lstBook.add(new Msofficemodel("MS Dos", R.drawable.dos2));
          lstBook.add(new Msofficemodel("MS Excel", R.drawable.excel2));
        lstBook.add(new Msofficemodel("MS Word", R.drawable.word));
        lstBook.add(new Msofficemodel("MS Paint", R.drawable.paint2));
        lstBook.add(new Msofficemodel("MS Access", R.drawable.access));



        lstBook.add(new Msofficemodel("MS Power Point",R.drawable.power));
        lstBook.add(new Msofficemodel("MS Outlook", R.drawable.out2));






        recyclerView = (RecyclerView) findViewById(R.id.msoffice);

        layoutManager=new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new MsofficeAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.office, menu);

        return true;
    }
}
