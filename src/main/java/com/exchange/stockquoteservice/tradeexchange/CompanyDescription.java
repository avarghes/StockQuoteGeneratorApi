package com.exchange.stockquoteservice.tradeexchange;

public class CompanyDescription {

    private String tickerSymbol;
    private String name;
    private String description;

    public CompanyDescription(String symbol,String name,String description){
        this.tickerSymbol = symbol;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getTickerSymbol() {
        return this.tickerSymbol;
    }
       
}