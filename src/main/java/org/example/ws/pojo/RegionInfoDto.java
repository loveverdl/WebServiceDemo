package org.example.ws.pojo;

import javax.xml.bind.annotation.XmlElement;

public class RegionInfoDto {
	private Integer regionId;
	private String regionName;
	/**
	 * @return the fieldId
	 */
	@XmlElement(name = "region_id")
	public Integer getRegionId() {
		return regionId;
	}
	/**
	 * @param fieldId the fieldId to set
	 */
	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
	/**
	 * @return the fieldName
	 */
	@XmlElement(name = "region_name")
	public String getRegionName() {
		return regionName;
	}
	/**
	 * @param fieldName the fieldName to set
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

}