package org.example.ws.bean;

// default package
// Generated 2013-5-15 12:37:00 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Picture generated by hbm2java
 */
@Entity
@Table(name = "picture", catalog = "shixun")
public class Picture implements java.io.Serializable {

	private int pictId;
	private String file;
	private Integer name;
	private Integer pictureSetId;
	private Set commercials = new HashSet(0);

	public Picture() {
	}

	public Picture(int pictId) {
		this.pictId = pictId;
	}

	public Picture(int pictId, String file, Integer name, Integer pictureSetId,
			Set commercials) {
		this.pictId = pictId;
		this.file = file;
		this.name = name;
		this.pictureSetId = pictureSetId;
		this.commercials = commercials;
	}

	@Id
	@Column(name = "pict_id", unique = true, nullable = false)
	public int getPictId() {
		return this.pictId;
	}

	public void setPictId(int pictId) {
		this.pictId = pictId;
	}

	@Column(name = "file", length = 100)
	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	@Column(name = "name")
	public Integer getName() {
		return this.name;
	}

	public void setName(Integer name) {
		this.name = name;
	}

	@Column(name = "pictureSet_id")
	public Integer getPictureSetId() {
		return this.pictureSetId;
	}

	public void setPictureSetId(Integer pictureSetId) {
		this.pictureSetId = pictureSetId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "picture")
	public Set getCommercials() {
		return this.commercials;
	}

	public void setCommercials(Set commercials) {
		this.commercials = commercials;
	}

}
