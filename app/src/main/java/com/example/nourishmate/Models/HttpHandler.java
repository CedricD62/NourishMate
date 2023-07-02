package com.example.nourishmate.Models;

import android.content.Context;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Optional;

public class HttpHandler {
    private static final String TAG = HttpHandler.class.getSimpleName();
    public HttpHandler() {
    }

    public String makeServiceCall(String reqUrl, Optional<Context> activity) {
        String response = null;
        try {
            URL url = new URL(reqUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            InputStream in = new BufferedInputStream(conn.getInputStream());
            response = convertStreamToString(in, activity);
        } catch (MalformedURLException e) {
            AlertDialogs.displayInformationToUser( false, true,
            "Récupération informations produit", "Une erreur liée à la requête API a eut lieu",
                    Optional.empty(), Optional.empty(), activity);
        } catch (ProtocolException e) {
            AlertDialogs.displayInformationToUser( false, true,
            "Récupération informations produit",
             "Une erreur liée au protocol d'appel API est survenue lors de la récupération des informations ",
                    Optional.empty(), Optional.empty(), activity);
        } catch (IOException e) {
            AlertDialogs.displayInformationToUser( false, true,
                    "Récupération informations produit",
                    "Une erreur liée au système Android survenue lors de la récupération des informations ",
                    Optional.empty(), Optional.empty(), activity);
        } catch (Exception e) {
            AlertDialogs.displayInformationToUser( false, true,
                    "Récupération informations produit",
                    "Une erreur inconnue à eut lieu : " + e.getMessage(),
                    Optional.empty(), Optional.empty(), activity);
        }
        return response;
    }

    private String convertStreamToString(InputStream is, Optional<Context> activity) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');
            }
        } catch (IOException e) {
            AlertDialogs.displayInformationToUser( false, true,
                    "Récupération informations produit",
                    "Une erreur est survenue lors de la récupération des informations ",
                    Optional.empty(), Optional.empty(), activity);
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                AlertDialogs.displayInformationToUser( false, true,
                        "Récupération informations produit",
                        "Une erreur est survenue lors de la récupération des informations ",
                        Optional.empty(), Optional.empty(), activity);
            }
        }
        return sb.toString();
    }
}
