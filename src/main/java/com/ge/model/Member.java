package com.ge.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>User: dream0708@163.com
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public class Member implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2900588565205845216L;
	private Long id;
	private Integer membertype;
	private String userid;
	private String realname;
	private Integer gender = Integer.valueOf(0);
	private String birth = "2000-01-01";
	private String password;
	private String telephone = "";
	private String mobile = "";
	private String email = "";
	private String companyname = "";
	private Long provinceid = Long.valueOf(1L);
	private Long cityid = Long.valueOf(0L);
	private Long areaid = Long.valueOf(0L);
	private String address = "";
	private Integer ctype = Integer.valueOf(1);
	private Integer cindustry = Integer.valueOf(1);
	private Integer cstaffnum = Integer.valueOf(1);
	private Integer cdepartment = Integer.valueOf(1);
	private Integer status = Integer.valueOf(1);
	private Long stationid = Long.valueOf(0L);
	private Date createtime = new Date();
	private Integer score = Integer.valueOf(0);
	private Integer hisscore = Integer.valueOf(0);
	private Long level = Long.valueOf(1L);
    public Member() {
    }

    public Member(String realname, String password) {
        this.realname = realname;
        this.password = password;
    }

	public Integer getMembertype() {
		return membertype;
	}

	public void setMembertype(Integer membertype) {
		this.membertype = membertype;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public Long getProvinceid() {
		return provinceid;
	}

	public void setProvinceid(Long provinceid) {
		this.provinceid = provinceid;
	}

	public Long getCityid() {
		return cityid;
	}

	public void setCityid(Long cityid) {
		this.cityid = cityid;
	}

	public Long getAreaid() {
		return areaid;
	}

	public void setAreaid(Long areaid) {
		this.areaid = areaid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getCtype() {
		return ctype;
	}

	public void setCtype(Integer ctype) {
		this.ctype = ctype;
	}

	public Integer getCindustry() {
		return cindustry;
	}

	public void setCindustry(Integer cindustry) {
		this.cindustry = cindustry;
	}

	public Integer getCstaffnum() {
		return cstaffnum;
	}

	public void setCstaffnum(Integer cstaffnum) {
		this.cstaffnum = cstaffnum;
	}

	public Integer getCdepartment() {
		return cdepartment;
	}

	public void setCdepartment(Integer cdepartment) {
		this.cdepartment = cdepartment;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getStationid() {
		return stationid;
	}

	public void setStationid(Long stationid) {
		this.stationid = stationid;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getHisscore() {
		return hisscore;
	}

	public void setHisscore(Integer hisscore) {
		this.hisscore = hisscore;
	}

	public Long getLevel() {
		return level;
	}

	public void setLevel(Long level) {
		this.level = level;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Member user = (Member) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", realname=" + realname +
                ", password='" + password + '\'' +
                '}';
    }
}
