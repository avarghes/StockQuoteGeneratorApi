package com.exchange.stockquoteservice.stockquote;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Currency;

public class StockQuoteDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 4692599796495022505L;

    private String tickerSymbol;

    private float openningPrice;

    private float closingPrice;

    private String listedExchange;

    private Currency currency;

    private LocalDate tradingDay;

    public String getTickerSymbol() {
        return this.tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public float getOpenningPrice() {
        return this.openningPrice;
    }

    public void setOpenningPrice(float openningPrice) {
        this.openningPrice = openningPrice;
    }

    public float getClosingPrice() {
        return this.closingPrice;
    }

    public void setClosingPrice(float closingPrice) {
        this.closingPrice = closingPrice;
    }

    public String getListedExchange() {
        return this.listedExchange;
    }

    public void setListedExchange(String listedExchange) {
        this.listedExchange = listedExchange;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public LocalDate getTradingDay() {
        return this.tradingDay;
    }

    public void setTradingDay(LocalDate tradingDay) {
        this.tradingDay = tradingDay;
    }

}