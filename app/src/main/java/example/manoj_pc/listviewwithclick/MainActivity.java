package example.manoj_pc.listviewwithclick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private List<UserInfo> userInfoList = new ArrayList<>();
    private ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        userInfoList.add(new UserInfo("manoj","28","Malaad"));
        userInfoList.add(new UserInfo("rajesh","26","kandivali"));
        userInfoList.add(new UserInfo("pank","25","bhayandar"));
        userInfoList.add(new UserInfo("billy","24","usa"));
        adapter = new ListViewAdapter(MainActivity.this, userInfoList);
        // Binds the Adapter to the ListView
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, userInfoList.get(i).getFirstname(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,  userInfoList.get(i).getAge(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,  userInfoList.get(i).getAddress(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("Firstname",userInfoList.get(i).getFirstname());
                intent.putExtra("Age",userInfoList.get(i).getAge());
                intent.putExtra("Address",userInfoList.get(i).getAddress());
                startActivity(intent);
            }
        });



    }

    private void initView() {
        list = (ListView)findViewById(R.id.list);
    }
}
