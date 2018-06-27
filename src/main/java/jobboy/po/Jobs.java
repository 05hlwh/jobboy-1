package jobboy.po;

import java.util.Date;

public class Jobs {
    private Integer id;

    private Integer fromId;

    private Date creatTime;

    private String title;

    private String type;

    private String jbTime;

    private String salaryStart;

    private String salaryEnd;

    private String detail;

    private String adress;

    private String gender;

    private Integer needNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getJbTime() {
        return jbTime;
    }

    public void setJbTime(String jbTime) {
        this.jbTime = jbTime == null ? null : jbTime.trim();
    }

    public String getSalaryStart() {
        return salaryStart;
    }

    public void setSalaryStart(String salaryStart) {
        this.salaryStart = salaryStart == null ? null : salaryStart.trim();
    }

    public String getSalaryEnd() {
        return salaryEnd;
    }

    public void setSalaryEnd(String salaryEnd) {
        this.salaryEnd = salaryEnd == null ? null : salaryEnd.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getNeedNum() {
        return needNum;
    }

    public void setNeedNum(Integer needNum) {
        this.needNum = needNum;
    }
}