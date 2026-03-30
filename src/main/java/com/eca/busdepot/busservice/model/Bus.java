package com.eca.busdepot.busservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "buses")
public class Bus {
    @Id
    private String id;
    private String plateNumber;
    private String model;
    private int capacity;
    private String imageUrl;

    public Bus() {}

    public Bus(String id, String plateNumber, String model, int capacity, String imageUrl) {
        this.id = id;
        this.plateNumber = plateNumber;
        this.model = model;
        this.capacity = capacity;
        this.imageUrl = imageUrl;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getPlateNumber() { return plateNumber; }
    public void setPlateNumber(String plateNumber) { this.plateNumber = plateNumber; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
