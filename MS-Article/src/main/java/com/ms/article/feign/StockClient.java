package com.ms.article.feign;

import com.ms.article.dto.StockDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "stock-service", url = "http://localhost:8080/stocks")
public interface StockClient {
    @GetMapping("/{id}")
    StockDto getStockById(@PathVariable("id") String id);
}
