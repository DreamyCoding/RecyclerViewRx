package com.dreamycoding.recyclerviewrx;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by JuyelRana on 1/25/2018.
 */

public class StockUpdateViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.stock_item_symbol)
    TextView txtStockItem;
    public StockUpdateViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
