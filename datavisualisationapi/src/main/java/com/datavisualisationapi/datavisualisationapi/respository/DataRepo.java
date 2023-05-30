package com.datavisualisationapi.datavisualisationapi.respository;


import java.sql.Date;
//import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.datavisualisationapi.datavisualisationapi.model.DataVisualisation;

@Repository
@EnableJpaRepositories
public interface  DataRepo extends JpaRepository<DataVisualisation,Integer>{

		List<DataVisualisation> findAll();

		List<DataVisualisation> findByStateAndGenderAndAgeg(String state, String gender,
				String ageg);
		
		List<DataVisualisation> findByDateBetween(Date startDate, Date endDate);

		List<DataVisualisation> findByAgeBetween(int startAge, int endAge);

		List<DataVisualisation> findByStateAndDistrictAndTypeAndDateBetweenAndAgeBetween(String state,String district,
				String type, Date startDate, Date endDate, int startAge, int endAge);
}
