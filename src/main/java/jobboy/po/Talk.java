package jobboy.po;

import java.util.Date;

public class Talk {
    private Integer tkId;

    private Integer getId;

    private Integer sendId;

    private Integer orderId;

    private Date tkTime;

    private String tkContent;

    private Float tkGrade;

    public Talk(Integer tkId, Integer getId, Integer sendId, Integer orderId, Date tkTime, String tkContent, Float tkGrade) {
        this.tkId = tkId;
        this.getId = getId;
        this.sendId = sendId;
        this.orderId = orderId;
        this.tkTime = tkTime;
        this.tkContent = tkContent;
        this.tkGrade = tkGrade;
    }

    public Talk() {
        super();
    }

    public Integer getTkId() {
        return tkId;
    }

    public void setTkId(Integer tkId) {
        this.tkId = tkId;
    }

    public Integer getGetId() {
        return getId;
    }

    public void setGetId(Integer getId) {
        this.getId = getId;
    }

    public Integer getSendId() {
        return sendId;
    }

    public void setSendId(Integer sendId) {
        this.sendId = sendId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getTkTime() {
        return tkTime;
    }

    public void setTkTime(Date tkTime) {
        this.tkTime = tkTime;
    }

    public String getTkContent() {
        return tkContent;
    }

    public void setTkContent(String tkContent) {
        this.tkContent = tkContent == null ? null : tkContent.trim();
    }

    public Float getTkGrade() {
        return tkGrade;
    }

    public void setTkGrade(Float tkGrade) {
        this.tkGrade = tkGrade;
    }
}