package com.example.computershortcutkey.Browser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class BrowserActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
   BrowserAdapter recyclerViewAdapter;

    ArrayList<BrowserModel> lstBook ;

    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);


        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.btoolbar);
        toolbar.setTitle("Browser Shortcut Keys");
        setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();
                 lstBook.add(new BrowserModel("Chrome",R.drawable.crome));
       lstBook.add(new BrowserModel("Firefox", R.drawable.firefox));
        lstBook.add(new BrowserModel("Internet Explorer", R.drawable.explorer));



        recyclerView = (RecyclerView) findViewById(R.id.browser);

        layoutManager=new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new BrowserAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.browser, menu);

        return true;
    }
}
