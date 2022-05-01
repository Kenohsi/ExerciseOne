package at.ac.fhcampuswien.Enum;

public enum Endpoint {
    everything("everything"),
    topHeadlines("top-headlines");

    private final String Endpoints;

    Endpoint(String Endpoints) {

        this.Endpoints = Endpoints;
    }
    public String getEndpoints(){
        return Endpoints;
    }
}
