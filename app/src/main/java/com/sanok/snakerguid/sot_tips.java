package com.sanok.snakerguid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class sot_tips extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sot_tips);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.color.items, "Using Maps", "Your map table and mission map are the most important sources of information that indicate your destination. Take care to compare them accordingly – the mission map will sometimes have the location written on it. Compare it to the world map and boom, head there. ."));
        exampleList.add(new ExampleItem(R.color.items1, "Sailing Straight", "To properly straighten your ship, look for a handle trimmed in gold at the helm (aka that wheel you use to move the ship). If you keep that centred, then your ship’s rudder will also be straight. This ensures that the ship is sailing straight and not drifting off to the left or right by accident."));
        exampleList.add(new ExampleItem(R.color.items2, "Turn Off The Lights", "Ambushing other unsuspecting players in Sea of Thieves is pretty much expected – you’re all pirates darn it. However, whether you’re doing that or approaching a location from a distance, a good way to not get spotted is to turn your ship’s lights off. Your enemies won’t see you till you’re close and it’s perfect for stealth at a distance."));
        exampleList.add(new ExampleItem(R.color.items3, "Into The Brig", "If a certain member on your team is misbehaving or you feel like having a laugh, throw them in the brig. You and other players can vote to have said player locked in the brig for as long as you want"));
        exampleList.add(new ExampleItem(R.color.items4, "Proper Pirate Coordination", "Though Sea of Thieves isn’t too deep of an experience, it still follows the basic rules of sailing. If you have multiple players on your team, have one hang out by the world map downstairs and communicating by voice with the captain."));
        exampleList.add(new ExampleItem(R.color.items5, "Quick Turns", "LPerforming quick turns is possible in Sea of Thieves and becomes very useful for dodging rocks and not suddenly crashing into islands. Sail ahead at full speed and when rotating left or right, drop the anchor immediately. Voilà, instant turn. "));
        exampleList.add(new ExampleItem(R.color.items6, "The Kraken Approaches", "If you happen to come across the Kraken, the “world boss” or whatever it’s called in Sea of Thieves, don’t panic. Well, you could panic if a tentacle grabs you and starts throwing you about. But otherwise, pay attention to the water. If it starts turning black, then the Kraken is nearby and you should be ready."));


        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
