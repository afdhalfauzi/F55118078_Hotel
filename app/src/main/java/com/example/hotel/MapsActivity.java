package com.example.hotel;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
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

        // Membuar mark pada tempat tinggal User
        LatLng MyHome = new LatLng(-0.9299567671766938, 119.87570364352652);
        // Custom size marker
        int tinggi = 150;
        int lebar = 90;
        BitmapDrawable bitmapDraw = (BitmapDrawable)getResources().getDrawable(R.drawable.pin_location);
        Bitmap b = bitmapDraw.getBitmap();
        Bitmap markerKecil = Bitmap.createScaledBitmap(b, lebar, tinggi, false);
        //Masukan Ke Map
        mMap.addMarker(new MarkerOptions().position(MyHome).title("Rumah (Afdhal Fauzi Basri F55118078)").snippet("Ini Rumah Saya").icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(MyHome, 13.5f));


        LatLng HotelRedDoorzTinggede = new LatLng(-0.9278872171490471, 119.8727784656823);
        mMap.addMarker(new MarkerOptions().position(HotelRedDoorzTinggede).title("Lokasi Terdekat : Hotel RedDoorz Tinggede"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelRedDoorzTinggede));

        LatLng HotelBestWesternPlus = new LatLng(-0.9191939874933974, 119.88703573112772);
        mMap.addMarker(new MarkerOptions().position(HotelBestWesternPlus).title("Hotel Best Western Plus Coco Palu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelBestWesternPlus));

        LatLng HotelCameloan = new LatLng(-0.9056344584980969, 119.8839458263857);
        mMap.addMarker(new MarkerOptions().position(HotelCameloan).title("Hotel Cameloan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelCameloan));

        LatLng HotelRamaGarden = new LatLng(-0.9025449384394427, 119.87553441903246);
        mMap.addMarker(new MarkerOptions().position(HotelRamaGarden).title("Rama Garden Hotel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelRamaGarden));

        LatLng HotelSantika = new LatLng(-0.8959367895154056, 119.87192953016678);
        mMap.addMarker(new MarkerOptions().position(HotelSantika).title("Hotel Santika"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelSantika));

        LatLng HotelAndalas = new LatLng(-0.8857241723118002, 119.87021291642124);
        mMap.addMarker(new MarkerOptions().position(HotelAndalas).title("Hotel Andalas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelAndalas));

        LatLng HotelJazz = new LatLng(-0.9236050169923667, 119.88602328450928);
        mMap.addMarker(new MarkerOptions().position(HotelJazz).title("Hotel Jazz"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelJazz));

        LatLng HotelSwissBell = new LatLng(-0.8766786944177837, 119.83612194109682);
        mMap.addMarker(new MarkerOptions().position(HotelSwissBell).title("Swiss-Belhotel Silae"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelSwissBell));

        LatLng HotelPelangi = new LatLng(-0.882205532958907, 119.87939679995999);
        mMap.addMarker(new MarkerOptions().position(HotelPelangi).title("Hotel Pelangi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelPelangi));

        LatLng HotelBumiPalupi = new LatLng(-0.8949983402418726, 119.88376371224301);
        mMap.addMarker(new MarkerOptions().position(HotelBumiPalupi).title("Hotel Bumi Palupi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelBumiPalupi));

        LatLng HotelRajaAkas = new LatLng(-0.9205148813720094, 119.87801194109443);
        mMap.addMarker(new MarkerOptions().position(HotelRajaAkas).title("Hotel Raja Arkas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelRajaAkas));

        LatLng HotelAlamRaya = new LatLng(-0.9023017221745672, 119.85833335888552);
        mMap.addMarker(new MarkerOptions().position(HotelAlamRaya).title("Hotel Alam Raya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelAlamRaya));

        LatLng HotelPaluCity = new LatLng(-0.8980688630847219, 119.85975231778106);
        mMap.addMarker(new MarkerOptions().position(HotelPaluCity).title("Palu City Hotel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelPaluCity));

        LatLng HotelPaluGolden = new LatLng(-0.8833533816966727, 119.86769163976126);
        mMap.addMarker(new MarkerOptions().position(HotelPaluGolden).title("Palu Golden Hotel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelPaluGolden));

        LatLng HotelSutanRaja = new LatLng(-0.91868994037767, 119.89794182606538);
        mMap.addMarker(new MarkerOptions().position(HotelSutanRaja).title("Sutan Raja Hotel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelSutanRaja));

        LatLng HotelGajahMada = new LatLng(-0.8978719738035551, 119.863304754901);
        mMap.addMarker(new MarkerOptions().position(HotelGajahMada).title("Hotel Gajah Mada"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelGajahMada));

        LatLng HotelSentral = new LatLng(-0.9034946793261571, 119.87467498188704);
        mMap.addMarker(new MarkerOptions().position(HotelSentral).title("Hotel Sentral"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelSentral));

        LatLng HotelAramas = new LatLng(-0.912730199334166, 119.88420891072265);
        mMap.addMarker(new MarkerOptions().position(HotelAramas).title("Hotel Armas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotelAramas));


        //PolyLine dari myHome ke Hotel RedDoorz Tinggede
        mMap.addPolyline(new PolylineOptions().add(
                MyHome,
                new LatLng(-0.929967494599359, 119.87584848281129),
                new LatLng(-0.9305789576375485, 119.87588066931903),
                new LatLng(-0.9303429543722085, 119.87312335849023),
                new LatLng(-0.9291897563714288, 119.87305362105683),
                new LatLng(-0.9289224139218698, 119.87297158505471),
                HotelRedDoorzTinggede
        ).width(10)
                .color(Color.BLACK)
        );
    }
}