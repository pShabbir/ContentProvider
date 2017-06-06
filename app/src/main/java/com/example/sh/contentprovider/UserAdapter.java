package com.example.sh.contentprovider;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Shabbir Hussain on 6/6/2017.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder>{
    private List<UserInfo> userInfoList;






    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView name,number;

        public MyViewHolder(View view){
            super(view);
            name = (TextView) view.findViewById(R.id.userName);
            number = (TextView) view.findViewById(R.id.userNo);
//            year = (TextView) view.findViewById(R.id.year);


        }
    }

    public UserAdapter(List<UserInfo> movies){
        userInfoList = movies;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.user_info,parent,false);

        final MyViewHolder myViewHolder = new MyViewHolder(view);
        return  myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        UserInfo userInfo = userInfoList.get(position);
        holder.name.setText(userInfo.getName());
        holder.number.setText(userInfo.getPhonenumber());

    }

    @Override
    public int getItemCount() {
        return userInfoList.size();
    }


}

