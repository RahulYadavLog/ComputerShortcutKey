package com.example.computershortcutkey.Shortcut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ChatAdapter recyclerViewAdapter;

    ArrayList<ChatModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

            toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Chat Shortcut Keys");
            setSupportActionBar(toolbar);

            lstBook = new ArrayList<>();

            lstBook.add(new ChatModel(":) :-","Standard smile",R.drawable.chat));
            lstBook.add(new ChatModel(":- :-","With Nose",R.drawable.chat));
            lstBook.add(new ChatModel(":-E :-","Buck-tooth or Vampire",R.drawable.chat));
            lstBook.add(new ChatModel(":( :-","Sad or frown smile",R.drawable.chat));

        lstBook.add(new ChatModel(":-( :-","Sad With nose",R.drawable.chat));
        lstBook.add(new ChatModel(":P :-","Sticking tongue out (raspberry)",R.drawable.chat));
        lstBook.add(new ChatModel(":-O :-","Surprised",R.drawable.chat));
        lstBook.add(new ChatModel(":-* :-","Kissing",R.drawable.chat));

        lstBook.add(new ChatModel(":-@ :-","Angry",R.drawable.chat));
        lstBook.add(new ChatModel(":-$ :-","Confuse",R.drawable.chat));
        lstBook.add(new ChatModel(":- :-","Shifty",R.drawable.chat));
        lstBook.add(new ChatModel(":-# :-","Don't tell/secret",R.drawable.chat));

        lstBook.add(new ChatModel("(((H))) :-","Hugs",R.drawable.chat));
        lstBook.add(new ChatModel(":-X :-","Kiss on the lips",R.drawable.chat));
        lstBook.add(new ChatModel(":-) :-","One eyebrow raised",R.drawable.chat));
        lstBook.add(new ChatModel(":^) :-","A Broken Nose",R.drawable.chat));
        lstBook.add(new ChatModel(":-& :-","tongue tied",R.drawable.chat));

        lstBook.add(new ChatModel("E-:- :-","a Ham radio operator",R.drawable.chat));
        lstBook.add(new ChatModel(":-&gt; :-","Big grin Happy",R.drawable.chat));
        lstBook.add(new ChatModel("(-}{-) :-","Couple Kissing",R.drawable.chat));
        lstBook.add(new ChatModel(":-Q :-","Smoking",R.drawable.chat));






        lstBook.add(new ChatModel("$_$ :-","Greedy",R.drawable.chat));
        lstBook.add(new ChatModel("@@ :-","Rolling your eyes",R.drawable.chat));
        lstBook.add(new ChatModel(":-! :-","Foot in mouth",R.drawable.chat));
        lstBook.add(new ChatModel(":-D :-","Laughter",R.drawable.chat));

        lstBook.add(new ChatModel(":*) :-","Drunk smile",R.drawable.chat));
        lstBook.add(new ChatModel(":@ :-","Exclamation What???",R.drawable.chat));
        lstBook.add(new ChatModel(":-@ :-","Scream",R.drawable.chat));
        lstBook.add(new ChatModel(":-0 :-","yell",R.drawable.chat));

        lstBook.add(new ChatModel(":----- :-","Long nose (Liar!)",R.drawable.chat));
        lstBook.add(new ChatModel("%-(:- :-","Confused",R.drawable.chat));
        lstBook.add(new ChatModel(":-):- :-","Madonna",R.drawable.chat));
        lstBook.add(new ChatModel(":-($):- :-","Put your money where your mouth is",R.drawable.chat));
        lstBook.add(new ChatModel("(:I:- :-","An egghead",R.drawable.chat));

        lstBook.add(new ChatModel("|-O :-","Yawning",R.drawable.chat));
        lstBook.add(new ChatModel(":@) :-","Pig smile",R.drawable.chat));
        lstBook.add(new ChatModel("d[-_-]b :-","DJ with headphones",R.drawable.chat));
        lstBook.add(new ChatModel("~:0 :-","Baby",R.drawable.chat));




        lstBook.add(new ChatModel("-@--@- :-","Eyeglasses",R.drawable.chat));
        lstBook.add(new ChatModel("VVV :-","King",R.drawable.chat));
        lstBook.add(new ChatModel("%%% :-","Queen",R.drawable.chat));
        lstBook.add(new ChatModel(":-# :-","With braces",R.drawable.chat));
        lstBook.add(new ChatModel(":'-) :-","Happy Crying",R.drawable.chat));

        lstBook.add(new ChatModel("{:-):-","Toupee smile",R.drawable.chat));
        lstBook.add(new ChatModel(";) :-","Winking smile",R.drawable.chat));
        lstBook.add(new ChatModel(";-) :-","Winking smile with nose",R.drawable.chat));
        lstBook.add(new ChatModel("O:-) :-","I'M an angle (boy)",R.drawable.chat));


        recyclerView = (RecyclerView) findViewById(R.id.chat);

            layoutManager=new GridLayoutManager(this,1);
            recyclerView.setLayoutManager(layoutManager);
            recyclerViewAdapter =new ChatAdapter(this, lstBook);
            recyclerView.setAdapter(recyclerViewAdapter);
    }
}
