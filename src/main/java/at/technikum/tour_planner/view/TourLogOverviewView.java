package at.technikum.tour_planner.view;

import at.technikum.tour_planner.entity.TourLogModel;
import at.technikum.tour_planner.viewmodel.TourLogOverviewViewModel;
import at.technikum.tour_planner.viewmodel.ToursTabViewModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class TourLogOverviewView implements Initializable {
    private final TourLogOverviewViewModel tourLogOverviewViewModel = TourLogOverviewViewModel.getInstance();
    @FXML
    public ListView<TourLogModel> tourLogList;

    /*public TourLogOverviewView(TourLogOverviewViewModel tourLogOverviewViewModel) {
        this.tourLogOverviewViewModel = tourLogOverviewViewModel;
    }*/

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.tourLogList.setItems(tourLogOverviewViewModel.getTourLogs());
        this.tourLogOverviewViewModel.selectedTourLogIndexProperty().bind(tourLogList.getSelectionModel().selectedIndexProperty());
    }
}
