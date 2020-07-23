package com.exchange.stockquoteservice.stockquote;

import java.util.List;

import com.exchange.stockquoteservice.stockquote.StockQuoteDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class StockQuoteGeneratorController {

	private StockQuoteFacade stockQuoteFacade;

	@Autowired
	public StockQuoteGeneratorController(StockQuoteFacade stockQuoteFacade) {
		this.stockQuoteFacade = stockQuoteFacade;
	}

	@GetMapping("/api/v1/stockquotes")
	public List<StockQuoteDTO> getStockQuotes() {
		List<StockQuoteDTO> stockQuoteList = stockQuoteFacade.allTradedStockPriceInfo();

		return stockQuoteList;

	}

	@GetMapping("/api/v1/stockquote/{ticker}/{exchange}")
	public StockQuoteDTO getStockQuote(@PathVariable("ticker") String tickerSymbol,
			@PathVariable("exchange") String exchange) {
		StockQuoteDTO stockQuoteDTO = stockQuoteFacade.lastTradedStockPriceInfo(tickerSymbol, exchange);

		return stockQuoteDTO;
	}

}