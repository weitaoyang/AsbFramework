package com.asb.framework.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户信息表
 * 
 * @author: 杨卫涛
 * @date: 2015-04-17 15:23
 * @desc: 用户信息表
 */
@Entity
@Table(name = "LIMUSEINF")
public class Limuseinf implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private String account;
	private String userId;
	private String userNam;
	private String userPwd;
	private String sysId;
	private String creaSign;
	private String random;
	private String userDate;
	private String state;
	private String descInf;
	private String tel;
	private String email;
	private String loginFailCount;
	private String currentLoginTime;
	private String preset1;
	private String lastUppwdDate;
	private String userExpiredTime;
	private String mailflg;
	private String orgId;
	private String issueid;
	private int isUse;

	// Constructors

	/** default constructor */
	public Limuseinf()
	{
	}

	/** minimal constructor */
	public Limuseinf(String account, String userId, String userNam, String userPwd,
			String sysId, String creaSign)
	{
		this.account = account;
		this.userId = userId;
		this.userNam = userNam;
		this.userPwd = userPwd;
		this.sysId = sysId;
		this.creaSign = creaSign;
	}

	/** full constructor */
	public Limuseinf(String account, String userId, String userNam, String userPwd,
			String sysId, String creaSign, String random, String userDate,
			String state, String descInf, String tel, String email,
			String loginFailCount, String currentLoginTime, String preset1,
			String lastUppwdDate, String userExpiredTime, String mailflg,
			String orgId, String issueid, short isUse)
	{
		this.account = account;
		this.userId = userId;
		this.userNam = userNam;
		this.userPwd = userPwd;
		this.sysId = sysId;
		this.creaSign = creaSign;
		this.random = random;
		this.userDate = userDate;
		this.state = state;
		this.descInf = descInf;
		this.tel = tel;
		this.email = email;
		this.loginFailCount = loginFailCount;
		this.currentLoginTime = currentLoginTime;
		this.preset1 = preset1;
		this.lastUppwdDate = lastUppwdDate;
		this.userExpiredTime = userExpiredTime;
		this.mailflg = mailflg;
		this.orgId = orgId;
		this.issueid = issueid;
		this.isUse = isUse;
	}

	@Id
	@Column(name = "ACCOUNT", nullable = false, length = 20)
	public String getAccount()
	{
		return this.account;
	}

	public void setAccount(String account)
	{
		this.account = account;
	}

	@Id
	@Column(name = "USER_ID", nullable = false, length = 20)
	public String getUserId()
	{
		return this.userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	@Column(name = "USER_NAM", nullable = false, length = 60)
	public String getUserNam()
	{
		return this.userNam;
	}

	public void setUserNam(String userNam)
	{
		this.userNam = userNam;
	}

	@Column(name = "USER_PWD", nullable = false, length = 100)
	public String getUserPwd()
	{
		return this.userPwd;
	}

	public void setUserPwd(String userPwd)
	{
		this.userPwd = userPwd;
	}

	@Column(name = "SYS_ID", nullable = false, length = 15)
	public String getSysId()
	{
		return this.sysId;
	}

	public void setSysId(String sysId)
	{
		this.sysId = sysId;
	}

	@Column(name = "CREA_SIGN", nullable = false, length = 1)
	public String getCreaSign()
	{
		return this.creaSign;
	}

	public void setCreaSign(String creaSign)
	{
		this.creaSign = creaSign;
	}

	@Column(name = "RANDOM", length = 15)
	public String getRandom()
	{
		return this.random;
	}

	public void setRandom(String random)
	{
		this.random = random;
	}

	@Column(name = "USER_DATE", length = 14)
	public String getUserDate()
	{
		return this.userDate;
	}

	public void setUserDate(String userDate)
	{
		this.userDate = userDate;
	}

	@Column(name = "STATE", length = 1)
	public String getState()
	{
		return this.state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	@Column(name = "DESC_INF", length = 100)
	public String getDescInf()
	{
		return this.descInf;
	}

	public void setDescInf(String descInf)
	{
		this.descInf = descInf;
	}

	@Column(name = "TEL", length = 13)
	public String getTel()
	{
		return this.tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}

	@Column(name = "EMAIL", length = 50)
	public String getEmail()
	{
		return this.email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	@Column(name = "LOGIN_FAIL_COUNT", length = 15)
	public String getLoginFailCount()
	{
		return this.loginFailCount;
	}

	public void setLoginFailCount(String loginFailCount)
	{
		this.loginFailCount = loginFailCount;
	}

	@Column(name = "CURRENT_LOGIN_TIME", length = 14)
	public String getCurrentLoginTime()
	{
		return this.currentLoginTime;
	}

	public void setCurrentLoginTime(String currentLoginTime)
	{
		this.currentLoginTime = currentLoginTime;
	}

	@Column(name = "PRESET1", length = 90)
	public String getPreset1()
	{
		return this.preset1;
	}

	public void setPreset1(String preset1)
	{
		this.preset1 = preset1;
	}

	@Column(name = "LAST_UPPWD_DATE", length = 14)
	public String getLastUppwdDate()
	{
		return this.lastUppwdDate;
	}

	public void setLastUppwdDate(String lastUppwdDate)
	{
		this.lastUppwdDate = lastUppwdDate;
	}

	@Column(name = "USER_EXPIRED_TIME", length = 20)
	public String getUserExpiredTime()
	{
		return this.userExpiredTime;
	}

	public void setUserExpiredTime(String userExpiredTime)
	{
		this.userExpiredTime = userExpiredTime;
	}

	@Column(name = "MAILFLG", length = 2)
	public String getMailflg()
	{
		return this.mailflg;
	}

	public void setMailflg(String mailflg)
	{
		this.mailflg = mailflg;
	}

	@Column(name = "ORG_ID", length = 20)
	public String getOrgId()
	{
		return this.orgId;
	}

	public void setOrgId(String orgId)
	{
		this.orgId = orgId;
	}

	@Column(name = "ISSUEID", length = 6)
	public String getIssueid()
	{
		return this.issueid;
	}

	public void setIssueid(String issueid)
	{
		this.issueid = issueid;
	}

	@Column(name = "IS_USE", columnDefinition="SMALLINT default 1")
	public int getIsUse()
	{
		return this.isUse;
	}

	public void setIsUse(int isUse)
	{
		this.isUse = isUse;
	}

}