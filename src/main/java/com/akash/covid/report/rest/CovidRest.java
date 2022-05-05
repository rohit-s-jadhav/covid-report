package com.akash.covid.report.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.akash.covid.report.CovidFinalResponse;
import com.akash.covid.report.CovidResponse;
import com.google.gson.Gson;

@RestController
public class CovidRest {

	@Autowired
	private Gson gson;

	public static final String COVID_URL = "https://corona.lmao.ninja/v2/countries?yesterday=&sort=\"";

	@GetMapping("/get-covid-data")
	public CovidFinalResponse getCovidData() {
		CovidFinalResponse covidFinalResponse = callCovidAPI();
		System.out.println("Response from API :: " + gson.toJson(covidFinalResponse));
		return covidFinalResponse;
	}

	private CovidFinalResponse callCovidAPI() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<CovidResponse[]> response = restTemplate.getForEntity(COVID_URL, CovidResponse[].class);
		CovidResponse[] covidResponse = response.getBody();
		List<CovidResponse> covidResponseList = Arrays.asList(covidResponse);
		CovidFinalResponse covidFinalResponse = new CovidFinalResponse();
		covidFinalResponse.setCovidResponseList(covidResponseList);
		return covidFinalResponse;
	}

}
