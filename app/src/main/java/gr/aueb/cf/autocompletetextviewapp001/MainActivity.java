package gr.aueb.cf.autocompletetextviewapp001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTV;
    private String[] itemArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTV = findViewById(R.id.autoCompleteTV);
        itemArray = getResources().getStringArray(R.array.itemList);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                itemArray
        );

        autoCompleteTV.setAdapter(arrayAdapter);

    }
}