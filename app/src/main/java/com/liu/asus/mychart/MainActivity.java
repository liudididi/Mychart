package com.liu.asus.mychart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout customBarChart=findViewById(R.id.custom);
        String[] xLabel = {"0", "2015", "2016", "2017", "2018", "2019", "2020", "2021"};
        String[] yLabel = {"0", "200", "400", "600", "800", "1000", "1200", "1400"};
        int[] data1 = {300, 500, 550, 500, 300, 700, 700};
        List<int[]> data = new ArrayList<>();
        data.add(data1);
        List<Integer> color = new ArrayList<>();
        color.add(R.color.colorAccent);
        color.add(R.color.colorPrimary);
        color.add(R.color.black);
        customBarChart.addView(new CustomBarChart(this, xLabel, yLabel, data, color));
    }
}
