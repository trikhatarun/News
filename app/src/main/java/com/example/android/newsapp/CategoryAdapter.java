package com.example.android.newsapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by trikh on 27-10-2016.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    SharedPreferences sharedPrefs;
    ArrayList<String> choices = new ArrayList<>();
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        sharedPrefs = PreferenceManager.getDefaultSharedPreferences(mContext);
        fetchChoices();
    }

    @Override
    public Fragment getItem(int position) {
        Bundle category = new Bundle();
        category.putString("News", choices.get(position));
        Fragment currentFragment = new NewsFragment();
        currentFragment.setArguments(category);
        return currentFragment;
    }

    @Override
    public int getCount() {
        return choices.size();
    }

    private void fetchChoices() {
        boolean business, books, music, politics, sports, technology;
        business = sharedPrefs.getBoolean("business", false);
        books = sharedPrefs.getBoolean("books", false);
        music = sharedPrefs.getBoolean("music", false);
        politics = sharedPrefs.getBoolean("politics", false);
        sports = sharedPrefs.getBoolean("sports", false);
        technology = sharedPrefs.getBoolean("technology", false);
        if (business) {
            choices.add("business");
        }
        if (books) {
            choices.add("books");
        }
        if (music) {
            choices.add("music");
        }
        if (politics) {
            choices.add("politics");
        }
        if (sports) {
            choices.add("sport");
        }
        if (technology) {
            choices.add("technology");
        }
    }
}
