package com.example.fonetbilgiteknoloji.awesomelayouts;

import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends RootActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.cardViewItemLay) void cardViewItemLay(){

        startActivity(new Intent(MainActivity.this,ItemLayout.class));

    }
    @OnClick(R.id.cardViewItemLay2) void cardViewItemLay2(){

        startActivity(new Intent(MainActivity.this,Item2.class));

    }
    @OnClick(R.id.cardviewExpandable) void cardviewExpandable(){

        startActivity(new Intent(MainActivity.this,ExpanableLayout.class));

    }

    @OnClick(R.id.cardViewHomeLayout) void cardViewHomeLayout(){

        startActivity(new Intent(MainActivity.this,HomeScreen.class));

    }
}
