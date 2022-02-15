/*package com.example.openclasseromeprojet;


import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private static final String TAG = "ListActivity";

    private final List<Player> mPlayerList = new ArrayList<>();
    private final RecyclerViewAdapter mAdapter;

    public ListActivity(RecyclerViewAdapter adapter, Button buttonRemove) {
        mAdapter = adapter;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initImageBitmaps();
    }
    

    private void initImageBitmaps() {

        Player messi = new Player("Lionel Messi", "https://wikicelebridad.com/wp-content/uploads/2019/05/Lionel-Messi.jpg");
        mPlayerList.add(messi);

        Player Lewandowski = new Player("Robert Lewandowski", "https://bayernstrikes.com/wp-content/uploads/getty-images/2019/10/1168485252.jpeg");
        mPlayerList.add(Lewandowski);

        Player Jorginho = new Player("Jorginho", "https://www.100x100napoli.it/wp-content/uploads/2021/05/chelsea-jorginho-202103280930_chelsea_jorginho_202103280930_1rh5b23liwns3zghzyccw6w7m-1536x864.jpg");
        mPlayerList.add(Jorginho);

        Player Benzema = new Player("Karim Benzema", "https://wikicelebridad.com/wp-content/uploads/2019/05/Lionel-Messi.jpg");
        mPlayerList.add(Benzema);

        Player Kanté = new Player("N'Golo Kanté", "https://www.radiobeton.com/www/wp-content/uploads/2018/11/n-golo-kante-sa-surprenante-soiree-avec-des-supporters-anglais.jpeg");
        mPlayerList.add(Kanté);

        Player Ronaldo = new Player("Cristiano Ronaldo", "https://i.le360.ma/fr/sites/default/files/styles/image_la_une_on_home_page/public/assets/images/2021/10/cristiano_ronaldo.jpeg");
        mPlayerList.add(Ronaldo);

        Player Salah = new Player("Mohamed Salah", "https://gossipgist.com/uploads/52/mohamed-salah-skysports.jpg");
        mPlayerList.add(Salah);

        Player Bruyne = new Player("Kevin De Bruyne", "https://lh3.googleusercontent.com/9VGJxxoQ5E-_JR4CMU_aZsGT2X318lptqb_gjWGYIaDPrOLxpjLGc9CtoG2I-kUHntBCNcFXVRzXvZKhZEd6fGO3=w1500-h1000-p-e7");
        mPlayerList.add(Bruyne);

        Player Mbappé = new Player("Kylian Mbappé", "https://assets-fr.imgfoot.com/media/cache/642x382/mbappe-5f92ce01de36f.jpg");
        mPlayerList.add(Mbappé);

        Player Donnarumma = new Player("Gianluigi Donnarumma", "https://e2.365dm.com/21/06/1920x1080/skysports-donnarumma-ac-milan_5408566.jpg?20210607223534");
        mPlayerList.add(Donnarumma);

        Player Haaland = new Player("Erling Haaland", "https://www.radio912.de/externalimages/?source=jpg261/erling-haaland2021.jpg&crop=0x102x4902x3064&resize=1280x800&dt=202008260940140");
        mPlayerList.add(Haaland);

        Player Lukaku = new Player("Romelu Lukaku", "https://cdn.vox-cdn.com/thumbor/Msm6-NV7MB7R85jEg7655KQ5rSw=/0x0:2520x3266/1200x800/filters:focal(1034x745:1436x1147)/cdn.vox-cdn.com/uploads/chorus_image/image/60083509/939516376.jpg.0.jpg");
        mPlayerList.add(Lukaku);

        Player Chiellini = new Player("Giorgio Chiellini", "https://www.fussballeuropa.com/images/xtra/giorgio-chiellini-2021-1.jpg");
        mPlayerList.add(Chiellini);


        initRecyclerView();

    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(mPlayerList, this);

        recyclerView.setAdapter(mAdapter);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}




*/

package com.example.openclasseromeprojet;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity implements RecyclerViewAdapter.Listener {

    private static final String TAG = "ListActivity";

    private final List<Player> mPlayerList = new ArrayList<>();
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initImageBitmaps();
    }

    private void initImageBitmaps() {

        Player messi = new Player("Lionel Messi", "https://wikicelebridad.com/wp-content/uploads/2019/05/Lionel-Messi.jpg");
        mPlayerList.add(messi);

        Player lewandowski = new Player("Robert Lewandowski", "https://bayernstrikes.com/wp-content/uploads/getty-images/2019/10/1168485252.jpeg");
        mPlayerList.add(lewandowski);

        Player jorginho = new Player("Jorginho", "https://www.100x100napoli.it/wp-content/uploads/2021/05/chelsea-jorginho-202103280930_chelsea_jorginho_202103280930_1rh5b23liwns3zghzyccw6w7m-1536x864.jpg");
        mPlayerList.add(jorginho);

        Player benzema = new Player("Karim Benzema", "https://wikicelebridad.com/wp-content/uploads/2019/05/Lionel-Messi.jpg");
        mPlayerList.add(benzema);

        Player kante = new Player("N'Golo Kanté", "https://www.radiobeton.com/www/wp-content/uploads/2018/11/n-golo-kante-sa-surprenante-soiree-avec-des-supporters-anglais.jpeg");
        mPlayerList.add(kante);

        Player Ronaldo = new Player("Cristiano Ronaldo", "https://i.le360.ma/fr/sites/default/files/styles/image_la_une_on_home_page/public/assets/images/2021/10/cristiano_ronaldo.jpeg");
        mPlayerList.add(Ronaldo);

        Player salah = new Player("Mohamed Salah", "https://gossipgist.com/uploads/52/mohamed-salah-skysports.jpg");
        mPlayerList.add(salah);

        Player bruyne = new Player("Kevin De Bruyne", "https://lh3.googleusercontent.com/9VGJxxoQ5E-_JR4CMU_aZsGT2X318lptqb_gjWGYIaDPrOLxpjLGc9CtoG2I-kUHntBCNcFXVRzXvZKhZEd6fGO3=w1500-h1000-p-e7");
        mPlayerList.add(bruyne);

        Player mbappe = new Player("Kylian Mbappé", "https://assets-fr.imgfoot.com/media/cache/642x382/mbappe-5f92ce01de36f.jpg");
        mPlayerList.add(mbappe);

        Player donnarumma = new Player("Gianluigi Donnarumma", "https://e2.365dm.com/21/06/1920x1080/skysports-donnarumma-ac-milan_5408566.jpg?20210607223534");
        mPlayerList.add(donnarumma);

        Player haaland = new Player("Erling Haaland", "https://www.radio912.de/externalimages/?source=jpg261/erling-haaland2021.jpg&crop=0x102x4902x3064&resize=1280x800&dt=202008260940140");
        mPlayerList.add(haaland);

        Player lukaku = new Player("Romelu Lukaku", "https://cdn.vox-cdn.com/thumbor/Msm6-NV7MB7R85jEg7655KQ5rSw=/0x0:2520x3266/1200x800/filters:focal(1034x745:1436x1147)/cdn.vox-cdn.com/uploads/chorus_image/image/60083509/939516376.jpg.0.jpg");
        mPlayerList.add(lukaku);

        Player chiellini = new Player("Giorgio Chiellini", "https://www.fussballeuropa.com/images/xtra/giorgio-chiellini-2021-1.jpg");
        mPlayerList.add(chiellini);

        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(mPlayerList, getApplicationContext(), this);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onClickDelete(Player player) {
        Log.d(TAG, "onClickDelete: " + player.getName());
    }

    @Override
    public void onItemClick(Player player) {
        Log.d(TAG, "onItemClick: " + player.getName());
    }
}



