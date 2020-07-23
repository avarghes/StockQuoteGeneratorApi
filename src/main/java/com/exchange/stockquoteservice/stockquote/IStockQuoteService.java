package com.exchange.stockquoteservice.stockquote;

interface IStockQuoteService {

    public StockQuoteDTO pullStockQuoteByTickerId(String tickerId);

}