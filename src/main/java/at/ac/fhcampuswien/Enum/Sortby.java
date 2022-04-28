package at.ac.fhcampuswien.Enum;

public enum Sortby {
    RELEVANCY("relevancy"),
    POPULARITY("popularity"),
    PUBLISHEDAT("publishedAt");

    public final String sortby;

    Sortby (String sortby) {

        this.sortby=sortby;
    }
}
