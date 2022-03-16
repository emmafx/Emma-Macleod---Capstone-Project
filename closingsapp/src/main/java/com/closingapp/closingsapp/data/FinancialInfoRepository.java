package com.closingapp.closingsapp.data;

import com.closingapp.closingsapp.models.FinancialInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialInfoRepository extends CrudRepository<FinancialInformation, Integer> {

}
