package com.example.computershortcutkey.Office;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class MsAccessActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MsAccessAdapter recyclerViewAdapter;

    ArrayList<MsAccessmodel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ms_access);





            toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Ms Access Shortcut Keys");
            setSupportActionBar(toolbar);

            lstBook = new ArrayList<>();

            lstBook.add(new MsAccessmodel("Ctrl+B :-","Bold",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+F2 :-","Builder",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+W :-","Close currently Open file",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+F4 :-","Close currently Open Window",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+C :-","Copy Selected Item",R.drawable.access));

        lstBook.add(new MsAccessmodel("Ctrl+X :-","Cut Selected items",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+Y :-","Cut Current line and copy to clipboard",R.drawable.access));
        lstBook.add(new MsAccessmodel("F6/Shift+F6 :-","Cycle Through Selection",R.drawable.access));

        lstBook.add(new MsAccessmodel("Ctrl+Tab :-","Cycle Through tab of each object Type(forward)",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+Shift+Tab :-","Cycle through tab of each object type (backward)",R.drawable.access));
        lstBook.add(new MsAccessmodel("F11 :-","Database Window",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+- :-","Delete current record",R.drawable.access));

        lstBook.add(new MsAccessmodel("F2 :-","Edit/Navigation mode (toggle)",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+Tab/Shift+Tab :-","Exit Subform and move to next/previous field in next record",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+Dn/Up :-","Extend selection to next/previous record",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+F :-","Find",R.drawable.access));

        lstBook.add(new MsAccessmodel("Shift+F4 :-","Find Next",R.drawable.access));
        lstBook.add(new MsAccessmodel("Shift+F3 :-","Find Previous",R.drawable.access));
        lstBook.add(new MsAccessmodel("ctrl+G :-","Goto",R.drawable.access));

        lstBook.add(new MsAccessmodel("Ctrl+; :-","Insert Current Date",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+: :-","Insert Current Time)",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+Alt+Spacebar :-","Insert Default Value",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+Enter :-","Insert New Line",R.drawable.access));

        lstBook.add(new MsAccessmodel("Ctrl+' :-","Insert Value From Some Field in Previous Record ",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+I :-","Italic",R.drawable.access));
        lstBook.add(new MsAccessmodel("F10 :-","Menu bar",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+Home/End :-","Move To Beginning/end of multiple line",R.drawable.access));

        lstBook.add(new MsAccessmodel("Ctrl+Up/Down :-","Move to current Field in first/last record",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+Home :-","Move To the First Field in first Record(Navigation Mode)",R.drawable.access));
        lstBook.add(new MsAccessmodel("Home/End :-","Move to first/last field in current record (Navigation Mode)",R.drawable.access));

        lstBook.add(new MsAccessmodel("Ctrl+End :-","Move To the last Field inlast record",R.drawable.access));
        lstBook.add(new MsAccessmodel("Home or Ctrl+Left :-","Move To Left edge Of Page",R.drawable.access));
        lstBook.add(new MsAccessmodel("F5 :-","Move to  page number/record number box",R.drawable.access));
        lstBook.add(new MsAccessmodel("End or Ctrl+Right- :-","Move to right edge og page",R.drawable.access));

        lstBook.add(new MsAccessmodel("Ctrl+N :-","New (object)",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+ :-","New Record (Add)",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+F6 :-","Next Window",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+O :-","Open",R.drawable.access));






        lstBook.add(new MsAccessmodel("F4 :-","Open Combo box",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+Enter :-","Open In Design View",R.drawable.access));
        lstBook.add(new MsAccessmodel("ctrl+V :-","Paste",R.drawable.access));

        lstBook.add(new MsAccessmodel("Ctrl+P :-","print",R.drawable.access));
        lstBook.add(new MsAccessmodel("Alt+Enter :-","Property Sheet",R.drawable.access));
        lstBook.add(new MsAccessmodel("F9 :-","Refresh Combo Box",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+H :-","Replace",R.drawable.access));

        lstBook.add(new MsAccessmodel("Shift+F9 :-","Requery Underlying tables in subform ",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+S :-","Save",R.drawable.access));
        lstBook.add(new MsAccessmodel("F12 :-","Save As",R.drawable.access));
        lstBook.add(new MsAccessmodel("Shift+Enter :-","Save Current Record",R.drawable.access));

        lstBook.add(new MsAccessmodel("Ctrl+PageUp/PageDown :-","Screen Left/right",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+Spacebar :-","Select/Unselect Column (Navigation Mode))",R.drawable.access));

        lstBook.add(new MsAccessmodel("F7 :-","Spelling/Grammar Check",R.drawable.access));
        lstBook.add(new MsAccessmodel("F6 :-","Switch Between upper/lower panes",R.drawable.access));
        lstBook.add(new MsAccessmodel("F5 :-","Switch To From View",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+F8- :-","Turn on Move mode",R.drawable.access));

        lstBook.add(new MsAccessmodel("Ctrl+U :-","Underline",R.drawable.access));
        lstBook.add(new MsAccessmodel("Ctrl+Z :-","Undo",R.drawable.access));
        lstBook.add(new MsAccessmodel("Shift+F8 :-","Undo Previous Extension",R.drawable.access));
        lstBook.add(new MsAccessmodel("Shift+F2 :-","Zoom Box",R.drawable.access));


        recyclerView = (RecyclerView) findViewById(R.id.access);

            layoutManager=new GridLayoutManager(this,1);
            recyclerView.setLayoutManager(layoutManager);
            recyclerViewAdapter =new MsAccessAdapter(this, lstBook);
            recyclerView.setAdapter(recyclerViewAdapter);
        }
}
