package com.example.computershortcutkey.Shortcut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class AsciicodeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    AsciicodeAdapter recyclerViewAdapter;

    ArrayList<AsciicodeModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asciicode);

        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Asciicode Shortcut Keys");
        setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();

        lstBook.add(new AsciicodeModel("48 :-","Zero",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("49 :-","one",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("50 :-","two",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("51 :-","three",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("51 :-","four",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("53 :-","five",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("54 :-","six",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("55 :-","seven",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("56 :-","eight",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("57 :-","nine",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("58 :-","colon",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("59 :-","semicolon",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("60 :-","less than sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("61 :-","equal sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("62 :-","greater than sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("63 :-","Question Marks",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("32 :-","space",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("33 :-","exclamation point",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("34 :-","double quotes",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("35 :-","number sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("36 :-","dollar sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("37 :-","percent sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("38 :-","ampersand",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("39 :-","Single quote",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("40 :-","opening parenthesis",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("41 :-","closing parenthesis",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("42 :-","asterisk",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("43 :-","plus sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("44 :-","comma",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("45 :-","minus sign-hyphen",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("46 :-","period",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("47 :-","slash",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("64 :-","at symbol(@)",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("65 :-","A",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("66 :-","B",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("67 :-","C",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("68 :-","D",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("69 :-","E",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("70 :-","F",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("71 :-","G",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("72 :-","H",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("73 :-","I",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("74 :-","J",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("75 :-","K",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("76 :-","L",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("77 :-","M",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("78 :-","N",R.drawable.ascii));

        lstBook.add(new AsciicodeModel("79:-","O",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("80 :-","P",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("81 :-","Q",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("82 :-","R",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("83 :-","S",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("84 :-","T",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("85 :-","U",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("86 :-","V",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("87 :-","W",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("88 :-","X",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("89 :-","Y",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("90 :-","Z",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("91 :-","Opening bracket",R.drawable.ascii));








        lstBook.add(new AsciicodeModel("92 :-","backslash",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("93 :-","closing bracket",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("94 :-","caret- circumflex",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("95 :-","underscore",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("96 :-","grave accent",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("97 :-","a",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("98 :-","b",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("99 :-","c",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("100 :-","d",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("101 :-","e",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("102 :-","f",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("103 :-","g",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("104 :-","h",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("105 :-","i",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("106 :-","j",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("107 :-","k",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("108 :-","l",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("109 :-","m",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("110 :-","n",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("111 :-","o",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("112 :-","p",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("113 :-","q",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("114 :-","r",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("115 :-","s",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("116 :-","t",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("117 :-","u",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("118 :-","v",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("119 :-","w",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("120 :-","x",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("121 :-","y",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("122 :-","z",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("123 :-","opening brace",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("124 :-","vertical bar",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("125 :-","closing brace",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("126 :-","equivalency sign -tilde",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("160 :-","non-breaking space",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("161 :-","inverted exclamation marks",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("162 :-","cent sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("163 :-","pound sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("164 :-","currency sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("165 :-","yen sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("166 :-","broken vertical bar",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("167 :-","section sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("168 :-","spacing diaeresis - umlaut",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("169 :-","copyright sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("170 :-","feminine ordinal indicator",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("171 :-","left double angle quotes",R.drawable.ascii));

        lstBook.add(new AsciicodeModel("172:-","not sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("173 :-","soft hyphen",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("174 :-","registered trade marks sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("175 :-","spacing macron-overline",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("176 :-","degree sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("177 :-","plus-or-minus sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("178 :-","superscript two- squared",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("179 :-","superscript three- cubed",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("180 :-","acute accent - spacing acute",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("181 :-","micro sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("182 :-","pilcrow sign-paragraph sign",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("183 :-","middle dot- Georgian comma",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("184 :-","spacing cedilla",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("185 :-","superscript one",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("186 :-","Masculine ordinal indicator",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("187 :-","right double angle quotes",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("188 :-","fraction One quarters",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("189 :-","fraction one half",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("190 :-","fraction Three quarters",R.drawable.ascii));
        lstBook.add(new AsciicodeModel("191 :-","Inverted Question Marks",R.drawable.ascii));




//        lstBook.add(new AsciicodeModel("192 :-","a",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("193 :-","b",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("194 :-","c",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("195 :-","d",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("196 :-","e",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("197 :-","f",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("198 :-","g",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("200 :-","h",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("201 :-","i",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("202 :-","j",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("203 :-","k",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("204 :-","l",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("205 :-","m",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("206 :-","n",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("207 :-","o",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("208 :-","p",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("209 :-","q",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("210 :-","r",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("211 :-","s",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("212 :-","t",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("213 :-","u",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("214 :-","v",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("215 :-","w",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("216 :-","x",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("217 :-","y",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("218 :-","",R.drawable.ascii));
//
//
//
//
//        lstBook.add(new AsciicodeModel("200 :-","h",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("201 :-","i",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("202 :-","j",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("203 :-","k",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("204 :-","l",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("205 :-","m",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("206 :-","n",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("207 :-","o",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("208 :-","p",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("209 :-","q",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("210 :-","r",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("211 :-","s",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("212 :-","t",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("213 :-","u",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("214 :-","v",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("215 :-","w",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("216 :-","x",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("217 :-","y",R.drawable.ascii));
//        lstBook.add(new AsciicodeModel("218 :-","z",R.drawable.ascii));
        recyclerView = (RecyclerView) findViewById(R.id.asciicode);

        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new AsciicodeAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);



    }
}
