package com.fryanramzkhar.ngereadyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailRead extends AppCompatActivity {

    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.txtDetail)
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_read);
        ButterKnife.bind(this);

        txtTitle.setText(getIntent().getStringExtra("nr"));
        txtDetail.setText(getIntent().getStringExtra("dr"));




    }
}
