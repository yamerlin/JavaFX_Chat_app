module com.example.tp_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp_javafx to javafx.fxml;
    exports com.example.tp_javafx;
}