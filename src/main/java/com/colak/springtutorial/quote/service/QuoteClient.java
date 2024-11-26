package com.colak.springtutorial.quote.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuoteClient {

    public void processQuotes() {
        WebClient webClient = WebClient.create("http://localhost:8080/api/v1/quote");
        webClient
                .get()
                .uri("/getQuotes")
                .retrieve()
                .bodyToFlux(String.class)
                .subscribe(data -> System.out.println("Received data : " + data));

    }
}
