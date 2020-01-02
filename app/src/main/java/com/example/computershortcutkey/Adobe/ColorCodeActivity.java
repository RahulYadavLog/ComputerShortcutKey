package com.example.computershortcutkey.Adobe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.ColorCodeAdapter;
import com.example.computershortcutkey.ColorCodeModel;
import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class ColorCodeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ColorCodeAdapter recyclerViewAdapter;

    ArrayList<ColorCodeModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_code);





            toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Color Code Shortcut Keys");
            setSupportActionBar(toolbar);

            lstBook = new ArrayList<>();

            lstBook.add(new ColorCodeModel("#CD5C5C :-","Indianredm",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#F08080 :-","Light Coral",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FA8072 :-","Salmon",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#E9697A :-","Dark Salmon",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FFA07A :-","Light Salmon",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#DC143C :-","Crimson",R.drawable.colorcode));





        lstBook.add(new ColorCodeModel("#FF0000 :-","Red",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#B22222 :-","Firebrick",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#8B0000 :-","Dark Red",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FFC0CB :-","Pink",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FFB6C1 :-","Light Pink",R.drawable.colorcode));

        lstBook.add(new ColorCodeModel("#FF69B4 :-","Hot Pink",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FF1493 :-","Deep Pink",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#C71585 :-","Medium Violetred",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#DB7093 :-","Palevioletred",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FFA07A :-","Light Salmon",R.drawable.colorcode));

        lstBook.add(new ColorCodeModel("#FF7F50 :-","Coral",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FF6347 :-","Tomato",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FF4500 :-","Orange Red",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FF8C00 :-","Dark Orange",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FFA500 :-","Orange",R.drawable.colorcode));




        lstBook.add(new ColorCodeModel("#F0F8FF  :-","Alice blue",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FAEBD7 :-","Antique white",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#00FFFF :-","Aqua ",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#7FFFD4 :-","Aquamarine",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#F0FFFF :-","Azure ",R.drawable.colorcode));

        lstBook.add(new ColorCodeModel("#F5F5DC  :-","Beige",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FFE4C4 :-","Bisque ",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#000000 :-","Black ",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FFEBCD :-","Blanched almond",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#0000FF  :-","Blue ",R.drawable.colorcode));








        lstBook.add(new ColorCodeModel("##8A2BE2   :-","Blue violet ",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#A52A2A :-","Brown ",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#DEB887  :-","Burlywood  ",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#5F9EA0  :-","Cadet blue",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#7FFF00 :-","Chartreuse ",R.drawable.colorcode));

        lstBook.add(new ColorCodeModel("#D2691E  :-","Chocolate ",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FF7F50 :-","Coral  ",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#6495ED :-","Cornflower blue  ",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#FFF8DC  :-","Cornsilk ",R.drawable.colorcode));
        lstBook.add(new ColorCodeModel("#DC143C  :-","Crimson ",R.drawable.colorcode));



        recyclerView = (RecyclerView) findViewById(R.id.colorcode);

            layoutManager=new GridLayoutManager(this,1);
            recyclerView.setLayoutManager(layoutManager);
            recyclerViewAdapter =new ColorCodeAdapter(this, lstBook);
            recyclerView.setAdapter(recyclerViewAdapter);
    }
}
