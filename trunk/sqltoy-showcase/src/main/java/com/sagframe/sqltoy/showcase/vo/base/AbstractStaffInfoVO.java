/**
 *@Generated by sagacity-quickvo 4.0
 */
package com.sagframe.sqltoy.showcase.vo.base;

import java.io.Serializable;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * @project sqltoy-showcase
 * @version 1.0.0
 * Table: sqltoy_staff_info,Remark:员工信息表   
 */
@Entity(tableName="sqltoy_staff_info",pk_constraint="PRIMARY")
public abstract class AbstractStaffInfoVO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //staffId,staffCode,staffName,organId,sexType,birthday,entryDate,termDate,photo,country,censusRegister,address,email,telNo,post,postGrade,createBy,createTime,updateBy,updateTime,status
	 
	 //not null properties
	 //staffId,staffCode,staffName,organId,sexType,entryDate,createBy,createTime,updateBy,updateTime,status

	/**
	 * 
	 */
	private static final long serialVersionUID = 6555146524698728551L;
	
	/**
	 * 员工ID
	 */
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugin.id.DefaultIdGenerator")
	@Column(name="STAFF_ID",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String staffId;
	
	/**
	 * 工号
	 */
	@Column(name="STAFF_CODE",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String staffCode;
	
	/**
	 * 姓名
	 */
	@Column(name="STAFF_NAME",length=30L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String staffName;
	
	/**
	 * 部门
	 */
	@Column(name="ORGAN_ID",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String organId;
	
	/**
	 * 性别
	 */
	@Column(name="SEX_TYPE",length=1L,type=java.sql.Types.CHAR,nullable=false)
	protected String sexType;
	
	/**
	 * 出生日期
	 */
	@Column(name="BIRTHDAY",length=10L,type=java.sql.Types.DATE,nullable=true)
	protected LocalDate birthday;
	
	/**
	 * 入职日期
	 */
	@Column(name="ENTRY_DATE",length=10L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDate entryDate;
	
	/**
	 * 离职日期
	 */
	@Column(name="TERM_DATE",length=10L,type=java.sql.Types.DATE,nullable=true)
	protected LocalDate termDate;
	
	/**
	 * 照片
	 */
	@Column(name="PHOTO",length=2147483647L,type=java.sql.Types.BLOB,nullable=true)
	protected byte[] photo;
	
	/**
	 * 国家
	 */
	@Column(name="COUNTRY",length=10L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String country;
	
	/**
	 * 籍贯
	 */
	@Column(name="CENSUS_REGISTER",length=150L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String censusRegister;
	
	/**
	 * 家庭地址
	 */
	@Column(name="ADDRESS",length=250L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String address;
	
	/**
	 * 邮箱
	 */
	@Column(name="EMAIL",length=100L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String email;
	
	/**
	 * 移动电话
	 */
	@Column(name="TEL_NO",length=20L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String telNo;
	
	/**
	 * 岗位
	 */
	@Column(name="POST",length=20L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String post;
	
	/**
	 * 职位级别
	 */
	@Column(name="POST_GRADE",length=20L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String postGrade;
	
	/**
	 * 创建人
	 */
	@Column(name="CREATE_BY",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String createBy;
	
	/**
	 * 创建时间
	 */
	@Column(name="CREATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDateTime createTime;
	
	/**
	 * 最后修改人
	 */
	@Column(name="UPDATE_BY",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String updateBy;
	
	/**
	 * 最后修改时间
	 */
	@Column(name="UPDATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDateTime updateTime;
	
	/**
	 * 状态
	 */
	@Column(name="STATUS",length=1L,defaultValue="1",type=java.sql.Types.INTEGER,nullable=false)
	protected Integer status;
	


	/** default constructor */
	public AbstractStaffInfoVO() {
	}
	
	/** pk constructor */
	public AbstractStaffInfoVO(String staffId)
	{
		this.staffId=staffId;
	}

	/** minimal constructor */
	public AbstractStaffInfoVO(String staffId,String staffCode,String staffName,String organId,String sexType,LocalDate entryDate,String createBy,LocalDateTime createTime,String updateBy,LocalDateTime updateTime,Integer status)
	{
		this.staffId=staffId;
		this.staffCode=staffCode;
		this.staffName=staffName;
		this.organId=organId;
		this.sexType=sexType;
		this.entryDate=entryDate;
		this.createBy=createBy;
		this.createTime=createTime;
		this.updateBy=updateBy;
		this.updateTime=updateTime;
		this.status=status;
	}

	/** full constructor */
	public AbstractStaffInfoVO(String staffId,String staffCode,String staffName,String organId,String sexType,LocalDate birthday,LocalDate entryDate,LocalDate termDate,byte[] photo,String country,String censusRegister,String address,String email,String telNo,String post,String postGrade,String createBy,LocalDateTime createTime,String updateBy,LocalDateTime updateTime,Integer status)
	{
		this.staffId=staffId;
		this.staffCode=staffCode;
		this.staffName=staffName;
		this.organId=organId;
		this.sexType=sexType;
		this.birthday=birthday;
		this.entryDate=entryDate;
		this.termDate=termDate;
		this.photo=photo;
		this.country=country;
		this.censusRegister=censusRegister;
		this.address=address;
		this.email=email;
		this.telNo=telNo;
		this.post=post;
		this.postGrade=postGrade;
		this.createBy=createBy;
		this.createTime=createTime;
		this.updateBy=updateBy;
		this.updateTime=updateTime;
		this.status=status;
	}
	
	/**
	 *@param staffId the staffId to set
	 */
	public void setStaffId(String staffId) {
		this.staffId=staffId;
	}
		
	/**
	 *@return the StaffId
	 */
	public String getStaffId() {
	    return this.staffId;
	}
	
	/**
	 *@param staffCode the staffCode to set
	 */
	public void setStaffCode(String staffCode) {
		this.staffCode=staffCode;
	}
		
	/**
	 *@return the StaffCode
	 */
	public String getStaffCode() {
	    return this.staffCode;
	}
	
	/**
	 *@param staffName the staffName to set
	 */
	public void setStaffName(String staffName) {
		this.staffName=staffName;
	}
		
	/**
	 *@return the StaffName
	 */
	public String getStaffName() {
	    return this.staffName;
	}
	
	/**
	 *@param organId the organId to set
	 */
	public void setOrganId(String organId) {
		this.organId=organId;
	}
		
	/**
	 *@return the OrganId
	 */
	public String getOrganId() {
	    return this.organId;
	}
	
	/**
	 *@param sexType the sexType to set
	 */
	public void setSexType(String sexType) {
		this.sexType=sexType;
	}
		
	/**
	 *@return the SexType
	 */
	public String getSexType() {
	    return this.sexType;
	}
	
	/**
	 *@param birthday the birthday to set
	 */
	public void setBirthday(LocalDate birthday) {
		this.birthday=birthday;
	}
		
	/**
	 *@return the Birthday
	 */
	public LocalDate getBirthday() {
	    return this.birthday;
	}
	
	/**
	 *@param entryDate the entryDate to set
	 */
	public void setEntryDate(LocalDate entryDate) {
		this.entryDate=entryDate;
	}
		
	/**
	 *@return the EntryDate
	 */
	public LocalDate getEntryDate() {
	    return this.entryDate;
	}
	
	/**
	 *@param termDate the termDate to set
	 */
	public void setTermDate(LocalDate termDate) {
		this.termDate=termDate;
	}
		
	/**
	 *@return the TermDate
	 */
	public LocalDate getTermDate() {
	    return this.termDate;
	}
	
	/**
	 *@param photo the photo to set
	 */
	public void setPhoto(byte[] photo) {
		this.photo=photo;
	}
		
	/**
	 *@return the Photo
	 */
	public byte[] getPhoto() {
	    return this.photo;
	}
	
	/**
	 *@param country the country to set
	 */
	public void setCountry(String country) {
		this.country=country;
	}
		
	/**
	 *@return the Country
	 */
	public String getCountry() {
	    return this.country;
	}
	
	/**
	 *@param censusRegister the censusRegister to set
	 */
	public void setCensusRegister(String censusRegister) {
		this.censusRegister=censusRegister;
	}
		
	/**
	 *@return the CensusRegister
	 */
	public String getCensusRegister() {
	    return this.censusRegister;
	}
	
	/**
	 *@param address the address to set
	 */
	public void setAddress(String address) {
		this.address=address;
	}
		
	/**
	 *@return the Address
	 */
	public String getAddress() {
	    return this.address;
	}
	
	/**
	 *@param email the email to set
	 */
	public void setEmail(String email) {
		this.email=email;
	}
		
	/**
	 *@return the Email
	 */
	public String getEmail() {
	    return this.email;
	}
	
	/**
	 *@param telNo the telNo to set
	 */
	public void setTelNo(String telNo) {
		this.telNo=telNo;
	}
		
	/**
	 *@return the TelNo
	 */
	public String getTelNo() {
	    return this.telNo;
	}
	
	/**
	 *@param post the post to set
	 */
	public void setPost(String post) {
		this.post=post;
	}
		
	/**
	 *@return the Post
	 */
	public String getPost() {
	    return this.post;
	}
	
	/**
	 *@param postGrade the postGrade to set
	 */
	public void setPostGrade(String postGrade) {
		this.postGrade=postGrade;
	}
		
	/**
	 *@return the PostGrade
	 */
	public String getPostGrade() {
	    return this.postGrade;
	}
	
	/**
	 *@param createBy the createBy to set
	 */
	public void setCreateBy(String createBy) {
		this.createBy=createBy;
	}
		
	/**
	 *@return the CreateBy
	 */
	public String getCreateBy() {
	    return this.createBy;
	}
	
	/**
	 *@param createTime the createTime to set
	 */
	public void setCreateTime(LocalDateTime createTime) {
		this.createTime=createTime;
	}
		
	/**
	 *@return the CreateTime
	 */
	public LocalDateTime getCreateTime() {
	    return this.createTime;
	}
	
	/**
	 *@param updateBy the updateBy to set
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy=updateBy;
	}
		
	/**
	 *@return the UpdateBy
	 */
	public String getUpdateBy() {
	    return this.updateBy;
	}
	
	/**
	 *@param updateTime the updateTime to set
	 */
	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime=updateTime;
	}
		
	/**
	 *@return the UpdateTime
	 */
	public LocalDateTime getUpdateTime() {
	    return this.updateTime;
	}
	
	/**
	 *@param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status=status;
	}
		
	/**
	 *@return the Status
	 */
	public Integer getStatus() {
	    return this.status;
	}



	/**
     * @todo vo columns to String
     */
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("staffId=").append(getStaffId()).append("\n");
		columnsBuffer.append("staffCode=").append(getStaffCode()).append("\n");
		columnsBuffer.append("staffName=").append(getStaffName()).append("\n");
		columnsBuffer.append("organId=").append(getOrganId()).append("\n");
		columnsBuffer.append("sexType=").append(getSexType()).append("\n");
		columnsBuffer.append("birthday=").append(getBirthday()).append("\n");
		columnsBuffer.append("entryDate=").append(getEntryDate()).append("\n");
		columnsBuffer.append("termDate=").append(getTermDate()).append("\n");
		columnsBuffer.append("photo=").append(getPhoto()).append("\n");
		columnsBuffer.append("country=").append(getCountry()).append("\n");
		columnsBuffer.append("censusRegister=").append(getCensusRegister()).append("\n");
		columnsBuffer.append("address=").append(getAddress()).append("\n");
		columnsBuffer.append("email=").append(getEmail()).append("\n");
		columnsBuffer.append("telNo=").append(getTelNo()).append("\n");
		columnsBuffer.append("post=").append(getPost()).append("\n");
		columnsBuffer.append("postGrade=").append(getPostGrade()).append("\n");
		columnsBuffer.append("createBy=").append(getCreateBy()).append("\n");
		columnsBuffer.append("createTime=").append(getCreateTime()).append("\n");
		columnsBuffer.append("updateBy=").append(getUpdateBy()).append("\n");
		columnsBuffer.append("updateTime=").append(getUpdateTime()).append("\n");
		columnsBuffer.append("status=").append(getStatus()).append("\n");
		return columnsBuffer.toString();
	}
}
