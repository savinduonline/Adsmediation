package lk.savindu.test.adsmediation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import lk.savindu.mediationads.MediationAds;

public class MainActivity extends AppCompatActivity {

    MediationAds mediationAds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediationAds = new MediationAds(MainActivity.this);


    }
}