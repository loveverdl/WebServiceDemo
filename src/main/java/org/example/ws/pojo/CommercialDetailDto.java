package org.example.ws.pojo;

import java.io.Serializable;
import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "commercialdetail")
public class CommercialDetailDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 商铺ID
	 */
	private Integer commId;

	/**
	 * 商铺图片路径
	 */
	private String pictUrl;

	/**
	 * 商铺名称
	 */
	private String name;

	/**
	 * 一级类别
	 */
	private String kind1;

	/**
	 * 二级类别
	 */
	private String kind2;

	/**
	 * 预算
	 */
	private Integer budget;

	/**
	 * 可否刷卡
	 */
	private Boolean isCardSupported;

	/**
	 * 可否抽烟
	 */
	private Boolean isSmokeEnable;

	/**
	 * 日语
	 */
	private Boolean isJapanese;

	/**
	 * 开发票
	 */
	private Boolean isIvoiceSupported;

	/**
	 * 是否所有wifi
	 */
	private Boolean isWifiSupported;

	/**
	 * 是否有包间
	 */
	private Boolean isPrivateRoomEnabled;

	/**
	 * 商铺名称
	 */
	private String address;

	/**
	 * 电话号码
	 */
	private Collection<PhoneNumberDto> phonenumbers;

	/**
	 * 一级地区名称
	 */
	private String region1;

	/**
	 * 二级地区名称
	 */
	private String region2;

	private String opentime;

	private String closetime;

	private Double latitude;

	private Double longitude;

	private Collection<CouponDto> coupons;

	private Collection<PictureSetDto> pictureSets;

	public Integer getCommId() {
		return commId;
	}

	public void setCommId(Integer commId) {
		this.commId = commId;
	}

	public String getPictUrl() {
		return pictUrl;
	}

	public void setPictUrl(String pictUrl) {
		this.pictUrl = pictUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind1() {
		return kind1;
	}

	public void setKind1(String kind1) {
		this.kind1 = kind1;
	}

	public String getKind2() {
		return kind2;
	}

	public void setKind2(String kind2) {
		this.kind2 = kind2;
	}

	public Integer getBudget() {
		return budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}

	public Boolean getIsCardSupported() {
		return isCardSupported;
	}

	public void setIsCardSupported(Boolean isCardSupported) {
		this.isCardSupported = isCardSupported;
	}

	public Boolean getIsSmokeEnable() {
		return isSmokeEnable;
	}

	public void setIsSmokeEnable(Boolean isSmokeEnable) {
		this.isSmokeEnable = isSmokeEnable;
	}

	public Boolean getIsJapanese() {
		return isJapanese;
	}

	public void setIsJapanese(Boolean isJapanese) {
		this.isJapanese = isJapanese;
	}

	public Boolean getIsIvoiceSupported() {
		return isIvoiceSupported;
	}

	public void setIsIvoiceSupported(Boolean isIvoiceSupported) {
		this.isIvoiceSupported = isIvoiceSupported;
	}

	public Boolean getIsWifiSupported() {
		return isWifiSupported;
	}

	public void setIsWifiSupported(Boolean isWifiSupported) {
		this.isWifiSupported = isWifiSupported;
	}

	public Boolean getIsPrivateRoomEnabled() {
		return isPrivateRoomEnabled;
	}

	public void setIsPrivateRoomEnabled(Boolean isPrivateRoomEnabled) {
		this.isPrivateRoomEnabled = isPrivateRoomEnabled;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegion1() {
		return region1;
	}

	public void setRegion1(String region1) {
		this.region1 = region1;
	}

	public String getRegion2() {
		return region2;
	}

	public void setRegion2(String region2) {
		this.region2 = region2;
	}

	public Collection<CouponDto> getCoupons() {
		return coupons;
	}

	public void setCoupons(Collection<CouponDto> coupons) {
		this.coupons = coupons;
	}

	public Collection<PictureSetDto> getPictureSets() {
		return pictureSets;
	}

	public void setPictureSets(Collection<PictureSetDto> pictureSets) {
		this.pictureSets = pictureSets;
	}

	public Collection<PhoneNumberDto> getPhonenumbers() {
		return phonenumbers;
	}

	public void setPhonenumbers(Collection<PhoneNumberDto> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}

	public String getOpentime() {
		return opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}

	public String getClosetime() {
		return closetime;
	}

	public void setClosetime(String closetime) {
		this.closetime = closetime;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}
