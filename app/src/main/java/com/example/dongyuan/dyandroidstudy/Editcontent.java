package com.example.dongyuan.dyandroidstudy;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.VideoView;

import java.io.File;

/**
 * Created by dongyuan on 2017/1/10.
 */

public class Editcontent extends Activity implements View.OnClickListener {

    private Button savebtn, cancelbtn;
    private EditText ettext;
    private NotesDB notesdb;
    private SQLiteDatabase dbWriter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editcontent);
        savebtn = (Button) findViewById(R.id.c_save);
        savebtn.setOnClickListener(this);
        cancelbtn = (Button) findViewById(R.id.c_cancel);
        cancelbtn.setOnClickListener(this);
        ettext = (EditText) findViewById(R.id.c_ettext);
        notesdb = new NotesDB(this);
        dbWriter = notesdb.getWritableDatabase();

        initview();

        System.out.println(getIntent().getIntExtra("_id", 0));
    }

    public void initview(){

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.e_save:
                finish();
                break;
            case R.id.e_cancel:
                finish();
                break;
        }
    }

}
