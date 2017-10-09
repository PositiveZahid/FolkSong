package com.lyrics.banglafolksongs;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ExpandableListView              expandableListView;
    ExpandableListAdapter           expandableListAdapter;
    List<String>                    expandableListTitle;
    HashMap<String, List<String>>   expandableListDetail;
    HashMap<String, String>         allLyrics;
    Activity                        context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        expandableListView      = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail    = ExpandableListDataPump.getData();
        allLyrics               = ExpandableListDataPump.getAllLyrics();
        expandableListTitle     = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter   = new CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        context                 = this;
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {

            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
            //Toast.makeText(getApplicationContext(),expandableListTitle.get(groupPosition)+ " -> "+ expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT).show();
            Iterator it = allLyrics.entrySet().iterator();
            while (it.hasNext()) {
                HashMap.Entry pair = (HashMap.Entry)it.next();
                if(pair.getKey().equals(expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition))){
                    showAlert(pair.getKey().toString(),pair.getValue().toString(),context);
                }
            }
            return false;
            }
        });
    }

    public void showAlert(String title,String message, Context context){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        // set title
        alertDialogBuilder.setTitle(title);

        // set dialog message
        alertDialogBuilder
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        dialog.cancel();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        // show it
        alertDialog.show();
        TextView textView = (TextView) alertDialog.findViewById(android.R.id.message);
        textView.setTextSize(13);
    }
}
