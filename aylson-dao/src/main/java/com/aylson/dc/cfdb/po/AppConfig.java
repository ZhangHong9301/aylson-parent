package com.aylson.dc.cfdb.po;

import java.io.Serializable;

public class AppConfig implements Serializable{

	private static final long serialVersionUID = -3614595731018009677L;
	
	private String id;			//主键
	private String logoUrl;		//广告图Url
	private String createDate;	//创建时间
	private String updateDate;	//更新时间
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
}
