package com.example.nguyenson.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private HeroAdapterView mHeroAdapterView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerview);
        mHeroAdapterView = new HeroAdapterView(initData());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(mHeroAdapterView);
    }

    private ArrayList<Hero> initData(){
        ArrayList<Hero> list = new ArrayList<>();
        Hero hero;
        hero = new Hero();
        hero.setName("ClockWerk");
        hero.setPhoto(R.drawable.ic_clockwerk);
        list.add(hero);

        hero = new Hero();
        hero.setName("DragonKnight");
        hero.setPhoto(R.drawable.ic_dragonknight);
        list.add(hero);

        hero = new Hero();
        hero.setName("EarthShaker");
        hero.setPhoto(R.drawable.ic_earthshaker);
        list.add(hero);

        hero = new Hero();
        hero.setName("EmberSpirit");
        hero.setPhoto(R.drawable.ic_emberspirit);
        list.add(hero);

        hero = new Hero();
        hero.setName("Jakiro");
        hero.setPhoto(R.drawable.ic_jakiro);
        list.add(hero);

        hero = new Hero();
        hero.setName("Sven");
        hero.setPhoto(R.drawable.ic_sven);
        list.add(hero);

        hero = new Hero();
        hero.setName("WarLock");
        hero.setPhoto(R.drawable.ic_warlock);
        list.add(hero);

        return list;
    }
}
