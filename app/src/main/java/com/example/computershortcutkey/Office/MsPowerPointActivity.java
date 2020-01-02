package com.example.computershortcutkey.Office;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class MsPowerPointActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MsPowerPointAdapter recyclerViewAdapter;

    ArrayList<MsPowerPointModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ms_power_point);

        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Ms Access Shortcut Keys");
        setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();

        lstBook.add(new MsPowerPointModel("Ctrl+N :-","New Slide",R.drawable.power));
        lstBook.add(new MsPowerPointModel("Ctrl+O :-","Open File",R.drawable.power));
        lstBook.add(new MsPowerPointModel("Ctrl+C :-","Copy Selected Item",R.drawable.power));
        lstBook.add(new MsPowerPointModel("Ctrl+X :-","Cut Selected Item",R.drawable.power));
        lstBook.add(new MsPowerPointModel("Ctrl+V :-","Paste Clipboard Item",R.drawable.power));




        lstBook.add(new MsPowerPointModel("Del :-","Delete",R.drawable.power));
        lstBook.add(new MsPowerPointModel("Ctrl+Z :-","Undo",R.drawable.power));
        lstBook.add(new MsPowerPointModel("Ctrl+Y :-","Redo",R.drawable.power));
        lstBook.add(new MsPowerPointModel("F5 :-","Slide Show Begin",R.drawable.power));
        lstBook.add(new MsPowerPointModel("Esc :-","Slide show end  ",R.drawable.power));

        lstBook.add(new MsPowerPointModel("N :-","Slide Show Next Slide",R.drawable.power));
        lstBook.add(new MsPowerPointModel("P :-","Slide Show Previous Slide",R.drawable.power));
        lstBook.add(new MsPowerPointModel("B :-","Make The Screen go Black During a show",R.drawable.power));
        lstBook.add(new MsPowerPointModel("Slide number+Enter :-","During Presentation ,Go to Slide Number",R.drawable.power));
        lstBook.add(new MsPowerPointModel("Shift+F5 :-","View The Slide Show From the Current slide",R.drawable.power));




        recyclerView = (RecyclerView) findViewById(R.id.power);

        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new MsPowerPointAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }



}
