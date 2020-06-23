package com.sanok.rdred;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Tricks extends AppCompatActivity {

    InterstitialAd interstitialAd = null;//admob intestial
   private AdView mAdViewadmob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tricks);

        //admob
        mAdViewadmob  = new AdView(this);
        mAdViewadmob.setAdSize(AdSize.BANNER);
        mAdViewadmob.setAdUnitId(getString(R.string.admob_banner));
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        //intestial ads admob backpress
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
