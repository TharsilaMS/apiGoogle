package Atividade4.apiGoogle.service;

import Atividada4.apiGoogle.Config.GoogleMapsConfig;
import Atividada4.apiGoogle.model.Coordinates;
import Atividada4.apiGoogle.response.Geometry;
import Atividada4.apiGoogle.response.GoogleMapsResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoogleMapsService {

    @Autowired
    private GoogleMapsConfig config;

    public Coordinates getCoordinates(String address) {
        String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" + address + "&key=" + config.getApiKey();
        RestTemplate restTemplate = new RestTemplate();
        GoogleMapsResponse response = restTemplate.getForObject(url, GoogleMapsResponse.class);
        if (response != null && response.getStatus().equals("OK") && response.getResults() != null && !response.getResults().isEmpty()) {
            Geometry geometry = response.getResults().get(0).getGeometry();
            double lat = geometry.getLocation().getLat();
            double lng = geometry.getLocation().getLng();
            return new Coordinates(lat, lng);
        } else {
            return null;
        }
    }
}
