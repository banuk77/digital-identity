package com.fragilebytes.digitalidentity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private View mMainLayout;
    private ImageView mStampImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainLayout = findViewById(R.id.main_frame);
        mStampImg = findViewById(R.id.stamp_img);
        mStampImg.setImageResource(R.drawable.stamp_certified);
        startJourney();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    public void OnClickOutside(View view) {
        finish();
    }

    private void startJourney() {
        mMainLayout.animate().alpha(1).translationY(0).setDuration(600).start();
    }
}
