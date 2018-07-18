package com.powerwalking.powerwalking;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class VitualWalkingPlayActivity extends AppCompatActivity {

    ViewPager viewPager;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitual_walking_play);

        viewPager = (ViewPager) findViewById(R.id.activity_virtual_walking_play_viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this));
        textView = (TextView)findViewById(R.id.activity_virtual_walking_play_textView);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position == 0){
                    textView.setText("Select Map");
                }
                else if(position == 1){
                    textView.setText("Map Details");
                }
                else if(position == 2){
                    textView.setText("Virtual Walking");
                }
                else{
                    textView.setText("Select Map");
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}

class CustomPagerAdapter extends PagerAdapter {

    private Context mContext;

    public CustomPagerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = null;
        if(position == 0){
            layout = (ViewGroup) inflater.inflate(R.layout.fragment_virtual_walking_play1, collection, false);
        }
        else if(position == 1){
            layout = (ViewGroup) inflater.inflate(R.layout.fragment_virtual_walking_play2, collection, false);
        }
        else if(position == 2){
            layout = (ViewGroup) inflater.inflate(R.layout.fragment_virtual_walking_play3, collection, false);
        }
        else{
            layout = (ViewGroup) inflater.inflate(R.layout.fragment_virtual_walking_play1, collection, false);
        }
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}

