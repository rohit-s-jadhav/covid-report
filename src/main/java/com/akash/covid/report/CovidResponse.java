package com.akash.covid.report;

/**
 *
 * @author akash
 */
public class CovidResponse {

	private Long updated;
	private String country;
	private CountryInfo countryInfo;
	private Long cases;
	private Long todayCases;
	private Long deaths;
	private Long todayDeaths;
	private Long recovered;
	private Long todayRecovered;
	private Long active;
	private Long critical;
	private Double casesPerOneMillion;
	private Double deathsPerOneMillion;
	private Long tests;
	private Double testsPerOneMillion;
	private Long population;
	private String continent;
	private Double oneCasePerPeople;
	private Double oneDeathPerPeople;
	private Double oneTestPerPeople;
	private Double activePerOneMillion;
	private Double recoveredPerOneMillion;
	private Double criticalPerOneMillion;

	public Long getUpdated() {
		return updated;
	}

	public void setUpdated(Long updated) {
		this.updated = updated;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public CountryInfo getCountryInfo() {
		return countryInfo;
	}

	public void setCountryInfo(CountryInfo countryInfo) {
		this.countryInfo = countryInfo;
	}

	public Long getCases() {
		return cases;
	}

	public void setCases(Long cases) {
		this.cases = cases;
	}

	public Long getTodayCases() {
		return todayCases;
	}

	public void setTodayCases(Long todayCases) {
		this.todayCases = todayCases;
	}

	public Long getDeaths() {
		return deaths;
	}

	public void setDeaths(Long deaths) {
		this.deaths = deaths;
	}

	public Long getTodayDeaths() {
		return todayDeaths;
	}

	public void setTodayDeaths(Long todayDeaths) {
		this.todayDeaths = todayDeaths;
	}

	public Long getRecovered() {
		return recovered;
	}

	public void setRecovered(Long recovered) {
		this.recovered = recovered;
	}

	public Long getTodayRecovered() {
		return todayRecovered;
	}

	public void setTodayRecovered(Long todayRecovered) {
		this.todayRecovered = todayRecovered;
	}

	public Long getActive() {
		return active;
	}

	public void setActive(Long active) {
		this.active = active;
	}

	public Long getCritical() {
		return critical;
	}

	public void setCritical(Long critical) {
		this.critical = critical;
	}

	public Double getCasesPerOneMillion() {
		return casesPerOneMillion;
	}

	public void setCasesPerOneMillion(Double casesPerOneMillion) {
		this.casesPerOneMillion = casesPerOneMillion;
	}

	public Double getDeathsPerOneMillion() {
		return deathsPerOneMillion;
	}

	public void setDeathsPerOneMillion(Double deathsPerOneMillion) {
		this.deathsPerOneMillion = deathsPerOneMillion;
	}

	public Long getTests() {
		return tests;
	}

	public void setTests(Long tests) {
		this.tests = tests;
	}

	public Double getTestsPerOneMillion() {
		return testsPerOneMillion;
	}

	public void setTestsPerOneMillion(Double testsPerOneMillion) {
		this.testsPerOneMillion = testsPerOneMillion;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public Double getOneCasePerPeople() {
		return oneCasePerPeople;
	}

	public void setOneCasePerPeople(Double oneCasePerPeople) {
		this.oneCasePerPeople = oneCasePerPeople;
	}

	public Double getOneDeathPerPeople() {
		return oneDeathPerPeople;
	}

	public void setOneDeathPerPeople(Double oneDeathPerPeople) {
		this.oneDeathPerPeople = oneDeathPerPeople;
	}

	public Double getOneTestPerPeople() {
		return oneTestPerPeople;
	}

	public void setOneTestPerPeople(Double oneTestPerPeople) {
		this.oneTestPerPeople = oneTestPerPeople;
	}

	public Double getActivePerOneMillion() {
		return activePerOneMillion;
	}

	public void setActivePerOneMillion(Double activePerOneMillion) {
		this.activePerOneMillion = activePerOneMillion;
	}

	public Double getRecoveredPerOneMillion() {
		return recoveredPerOneMillion;
	}

	public void setRecoveredPerOneMillion(Double recoveredPerOneMillion) {
		this.recoveredPerOneMillion = recoveredPerOneMillion;
	}

	public Double getCriticalPerOneMillion() {
		return criticalPerOneMillion;
	}

	public void setCriticalPerOneMillion(Double criticalPerOneMillion) {
		this.criticalPerOneMillion = criticalPerOneMillion;
	}
}
