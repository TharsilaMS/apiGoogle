package Atividada4.apiGoogle.response;

import java.util.List;
public class GoogleMapsResponse {
        private List<GoogleMapsResult> results;
        private String status;

        public List<GoogleMapsResult> getResults() {
            return results;
        }

        public void setResults(List<GoogleMapsResult> results) {
            this.results = results;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

