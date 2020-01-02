package com.example.computershortcutkey.Shortcut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class TallyActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    TallyAdapter recyclerViewAdapter;

    ArrayList<TallyModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tally);


        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Tally Shortcut Keys");
        setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();

        lstBook.add(new TallyModel("Alt + 2 :-","Duplicate Voucher",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + A :-","Add Voucher /To Alter The Column in columnar report",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + C :-","Create a Master at a voucher screen",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + D :-","Delete a Voucher to delete Accounting or Inventory master which is not used by any voucher or elsewhere in the alternate mode  ",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + E :-","Expert the report in ASCII ,HTML OR XML format",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + I :-","Insert a Voucher /To toggle between Item Accounting invoice",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + N :-","To View the report in automatic column",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + P :-","Print the report",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + R :-","Remove a line in a report",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + S :-","Bring Back aline you removed using Alt+R",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + U :-","Retrieve the last line which is delete using Alt+R",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + W :-","To View The the tally Web Browser",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + X :-","Cancel a voucher in Day Book/List of Vouchers",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + Y :-","Register Tally",R.drawable.tally2));
        lstBook.add(new TallyModel("CTRL + A :-","Accept afrom -wherever you use this key combination ,that screen or report gets accepts as it is",R.drawable.tally2));
        lstBook.add(new TallyModel("CTRL + ALT + B :-","Check the Company Statutory details",R.drawable.tally2));
        lstBook.add(new TallyModel("CTRL + G :-","Select Group",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + I :-","Import statutory masters",R.drawable.tally2));
        lstBook.add(new TallyModel("CTRL + Q :-","Abandon a from - wherever you use this key combination ,it quits that screen without making any change to it",R.drawable.tally2));
        lstBook.add(new TallyModel("CTRL + ALT + R :-","Rewrite data for a company",R.drawable.tally2));




        lstBook.add(new TallyModel("Alt + H :-","Help Shortcut",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + F2 :-","Maintain Date for Multiple Years by Changing period on Gateway of Tally/Change of Period for Setting Period",R.drawable.tally2));
        lstBook.add(new TallyModel("CTRL + M :-","Switch to main Area of Tally Screen",R.drawable.tally2));
        lstBook.add(new TallyModel("CTRL + N :-","Switches to calculator /ODBC Section of Tally Screen",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + R :-","Recalls the last narration saved for the first ledger inthe voucher, irrespective of the voucher type",R.drawable.tally2));
        lstBook.add(new TallyModel("CTRL + R :-","Repeat narration in the same voucher type irrespective of ledger Account",R.drawable.tally2));
        lstBook.add(new TallyModel("CTRL + T :-","Make any Voucher as Post Dated Voucher",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + D :-","Delete any voucher in Day Book/Deleting",R.drawable.tally2));



        lstBook.add(new TallyModel("Alt + O :-","To Upload the report to the webe",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + M :-","Email the Report",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + F1 :-","Close aCompany (At All Menu Screen). View detailed Report (Report Screen). Explore a line into its details (At Almost all Screen)",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + F3 :-","Select the company info menu (At Gateway of Tally screen). Create /alter shut a company (At Gateway of Tally Screen)",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + F5 :-","View sales and purchase register summary on a quarterly basic",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + F12 :-","View The filters screen where the range of information can be specified",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + Z :-","Zoom",R.drawable.tally2));



        lstBook.add(new TallyModel("CTRL + ALT + C :-","Copy the text from Tally (creation and alternation screen)",R.drawable.tally2));
        lstBook.add(new TallyModel("CTRL + ALT + V :-","To paste the next from Tally (At create and alternation screens)",R.drawable.tally2));
        lstBook.add(new TallyModel("SHIFT + ENTER :-","To view the next level of details and/or condense the next level of details",R.drawable.tally2));
        lstBook.add(new TallyModel("F2 :-","Change the data ",R.drawable.tally2));
        lstBook.add(new TallyModel("F4 :-","Contra Voucher (All Voucher creation and alternate screen) View list of Group (Reports Group summary ,group voucher screen , cash/ bank summary)",R.drawable.tally2));

        lstBook.add(new TallyModel("F5 :-","Select Payment Voucher. Switch between Grouped and Ledger-wise Display",R.drawable.tally2));
        lstBook.add(new TallyModel("F6 :-","Select Receipt Voucher",R.drawable.tally2));
        lstBook.add(new TallyModel("F7 :-","Select Journal Voucher",R.drawable.tally2));
        lstBook.add(new TallyModel("F8 :-","Select Sales Voucher ",R.drawable.tally2));
        lstBook.add(new TallyModel("F9 :-","Select Purchase Voucher",R.drawable.tally2));
        lstBook.add(new TallyModel("CTRL + F9 :-","Select Debit Note Voucher",R.drawable.tally2));
        lstBook.add(new TallyModel("F10 :-","Navigate Between Accounting Reports",R.drawable.tally2));
        lstBook.add(new TallyModel("F11 :-","Modify Company feature specific to current company only",R.drawable.tally2));


        lstBook.add(new TallyModel("F12 :-","Master Configuration which will affect all companies in same data directory.",R.drawable.tally2));
        lstBook.add(new TallyModel("CTRL + L:-","Mark a voucher as option or Regular",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + F4 :-","Purchase Order Voucher",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + F5 :-","Sales Order Voucher",R.drawable.tally2));
        lstBook.add(new TallyModel("CTRL + F6 :-","Rejection In",R.drawable.tally2));
        lstBook.add(new TallyModel("Alt + F7 :-","Stock Journal/ Manufacturing journal ",R.drawable.tally2));


        lstBook.add(new TallyModel("ALT + F8 :-","Delivery Note",R.drawable.tally2));
        lstBook.add(new TallyModel("ALT + F9 :-","Receipt Note",R.drawable.tally2));
        lstBook.add(new TallyModel("ALT + F10 :-","Physical Stock",R.drawable.tally2));
        lstBook.add(new TallyModel("ESC :-","clear entry",R.drawable.tally2));


        recyclerView = (RecyclerView) findViewById(R.id.tally);

        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new TallyAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.home, menu);
//
//        return true;

}
