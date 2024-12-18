package com.rd.spring.bike.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BikeResponse {

    private final String bikeId;
    private final String bikeName;

}
