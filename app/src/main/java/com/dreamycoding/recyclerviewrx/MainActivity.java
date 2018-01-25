package com.dreamycoding.recyclerviewrx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.stock_updates_recycler_view)
    RecyclerView recyclerView;

    private LinearLayoutManager linearLayoutManager;
    private StockDataAdapte stockDataAdapte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.stock_updates_recycler_view);

        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        stockDataAdapte = new StockDataAdapte();
        recyclerView.setAdapter(stockDataAdapte);

        Observable.just("Google", "Yahoo", "Gmail", "TWITTER").subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                stockDataAdapte.add(s);
            }
        });
    }
}
