package com.example.computershortcutkey.Shortcut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class GeneralBasicMac extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    GeneralBasicMacAdapter recyclerViewAdapter;

    ArrayList<GeneralBasicMacModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_basic_mac);

        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Basic Mac Shortcut Keys");
        setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();
        lstBook.add(new GeneralBasicMacModel("Cmd +Click :-","Open Sidebar item in a new Tab or Window(depending on Finder Preference)",R.drawable.mac3));
        lstBook.add(new GeneralBasicMacModel("Cmd + 1,Cmd + 2,Cmd + 3,Cmd + 4 :-","Switch Finder Views(Icon,List,Column,Cover Flow)",R.drawable.mac3));
        lstBook.add(new GeneralBasicMacModel("Right Arrow :-","In List View expand a folder",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Left Arrow :-","In List View collapse a folder",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Press Return (or Enter) :-","Rename The Selected File/Folder",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Cmd +Down Arrow :-","Go to selected Folder or open the selected File",R.drawable.mac3));


        lstBook.add(new GeneralBasicMacModel("Cmd +Up Arrow :-","Go To Parent Folder",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Cmd +[ :-","Go Back",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Cmd +] :-","Go Forward",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Tab (Shift +Tab reverses direction) :-","Select the next icon in Icon and List views",R.drawable.mac3));


        lstBook.add(new GeneralBasicMacModel("Tab (Shift +Tab reverses direction) :-","Alternate columns in Column View",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Double + Click column divider (or the resize widget ata the bottom of the column divider,depending on your setup) :-","Resize one column to fit the longest file name (Column View)",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Option Double + Click column divider (or the resize widget at the bottom ofthe column divider, depending on your setup) :-","Resize all column to fit their longest file name (Column View)",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Cmd + C ,then Cmd + V :-","Copy and Paste file",R.drawable.mac3));


        lstBook.add(new GeneralBasicMacModel("Cmd + C, then Cmd + Option + Shift +  V :-","Copy and Paste files Exactly (Keeps original ownership, permission, Require Admin username, password)",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Cmd + C, then Cmd + Option + Shift +  V:-","Cut and Paste file(Move files)",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Cmd + Drag file to disk :-","Move a file instead of copying (Copies to the destination and removes it from the original disk.)",R.drawable.mac3));
        lstBook.add(new GeneralBasicMacModel("Cmd + Opt + Delete :-","Immediately Delete a File (does not put file in Trash)",R.drawable.mac3));



        lstBook.add(new GeneralBasicMacModel("Cmd + Delete :-","Move selected files to the Trash (Called the Recycle Bin in Windows)",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Cmd + Shift + Delete :-","Empty the Trash with  warning (like emptying Recycle Bin in Window)",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Cmd + Opt + Shift + Delete :-","Empty the Trash with no warning (like emptying Recycle Bin in Window)",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Esc :-","Cancel a drag-n-drop action while in the midst of dragging",R.drawable.mac3));


        lstBook.add(new GeneralBasicMacModel("Cmd + Opt + I :-","Show inspector (a single ,live refreshing Info window)",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Cmd + Z :-","Undo the last action (such as rename file , copy file , etc.",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Cmd + Opt + S :-","Hide/Show Toolbar (on the left)",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Cmd + Opt + T :-","Hide/Show Toolbar (on the top) and the Sidebar",R.drawable.mac3));



        lstBook.add(new GeneralBasicMacModel("Cmd + Drag :-","Move or Remove item in toolbar (at the top of the window). Works in most Programs",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Press the Spacebar (or Cmd + Y). On a trackpad can also tap with 3 fingers :-","Open Quick Look (Previews most types of files without having to open them)",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Pinch on a trackpad or hold Opt While Scrolling For Images,hold Option to Zoom to 100% :-","Zoome In/Out in Quick Look(Images,PDFs)",R.drawable.mac3));

        lstBook.add(new GeneralBasicMacModel("Cmd + F:-","Find Files",R.drawable.mac3));

        recyclerView = (RecyclerView) findViewById(R.id.general_mac);

        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new GeneralBasicMacAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }


}
