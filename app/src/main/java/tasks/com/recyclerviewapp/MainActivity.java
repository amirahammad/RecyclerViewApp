package tasks.com.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Product>productList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList=new ArrayList<>();

        productList.add(
                new Product(
                        1,
                        R.drawable.imageone,
                        60000,
                        4.3,
                        "13.3 inch, Silver, 1.35 kg",
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)"
                ));

        productList.add(
                new Product(
                        1,
                      R.drawable.imagetwo,
                        60000,
                        4.5,
                        "14 inch, Gray, 1.659 kg",
                        "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)"

                       ));

        productList.add(
                new Product(
                        1,
                        R.drawable.imagethree,
                        60000,
                        4.3,
                        "13.3 inch, Silver, 1.35 kg",
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)"
                      ));

        Adapter adapter=new Adapter(productList,this);
        recyclerView.setAdapter(adapter);

    }
}
