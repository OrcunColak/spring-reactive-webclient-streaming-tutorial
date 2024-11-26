package com.colak.springtutorial.quote.controller;

import com.colak.springtutorial.quote.service.QuoteClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/quoteclient")
@RequiredArgsConstructor
public class QuoteClientController {

    private final QuoteClient quoteClient;

    // http://localhost:8080/api/v1/quoteclient/getQuotesByWebFlux
    @GetMapping(path = "getQuotesByWebFlux")
    public void getQuotesByWebFlux() {
        quoteClient.processQuotes();
    }

}
