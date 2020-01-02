package com.example.computershortcutkey.Adobe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.ColorCodeAdapter;
import com.example.computershortcutkey.ColorCodeModel;
import com.example.computershortcutkey.CorelDrawADapter;
import com.example.computershortcutkey.CorelDrawModel;
import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class CorelDrawActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    CorelDrawADapter recyclerViewAdapter;

    ArrayList<CorelDrawModel> lstBook;
    public android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corel_draw);


        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Corel Draw Shortcut Keys");
        setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();

        lstBook.add(new CorelDrawModel("Ctrl+I :-", "Import or link content into your document", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+E :-", "Export Pages or object to selected file format", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+P :-", "Print The Active Drawing", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Z :-", "Undo/Reverse The Last Operation", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Shift+Z :-", "Redo", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+R :-", "Repeat The Last Operation", R.drawable.coreldraw));






        lstBook.add(new CorelDrawModel("Ctrl+F3 :-", "Symbol Manager Docker", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+D :-", "Duplicate The Selected Object at Their current location", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Shift+D :-", "Shows Step and Repeat Docker", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+F :-", "Find and Replace>Find Object", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Alt+Enter :-", "Allow The Properties of an object to be Viewed and Edited ", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("F9 :-", "Displays a Full-Screen Preview of the drawing", R.drawable.coreldraw));

        lstBook.add(new CorelDrawModel("Ctrl+F2 :-", "Open The View Manager Docker Window", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Y :-", "Snap to>document Grid", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Alt+Z :-", "Snap to >Objects", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Alt+Shift+D :-", "Dynamic Guide", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Alt+Shift+A :-", "Alignment Guides", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Alt+F7 :-", "TransFormation>Position", R.drawable.coreldraw));

        lstBook.add(new CorelDrawModel("Alt+F8 :-", "TransFormation>Rotate", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Alt+F9 :-", "TransFormation>Scale", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Alt+F10 :-", "TransFormation>Size", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("L :-", "Align and Distribute >Align Left", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("R :-", "Align and Distribute >Align Right", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("T :-", "Align and Distribute >Align Top", R.drawable.coreldraw));

        lstBook.add(new CorelDrawModel("B :-", "Align and Distribute >Align Bottom", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("E :-", "Align and Distribute >Align Center Horizontally", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("C :-", "Align and Distribute >Align Center Vertically", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("P :-", "Align and Distribute >center to page", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Home :-", "Order >To Back of Page ", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+End :-", "Order>To Back of page", R.drawable.coreldraw));













        lstBook.add(new CorelDrawModel("Shift+Page Up :-", "Order>To Front of Layer", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Shift+Page Down :-", "Order>To Back of Layer", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Page Up:-", "Order>Forward One", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Page Down :-", "Order>Backward One", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+G :-", "Group ", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+U :-", "Ungroup", R.drawable.coreldraw));

        lstBook.add(new CorelDrawModel("Ctrl+L :-", "Combine", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+K :-", "Break Apart", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Q :-", "Convert To Curves", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Shift+Q :-", "Convert Outline To Object", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+B :-", "Adjust >Brightness/Contrast/Intensity", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Shift+B :-", "Adjust >Color Balance", R.drawable.coreldraw));

        lstBook.add(new CorelDrawModel("Ctrl+Shift+U :-", "Adjust >Hue/Saturation/Lightness", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+F9 :-", "Contour", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+F7:-", "Envelop", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+F3 :-", "Lens", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+T :-", "Text Properties", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Shift+T :-", "Edit Text", R.drawable.coreldraw));

        lstBook.add(new CorelDrawModel("Ctrl+F11 :-", "Insert Symbol Character", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Shift +- :-", "Insert Formating Code> Non-breaking Code Hypen", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+- :-", "Insert Formating Code>Optional Hypen", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Alt+F12 :-", "Align To BaseLine", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+F12 :-", "Writing Tools>Spell Check ", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+F8 :-", "Convert", R.drawable.coreldraw));

        lstBook.add(new CorelDrawModel("Ctrl+J :-", "Option", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+F2 +- :-", "View Manager", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+F6 :-", "Color Style", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+F5 :-", "Object Style", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Alt+Shift+F11 :-", "Macros> Macro Manager ", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Alt+F11 :-", "Macros> Macro Editor", R.drawable.coreldraw));

        lstBook.add(new CorelDrawModel("Alt+Shift+F12 :-", "Macros> VSTA Editor", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Shift+O +- :-", "Macros> Stop Recording", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Shift+R :-", "Macros> Record Temporary Macro", R.drawable.coreldraw));
        lstBook.add(new CorelDrawModel("Ctrl+Shift+P:-", "Macros> Run Temporary Macro", R.drawable.coreldraw));



        recyclerView = (RecyclerView) findViewById(R.id.corel);

        layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new CorelDrawADapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}