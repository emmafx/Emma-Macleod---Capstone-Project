package com.closingapp.closingsapp.data;

import com.closingapp.closingsapp.models.PropertyInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyInfoRepository extends CrudRepository<PropertyInformation, Integer> {
}
