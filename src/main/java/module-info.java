module com.example.exerasixc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires com.google.gson;
    requires okhttp3;
    requires javafx.graphics;



    exports at.ac.fhcampuswien;
    exports at.ac.fhcampuswien.Enum;
    opens at.ac.fhcampuswien.Enum to com.google.gson, javafx.fxml;
    opens at.ac.fhcampuswien to javafx.fxml, com.google.gson;
}