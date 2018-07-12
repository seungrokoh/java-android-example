package example.develop.davidoh.cardlistuidesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set the status bar background to transparent

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // setup recyclerview with the adapter

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_list);
        ArrayList<Item> mList = new ArrayList<>();
        mList.add(new Item(R.drawable.background_forest, "Forest", R.drawable.profile01, 2500));
        mList.add(new Item(R.drawable.background_mountain, "Mountain", R.drawable.profile02, 3100));
        mList.add(new Item(R.drawable.background_switzerland, "Switzerland", R.drawable.profile03, 8000));
        mList.add(new Item(R.drawable.background_tree, "Beautiful Tree", R.drawable.profile04, 10000));
        mList.add(new Item(R.drawable.background_table, "Table", R.drawable.profile05, 16000));
        Adapter adapter = new Adapter(this, mList);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
