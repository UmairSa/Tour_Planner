package at.technikum.tour_planner.entity;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Tour {
    private final StringProperty name;
    private final StringProperty description;
    private final StringProperty from;
    private final StringProperty to;
    private final StringProperty transportType;

    public Tour(String name, String description, String origin, String destination, String transportType) {
        this.name = new SimpleStringProperty(name);
        this.description = new SimpleStringProperty(description);
        this.from = new SimpleStringProperty(origin);
        this.to = new SimpleStringProperty(destination);
        this.transportType = new SimpleStringProperty(transportType);
    }

    //Getters
    public String getName() {
        return name.get();
    }
    public String getDescription() {
        return description.get();
    }
    public String getOrigin() {
        return from.get();
    }
    public String getDestination() {
        return to.get();
    }
    public String getTransportType() { return transportType.get(); }

    //Setters
    public void setName(String name) {
        this.name.set(name);
    }
    public void setDescription(String description) {
        this.description.set(description);
    }
    public void setOrigin(String origin) {
        this.from.set(origin);
    }
    public void setDestination(String destination) {
        this.to.set(destination);
    }
    public void setTransportType(String transportType) { this.transportType.set(transportType); }



    //property methods
    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public StringProperty originProperty() {
        return from;
    }

    public StringProperty destinationProperty() { return to; }

    public StringProperty transportTypeProperty() { return transportType; }
}