package com.example.computershortcutkey.Adobe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.CorelDrawADapter;
import com.example.computershortcutkey.CorelDrawModel;
import com.example.computershortcutkey.DreamWeaverAdapter;
import com.example.computershortcutkey.DreamWeaverModel;
import com.example.computershortcutkey.PagemakerModel;
import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class DreamWeaverActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    DreamWeaverAdapter recyclerViewAdapter;

    ArrayList<DreamWeaverModel> lstBook;
    public android.support.v7.widget.Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dream_weaver);




            toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Dream Weaver Shortcut Keys");
            setSupportActionBar(toolbar);

            lstBook = new ArrayList<>();

        lstBook.add(new DreamWeaverModel("Ctrl+Shift+Space :-", "Non-Breaking Space", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Shift+Return :-", "Line Break", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Alt+I :-", "Image", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Alt+T :-", "Table", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+T :-", "Quick Tag Editor", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Alt+Click :-", "Show Code Navigator", R.drawable.dream));




        lstBook.add(new DreamWeaverModel("Ctrl+M :-", "Insert Row", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Shift+A :-", "insert Column", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Shift+M :-", "Delete Row", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Shift+Hyphen (-) :-", "Delete Column", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Alt+M :-", "Merge Selected Cells", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Alt+S :-", "Split cell", R.drawable.dream));

        lstBook.add(new DreamWeaverModel("Ctrl+Shift+] :-", "Increase Column Span", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Shift+[ :-", "Decrease Column Span", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Alt+Right arrow :-", "Select Next Frame or Frameset", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Alt+Left Arrow :-", "Select Previous frame or frameset", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Alt+Up Arrow :-", "Select Parent FrameSet", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Alt+Down Arrow :-", "Select First child Frame or FrameSet", R.drawable.dream));

        lstBook.add(new DreamWeaverModel("Ctrl+Right Arrow :-", "Go To Next Word", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Left Arrow :-", "Go To Previous Word", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Up Arrow :-", "Go to Previous Paragraph", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Down Arrow:-", "Go To Next Paragraph", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Shift+Right Arrow:-", "Select Until Next Word ", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Shift+Left Arrow:-", "Select From Previous Word", R.drawable.dream));

        lstBook.add(new DreamWeaverModel("Ctrl+Shift+Up Arrow :-", "Select From PreviousParagraph", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Shift+Down Arrow :-", "Select until next Paragraph", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Shift+F5 :-", "Edit Tag", R.drawable.dream));
        lstBook.add(new DreamWeaverModel("Ctrl+Enter:-", "Exit paragraph", R.drawable.dream));


        recyclerView = (RecyclerView) findViewById(R.id.dream);

            layoutManager = new GridLayoutManager(this, 1);
            recyclerView.setLayoutManager(layoutManager);
            recyclerViewAdapter = new DreamWeaverAdapter(this, lstBook);
            recyclerView.setAdapter(recyclerViewAdapter);
    }
}
