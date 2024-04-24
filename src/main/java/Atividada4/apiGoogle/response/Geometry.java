package Atividada4.apiGoogle.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.parsing.Location;
@Getter
@Setter
public class Geometry {
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Getter
    @Setter
    public class Location {
        private double lat;
        private double lng;

        public Location() {
        }

        public Location(double lat, double lng) {
            this.lat = lat;
            this.lng = lng;
        }
    }
}


