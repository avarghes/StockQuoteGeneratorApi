package com.exchange.stockquoteservice.tradeexchange;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

final public class TradeExchange {

	public Map<String, CompanyDescription> stocksTradedOnExchange = null;

	public String exchangeName;

	public TradeExchange() {

		stocksTradedOnExchange = new HashMap<String, CompanyDescription>();

		// Initialized to the default listed stocks
		CompanyDescription description = new CompanyDescription("GOOG", "Alphabet Inc", "Search Engine Giant.");
		stocksTradedOnExchange.put(description.getTickerSymbol(), description);

		description = new CompanyDescription("APPLE", "Apple Inc", "Manufacturer of iPhones/Macs.");
		stocksTradedOnExchange.put(description.getTickerSymbol(), description);

		description = new CompanyDescription("GE", "General Electric Inc",
				"Industrial Behmoth (Jet Engines/Heavy Electricals)");
		stocksTradedOnExchange.put(description.getTickerSymbol(), description);

		description = new CompanyDescription("WALM", "Walmart Inc", "Retail Giant");
		stocksTradedOnExchange.put(description.getTickerSymbol(), description);

	}

	public TradeExchange(String exchangeName) {
		this();
		this.exchangeName = exchangeName;
	}

	public void addTicker(String ticker, CompanyDescription description) {
		stocksTradedOnExchange.put(ticker, description);
	}

	public boolean removeTicker(String ticker) {
		if (isTickerTraded(ticker)) {
			stocksTradedOnExchange.remove(ticker);
			return true;
		}

		return false;
	}

	public String getExchangeName() {
		return this.exchangeName;
	}

	public boolean isTickerTraded(String ticker) {
		return (stocksTradedOnExchange.get(ticker) != null);
	}

	public CompanyDescription lookupTicker(String ticker) {
		return stocksTradedOnExchange.get(ticker);
	}

	public List<CompanyDescription> allTradedTicker() {
		List<CompanyDescription> tradedTickerList = new ArrayList<CompanyDescription>();

		stocksTradedOnExchange.forEach((k, v) -> tradedTickerList.add(v));

		return tradedTickerList;
	}

}