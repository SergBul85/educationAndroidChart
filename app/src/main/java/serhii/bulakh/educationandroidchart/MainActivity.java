package serhii.bulakh.educationandroidchart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart pieChart = findViewById(R.id.pieChart);

        ArrayList<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(350.0f, "Energy"));
        entries.add(new PieEntry(180.0f, "Water"));
        entries.add(new PieEntry(120.0f, "Gas"));
        entries.add(new PieEntry(120.0f, "Gas"));
        entries.add(new PieEntry(120.0f, "Gas"));
        entries.add(new PieEntry(120.0f, "Gas"));
        entries.add(new PieEntry(120.0f, "Gas"));
        entries.add(new PieEntry(600.0f, "Warm"));

        PieDataSet dataSet = new PieDataSet(entries, "");
//        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        dataSet.setColors(Color.rgb(255, 0, 0),
                Color.rgb(0, 100, 0),
                Color.rgb(100, 255, 0),
                Color.rgb(0, 255, 100),
                Color.rgb(100, 150, 100),
                Color.rgb(200, 255, 150),
                Color.rgb(0, 255, 0),
                Color.rgb(0, 0, 255));
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(24f);

        PieData pieData = new PieData(dataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("Komunalka");
        pieChart.animate();

    }
}