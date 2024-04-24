package Atividada4.apiGoogle.controller;

import Atividada4.apiGoogle.model.Coordinates;
import Atividada4.apiGoogle.service.GoogleMapsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private GoogleMapsService googleMapsService;

    @GetMapping("/address/geographic-location")
    public ResponseEntity<Coordinates> getGeographicLocation(@RequestParam String address) {
        Coordinates coordinates = googleMapsService.getCoordinates(address);
        if (coordinates != null) {
            return ResponseEntity.ok(coordinates);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
