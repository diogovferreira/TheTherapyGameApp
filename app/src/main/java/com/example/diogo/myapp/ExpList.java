package com.example.diogo.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Diogo on 22/06/2017.
 */

public class ExpList extends BaseExpandableListAdapter {


    private ArrayList<String> GameList;
    private Map<String,ArrayList<String>> gamesInfo;
    private Context context;


    public ExpList(ArrayList<String> gameList, Map<String, ArrayList<String>> gamesInfo, Context context) {
        GameList = gameList;
        this.gamesInfo = gamesInfo;
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return GameList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return gamesInfo.get(GameList.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return GameList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return gamesInfo.get(GameList.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String title = (String) this.getGroup(groupPosition);
        if(convertView == null){
            LayoutInflater layoutInflater =(LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }
        return null;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
