package acadgild.com.assignment41;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button button1;
    Button button2;
    List<String> stringList;
    String[] values = new String[]{"jan","feb","mar","apr","may","jun","july","aug",
            "sept","oct","nov","dec"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        button1 =(Button)findViewById(R.id.btn1);
        button2=(Button)findViewById(R.id.btn2);






        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ascendingListView();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                descendingListView();
            }
        });

    }
   public void ascendingListView(){
     stringList= Arrays.asList(values);
       Collections.sort(stringList);
       adapter =  new
               ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,values);

       listView.setAdapter(adapter);
   }
   public void descendingListView(){
       stringList= Arrays.asList(values);
       Collections.sort(stringList,Collections.<String>reverseOrder());
       adapter =  new
               ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,values);

       listView.setAdapter(adapter);
   }
}
