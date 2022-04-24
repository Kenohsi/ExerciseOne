module com.example.exerasixc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires com.google.gson;
    requires okhttp3;


    exports at.ac.fhcampuswien.Enum;
    opens at.ac.fhcampuswien.Enum to javafx.fxml;


    opens at.ac.fhcampuswien to javafx.fxml;
    exports at.ac.fhcampuswien;
}