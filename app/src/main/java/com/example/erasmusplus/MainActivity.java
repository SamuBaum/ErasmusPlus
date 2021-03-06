package com.example.erasmusplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavHost;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.NavController;


public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //NavController navController;
        //AppBarConfiguration appBarConfiguration =
        //        new AppBarConfiguration.Builder(navController.getGraph()).build();

        //set up Toolbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("Cities"); // Titel der Actionbar festlegen

        //NavController navController = NavHostFragment.findNavController(R.layout.activity_main);

        /*

        // Card Views erstellen
        CardView cardMgh = findViewById(R.id.firstcard);
        CardView cardBorgo = findViewById(R.id.secondcard);
        CardView cardOdry = findViewById(R.id.thirdcard);

        Button btnMGH = findViewById(R.id.buttonfirstcard);

        ImageView mghImg = findViewById(R.id.imageView1);
        ImageView bgoImg = findViewById(R.id.imageView2);
        ImageView OdrImg = findViewById(R.id.imageView3);


        TextView mghTitle = findViewById(R.id.title1);
        TextView bgoTitle = findViewById(R.id.title2);
        TextView odrTitle = findViewById(R.id.title3);

        TextView mghDes = findViewById(R.id.description1);
        TextView bgoDes = findViewById(R.id.description2);
        TextView odryDes = findViewById(R.id.description3);

        City MGH = new City(cardMgh);
        City Borgomonero = new City(cardBorgo);
        City Odry = new City(cardOdry);

        btnMGH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivity();
            }
        });

        */





    }

    public void launchActivity() {
        Intent intent = new Intent(this, Sights.class);
        startActivity(intent);
    }


}

