package com.colak.springtutorial.quote.external.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/v1/quote")
public class QuoteController {

    // http://localhost:8080/api/v1/quote/getQuotes

    // With TEXT_EVENT_STREAM_VALUE: The server sends each item in the Flux as a separate event, ensuring proper streaming.
    @GetMapping(path = "getQuotes" , produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> getQuotes() {
        List<String> list = List.of("quote1", "quote2");
        return Flux.fromIterable(list);
    }
}
