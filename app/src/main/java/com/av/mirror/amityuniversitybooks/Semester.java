package com.av.mirror.amityuniversitybooks;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Semester extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public int mctrs,ctrs;
    public String str;
    Intent semintent = getIntent();
    Bundle getextra = semintent.getExtras();

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Select Semester");


        Button oddsem, evesem;
        oddsem = (Button) findViewById(R.id.odd_sem);
        evesem = (Button) findViewById(R.id.even_sem);



        ctrs = semintent.getIntExtra("ctr",0);

//FIRST YEAR
        if (ctrs == 1) {
            oddsem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    str = "first year";

                    Toast.makeText(Semester.this, str + " odd sem " + ctrs, Toast.LENGTH_SHORT).show();
                    //    ctrs=11;

                }
            });

            evesem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    str = "first year";

                    Toast.makeText(Semester.this, str + " even sem " + ctrs, Toast.LENGTH_SHORT).show();
                    //   ctrs=12;

                }
            });
        }


//SECOND YEAR
        if (ctrs == 2) {

            oddsem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    str = "second year";

                    Toast.makeText(Semester.this, str + " odd sem " + ctrs, Toast.LENGTH_SHORT).show();
                    //  ctrs=21;

                }
            });

            evesem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    str = "second year";

                    Toast.makeText(Semester.this, str + " even sem " + ctrs, Toast.LENGTH_SHORT).show();
                    //    ctrs=22;

                }
            });
        }

        //THIRD YEAR
        if (ctrs == 3) {

            oddsem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    str = "third year";

                    Toast.makeText(Semester.this, str + " odd sem " + ctrs, Toast.LENGTH_SHORT).show();
                    // ctrs=31;

                }

            });

            evesem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    str = "third year";

                    Toast.makeText(Semester.this, str + " even sem " + ctrs, Toast.LENGTH_SHORT).show();
                    //   ctrs=32;

                }
            });
        }
        //FOURTH YEAR
        if (ctrs == 4) {
            oddsem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    str = "fourth year";

                    Toast.makeText(Semester.this, str + " odd sem " + ctrs, Toast.LENGTH_SHORT).show();
                    //    ctrs=41;

                }
            });

            evesem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    str = "fourth year";

                    Toast.makeText(Semester.this, str + " even sem " + ctrs, Toast.LENGTH_SHORT).show();
                    //      ctrs=42;

                }
            });
        }




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.semester, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout rel=(RelativeLayout) findViewById(R.id.main_view_sem);


        mctrs=semintent.getIntExtra("mctr",0);

        switch ( item.getItemId()){

            case R.id.about:{
                Toast.makeText(Semester.this,"This will show \n about the developers",Toast.LENGTH_SHORT).show();
                return true;}
            case  R.id.black:{
                if(item.isChecked()){
                    item.setChecked(false);

                }
                else {
                    item.setChecked(true);
                    rel.setBackgroundColor(Color.BLACK);
                    return true;
                }
            }
            case  R.id.yellow:{
                if(item.isChecked()){

                    item.setChecked(false);

                }
                else {
                    item.setChecked(true);
                    rel.setBackgroundColor(Color.YELLOW);
                    return true;
                }
            }

            case R.id.white:{
                if(item.isChecked()){
                    item.setChecked(false);

                }
                else {
                    item.setChecked(true);
                    rel.setBackgroundColor(Color.WHITE);
                    return true;
                }
            }
            default:return super.onOptionsItemSelected(item);
        }

       /* switch (a){
            case 1:{    item.setChecked(true);
                rel.setBackgroundColor(Color.BLACK);
                return true;
                   }
            case 2:{
                item.setChecked(true);
                rel.setBackgroundColor(Color.YELLOW);
                return true;

            }
            case 3:{
                item.setChecked(true);
                rel.setBackgroundColor(Color.WHITE);
                return true;

            }
            default:return super.onOptionsItemSelected(item);

        }*/


    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        ctrs=0;
        if (id == R.id.sem_nav_one) {
            ctrs = 1;
            Intent i = new Intent(Semester.this, Semester.class);
            i.putExtra("ctr",ctrs);
            startActivity(i);
            Toast.makeText(Semester.this, "First year", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.sem_nav_two) {
            ctrs =2;
            Intent i = new Intent(Semester.this, Semester.class);
            i.putExtra("ctr",ctrs);
            startActivity(i);
            Toast.makeText(Semester.this, "Second year", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.sem_nav_three) {
            ctrs = 3;
            Intent i = new Intent(Semester.this, Semester.class);
              i.putExtra("ctr",ctrs);
            startActivity(i);
            Toast.makeText(Semester.this, "Third year", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.sem_nav_four) {
            ctrs = 4;
            Intent i = new Intent(Semester.this, Semester.class);
            i.putExtra("ctr",ctrs);
            startActivity(i);
            Toast.makeText(Semester.this, "Fourth year", Toast.LENGTH_SHORT).show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Semester Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.av.mirror.amityuniversitybooks/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Semester Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.av.mirror.amityuniversitybooks/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
