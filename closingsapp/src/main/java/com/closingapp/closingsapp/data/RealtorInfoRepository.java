package com.closingapp.closingsapp.data;

import com.closingapp.closingsapp.models.RealtorInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtorInfoRepository extends CrudRepository<RealtorInformation, Integer> {

}
