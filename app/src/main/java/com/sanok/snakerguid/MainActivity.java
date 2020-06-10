package com.sanok.snakerguid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.google.android.material.navigation.NavigationView;

import static com.sanok.snakerguid.R.string.app_name;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    //btns
    Button sot_intro,sot_tips,sot_tricks,sot_gp,controls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolBar();

        //mainactivity   second btn  (SOT_Tips)
        sot_intro = (Button) findViewById(R.id.introduction_btn);

        sot_intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sot_intro = new Intent(MainActivity.this,Introduction.class);
                startActivity(sot_intro);
            }
        });


//mainactivity   second btn  (SOT_Tips)
        sot_tips = (Button) findViewById(R.id.tips_btn);

        sot_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sot_open = new Intent(MainActivity.this,sot_tips.class);
                startActivity(sot_open);
            }
        });


        //mainactivity   3rd btn  (SOT_T R I C K S)
        sot_tricks = (Button) findViewById(R.id.tricks_btn);

        sot_tricks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sot_tricks = new Intent(MainActivity.this,Tricks.class);
                startActivity(sot_tricks);
            }
        });


        //mainactivity   Forth btn  (SOT_gameplay)
        sot_gp = (Button) findViewById(R.id.gameplay_btn);

        sot_gp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sot_gp = new Intent(MainActivity.this,sot_gp.class);
                startActivity(sot_gp);
            }
        });



        // 5th btn   ---- controls

        controls = (Button) findViewById(R.id.controls_btn);

                 controls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent controls = new Intent(MainActivity.this,controls.class);
                startActivity(controls);
            }
        });

        navigationView = (NavigationView) findViewById(R.id.navigation_menu);

        //menu items and itz onclick functions
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        Intent openhome = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(openhome);
                    Toast.makeText(MainActivity.this, "HOME", Toast.LENGTH_SHORT).show();

                    break;

                    //tips Home2
                    case R.id.nav_home2:
                        Intent open_tips = new Intent(MainActivity.this,sot_tips.class);
                        startActivity(open_tips);
                        Toast.makeText(MainActivity.this, "SOT TIPS", Toast.LENGTH_SHORT).show();

                        break;

                    //tips Home2
                    case R.id.nav_home3:
                        Intent open_tricks = new Intent(MainActivity.this,Tricks.class);
                        startActivity(open_tricks);
                        Toast.makeText(MainActivity.this, "Tricks", Toast.LENGTH_SHORT).show();

                        break;

                    //About
                    case R.id.nav_grpitem2_about:


                        //About dialoogue
                        openDialogue();//open about
                        Toast.makeText(MainActivity.this, "About", Toast.LENGTH_SHORT).show();
                        break;


                        //Gameplay _SOT
                    case R.id.nav_home4:
                        Intent open_gp = new Intent(MainActivity.this,sot_gp.class);
                        startActivity(open_gp);
                        Toast.makeText(MainActivity.this, "SOT GamePlay", Toast.LENGTH_SHORT).show();

                        break;

                        //moreapps
                    case R.id.nav_moreapps:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Sano.K")));
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("market://search?q=pub:Sano.K"));
                        MainActivity.this.startActivity(intent);

                        Toast.makeText(MainActivity.this, "More Apps", Toast.LENGTH_SHORT).show();
                        break;


                        //privacyPolicy intent
                    case R.id.nav_grpitem_pp:
                        //short intent for privacy policy
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/sotguide/home")));
                        Toast.makeText(MainActivity.this, "Privacy Policy", Toast.LENGTH_SHORT).show();
                        break;

                }


                return false;
            }




            //open dialogue about
            private void openDialogue() {

                aboutInfo exampleDialog = new aboutInfo();
                exampleDialog.show(getSupportFragmentManager(), "example dialog");

            }




        });

    }

    //toolbar
        private void setUpToolBar(){

        drawerLayout=(DrawerLayout) findViewById(R.id.drawerlayout);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //toolbar image
            getSupportActionBar().setLogo(R.drawable.hamburgericon);
            getSupportActionBar().setTitle("  SOT Guide");
           toolbar.setPadding(30,0,30,0);
           toolbar.setContentInsetsAbsolute(0,0);
           drawerLayout.setPadding(20,0,0,0);


            //text in toolbar
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout, app_name,R.string.Toolbar);
            actionBarDrawerToggle.setDrawerIndicatorEnabled(true);

           // drawerLayout.setDrawerListener(actionBarDrawerToggle);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        actionBarDrawerToggle.syncState();


        }






}
