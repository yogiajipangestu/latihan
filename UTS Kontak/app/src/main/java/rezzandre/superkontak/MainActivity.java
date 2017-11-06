package rezzandre.superkontak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    KontakAdapter adapter;
    List<KontakModel> kontakModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.rv);
        adapter = new KontakAdapter(this, kontakModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        isiData();
    }
    private void isiData(){
        KontakModel model = new KontakModel("Bagas Afrian", "bagasafrian@gmail.com", "0896107271");
        kontakModels.add(model);

        model = new KontakModel("Aditya Arya", "aditya_200397_bro@yahoo.com", "081234567");
        kontakModels.add(model);

        model = new KontakModel("Irvan Sipit", "irvansipit@gmail.com", "087335321");
        kontakModels.add(model);

        adapter.notifyDataSetChanged();
    }
}
