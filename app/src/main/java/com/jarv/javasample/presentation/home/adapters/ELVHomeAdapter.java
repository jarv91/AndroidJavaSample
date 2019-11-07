package com.jarv.javasample.presentation.home.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.jarv.javasample.R;

import java.util.HashMap;
import java.util.List;

public class ELVHomeAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> expandableListTitles;
    private HashMap<String, List<String>> expandableListDetails;

    public ELVHomeAdapter(Context context, List<String> expandableListTitles, HashMap<String, List<String>> expandableListDetails) {
        this.context = context;
        this.expandableListTitles = expandableListTitles;
        this.expandableListDetails = expandableListDetails;
    }

    @Override
    public int getGroupCount() {
        return this.expandableListTitles.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        List<String> expandableListDetail = this.expandableListDetails.get(this.expandableListTitles.get(groupPosition));
        if (expandableListDetail == null)
            return 0;
        return expandableListDetail.size();
    }

    @Override
    public String getGroup(int groupPosition) {
        return this.expandableListTitles.get(groupPosition);
    }

    @Override
    public String getChild(int groupPosition, int childPosition) {
        List<String> expandableListDetail = this.expandableListDetails.get(this.expandableListTitles.get(groupPosition));
        if (expandableListDetail == null)
            return null;
        return expandableListDetail.get(childPosition);
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
        String title = getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.elv_home_group, null);
        }
        TextView tvTitle = convertView.findViewById(R.id.tvTitle);
        tvTitle.setText(title);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String detail = getChild(groupPosition, childPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.elv_home_item, null);
        }
        TextView tvListItem = convertView.findViewById(R.id.tvListItem);
        tvListItem.setText(detail);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
