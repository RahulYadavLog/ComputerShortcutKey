package com.example.computershortcutkey.Office;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class MsWordActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MsWordAdapter recyclerViewAdapter;

    ArrayList<MsWordModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ms_word);





            toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Ms Access Shortcut Keys");
            setSupportActionBar(toolbar);

            lstBook = new ArrayList<>();

            lstBook.add(new MsWordModel("Ctrl+A :-","Select All Content Of page ",R.drawable.word));
            lstBook.add(new MsWordModel("Ctrl+B :-","Bold Highlighted selection ",R.drawable.word));
            lstBook.add(new MsWordModel("Ctrl+F :-","Open Search Box ",R.drawable.word));
             lstBook.add(new MsWordModel("Ctrl+I :-","Italic Highlighted Selection ",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+K :-","Insert Link ",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+M :-","Indent The Paragraph ",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+P :-","Open The Print Window",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+S :-","Save The Open Document ",R.drawable.word));



        lstBook.add(new MsWordModel("Ctrl+Shift+C :-","Copy formation of text ",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+Shift+V:-","Paste formation of text",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+C :-","Copy",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+X :-","Cut ",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+V :-","Paste ",R.drawable.word));
        lstBook.add(new MsWordModel("Del :-","Delete ",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+Z :-","Undo",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+Y :-","Redo ",R.drawable.word));










        lstBook.add(new MsWordModel("Ctrl+Shift+Z :-","Normal/Plain Text ",R.drawable.word));
        lstBook.add(new MsWordModel("Shift+F3 :-","Change cases(UppseCase/LowerCase) ",R.drawable.word));
        lstBook.add(new MsWordModel("F7 :-","Spelling Checker ",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+Shift+F :-","Change Font Style ",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+Shift+> :-","Increase font size ",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+Shift+< :-","Decrease font size ",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+Ctrl+Shift+> :-","Superscript",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+Ctrl+Shift+< :-","Subscript ",R.drawable.word));



        lstBook.add(new MsWordModel("Ctrl+S/F12 :-","Save Document",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+O :-","Open existing document",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+N :-","New Document",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+P :-","Print Document ",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+F4 :-","Exit ",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+W :-","Close ",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+H :-","Home tab",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+N :-","Insert Tab ",R.drawable.word));


        lstBook.add(new MsWordModel("Alt+G :-","Design tab",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+F :-","File Page",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+M :-","Mailing tab",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+P :-","Layout tab ",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+Q:-","Goto tell me box ",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+R :-","Review tab ",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+W :-","View tab",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+S :-","References tab ",R.drawable.word));







        lstBook.add(new MsWordModel("Ctrl+Alt+F2 :-","Choose the Open command (Microsoft Office Button ",R.drawable.word));
        lstBook.add(new MsWordModel("Ctrl+Alt+F1 :-","Display Microsoft System Information",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+Shift+F10:-","Display a menu or message for a smart tag",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+Shift+F9 :-","Run GOTOBUTTON or MACROBUTTON from the field that displays the field results",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+Shift+F7 :-","Display the Research task pane ",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+Shift+F2 :-","Choose the Save command (Microsoft Office Button ) ",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+Shift+F1 :-","Go to the previous field",R.drawable.word));
        lstBook.add(new MsWordModel("Alt+F11 :-","Display Microsoft Visual Basic code ",R.drawable.word));






        recyclerView = (RecyclerView) findViewById(R.id.word);

            layoutManager=new GridLayoutManager(this,1);
            recyclerView.setLayoutManager(layoutManager);
            recyclerViewAdapter =new MsWordAdapter(this, lstBook);
            recyclerView.setAdapter(recyclerViewAdapter);
    }
}
