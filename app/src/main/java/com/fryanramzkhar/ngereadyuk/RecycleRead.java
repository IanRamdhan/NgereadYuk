package com.fryanramzkhar.ngereadyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleRead extends AppCompatActivity {

    @BindView(R.id.my_recycle_read)
    RecyclerView myRecycleRead;

    String[] namaRead,detailRead;
    int[] gambarRead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_read);
        ButterKnife.bind(this);

        namaRead = getResources().getStringArray(R.array.nama_read);
        detailRead = getResources().getStringArray(R.array.isi_cerita);

        Adapter adapter = new Adapter(this,namaRead,detailRead);
        myRecycleRead.setHasFixedSize(true);
        myRecycleRead.setLayoutManager(new LinearLayoutManager(RecycleRead.this));
        myRecycleRead.setAdapter(adapter);

    }
}
