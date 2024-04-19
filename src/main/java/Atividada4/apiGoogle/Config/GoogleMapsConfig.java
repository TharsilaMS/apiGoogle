package Atividada4.apiGoogle.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class GoogleMapsConfig {

        @Value("${app.google-maps.api-key}")
        private String apiKey;

        public String getApiKey() {
            return apiKey;
        }
    }


