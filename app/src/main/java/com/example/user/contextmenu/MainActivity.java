package com.example.user.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.context);
        registerForContextMenu(text);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Message");
        menu.add(0,v.getId(),0,"Cut");
        menu.add(0,v.getId(),0,"Copy");
        menu.add(0,v.getId(),0,"Paste");
        menu.add(0,v.getId(),0,"Delete");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle()=="Cut"){
            Toast.makeText(this, "you selected Cut", Toast.LENGTH_SHORT).show();
        }
        else if (item.getTitle()=="Copy"){
            Toast.makeText(this, "you selected Copy", Toast.LENGTH_SHORT).show();
        }
        else if (item.getTitle()=="Paste"){
            Toast.makeText(this, "you selected Paste", Toast.LENGTH_SHORT).show();
        }
        else if (item.getTitle()=="Delete"){
            Toast.makeText(this, "you selected Delete", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}
