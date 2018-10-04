package com.example.professor.atividade5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.act_add:
                Toast.makeText(this, R.string.adicionar_msg, Toast.LENGTH_SHORT).show();
                break;
            case R.id.act_edit:
                Toast.makeText(this, R.string.editar_msg, Toast.LENGTH_SHORT).show();
                break;
            case R.id.act_delete:
                Toast.makeText(this, R.string.remover_msg, Toast.LENGTH_SHORT).show();
                break;
            case R.id.act_help:
                Toast.makeText(this, R.string.ajuda_msg, Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
