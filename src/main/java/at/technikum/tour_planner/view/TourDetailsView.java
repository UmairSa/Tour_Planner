package at.technikum.tour_planner.view;

import at.technikum.tour_planner.entity.Tour;
import at.technikum.tour_planner.viewmodel.TourDetailsViewModel;
import at.technikum.tour_planner.viewmodel.ToursTabViewModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TourDetailsView implements Initializable {

    private final ObservableList<String> transList = FXCollections.observableArrayList("Car", "Walk", "Bicycle");
    private final TourDetailsViewModel tourDetailsViewModel;

    @FXML
    private TextField tourName;
    @FXML
    private TextField tourDesc;
    @FXML
    private TextField from;
    @FXML
    private TextField to;
    @FXML
    private ChoiceBox<String> transportType;
    @FXML
    private Button addButton;
    @FXML
    protected void onAddTour() {
        Tour newTour = tourDetailsViewModel.createTour();
        ToursTabViewModel.getInstance().addTour(newTour);
        clearFormFields();
    }
    private void clearFormFields() {
        tourName.clear();
        tourDesc.clear();
        from.clear();
        to.clear();
        transportType.getSelectionModel().selectFirst();
    }

    public TourDetailsView() {
        this.tourDetailsViewModel = new TourDetailsViewModel();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bindProperties();
        transportType.getItems().addAll(transList);
        transportType.getSelectionModel().selectFirst();
        addButton.disableProperty().bind(tourDetailsViewModel.addButtonDisabledProperty());

    }

    public void bindProperties() {
        tourName.textProperty().bindBidirectional(tourDetailsViewModel.tourNameProperty());
        from.textProperty().bindBidirectional(tourDetailsViewModel.fromProperty());
        to.textProperty().bindBidirectional(tourDetailsViewModel.toProperty());
        tourDesc.textProperty().bindBidirectional(tourDetailsViewModel.tourDescriptionProperty());
    }
}
