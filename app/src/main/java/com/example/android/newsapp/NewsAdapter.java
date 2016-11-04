package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by trikh on 26-10-2016.
 */

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, List<News> newsList) {
        super(context, 0, newsList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //getting current news
        News currentNews = getItem(position);

        //set title
        TextView title = (TextView) listItemView.findViewById(R.id.headline);
        title.setText(currentNews.getMtitle());

        //set date
        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(currentNews.getMdate_published());

        return listItemView;
    }
}
