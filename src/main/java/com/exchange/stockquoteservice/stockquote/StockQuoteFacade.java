package com.exchange.stockquoteservice.stockquote;

import org.springframework.beans.factory.annotation.Autowired;
import com.exchange.stockquoteservice.stockquote.IStockQuoteService;
import com.exchange.stockquoteservice.tradeexchange.ITradeExchangeService;
import com.exchange.stockquoteservice.tradeexchange.CompanyDescription;
import com.exchange.stockquoteservice.stockquote.StockQuoteDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;

@Component
class StockQuoteFacade {

	private IStockQuoteService stockQuoteService;

	private ITradeExchangeService tradeExchangeService;

	@Autowired
	public StockQuoteFacade(IStockQuoteService stockQuoteService, ITradeExchangeService tradeExchangeService) {
		this.stockQuoteService = stockQuoteService;
		this.tradeExchangeService = tradeExchangeService;
	}

	public StockQuoteDTO lastTradedStockPriceInfo(String ticker, String exchange) {
		CompanyDescription companyDesc = tradeExchangeService.getTradedCompanyInfoByTickerName(ticker);

		StockQuoteDTO stockQuoteDTO = stockQuoteService.pullStockQuoteByTickerId(ticker);

		stockQuoteDTO.setDescription(companyDesc);

		return stockQuoteDTO;
	}

	public List<StockQuoteDTO> allTradedStockPriceInfo() {
		List<CompanyDescription> companydescList = tradeExchangeService.getAllTradedCompanyInfo();

		List<StockQuoteDTO> alltradedStockPrices = new ArrayList<StockQuoteDTO>();

		for (CompanyDescription companyInfo : companydescList) {
			StockQuoteDTO stockQuoteDTO = stockQuoteService.pullStockQuoteByTickerId(companyInfo.getTickerSymbol());

			stockQuoteDTO.setDescription(companyInfo);

			alltradedStockPrices.add(stockQuoteDTO);
		}

		return alltradedStockPrices;
	}

}