package com.example.ranjeet.login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.GridView;


//Search bar
import com.miguelcatalan.materialsearchview.MaterialSearchView;

public class ServicePage extends AppCompatActivity {
     ListView Listview;
//     ImageView tvsell;
     RelativeLayout Hostel;
     RelativeLayout IVSusity;
   RelativeLayout IVRoom;
    RelativeLayout IVHotel;
    RelativeLayout IVDry;
    TextView Filters;
    //ImageView search;
//    ImageView IVProfile;
    ImageView os_images;
    GridView gridview;
    //Search bar
   MaterialSearchView searchView;
    Toolbar toolbar;
    //Location button
    RelativeLayout Relocation;
//    String[] list;

;

    public static String[] osNameList = {
            "Sai Hostel",
            "Tulshi Hostel",
            "Shakutala Hostel",
            "Ujawal Hostel",
            "Kamlai Hostel",
            "Pancham Hostel",
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
            R.mipmap.get,
            R.mipmap.images,
            R.mipmap.oye,
            R.mipmap.room,
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


//    TextView Location_bt;
//    LocationManager locationManager;
     public static final int CAMERA_REQUEST=9999;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_page);

        // navigation bottom

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HomeFragment()).commit();
        }
        //LinearLayout gallery = findViewById(R.id.gallery);
        // LayoutInflater inflater = LayoutInflater.from(this);
        // all button
//        IVProfile = findViewById(R.id.IVProfile);
//        tvsell = findViewById(R.id.tvsell);
        //Filter = (item)findViewById(R.id.Filter);
        Hostel = findViewById(R.id.Hostel);
        IVSusity = findViewById(R.id.IVSusity);
        IVRoom = findViewById(R.id.IVRoom);
        IVDry = findViewById(R.id.IVDry);
        IVHotel = findViewById(R.id.IVHotel);
//        IVHome = (ImageView) findViewById(R.id.IVHome);
//        Filters = findViewById(R.id.Filters);
        os_images = findViewById(R.id.os_images);
        //Location_bt =(TextView)findViewById(R.id.Location_button);
        gridview = (GridView) findViewById(R.id.customgrid);
        gridview.setAdapter(new CustomAdapter(this, osNameList, osImages));

        //setSupportActionBar(toolbar);




        //     for ( int i=0;i<6;i++ ){

        //          View view = inflater.inflate(R.layout.activity_item, gallery, false);
        //        TextView textView = view.findViewById(R.id.text);
        //      textView.setText("activity_item"+ i);

        //    ImageView imageView = view.findViewById(R.id.IVItem);
        //  imageView.setImageResource(R.mipmap.ic_launcher);


        //gallery.addView(view);
        //}

//        if (ContextCompat.checkSelfPermission(getApplicationContext(),
//                android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
//                ActivityCompat.checkSelfPermission(getApplicationContext(),
//                        android.Manifest.permission.ACCESS_COARSE_LOCATION)
//                        != PackageManager.PERMISSION_GRANTED) {
//
//            ActivityCompat.requestPermissions(this, new String[]
//                    {android.Manifest.permission.ACCESS_FINE_LOCATION,
//                    android.Manifest.permission.ACCESS_COARSE_LOCATION}, 101);
//
//        }
//
//        Location_bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getLocation();
//            }
//        });

//
//        tvsell.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
//                startActivityForResult(intent, CAMERA_REQUEST);
//
//
//            }
//        });
//

        Hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ServicePage.this, Product.class);
                startActivity(intent);
            }
        });


        IVSusity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ServicePage.this, Product1.class);
                startActivity(intent);
            }
        });


        IVRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ServicePage.this, Product2.class);
                startActivity(intent);
            }
        });


        IVDry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ServicePage.this, Product3.class);
                startActivity(intent);
            }
        });


        IVHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ServicePage.this, Product4.class);
                startActivity(intent);
            }
        });


//        Filters.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(ServicePage.this, Filterpage.class);
//                startActivity(intent);
//            }
//        });

//        IVHome.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(ServicePage.this, ServicePage.class);
//                startActivity(intent);
//            }
//        });
//
//
//        IVProfile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(ServicePage.this, Profile.class);
//                startActivity(intent);
//            }
//        });




       //search bar list

//        list = new String[]{"Clipcodes", "Android Tutorials", "Youtube Clipcodes Tutorials", "SearchView Clipcodes", "Android Clipcodes", "Tutorials Clipcodes"};
//
//        //materialSearchView.clearFocus();
//        materialSearchView.setSuggestions(list);
//
//        materialSearchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                //Here Create your filtering
//                Toast.makeText(getApplicationContext(),query,Toast.LENGTH_SHORT).show();
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                //You can make change realtime if you typing here
//                //See my tutorials for filtering with ListView
//                return false;
//            }
//        });

        //Follow this video for fix and other happend, Comment and Like this video . THANKS
   // }

//    void getLocation() {
//        try {
//            locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 5000, 5, (LocationListener) this);
//        }
//        catch(SecurityException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.menu, menu);
//
//
//        return true;

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
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu,menu);
//        MenuItem item=menu.findItem(R.id.action_search);
//       // MenuItem item=menu.findItem(R.id.Filter1);
//        searchView.setMenuItem(item);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId())
//        {
//            case R.id.action_search:
//                return true;
////            case R.id.Filter;
////                return true;
//                default:
//                    return super.onOptionsItemSelected(item);
//
//
//        }

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
     // navigation bottom

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.nav_favorites:
                            selectedFragment = new SellFragment();
                            break;
                        case R.id.nav_search:
                            selectedFragment = new ProfileFragment();
                            break;
                    }

                    assert selectedFragment != null;
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };


}
