package com.example.computershortcutkey.Office;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class MsDosActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MsDosAdapter recyclerViewAdapter;

    ArrayList<MsDosModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ms_dos);


        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Chrome Shortcut Keys");
        setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();

        lstBook.add(new MsDosModel("compmgmt.msc :-","Computer Management",R.drawable.dos2));
        lstBook.add(new MsDosModel("devmgmt.msc :-","Device Manager",R.drawable.dos2));
        lstBook.add(new MsDosModel("diskmgmt.msc :-","Disk Management",R.drawable.dos2));
        lstBook.add(new MsDosModel("dfrg.msc :-","Disk Defrag",R.drawable.dos2));
        lstBook.add(new MsDosModel("eventvwr.msc :-","Event Viewer",R.drawable.dos2));
        lstBook.add(new MsDosModel("fsmgmt.msc :-","Shared Folder",R.drawable.dos2));
        lstBook.add(new MsDosModel("gpedit.msc :-","Group Policies",R.drawable.dos2));
        lstBook.add(new MsDosModel("lusrmgr.msc :-","Local User and Group",R.drawable.dos2));





        lstBook.add(new MsDosModel("perfmon.msc :-","Performance Monitor",R.drawable.dos2));
        lstBook.add(new MsDosModel("rsop.msc :-","Resultant set of policies",R.drawable.dos2));
        lstBook.add(new MsDosModel("secpol.msc :-","Local Security Setting",R.drawable.dos2));
        lstBook.add(new MsDosModel("services.msc :-","Various Service",R.drawable.dos2));
        lstBook.add(new MsDosModel("mcconfig :-","System Configuration Utility",R.drawable.dos2));
        lstBook.add(new MsDosModel("regedit :-","Registry Editor",R.drawable.dos2));
        lstBook.add(new MsDosModel("msinfo32 :-","System Information",R.drawable.dos2));
        lstBook.add(new MsDosModel("sysedit :-","System Edit",R.drawable.dos2));


        lstBook.add(new MsDosModel("win.ini :-","Window Loading Information",R.drawable.dos2));
        lstBook.add(new MsDosModel("winver :-","Shows current Version of Window",R.drawable.dos2));
        lstBook.add(new MsDosModel("mailto :-","Open Default email client",R.drawable.dos2));
        lstBook.add(new MsDosModel("command :-","Open Command Prompt",R.drawable.dos2));

        recyclerView = (RecyclerView) findViewById(R.id.msdos);

        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new MsDosAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
