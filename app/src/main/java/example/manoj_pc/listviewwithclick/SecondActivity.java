package example.manoj_pc.listviewwithclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity{
    private TextView tvFirstname;
    private TextView tvAge;
    private TextView tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        initData();
    }

    private void initData() {
        tvFirstname.setText(getIntent().getStringExtra("Firstname"));
        tvAge.setText(getIntent().getStringExtra("Age"));
        tvAddress.setText(getIntent().getStringExtra("Address"));
    }

    private void initView() {
        tvFirstname = (TextView)findViewById(R.id.tvFirstname);
        tvAge = (TextView)findViewById(R.id.tvAge);
        tvAddress = (TextView)findViewById(R.id.tvAddress);


    }
}
