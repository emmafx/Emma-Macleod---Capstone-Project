package com.closingapp.closingsapp.data;

import com.closingapp.closingsapp.models.SellersInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellersInfoRepository extends CrudRepository<SellersInformation, Integer> {

}
