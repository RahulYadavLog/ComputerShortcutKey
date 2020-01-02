package com.example.computershortcutkey.Adobe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import com.example.computershortcutkey.Office.Msofficemodel;
import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class AdobeActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
  AdobeAdapter recyclerViewAdapter;

    ArrayList<Adobemodel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adobe);




            toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.Atoolbar);
            toolbar.setTitle("Adobe Shortcut Keys");
            setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();
                lstBook.add(new Adobemodel("Adobe Photoshop",R.drawable.photoshop));
        lstBook.add(new Adobemodel("Illustrator MAc OS", R.drawable.illust));
        lstBook.add(new Adobemodel("Photoshop MAC OS", R.drawable.mac_photoshop));
        lstBook.add(new Adobemodel("Illustrator", R.drawable.illust));
        lstBook.add(new Adobemodel("Adobe Dream Weaver", R.drawable.dream));

        lstBook.add(new Adobemodel("Adobe Flash",R.drawable.flash));
        lstBook.add(new Adobemodel("Adobe Corel Draw", R.drawable.coreldraw));
        lstBook.add(new Adobemodel("Adobe Page Maker", R.drawable.page));
        lstBook.add(new Adobemodel("Color Code", R.drawable.colorcode));





        recyclerView = (RecyclerView) findViewById(R.id.adobe);

        layoutManager=new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new AdobeAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.adobe, menu);

        return true;
    }
}
