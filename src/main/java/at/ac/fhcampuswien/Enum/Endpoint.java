package at.ac.fhcampuswien.Enum;

public enum Endpoint {
    EVERYTHING("everything"),
    TOP_HEADLINES("top-headlines");

    public final String Endpoints;

    Endpoint(String Endpoints) {

        this.Endpoints = Endpoints;
    }
}
