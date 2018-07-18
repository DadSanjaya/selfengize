package com.powerwalking.powerwalking;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.github.clans.fab.FloatingActionMenu;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private com.github.clans.fab.FloatingActionButton fab_add_goal;
    private com.github.clans.fab.FloatingActionButton fab_new_feature;
    private com.github.clans.fab.FloatingActionButton fab_virtual_working;
    private List<FloatingActionMenu> menus = new ArrayList<>();
    private ImageView imageViewGif;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fab_add_goal = (com.github.clans.fab.FloatingActionButton) view.findViewById(R.id.fab_add_goal);
        fab_new_feature = (com.github.clans.fab.FloatingActionButton) view.findViewById(R.id.fab_new_feature);
        fab_virtual_working = (com.github.clans.fab.FloatingActionButton) view.findViewById(R.id.fab_virtual_working);
        imageViewGif = (ImageView)view.findViewById(R.id.fragment_home_imageview_gif);

        fab_add_goal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), GoalActivity.class);
                startActivity(intent);
            }
        });

        fab_new_feature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NewFeatureActivity.class);
                startActivity(intent);
            }
        });

        fab_virtual_working.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), VirtualWalkingActivity.class);
                startActivity(intent);
            }
        });

        Glide.with(this)
                .load(R.drawable.running_3)
                .into(imageViewGif);

    }
}
