package com.example.fonetbilgiteknoloji.awesomelayouts;

import android.app.Activity;
import android.os.Bundle;

public class RootActivity extends Activity {

    int onStartCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onStartCount = 1;
        if (savedInstanceState == null)
        {
            this.overridePendingTransition(R.anim.anim_slide_in_left,
                    R.anim.anim_slide_in_left);
        } else
        {
            onStartCount = 2;
        }
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        if (onStartCount > 1) {
            this.overridePendingTransition(R.anim.anim_slide_in_right,
                    R.anim.anim_slide_in_right);

        } else if (onStartCount == 1) {
            onStartCount++;
        }

    }

}