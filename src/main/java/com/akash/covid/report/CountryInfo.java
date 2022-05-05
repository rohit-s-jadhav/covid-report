package com.akash.covid.report;

/**
 *
 * @author akash
 */
class CountryInfo {

	private Long id;
	private String iso2;
	private String iso3;
	private Double lat;
	private Double _long;
	private String flag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIso2() {
		return iso2;
	}

	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}

	public String getIso3() {
		return iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLong() {
		return _long;
	}

	public void setLong(Double _long) {
		this._long = _long;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}
