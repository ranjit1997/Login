package com.example.ranjeet.login;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

public class Product4 extends AppCompatActivity {

    GridView gridview;
//    ImageView IVProfile;
    //Search bar
    MaterialSearchView searchView;
    Toolbar toolbar;

    public static String[] osNameList = {
            "Android",
            "iOS",
            "Linux",
            "MacOS",
            "MS DOS",
            "Symbian",
            "Windows 10",
            "Windows XP",
            "Android",
            "iOS",
            "Linux",
            "MacOS",
            "MS DOS",
            "Symbian",
            "Windows 10",
            "Windows XP",
            "Android",
            "iOS",
            "Linux",
            "MacOS",
            "MS DOS",
            "Symbian",
            "Windows 10",
            "Windows XP",
            "Android",
            "iOS",
            "Linux",
            "MacOS",
            "MS DOS",
            "Symbian",
            "Windows 10",
            "Windows XP",
            "Android",
            "iOS",
            "Linux",
            "MacOS",
            "MS DOS",
            "Symbian",
            "Windows 10",
            "Windows XP",

    };
    public static int[] osImages = {
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
    };

    ImageView back3;
//         ImageView IVHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product4);
//        IVProfile =findViewById(R.id.IVProfile);
        gridview = (GridView) findViewById(R.id.customgrid5);
        gridview.setAdapter(new CustomAdapter(Product4.this, osNameList, osImages));


        // LinearLayout gallery = findViewById(R.id.gallery);
       // LayoutInflater inflater = LayoutInflater.from(this);

       // for ( int i=0;i<6;i++ ){

          //  View view = inflater.inflate(R.layout.activity_item, gallery, false);
           // TextView textView = view.findViewById(R.id.text);
           // textView.setText("activity_item"+ i);

            //ImageView imageView = view.findViewById(R.id.IVItem);
            //imageView.setImageResource(R.mipmap.ic_launcher);

          //  gallery.addView(view);
        //}

        back3 = (ImageView) findViewById(R.id.back3);
//        IVHome = (ImageView) findViewById(R.id.IVHome);



//        IVHome.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(Product4.this,ServicePage.class);
//                startActivity(intent);
//            }
//        });



        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Product4.this,ServicePage.class);
                startActivity(intent);
            }
        });

//        IVProfile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(Product4.this,Profile.class);
//                startActivity(intent);
//            }
//        });

        //search bar
        searchView = (MaterialSearchView)findViewById(R.id.search_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        searchViewCode();
    }
    private void searchViewCode()
    {
        searchView=(MaterialSearchView)findViewById(R.id.search_view);
        searchView.setSuggestions(getResources().getStringArray(R.array.query_suggestions));
        searchView.setEllipsize(true);
        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(getApplicationContext(),query,Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {

            }

            @Override
            public void onSearchViewClosed() {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem item=menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_search:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public void onBackPressed() {
        if (searchView.isSearchOpen())
        {
            searchView.closeSearch();
        }
        else {
            super.onBackPressed();
        }

    }

}
