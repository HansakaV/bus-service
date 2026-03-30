package com.eca.busdepot.busservice.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "buses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bus {
    @Id
    private String id;
    private String plateNumber;
    private String model;
    private int capacity;
    private String imageUrl;
}
