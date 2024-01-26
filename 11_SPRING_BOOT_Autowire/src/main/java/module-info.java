module anand_daily.anand_daily {
    requires javafx.controls;
    requires javafx.fxml;


    opens anand_daily.anand_daily to javafx.fxml;
    exports anand_daily.anand_daily;
}