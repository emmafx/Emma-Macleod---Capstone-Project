package com.closingapp.closingsapp.data;

import com.closingapp.closingsapp.models.BuyersInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyersInfoRepository extends CrudRepository<BuyersInformation, Integer> {
}
