package com.exchange.stockquoteservice.util;

import java.time.LocalDate;
import java.util.Currency;
import java.util.Random;

import com.exchange.stockquoteservice.dto.StockQuoteDTO;

public class RandomStockQuoteGenerator {

    public static StockQuoteDTO generate(String tickerSymbol,String exchange) {

        StockQuoteDTO stockQuoteDTO = new StockQuoteDTO();

        Random randomPrice = new Random();

        Currency currency = Currency.getInstance("USD");

        stockQuoteDTO.setTickerSymbol(tickerSymbol);
        stockQuoteDTO.setClosingPrice(randomPrice.nextFloat());
        stockQuoteDTO.setOpenningPrice(randomPrice.nextFloat());
        stockQuoteDTO.setListedExchange(exchange);
        stockQuoteDTO.setCurrency(currency);
        stockQuoteDTO.setTradingDay(LocalDate.now());

        return stockQuoteDTO;
    }

}