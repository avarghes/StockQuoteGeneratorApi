package com.exchange.stockquoteservice.controller;

import java.util.ArrayList;
import java.util.List;

import com.exchange.stockquoteservice.dto.StockQuoteDTO;
import com.exchange.stockquoteservice.util.RandomStockQuoteGenerator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockQuoteGeneratorController {

   @GetMapping("/stockquotes")
   public List<StockQuoteDTO> getStockQuotes() {
      List <StockQuoteDTO> stockQuoteList = new ArrayList<StockQuoteDTO>();

      StockQuoteDTO stockQuoteDTO = RandomStockQuoteGenerator.generate("GOOG", "NASDAQ");
      stockQuoteList.add(stockQuoteDTO);

      return stockQuoteList;

   }

   @GetMapping("/stockquote/{ticker}/{exchange}")
   public StockQuoteDTO getStockQuote(@PathVariable("ticker") String tickerSymbol,@PathVariable("exchange") String exchange) {
      StockQuoteDTO stockQuoteDTO = RandomStockQuoteGenerator.generate(tickerSymbol,exchange);
      return stockQuoteDTO;
   }

}