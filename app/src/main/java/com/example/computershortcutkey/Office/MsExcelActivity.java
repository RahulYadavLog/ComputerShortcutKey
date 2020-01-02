package com.example.computershortcutkey.Office;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.computershortcutkey.R;

import java.util.ArrayList;

public class MsExcelActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MsExcelAdapter recyclerViewAdapter;

    ArrayList<MsExcelModel> lstBook ;
    public android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ms_excel);


        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Chrome Shortcut Keys");
        setSupportActionBar(toolbar);

        lstBook = new ArrayList<>();

        lstBook.add(new MsExcelModel("Ctrl+N :-","New Work Book",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+O :-","Open File",R.drawable.excel3));

        lstBook.add(new MsExcelModel("Ctrl+C :-","Copy Selected Item",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+X :-","Cut Selected Item",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+V :-","Paste Clipboard Item",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Del :-","Delete Selected Item",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Z :-","Undo",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Y :-","Redo",R.drawable.excel3));
        lstBook.add(new MsExcelModel("F7 :-","Spell Check",R.drawable.excel3));
        lstBook.add(new MsExcelModel("F11 :-","New Chart",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+: :-","Insert Current Time",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+; :-","Insert Current Date",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Shift+F5 :-","Find into opened file",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Shift+F4 :-","Find Next",R.drawable.excel3));



        lstBook.add(new MsExcelModel("Ctrl+H :-","Replace",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Alt+F1 :-","Insert Chart",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+A:-","Selected All Content of page",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+B :-","Bold Highlighted selection",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+F :-","Open Search Box",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+I :-","Italic Highlighted Selection",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+K:-","Insert Link",R.drawable.excel3));

        lstBook.add(new MsExcelModel("Ctrl+1 :-","Changes the format of the selected cells.",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Alt+2 :-","Bolds all cells in the highlighted section",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+3:-","Puts italics all cells in the highlighted section.",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+4 :-","Underlines all cells in highlighted section.",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+5 :-","Puts a Strikethrough all cell in the highlighted section",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+6 :-","Show Or Hide Object",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+7:-","Shows or hides the toolbar.",R.drawable.excel3));

        lstBook.add(new MsExcelModel("Ctrl+8 :-","Toggles the outline symbols.",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Alt+9 :-","Hides rows",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+0:-","Hides columns",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+= :-","Inserts a new column or row",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+~ :-","Switches between showing Excel formulas or their values in cells",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+@ :-","Applies time formatting",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+!:-","Applies comma formatting",R.drawable.excel3));


        lstBook.add(new MsExcelModel("Ctrl+Shift+$ :-","Applies currency formatting.",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+# :-","Applies date formatting",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+% :-","Applies percentage formatting",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+^ :-","Applies exponential formatting",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+* :-","Selects the current region around the active cell",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+& :-","Places border around selected cells",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+_ :-","Removes a border",R.drawable.excel3));


        lstBook.add(new MsExcelModel("Ctrl++ :-","Insert.",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+- :-","Delete",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+(:-","Unhide rows",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+) :-","Unhide columns",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+/ :-","Selects the array containing the active cell",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+\\ :-","Selects the cells that have a static value or don’t match the formula in the active cell",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+[  :-","Selects all cells referenced by formulas in the highlighted section",R.drawable.excel3));

        lstBook.add(new MsExcelModel("Ctrl+] :-","Selects cells that contain formulas that reference the active cell.",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+{ :-","Selects all cells directly or indirectly referenced by formulas in the highlighted section",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+} :-","Selects cells which contain formulas that directly or indirectly reference the active cell",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+| (pipe) :-","Selects the cells within a column that don’t match the formula or static value in the active cell",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Enter :-","Fills the selected cells with the current entry",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Spacebar :-","Selects the entire column",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+Spacebar :-","Selects the entire worksheet",R.drawable.excel3));










        lstBook.add(new MsExcelModel("Ctrl+Home :-","Move to cell A1",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+End :-","Move to last cell on worksheet",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Tab:-","Move between Two or more open Excel files",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+Tab :-","Activates the previous workbook",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+A :-","Inserts argument names into a formula",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+F :-","Opens the drop-down menu for fonts",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+Shift+O :-","Selects all of the cells that contain comments",R.drawable.excel3));

        lstBook.add(new MsExcelModel("Ctrl+Shift+P :-","Opens the drop-down menu for point size",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Shift+Insert :-","Pastes what is stored on the clipboard",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Shift+Page Up :-","In a single column, highlights all cells above that which are selected",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Shift+Page Down :-","In a single column, highlights all cells above that which are selected",R.drawable.excel3));


        lstBook.add(new MsExcelModel("Shift+End :-","Highlights all text to the right of the cursor.",R.drawable.excel3));

        lstBook.add(new MsExcelModel("Shift+Up Arrow :-","Extends the highlighted area up one cell",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Shift+Down Arrow :-","Extends the highlighted area down one cell",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Shift+Left Arrow :-","Extends the highlighted area left one character",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Shift +Right Arrow :-","Extends the highlighted area right one character",R.drawable.excel3));

        lstBook.add(new MsExcelModel("Alt+Tab :-","Cycles through applications",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Alt+Spacebar :-","Opens the system menu",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Alt+Backpspace :-","Undo",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Alt+Enter :-","While typing text in a cell, pressing Alt+Enter will move to the next line, allowing for multiple lines of text in one cell",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Alt+= :-","Creates a formula to sum all of the above cells",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Alt+’ :-","Allows formatting on a dialog box",R.drawable.excel3));
        lstBook.add(new MsExcelModel("F1 :-","Opens the Help menu",R.drawable.excel3));
        lstBook.add(new MsExcelModel("F2 :-","Edits the selected cell",R.drawable.excel3));


        lstBook.add(new MsExcelModel("F3 :-","After a name has been created, F3 will paste names.",R.drawable.excel3));
        lstBook.add(new MsExcelModel("F4 :-","Repeats last action. For example, if you changed the color of text in another cell, pressing F4 will change the text in cell to the same color",R.drawable.excel3));
        lstBook.add(new MsExcelModel("F5 :-","Goes to a specific cell. For example, C6",R.drawable.excel3));
        lstBook.add(new MsExcelModel("F6 :-","Move to the next pane",R.drawable.excel3));
        lstBook.add(new MsExcelModel("F7 :-","Spell check selected text or document",R.drawable.excel3));
        lstBook.add(new MsExcelModel("F8 :-","Enters Extend Mode",R.drawable.excel3));
        lstBook.add(new MsExcelModel("F9 :-","Recalculates every workbook",R.drawable.excel3));








        lstBook.add(new MsExcelModel("F10 :-","Activates the menu bar.",R.drawable.excel3));
        lstBook.add(new MsExcelModel("F11 :-","Creates a chart from selected data",R.drawable.excel3));
        lstBook.add(new MsExcelModel("F12 :-","Save as",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Shift+F1 :-","Opens the “What’s This?” window",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Shift+F2 :-","Allows the user to edit a cell comment",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Shift+F3 :-","Opens the Excel formula window",R.drawable.excel3));



        lstBook.add(new MsExcelModel("Shift+F5 :-","Brings up a search box.",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Shift+F6 :-","Move to previous pane",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Shift+F8 :-","Add to selection",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Shift+F9 :-","Performs calculate function on active sheet",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+F3 :-","Open Excel Name Manager",R.drawable.excel3));
        lstBook.add(new MsExcelModel("Ctrl+F4 :-","Closes current Window",R.drawable.excel3));




        recyclerView = (RecyclerView) findViewById(R.id.msexcel);

        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter =new MsExcelAdapter(this, lstBook);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
