package at.technikum.tour_planner.viewmodel;

import at.technikum.tour_planner.event.Publisher;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SearchBarViewModel {
    private final Publisher publisher;
    private StringProperty searchText = new SimpleStringProperty("");
    private BooleanProperty disabledSearchButton = new SimpleBooleanProperty(true);

    public SearchBarViewModel(Publisher publisher) {
        this.publisher = publisher;
        // set disabledSearchButton true whenever searchText is empty or null.
        disabledSearchButton.bind(searchText.isEmpty().or(searchText.isNull()));
    }

    public StringProperty searchTextProperty() {
        return searchText;
    }

    public BooleanProperty searchButtonDisabledProperty() {
        return disabledSearchButton;
    }
}
