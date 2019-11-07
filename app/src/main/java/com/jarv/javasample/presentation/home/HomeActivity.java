package com.jarv.javasample.presentation.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.jarv.javasample.R;
import com.jarv.javasample.presentation.home.adapters.ELVHomeAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, HomeActivity.class);
    }

    private List<String> groups = new ArrayList<>();
    private HashMap<String, List<String>> groupItems = new HashMap<>();

    private ExpandableListView elvHome;
    private ExpandableListAdapter expandableListAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        groups.add("Lists");
        groups.add("Layouts");
        groups.add("Images");

        groupItems.put(groups.get(0), Arrays.asList("RecyclerView","ListView","GridView", "ExpandedListView"));
        groupItems.put(groups.get(1), Arrays.asList("RelativeLayout","LinearLayout","ConstraintLayout", "GridLayout", "TableLayout"));

        elvHome = findViewById(R.id.elvHome);
        expandableListAdapter = new ELVHomeAdapter(HomeActivity.this, groups, groupItems);
    }

    @Override
    protected void onStart() {
        super.onStart();
        elvHome.setAdapter(expandableListAdapter);
    }
}
