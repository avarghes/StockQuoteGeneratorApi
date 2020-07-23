package com.exchange.stockquoteservice.tradeexchange;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.beans.factory.annotation.Value;

@Configuration
class TradeExchangeConfig {

    @Value("${traded.exchange.name}")
    private String exchangeName;
  
    @Bean
    public TradeExchange getTradeExchange(){
        return new TradeExchange("NASDAQ");
    }
}