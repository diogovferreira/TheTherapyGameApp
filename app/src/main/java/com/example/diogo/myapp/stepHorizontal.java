package com.example.diogo.myapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class stepHorizontal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_horizontal);

        GraphView graphic = (GraphView) findViewById(R.id.graph);


        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(getDataPoint())


    }


    private DataPoint[] getDataPoint(){

        DataPoint [] dp ;



        return dp;
    }

}
