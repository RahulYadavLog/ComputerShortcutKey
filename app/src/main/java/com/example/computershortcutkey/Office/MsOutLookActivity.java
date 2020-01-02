package com.example.computershortcutkey.Office;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class MsOutLookActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MsOutlookAdapter recyclerViewAdapter;

    ArrayList<MsOutlookModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ms_out_look);


        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Ms Access Shortcut Keys");
        setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();

        lstBook.add(new MsOutlookModel("Alt+ :-","Open Address Book",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Alt+A :-","Open Action drop down Menu",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Alt+B :-","Open Address Book With BCC Selected",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Alt+C :-","Selected Message recipients for cc field",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Alt+D :-","Switch to Daily Calender view",R.drawable.out2));




        lstBook.add(new MsOutlookModel("Alt+L :-","Reply All",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Alt+M :-","Switch to Monthly Calender View",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Alt+S :-","Send",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Ctrl+1 :-","Go to mail",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Ctrl+2 :-","Go to Calender",R.drawable.out2));

        lstBook.add(new MsOutlookModel("Ctrl+3:-","Go to Contacts",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Ctrl+4 :-","Go To Tasks",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Ctrl+5 :-","Go To Notes",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Ctrl+F :-","Forward",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Ctrl+Q :-","Marks the selected message read",R.drawable.out2));

        lstBook.add(new MsOutlookModel("Ctrl+R :-","Reply",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Ctrl+U:-","Marks The selected message unread",R.drawable.out2));
        lstBook.add(new MsOutlookModel("F1 :-","Pen Outlook Help",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Ctrl+Shift+A :-","Open New Appointment",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Ctrl+Shift+B :-","Open Address Book",R.drawable.out2));

        lstBook.add(new MsOutlookModel("Ctrl+Shift+C :-","Create a new Contact",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Ctrl+Shift+M:-","Open A New Message",R.drawable.out2));
        lstBook.add(new MsOutlookModel("Ctrl+Shift+N :-","Open a New Note",R.drawable.out2));




        recyclerView = (RecyclerView) findViewById(R.id.outlook);

        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new MsOutlookAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }


}
