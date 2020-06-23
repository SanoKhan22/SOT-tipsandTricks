package com.sanok.rdred;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class sot_gp extends AppCompatActivity {
    InterstitialAd interstitialAd = null;//admob intestial
    private AdView adView;//fb banner

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sot_gp);

        ViewPager viewPager = findViewById(R.id.view_pager);
        ImageAdapter imageAdapter = new ImageAdapter(this);
        viewPager.setAdapter(imageAdapter);

        adView = new com.facebook.ads.AdView(this, "579516089614960_579516662948236", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();


        //intestial ads admob
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.admob_intestial));// check in adunit in string
        interstitialAd.loadAd(new AdRequest.Builder().build());

    }

    @Override
    public void onBackPressed() {
        if (interstitialAd.isLoaded( )) {
            interstitialAd.show( );
            interstitialAd.setAdListener(new AdListener( ) {
                @Override
                public void onAdClosed() {
                    super.onAdClosed( );
                    finish( );
                }
            });
        } else {
            super.onBackPressed( );
        }
    }

}
