package com.example.jobdata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataObjectAdapter extends
        RecyclerView.Adapter<DataObjectAdapter.ViewHolder> {

    private List<DataObject> mDataObjects;

    public DataObjectAdapter(List<DataObject> mDataObjects) {
        mDataObjects = mDataObjects;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View DataObjectView = inflater.inflate(R.layout.data_object_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(DataObjectView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Set item views based on your views and data model
        DataObject dataObject = mDataObjects.get(position);

        TextView NameData = holder.tvname;
        NameData.setText(dataObject.getEmpname());
        TextView MailData = holder.tvemail;
        NameData.setText(dataObject.getEmpemail());
        TextView DesignationData = holder.tvdesignation;
        NameData.setText(dataObject.getEmpdesignation());

    }

    @Override
    public int getItemCount() {
      return   mDataObjects.size();
    }

     public class ViewHolder extends  RecyclerView.ViewHolder {

        public TextView tvname;
        public TextView tvemail;
        public TextView tvdesignation;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

    }
}
