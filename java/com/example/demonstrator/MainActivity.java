package com.example.oi_leprogrammedelavalise;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.oi_leprogrammedelavalise.Fragments.BasiqueFragment;
import com.example.oi_leprogrammedelavalise.Fragments.ContactFragment;
import com.example.oi_leprogrammedelavalise.Fragments.HomeFragment;
import com.example.oi_leprogrammedelavalise.Fragments.ProduitsFragment;
import com.example.oi_leprogrammedelavalise.Fragments.ServicesFragment;
import com.example.oi_leprogrammedelavalise.Fragments.SocieteFragment;
import com.example.oi_leprogrammedelavalise.Modeles.EndDrawerToggle;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        drawer = findViewById(R.id.drawer_layout);
        drawer.setBackgroundResource(R.drawable.fond_intro);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().getItem(2).getSubMenu().getItem(1).setChecked(true);

        EndDrawerToggle toggle = new EndDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void onBackPressed(){
        if(drawer.isDrawerOpen(GravityCompat.END)){
            drawer.closeDrawer(GravityCompat.END);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_société:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SocieteFragment()).commit();
                drawer.setBackgroundResource(R.drawable.fond_blanc_definitif);
                break;
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HomeFragment()).commit();
                drawer.setBackgroundResource(R.drawable.fond_intro);
                break;
            case R.id.nav_services:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ServicesFragment()).commit();
                drawer.setBackgroundResource(R.drawable.fond_services_definitif);
                break;
            case R.id.nav_contact:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ContactFragment()).commit();
                drawer.setBackgroundResource(R.drawable.fond_bleu_definitif);
                break;
            case R.id.nav_produits:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ProduitsFragment()).commit();
                drawer.setBackgroundResource(R.drawable.fond_produits_definitif);
                break;
            case R.id.nav_basique:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new BasiqueFragment()).commit();
                drawer.setBackgroundResource(R.drawable.fond_basique_planche);
        }
        if (item.getItemId() != R.id.nav_home) {
            navigationView.getMenu().getItem(2).getSubMenu().getItem(1).setChecked(false);
        }
        drawer.closeDrawer(GravityCompat.END);
        return true;
    }
}
