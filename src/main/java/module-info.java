module at.technikum.tour_planner {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.technikum.tour_planner to javafx.fxml;
    exports at.technikum.tour_planner;
}