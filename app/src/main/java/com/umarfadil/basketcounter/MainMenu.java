package com.umarfadil.basketcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void basketCounter(View view) {
        startActivity(new Intent(MainMenu.this, MainActivity.class));
    }

    public void customRecycler(View view) {
        startActivity(new Intent(MainMenu.this, RecyclerViewActivity.class));
    }
}
