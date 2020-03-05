package com.example.moneypile;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {


    private ArrayList<finance> dataList;

    public MahasiswaAdapter(ArrayList<finance> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.transaction_history, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.txtType.setText(dataList.get(position).getType());
        holder.txtDescription.setText(dataList.get(position).getDescription());
        holder.txtDate.setText(dataList.get(position).getDate());
        holder.txtMoney.setText(dataList.get(position).getMoney());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtType, txtDescription, txtDate, txtMoney;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            txtType = (TextView) itemView.findViewById(R.id.txt_type);
            txtDescription = (TextView) itemView.findViewById(R.id.txt_description);
            txtDate = (TextView) itemView.findViewById(R.id.txt_date);
            txtMoney = (TextView) itemView.findViewById(R.id.txt_money);

        }
    }
}
