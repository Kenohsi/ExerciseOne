package at.ac.fhcampuswien.Enum;

public enum Category {
    BUSINESS("business"),
    ENTERTAINMENT("entertainment"),
    GENERAL("general"),
    HEALTH("health"),
    SCIENCE("science"),
    SPORTS("sports"),
    TECHNOLOGY("technology");

    public final String Categories;

    Category (String Categories) {

        this.Categories=Categories;
    }
}
