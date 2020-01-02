package com.example.computershortcutkey.Browser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class FirefoxActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    FirefoxAdapter recyclerViewAdapter;

    ArrayList<FirefoxModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firefox);

            toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Firefox Shortcut Keys");
            setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();

        lstBook.add(new FirefoxModel("Alt+<-/Backspace :-","Back",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Alt+->/Shift+Backspace :-","Forward",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Alt+Home :-","Home",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+O :-","Open File",R.drawable.firefox));
        lstBook.add(new FirefoxModel("F5 :-","Reload",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+F5 :-","Reload (override cache)",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Esc :-","Stop",R.drawable.firefox));
        lstBook.add(new FirefoxModel("page Down :-","Go Down Screen",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Page Up :-","Go Up a Screen",R.drawable.firefox));
        lstBook.add(new FirefoxModel("End :-","Go To Bottom of The Page",R.drawable.firefox));





        lstBook.add(new FirefoxModel("Home :-","Go to Home Page",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+P :-","Print",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+S :-","Save Page As",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl++ :-","Zoom In",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+- :-","Zoom Out",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+0 :-","Zoom Reset",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+C :-","Copy Selected Item",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+X :-","Cut Selected Item",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Del :-","Delete",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+V :-","Paste Clipboard Item",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+Shift+V :-","Paste a plane Text",R.drawable.firefox));


        lstBook.add(new FirefoxModel("Ctrl+Y :-","Redo",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+A :-","Select All",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+Z :-","Undo",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+F :-","Find",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+W :-","Close Tab",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+T :-","New Tab",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+N :-","New Window",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+Shift+P :-","New private Window",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+Tab :-","Next Tab",R.drawable.firefox));

        lstBook.add(new FirefoxModel("Alt+Enter :-","Open Address in new Tab",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+Shift+T :-","Undo Close Tab",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+H :-","History Sidebar",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+Shift+Del :-","Clear Recent History",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+J :-","Download",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+Shift+A :-","Add-ons",R.drawable.firefox));
        lstBook.add(new FirefoxModel("F12 :-","Toggle Developer Tools",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+Shift+K :-","Web Console",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+Shift+C:-","Inspector",R.drawable.firefox));

        lstBook.add(new FirefoxModel("Ctrl+Shift+S :-","Debugger",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Shift+F7 :-","Style Editor",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Shift+F2 :-","Developer Toolbar",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+Shift+M :-","Responsive Design View",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+Enter :-","Compete .com Address",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Shift+Enter :-","Compete .net Address",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+Shift+Enter :-","Complete .org Address",R.drawable.firefox));
        lstBook.add(new FirefoxModel("F11 :-","Toggle Full Screen",R.drawable.firefox));
        lstBook.add(new FirefoxModel("Ctrl+/ :-","Show/Hide Add-on Bar",R.drawable.firefox));

        recyclerView = (RecyclerView) findViewById(R.id.firefox);

        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new FirefoxAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
