package com.exchange.stockquoteservice.tradeexchange;

import com.exchange.stockquoteservice.tradeexchange.TradeExchange;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Component
public class TradeExchangeSubSystemService implements ITradeExchangeService
 {

   private TradeExchange tradeExchange;

   @Autowired
   public TradeExchangeSubSystemService(TradeExchange tradeExchange){
       this.tradeExchange = tradeExchange;
   }
    
   public CompanyDescription getTradedCompanyInfoByTickerName(String ticker){
       return tradeExchange.lookupTicker(ticker);
   }

   public List<CompanyDescription> getAllTradedCompanyInfo(){
      return tradeExchange.allTradedTicker();
   }

   public String getExchangeName(){
      return tradeExchange.getExchangeName();
   }
}