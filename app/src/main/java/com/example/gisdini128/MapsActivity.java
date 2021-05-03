package com.example.gisdini128;

import androidx.fragment.app.FragmentActivity;

import android.app.VoiceInteractor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.icu.text.DisplayContext;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Palu and move the camera
        LatLng Rumah = new LatLng(-0.806240,119.902036);
        LatLng SPBU1 = new LatLng(-0.8087172,119.8781434);
        LatLng SPBU2 = new LatLng(-0.7439114,119.8633599);
        LatLng SPBU3 = new LatLng(-0.847109,119.8900172);
        LatLng SPBU4 = new LatLng(-0.8613392,119.88211);
        LatLng SPBU5 = new LatLng(-0.8931732,119.8866803);
        LatLng SPBU6 = new LatLng(-0.8754138,119.874278);
        LatLng SPBU7 = new LatLng(-0.9010479,119.8785515);
        LatLng SPBU8 = new LatLng(-0.893512,119.8680763);
        LatLng SPBU9 = new LatLng(-0.90812,119.8890419);
        LatLng SPBU10 = new LatLng(-0.9060943,119.872658);

        //custom size marker
        int tinggi = 100;
        int lebar = 100;
        BitmapDrawable bitmapDraw = (BitmapDrawable)getResources().getDrawable(R.drawable.icon);
        Bitmap b = bitmapDraw.getBitmap();
        Bitmap markerKecil = Bitmap.createScaledBitmap(b, lebar, tinggi, false);

        //Add marker to map
        mMap.addMarker(new MarkerOptions().position(Rumah).title("Dini's Home"));
        mMap.addMarker(new MarkerOptions().position(SPBU1).title("SPBU Mamboro")
            .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(SPBU2).title("SPBU Kayumalue")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(SPBU3).title("SPBU Soekarno Hatta")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(SPBU4).title("SPBU Tanah Runtuh")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(SPBU5).title("SPBU Sigma")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(SPBU6).title("SPBU Yos Sudarso")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(SPBU7).title("SPBU Kartini")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(SPBU8).title("SPBU Pramuka")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(SPBU9).title("SPBU Jalur 2 Muhammad Yamin")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(SPBU10).title("SPBU Maluku")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));

        mMap.addPolyline(new PolylineOptions().add (
                Rumah,
                new LatLng(-0.806240,119.902036),
                new LatLng(-0.806122,119.900309),
                new LatLng(-0.806562, 119.900083),
                new LatLng(-0.807463, 119.900030),
                new LatLng(-0.807634, 119.896457),
                new LatLng(-0.807860, 119.895803),
                new LatLng(-0.808536, 119.893979),
                new LatLng(-0.808611, 119.892820),
                new LatLng(-0.809447, 119.892541),
                new LatLng(-0.809640, 119.890835),
                new LatLng(-0.810413, 119.888700),
                new LatLng(-0.811453, 119.887337),
                new LatLng(-0.811872, 119.887016),
                new LatLng(-0.812634, 119.886393),
                new LatLng(-0.812923, 119.886093),
                new LatLng(-0.813395, 119.885771),
                new LatLng(-0.813266, 119.885192),
                new LatLng(-0.811765, 119.884087),
                new LatLng(-0.811647, 119.883915),
                new LatLng(-0.810928, 119.883314),
                new LatLng(-0.810949, 119.880289),
                new LatLng(-0.810874, 119.878593),
                new LatLng(-0.809898, 119.877982),
                new LatLng(-0.809008, 119.877864),
                new LatLng(-0.8087172,119.8781434),
                SPBU1
                ).width(10)
                        .color(Color.BLUE)
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU1));
    }

}