package com.datavisualisationapi.datavisualisationapi.controller;


import java.sql.Date;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datavisualisationapi.datavisualisationapi.model.DataVisualisation;
import com.datavisualisationapi.datavisualisationapi.respository.DataRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DataController {
	

		@Autowired
		DataRepo datarepo;
		
		//http://localhost:8088/api/data
		@GetMapping("/data")
		public ResponseEntity<List<DataVisualisation>> getAllDataVisualisation() {
			
				List<DataVisualisation> alldata = new ArrayList<DataVisualisation>();
				datarepo.findAll().forEach(alldata::add);
				return new ResponseEntity<>(alldata, HttpStatus.OK);
			
		}
		
		
//		//http://localhost:8080/api/data/stateandgenderandageg?state=Jharkhand&gender=Male&ageg=<5
//		@GetMapping("/data/stateandgenderandageg")
//		public ResponseEntity<List<DataVisualisation>> getDataVisualisationByStateAndGenderAndAgeg(@RequestParam String state,@RequestParam String gender, @RequestParam String ageg) {
//					
//			List<DataVisualisation> alldata = new ArrayList<DataVisualisation>();
//			datarepo.findByStateAndGenderAndAgeg( state,  gender, ageg).forEach(alldata::add);
//			
//				return new ResponseEntity<List<DataVisualisation>>(alldata, HttpStatus.OK);
//			
//		}
		
		
//		//http://localhost:8088/api/data/date?startDate=2023-05-16&endDate=2023-05-19
//		@GetMapping("/data/date")
//		public ResponseEntity<List<DataVisualisation>> getDataVisualisationByDate (@RequestParam Date startDate,
//																	@RequestParam Date endDate) {
//			List<DataVisualisation> alldata = new ArrayList<DataVisualisation>();
//			datarepo.findByDateBetween(startDate, endDate).forEach(alldata::add);
//			return new ResponseEntity<List<DataVisualisation>>(alldata, HttpStatus.OK);
//		}
//	
//		//http://localhost:8088/api/data/age?startAge=6&endAge=12
//				@GetMapping("/data/age")
//				public ResponseEntity<List<DataVisualisation>> getDataVisualisationByAge(@RequestParam  int startAge,
//						@RequestParam int endAge) {
//							
//					List<DataVisualisation> alldata = new ArrayList<DataVisualisation>();
//					datarepo.findByAgeBetween(startAge, endAge).forEach(alldata::add);
//					
//						return new ResponseEntity<List<DataVisualisation>>(alldata, HttpStatus.OK);
//					
//				}
				
//http://localhost:8088/api/selected?state=Bihar&gender=Male&type=PKDL&startDate=2023-05-03&endDate=2023-05-19&startAge=6&endAge=12
		
//				@GetMapping("/selected")
//				public ResponseEntity<List<DataVisualisation>> getDataVisualisationByStateAndGenderAndTypeAndDateAndAge(@RequestParam String state,
//						@RequestParam String gender, 
//						@RequestParam String type,
//						@RequestParam  Date startDate,
//						@RequestParam Date endDate,
//						@RequestParam  int startAge,
//						@RequestParam int endAge) {
//					List<DataVisualisation> alldata = new ArrayList<DataVisualisation>();
//					datarepo.findByStateAndGenderAndTypeAndDateBetweenAndAgeBetween(state, gender, type, startDate, endDate, startAge, endAge ).forEach(alldata::add);
//
//					return new ResponseEntity<List<DataVisualisation>>(alldata, HttpStatus.OK);
//
//				}
//				
		//http://localhost:8088/api/selected?state=Bihar&district=Begusarai&type=PKDL&startDate=2023-05-03&endDate=2023-05-19&startAge=6&endAge=12

		@GetMapping("/selected")
		public ResponseEntity<List<DataVisualisation>> getDataVisualisationByStateAndDistrictAndTypeAndDateAndAge(@RequestParam String state,
				@RequestParam String district,
				@RequestParam String type,
				@RequestParam  Date startDate,
				@RequestParam Date endDate,
				@RequestParam  int startAge,
				@RequestParam int endAge) {
			List<DataVisualisation> alldata = new ArrayList<DataVisualisation>();
			datarepo.findByStateAndDistrictAndTypeAndDateBetweenAndAgeBetween(state,district, type, startDate, endDate, startAge, endAge ).forEach(alldata::add);

			return new ResponseEntity<List<DataVisualisation>>(alldata, HttpStatus.OK);

		}		

}
