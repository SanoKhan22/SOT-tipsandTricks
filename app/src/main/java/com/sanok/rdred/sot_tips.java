package com.sanok.rdred;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;

import java.util.ArrayList;

public class sot_tips extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private AdView adView;//fb banner

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sot_tips);
// Initialize the Audience Network SDK
        AudienceNetworkAds.initialize(this);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.color.items, "Use Dead Eye for hunting", "Morgan’s slow-mo shooting skills are especially handy when targeting smaller prey, like squirrel and fox. Dead Eye will also highlight animals vitals, and nailing a shot to the heart or neck will usually ned in an instant, clean kill if you’re using the right caliber of ammo. Take a look at our Red Dead Redemption 2 hunting tips for more advice."));
        exampleList.add(new ExampleItem(R.color.items2, "Issue simple commands to your horse", "You can make Morgan’s loyal mount follow, stay, or flee by holding down the left trigger while in close proximity of your pony pal."));
        exampleList.add(new ExampleItem(R.color.items5, "Feeling lazy? Use cinematic mode", "Set a waypoint and enter into cinematic mode to make your horse ride to your destination with zero input required from you… though we’d advise you don’t step away from your console. Should bounty hunters or rival gangs attack Arthur mid-journey, you’ll be swiftly booted out of cinematic mode and be expected to defend yourself. "));
        exampleList.add(new ExampleItem(R.color.items6, "Store hats on your horse", "Lost your fave fetching cowboy hat in a saloon fight? Fret not. You can store three hats on your horse that can be selected from your loyal chum’s saddle at any time. Even an outlaw values style and protection from that beating sun."));
        exampleList.add(new ExampleItem(R.color.items3, "Know your HUD options", "You can turn off your radar and all other on-screen displays by holding down on the D-pad, then selecting ‘radar off’ for a more immersive experience. In this HUD-free mode, and quick tap of down on the D-pad will briefly bring your radar back up. "));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        //fb banner adunit 579516089614960_579516662948236  rdr2
        adView = new AdView(this, "579516089614960_579516662948236", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
    }
}
