package com.bright.travelitinerary.service;

import reactor.core.publisher.Mono;

public interface ItineraryAIService {
    //It returns a sequence of zero or one asynchronous result
    Mono<String> getItinerary(String origin, String destination, int numberOfDays, String preference);
}
