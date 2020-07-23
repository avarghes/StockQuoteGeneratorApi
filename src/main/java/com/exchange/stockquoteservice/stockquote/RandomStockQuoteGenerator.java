package com.exchange.stockquoteservice.stockquote;

import java.time.LocalDate;
import java.util.Currency;
import java.util.Random;

import com.exchange.stockquoteservice.stockquote.StockQuoteDTO;

public class RandomStockQuoteGenerator {

	public static StockQuoteDTO generate(String tickerSymbol) {

		StockQuoteDTO stockQuoteDTO = new StockQuoteDTO();

		Random randomPrice = new Random();

		Currency currency = Currency.getInstance("USD");

		stockQuoteDTO.setClosingPrice(randomPrice.nextFloat());
		stockQuoteDTO.setOpenningPrice(randomPrice.nextFloat());
		stockQuoteDTO.setCurrency(currency);
		stockQuoteDTO.setTradingDay(LocalDate.now());

		return stockQuoteDTO;
	}

}