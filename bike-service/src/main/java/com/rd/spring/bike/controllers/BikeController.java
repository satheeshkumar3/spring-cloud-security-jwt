package com.rd.spring.bike.controllers;

import com.rd.spring.bike.model.BikeResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bike")
public class BikeController {

    @GetMapping
    public ResponseEntity<List<BikeResponse>> getCars() {
        List<BikeResponse> bikes = new ArrayList<>();
        bikes.add(new BikeResponse("1", "RTR 160"));
        return ResponseEntity.ok(bikes);
    }

}
