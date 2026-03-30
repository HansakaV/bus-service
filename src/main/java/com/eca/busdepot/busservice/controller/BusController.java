package com.eca.busdepot.busservice.controller;

import com.eca.busdepot.busservice.model.Bus;
import com.eca.busdepot.busservice.repository.BusRepository;
import com.eca.busdepot.busservice.service.StorageService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/buses")
public class BusController {

    private final BusRepository busRepository;
    private final StorageService storageService;

    // ✅ Constructor injection for Java 21 compliance
    public BusController(BusRepository busRepository, StorageService storageService) {
        this.busRepository = busRepository;
        this.storageService = storageService;
    }

    @GetMapping
    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    @PostMapping
    public Bus addBus(@RequestPart("bus") Bus bus, @RequestPart("image") MultipartFile image) throws IOException {
        String imageUrl = storageService.uploadFile(image);
        bus.setImageUrl(imageUrl);
        return busRepository.save(bus);
    }

    @DeleteMapping("/{id}")
    public void deleteBus(@PathVariable String id) {
        busRepository.deleteById(id);
    }
}