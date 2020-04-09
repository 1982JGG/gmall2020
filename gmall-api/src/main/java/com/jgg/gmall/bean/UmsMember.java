package com.jgg.gmall.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author JGG
 * @create 2020/4/9 21:11
 */
@Table(name = "ums_member")
public class UmsMember implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String memberLevelId;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private String status;
    private String createTime;
    private String icon;
    private String gender;
    private String birthday;
    private String city;
    private String job;
    private String personalizedSignature;
    private String sourceType;
    private String integration;
    private String growth;
    private String luckeyCount;
    private String historyIntegration;

    public UmsMember(String id, String memberLevelId, String username, String password, String nickname, String phone, String status, String createTime, String icon, String gender, String birthday, String city, String job, String personalizedSignature, String sourceType, String integration, String growth, String luckeyCount, String historyIntegration) {
        this.id = id;
        this.memberLevelId = memberLevelId;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.phone = phone;
        this.status = status;
        this.createTime = createTime;
        this.icon = icon;
        this.gender = gender;
        this.birthday = birthday;
        this.city = city;
        this.job = job;
        this.personalizedSignature = personalizedSignature;
        this.sourceType = sourceType;
        this.integration = integration;
        this.growth = growth;
        this.luckeyCount = luckeyCount;
        this.historyIntegration = historyIntegration;
    }

    public UmsMember() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(String memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getIntegration() {
        return integration;
    }

    public void setIntegration(String integration) {
        this.integration = integration;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    public String getLuckeyCount() {
        return luckeyCount;
    }

    public void setLuckeyCount(String luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    public String getHistoryIntegration() {
        return historyIntegration;
    }

    public void setHistoryIntegration(String historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UmsMember)) return false;

        UmsMember umsMember = (UmsMember) o;

        if (!id.equals(umsMember.id)) return false;
        if (!memberLevelId.equals(umsMember.memberLevelId)) return false;
        if (!username.equals(umsMember.username)) return false;
        if (!password.equals(umsMember.password)) return false;
        if (!nickname.equals(umsMember.nickname)) return false;
        if (!phone.equals(umsMember.phone)) return false;
        if (!status.equals(umsMember.status)) return false;
        if (!createTime.equals(umsMember.createTime)) return false;
        if (!icon.equals(umsMember.icon)) return false;
        if (!gender.equals(umsMember.gender)) return false;
        if (!birthday.equals(umsMember.birthday)) return false;
        if (!city.equals(umsMember.city)) return false;
        if (!job.equals(umsMember.job)) return false;
        if (!personalizedSignature.equals(umsMember.personalizedSignature)) return false;
        if (!sourceType.equals(umsMember.sourceType)) return false;
        if (!integration.equals(umsMember.integration)) return false;
        if (!growth.equals(umsMember.growth)) return false;
        if (!luckeyCount.equals(umsMember.luckeyCount)) return false;
        return historyIntegration.equals(umsMember.historyIntegration);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + memberLevelId.hashCode();
        result = 31 * result + username.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + nickname.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + createTime.hashCode();
        result = 31 * result + icon.hashCode();
        result = 31 * result + gender.hashCode();
        result = 31 * result + birthday.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + job.hashCode();
        result = 31 * result + personalizedSignature.hashCode();
        result = 31 * result + sourceType.hashCode();
        result = 31 * result + integration.hashCode();
        result = 31 * result + growth.hashCode();
        result = 31 * result + luckeyCount.hashCode();
        result = 31 * result + historyIntegration.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "UmsMember{" +
                "id='" + id + '\'' +
                ", memberLevelId='" + memberLevelId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                ", createTime='" + createTime + '\'' +
                ", icon='" + icon + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", city='" + city + '\'' +
                ", job='" + job + '\'' +
                ", personalizedSignature='" + personalizedSignature + '\'' +
                ", sourceType='" + sourceType + '\'' +
                ", integration='" + integration + '\'' +
                ", growth='" + growth + '\'' +
                ", luckeyCount='" + luckeyCount + '\'' +
                ", historyIntegration='" + historyIntegration + '\'' +
                '}';
    }
}
