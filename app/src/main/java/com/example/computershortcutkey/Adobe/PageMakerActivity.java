package com.example.computershortcutkey.Adobe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.DreamWeaverAdapter;
import com.example.computershortcutkey.DreamWeaverModel;
import com.example.computershortcutkey.FlashAdapter;
import com.example.computershortcutkey.FlashModel;
import com.example.computershortcutkey.PageMakeAdapter;
import com.example.computershortcutkey.PagemakerModel;
import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class PageMakerActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    PageMakeAdapter recyclerViewAdapter;

    ArrayList<PagemakerModel> lstBook;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_maker);
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Page Maker Shortcut Keys");
        setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();

                lstBook.add(new PagemakerModel("Alt+space bar:-", "Open Control menu box", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+N:-", "Create New Document/File", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+O :-", "Open", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+W :-", "Close", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+D :-", "Place a vector/raster/image", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Shift+D :-", "link Manager View/Display", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Shift+P :-", "Document (Modify/change) setup", R.drawable.page));




        lstBook.add(new PagemakerModel("Ctrl+P:-", "Print", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+K :-", "General/Preference(View/Display)", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Q :-", "Quite/Exit", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+E :-", "Edit/Modify", R.drawable.page));
        lstBook.add(new PagemakerModel("Alt+Ctrl+G :-", "Go To", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+T :-", "Character (gaps) specs", R.drawable.page));

        lstBook.add(new PagemakerModel("Ctrl+Shift+/:-", "letter/word strike Through", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+M :-", "Setup/Modify Paragraph", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Shift+V :-", "Reverse", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Shift+B :-", "Bold", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Shift+I :-", "Italic", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Shift+U :-", "Underline", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Shift+C :-", "Center (Text) Alignment", R.drawable.page));

        lstBook.add(new PagemakerModel("Ctrl+Shift+J :-", "Justify (Text) Alignment", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Shift+L :-", "Left (Text) Alignment", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Shift+R :-", "Right Text Alignment", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Shift+K :-", "Upper All Caps Latter", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+\" :-", "Letter/Word Subscript", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Shift+ \" :-", "Letter/Word Superscript", R.drawable.page));

        lstBook.add(new PagemakerModel("Ctrl+I:-", "Tabs/Indent SetUp/Modify", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+ +(plus)/-(minus) :-", "Zoom In/Out", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+1 :-", "Actual Size View/Display", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+2 :-", "200% View/Display", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+4 :-", "400% View/Display", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+5 :-", "500% View/Display", R.drawable.page));

        lstBook.add(new PagemakerModel("Ctrl+7:-", "75% View/Display", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+0 :-", "Fit In Window View/Display", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+3 :-", "Define (Text) Style", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+} :-", "Object/Text Bring to Front", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+{ :-", "Object/Text Send to Back", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Shift+} :-", "Object/Text Send Backward", R.drawable.page));

        lstBook.add(new PagemakerModel("Ctrl+Shift+{ :-", "Object/Text Bring Forward", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+ Shift :-", "Alignment (Object) View/Display", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Alt+E/T+E :-", "Wrap Text", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+G :-", "Group(text/object)", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+Shift+G :-", "Un-Group(text/object)", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+6 :-", "Mask(text/object)", R.drawable.page));

        lstBook.add(new PagemakerModel("Ctrl+Shift+6:-", "Unmask(text/object)", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+L :-", "Lock(text/object)", R.drawable.page));
        lstBook.add(new PagemakerModel("Alt+Ctrl+L :-", "Unlock(text/object)", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+F :-", "Find Search(text)", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+H :-", "Change/Modify", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+L :-", "Spelling find/check", R.drawable.page));

        lstBook.add(new PagemakerModel("Ctrl+Y :-", "Index access/entry", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+R :-", "Ruler(show/hide)", R.drawable.page));
        lstBook.add(new PagemakerModel("Ctrl+J :-", "Color panel(Show/hide)", R.drawable.page));


        recyclerView = (RecyclerView) findViewById(R.id.page);

        layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new PageMakeAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);




    }
}
