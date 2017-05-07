package com.umarfadil.basketcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.umarfadil.basketcounter.adapter.RecyclerAdapter;
import com.umarfadil.basketcounter.model.RView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<RView> datalist = new ArrayList<>();
    private RecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mAdapter = new RecyclerAdapter(datalist);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareData();
    }

    private void prepareData() {
        RView data = new RView("Browser", "Browse internet", R.drawable.browser);
        datalist.add(data);
        data = new RView("Android Studio", "Ngoding Android", R.drawable.androidstudio);
        datalist.add(data);
    }
}
