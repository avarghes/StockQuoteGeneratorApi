package com.exchange.stockquoteservice.tradeexchange;

import com.exchange.stockquoteservice.tradeexchange.CompanyDescription;

import java.util.List;

public interface ITradeExchangeService {
	public CompanyDescription getTradedCompanyInfoByTickerName(String ticker);

	public List<CompanyDescription> getAllTradedCompanyInfo();
}