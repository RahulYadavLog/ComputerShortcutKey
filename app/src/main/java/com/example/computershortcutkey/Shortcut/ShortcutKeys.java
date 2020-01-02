package com.example.computershortcutkey.Shortcut;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ProgressBar;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class ShortcutKeys extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    LinearLayoutManager manager;
    ShortcutAdapter recyclerViewAdapter;
    Boolean isScrolling=false;
    ProgressBar progressBar;
    int currentItem,totalItem,scrollOutItem;

    ArrayList<ShortcutModel> lstBook ;

    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shortcut_keys);


     toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.Stoolbar);
     toolbar.setTitle("Shortcut Keys");
     setSupportActionBar(toolbar);


        ListImage();
        progressBar=findViewById(R.id.progress);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        manager=new LinearLayoutManager(this);

        layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if(newState== AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL)
                {
                    isScrolling=true;
                }
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                currentItem=manager.getChildCount();
                totalItem=manager.getItemCount();
                scrollOutItem = manager.findFirstVisibleItemPosition();



                if(isScrolling && (currentItem + scrollOutItem ==totalItem))
                {
                    isScrolling = false;
                    fetchData();
                }

            }
        });
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        recyclerViewAdapter =new ShortcutAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);


    }

    private void fetchData(){
        progressBar.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                for (int i=0;i<5;i++)
                {

                    recyclerViewAdapter.notifyDataSetChanged();
                    progressBar.setVisibility(View.GONE);

                }


            }
        },5000);
    }

    private void ListImage(){

        lstBook = new ArrayList<>();
        lstBook.add(new ShortcutModel("General/Basic",R.drawable.shortcut));
        lstBook.add(new ShortcutModel("General/Basic Mac", R.drawable.mac3));
        lstBook.add(new ShortcutModel("Windows", R.drawable.window));

        lstBook.add(new ShortcutModel("Tally", R.drawable.tally2));
         lstBook.add(new ShortcutModel("NotePad++",R.drawable.notepad));

                lstBook.add(new ShortcutModel("Chat Symbol", R.drawable.chat));
      lstBook.add(new ShortcutModel("Ascii Code", R.drawable.ascii));

//         lstBook.add(new ShortcutModel("Chrome ",R.drawable.crome));
//       lstBook.add(new ShortcutModel("Firefox", R.drawable.firefox));
//        lstBook.add(new ShortcutModel("Internet Explorer", R.drawable.exproler));


        //lstBook.add(new ShortcutModel("MS Dos", R.drawable.dos2));
      //  lstBook.add(new ShortcutModel("MS Excel", R.drawable.excel2));
//        lstBook.add(new ShortcutModel("MS Word", R.drawable.word));
//        lstBook.add(new ShortcutModel("MS Paint", R.drawable.paint2));
//        lstBook.add(new ShortcutModel("MS Access", R.drawable.access));
//
//
//
//        lstBook.add(new ShortcutModel("MS Power Point ",R.drawable.power));
//        lstBook.add(new ShortcutModel("MS Outlook", R.drawable.out2));

//        lstBook.add(new ShortcutModel("Photoshop MAC OS", R.drawable.mac_photoshop));
//
//
//
//        lstBook.add(new ShortcutModel("Adobe Photoshop ",R.drawable.photoshop));
//        lstBook.add(new ShortcutModel("Illustrator MAc OS", R.drawable.illust));
//        lstBook.add(new ShortcutModel("Illustrator", R.drawable.illust));
//        lstBook.add(new ShortcutModel("Adobe Dream Weaver", R.drawable.dream));
//
//        lstBook.add(new ShortcutModel("Adobe Flash",R.drawable.flash));
//        lstBook.add(new ShortcutModel("Adobe Corel Draw", R.drawable.coreldraw));
//        lstBook.add(new ShortcutModel("Adobe Page Maker", R.drawable.page));
//        lstBook.add(new ShortcutModel("Color Code", R.drawable.colorcode));
//
//
//        lstBook.add(new ShortcutModel("Chat Symbol", R.drawable.chat));
//        lstBook.add(new ShortcutModel("Ascii Code", R.drawable.ascii));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);

        return true;
    }
}
