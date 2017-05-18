package io.plugin.geofence;

/**
 * Created by Gary Paluk on 17/05/2017.
 */

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;


public class Constants {

    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS = 12 * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 50;

    public static final HashMap<String, LatLng> LANDMARKS = new HashMap<String, LatLng>();
    static {
        // San Francisco International Airport.
        LANDMARKS.put("Moscone South", new LatLng(37.783888,-122.4009012));

        // Googleplex.
        LANDMARKS.put("Japantown", new LatLng(37.785281,-122.4296384));


        // Bluebeck office
        LANDMARKS.put("Bluebeck Office", new LatLng(53.257321, -2.121993));

        // Home
        LANDMARKS.put("Home", new LatLng(18.911045, 98.948657));
    }
}