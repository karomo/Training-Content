package com.karomo.scrollviewexample;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {


    String[] scroolViewExamplesArr = {"Login", "Login with scrollview", "Long text", "Long text with scrollview"};

    private ListView lvExamples;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_row_item, scroolViewExamplesArr);


        lvExamples = (ListView) findViewById(R.id.my_listView);
        lvExamples.setAdapter(adapter);

        lvExamples.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), LoginWithScrollviewActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(), LongTextActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(), LongTextWithScrollViewActivity.class));
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
