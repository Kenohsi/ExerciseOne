package at.ac.fhcampuswien.Enum;

public enum Language {
    ARABIC("ar"),
    GERMAN("de"),
    ENGLISH("en"),
    SPANISH("es"),
    FRENCH("fr"),
    HEBREW("he"),
    ITALIAN("it"),
    DUTCH("nl"),
    NORWEGIAN("no"),
    PORTUGUESE("pt"),
    RUSSIAN("ru"),
    SWEDISH("sv"),
    CHINESE("zh");

    public final String Languages;

    Language (String Languages) {

        this.Languages=Languages;
    }
}
