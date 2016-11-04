package overwatch.app.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import overwatch.app.R;
import overwatch.app.ui.quote.ListActivity;


public class MainActivity extends AppCompatActivity {
    private Spinner platform_spinner;
    private Spinner region_spinner;
    private Spinner mode_spinner;
    private Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        platform_spinner = (Spinner) findViewById(R.id.platform);
        // Initialize and set Adapter
        ArrayAdapter<CharSequence> platformAdapter = ArrayAdapter
                .createFromResource(this, R.array.platform_array,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        platformAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        platform_spinner.setAdapter(platformAdapter);


        region_spinner = (Spinner) findViewById(R.id.region);
        // Initialize and set Adapter
        ArrayAdapter<CharSequence> regionAdapter = ArrayAdapter
                .createFromResource(this, R.array.region_array,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        regionAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        region_spinner.setAdapter(regionAdapter);

        mode_spinner = (Spinner) findViewById(R.id.mode);
        // Initialize and set Adapter
        ArrayAdapter<CharSequence> modeAdapter = ArrayAdapter
                .createFromResource(this, R.array.mode_array,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        modeAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        mode_spinner.setAdapter(modeAdapter);

        search = (Button) findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ListActivity.class));
            }
        });

    }
}
