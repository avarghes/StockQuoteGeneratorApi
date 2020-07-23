package com.exchange.stockquoteservice.stockquote;

import org.springframework.stereotype.Component;

@Component
class StockQuoteSubSystemService implements IStockQuoteService {

    public StockQuoteDTO pullStockQuoteByTickerId(String tickerId){

      StockQuoteDTO stockQuoteDTO = RandomStockQuoteGenerator.generate(tickerId);
      return stockQuoteDTO;

    }
}