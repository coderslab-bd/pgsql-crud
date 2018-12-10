/**
 * 
 */
package com.coderslab.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.coderslab.model.RecordStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author zubayer
 *
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
@MappedSuperclass
@Access(AccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AbstractModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "companyCode", nullable = false, updatable = false)
	private String companyCode;

	@Column(name = "status", length = 1)
	@Enumerated(EnumType.STRING)
	private RecordStatus status;

	@Temporal(TemporalType.DATE)
	@Column(name = "createDate")
	private Date createDate;

	@Temporal(TemporalType.TIME)
	@Column(name = "createTime")
	private Date createTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "updateDate")
	private Date updateDate;

	@Temporal(TemporalType.TIME)
	@Column(name = "updateTime")
	private Date updateTime;

	@Version
	@Column(name = "versionNo")
	private long versionNo;

}
