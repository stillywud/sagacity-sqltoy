/**
 *@Generated by QuickVO Tools 1.6
 */
package org.sagacity.sqltoy.demo.vo.base;

import java.io.Serializable;
import java.util.Date;

import org.sagacity.sqltoy.config.annotation.Column;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;


/**
 * @project sqltoy-orm
 * @version 1.0.0
 * 员工信息表    			
 * StaffInfoVO generated by SYS_STAFF_INFO
 */
@Entity(tableName="SYS_STAFF_INFO")
public abstract class AbstractStaffInfoVO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //staffId,staffCode,organId,staffName,englishName,sexType,linkPhone,birthday,dutyDate,outDutyDate,post,photo,email,isVirtual,operator,operateDate,enabled
	 
	 //not null properties
	 //staffId,staffCode,organId,staffName,operator,operateDate,enabled

	/**
	 * 员工ID
	 */
	@Id(strategy="assign")
	@Column(name="STAFF_ID",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String staffId;
	
	/**
	 * 员工工号
	 */
	@Column(name="STAFF_CODE",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String staffCode;
	
	/**
	 * 机构编号
	 */
	@Column(name="ORGAN_ID",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String organId;
	
	/**
	 * 员工姓名
	 */
	@Column(name="STAFF_NAME",length=60L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String staffName;
	
	/**
	 * 英文名称
	 */
	@Column(name="ENGLISH_NAME",length=30L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String englishName;
	
	/**
	 * DD性别
	 */
	@Column(name="SEX_TYPE",length=1L,type=java.sql.Types.CHAR,nullable=true)
	protected String sexType;
	
	/**
	 * 联系电话
	 */
	@Column(name="LINK_PHONE",length=30L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String linkPhone;
	
	/**
	 * 出生日期
	 */
	@Column(name="BIRTHDAY",length=7L,type=java.sql.Types.DATE,nullable=true)
	protected Date birthday;
	
	/**
	 * 入职日期
	 */
	@Column(name="DUTY_DATE",length=7L,type=java.sql.Types.DATE,nullable=true)
	protected Date dutyDate;
	
	/**
	 * 离职日期
	 */
	@Column(name="OUT_DUTY_DATE",length=7L,type=java.sql.Types.DATE,nullable=true)
	protected Date outDutyDate;
	
	/**
	 * DD岗位
	 */
	@Column(name="POST",length=6L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String post;
	
	/**
	 * 照片
	 */
	@Column(name="PHOTO",length=4000L,type=java.sql.Types.BLOB,nullable=true)
	protected byte[] photo;
	
	/**
	 * 邮箱地址
	 */
	@Column(name="EMAIL",length=100L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String email;
	
	/**
	 * 默认都是非虚拟，虚拟用户用户设置如系统超级管理员等
	 */
	@Column(name="IS_VIRTUAL",length=1L,defaultValue="0",type=java.sql.Types.INTEGER,nullable=true)
	protected Integer isVirtual;
	
	/**
	 * 操作人
	 */
	@Column(name="OPERATOR",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String operator;
	
	/**
	 * 操作日期
	 */
	@Column(name="OPERATE_DATE",length=7L,type=java.sql.Types.DATE,nullable=false)
	protected Date operateDate;
	
	/**
	 * 启用标志
	 */
	@Column(name="ENABLED",length=1L,defaultValue="1",type=java.sql.Types.INTEGER,nullable=false)
	protected Integer enabled;
	


	/** default constructor */
	public AbstractStaffInfoVO() {
	}
	
	/** pk constructor */
	public AbstractStaffInfoVO(String staffId)
	{
		this.staffId=staffId;
	}

	/** minimal constructor */
	public AbstractStaffInfoVO(String staffId,String staffCode,String organId,String staffName,String operator,Date operateDate,Integer enabled)
	{
		this.staffId=staffId;
		this.staffCode=staffCode;
		this.organId=organId;
		this.staffName=staffName;
		this.operator=operator;
		this.operateDate=operateDate;
		this.enabled=enabled;
	}

	/** full constructor */
	public AbstractStaffInfoVO(String staffId,String staffCode,String organId,String staffName,String englishName,String sexType,String linkPhone,Date birthday,Date dutyDate,Date outDutyDate,String post,byte[] photo,String email,Integer isVirtual,String operator,Date operateDate,Integer enabled)
	{
		this.staffId=staffId;
		this.staffCode=staffCode;
		this.organId=organId;
		this.staffName=staffName;
		this.englishName=englishName;
		this.sexType=sexType;
		this.linkPhone=linkPhone;
		this.birthday=birthday;
		this.dutyDate=dutyDate;
		this.outDutyDate=outDutyDate;
		this.post=post;
		this.photo=photo;
		this.email=email;
		this.isVirtual=isVirtual;
		this.operator=operator;
		this.operateDate=operateDate;
		this.enabled=enabled;
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
	 *@param englishName the englishName to set
	 */
	public void setEnglishName(String englishName) {
		this.englishName=englishName;
	}
		
	/**
	 *@return the EnglishName
	 */
	public String getEnglishName() {
	    return this.englishName;
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
	 *@param linkPhone the linkPhone to set
	 */
	public void setLinkPhone(String linkPhone) {
		this.linkPhone=linkPhone;
	}
		
	/**
	 *@return the LinkPhone
	 */
	public String getLinkPhone() {
	    return this.linkPhone;
	}
	
	/**
	 *@param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday=birthday;
	}
		
	/**
	 *@return the Birthday
	 */
	public Date getBirthday() {
	    return this.birthday;
	}
	
	/**
	 *@param dutyDate the dutyDate to set
	 */
	public void setDutyDate(Date dutyDate) {
		this.dutyDate=dutyDate;
	}
		
	/**
	 *@return the DutyDate
	 */
	public Date getDutyDate() {
	    return this.dutyDate;
	}
	
	/**
	 *@param outDutyDate the outDutyDate to set
	 */
	public void setOutDutyDate(Date outDutyDate) {
		this.outDutyDate=outDutyDate;
	}
		
	/**
	 *@return the OutDutyDate
	 */
	public Date getOutDutyDate() {
	    return this.outDutyDate;
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
	 *@param isVirtual the isVirtual to set
	 */
	public void setIsVirtual(Integer isVirtual) {
		this.isVirtual=isVirtual;
	}
		
	/**
	 *@return the IsVirtual
	 */
	public Integer getIsVirtual() {
	    return this.isVirtual;
	}
	
	/**
	 *@param operator the operator to set
	 */
	public void setOperator(String operator) {
		this.operator=operator;
	}
		
	/**
	 *@return the Operator
	 */
	public String getOperator() {
	    return this.operator;
	}
	
	/**
	 *@param operateDate the operateDate to set
	 */
	public void setOperateDate(Date operateDate) {
		this.operateDate=operateDate;
	}
		
	/**
	 *@return the OperateDate
	 */
	public Date getOperateDate() {
	    return this.operateDate;
	}
	
	/**
	 *@param enabled the enabled to set
	 */
	public void setEnabled(Integer enabled) {
		this.enabled=enabled;
	}
		
	/**
	 *@return the Enabled
	 */
	public Integer getEnabled() {
	    return this.enabled;
	}




	/**
     * @todo vo columns to String
     */
	public String toString() {
		StringBuffer columnsBuffer=new StringBuffer();
		columnsBuffer.append("staffId=").append(getStaffId()).append("\n");
		columnsBuffer.append("staffCode=").append(getStaffCode()).append("\n");
		columnsBuffer.append("organId=").append(getOrganId()).append("\n");
		columnsBuffer.append("staffName=").append(getStaffName()).append("\n");
		columnsBuffer.append("englishName=").append(getEnglishName()).append("\n");
		columnsBuffer.append("sexType=").append(getSexType()).append("\n");
		columnsBuffer.append("linkPhone=").append(getLinkPhone()).append("\n");
		columnsBuffer.append("birthday=").append(getBirthday()).append("\n");
		columnsBuffer.append("dutyDate=").append(getDutyDate()).append("\n");
		columnsBuffer.append("outDutyDate=").append(getOutDutyDate()).append("\n");
		columnsBuffer.append("post=").append(getPost()).append("\n");
		columnsBuffer.append("photo=").append(getPhoto()).append("\n");
		columnsBuffer.append("email=").append(getEmail()).append("\n");
		columnsBuffer.append("isVirtual=").append(getIsVirtual()).append("\n");
		columnsBuffer.append("operator=").append(getOperator()).append("\n");
		columnsBuffer.append("operateDate=").append(getOperateDate()).append("\n");
		columnsBuffer.append("enabled=").append(getEnabled()).append("\n");
		return columnsBuffer.toString();
	}
}
