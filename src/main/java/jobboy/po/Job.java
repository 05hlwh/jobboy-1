package jobboy.po;

import java.util.Date;

public class Job {
    private Integer jbId;

    private Integer jbDoId;

    private Date jbCreatTime;

    private String jbName;

    private String jbType;

    private String jbTime;

    private String jbSlRange;

    private String jbDescribe;

    private String jbRemarks;

    private String jbAdress;

    private String jbStAc;

    private String jbGadRequest;

    private Integer jbReNum;

    public Job(Integer jbId, Integer jbDoId, Date jbCreatTime, String jbName, String jbType, String jbTime, String jbSlRange, String jbDescribe, String jbRemarks, String jbAdress, String jbStAc, String jbGadRequest, Integer jbReNum) {
        this.jbId = jbId;
        this.jbDoId = jbDoId;
        this.jbCreatTime = jbCreatTime;
        this.jbName = jbName;
        this.jbType = jbType;
        this.jbTime = jbTime;
        this.jbSlRange = jbSlRange;
        this.jbDescribe = jbDescribe;
        this.jbRemarks = jbRemarks;
        this.jbAdress = jbAdress;
        this.jbStAc = jbStAc;
        this.jbGadRequest = jbGadRequest;
        this.jbReNum = jbReNum;
    }

    public Job() {
        super();
    }

    public Integer getJbId() {
        return jbId;
    }

    public void setJbId(Integer jbId) {
        this.jbId = jbId;
    }

    public Integer getJbDoId() {
        return jbDoId;
    }

    public void setJbDoId(Integer jbDoId) {
        this.jbDoId = jbDoId;
    }

    public Date getJbCreatTime() {
        return jbCreatTime;
    }

    public void setJbCreatTime(Date jbCreatTime) {
        this.jbCreatTime = jbCreatTime;
    }

    public String getJbName() {
        return jbName;
    }

    public void setJbName(String jbName) {
        this.jbName = jbName == null ? null : jbName.trim();
    }

    public String getJbType() {
        return jbType;
    }

    public void setJbType(String jbType) {
        this.jbType = jbType == null ? null : jbType.trim();
    }

    public String getJbTime() {
        return jbTime;
    }

    public void setJbTime(String jbTime) {
        this.jbTime = jbTime == null ? null : jbTime.trim();
    }

    public String getJbSlRange() {
        return jbSlRange;
    }

    public void setJbSlRange(String jbSlRange) {
        this.jbSlRange = jbSlRange == null ? null : jbSlRange.trim();
    }

    public String getJbDescribe() {
        return jbDescribe;
    }

    public void setJbDescribe(String jbDescribe) {
        this.jbDescribe = jbDescribe == null ? null : jbDescribe.trim();
    }

    public String getJbRemarks() {
        return jbRemarks;
    }

    public void setJbRemarks(String jbRemarks) {
        this.jbRemarks = jbRemarks == null ? null : jbRemarks.trim();
    }

    public String getJbAdress() {
        return jbAdress;
    }

    public void setJbAdress(String jbAdress) {
        this.jbAdress = jbAdress == null ? null : jbAdress.trim();
    }

    public String getJbStAc() {
        return jbStAc;
    }

    public void setJbStAc(String jbStAc) {
        this.jbStAc = jbStAc == null ? null : jbStAc.trim();
    }

    public String getJbGadRequest() {
        return jbGadRequest;
    }

    public void setJbGadRequest(String jbGadRequest) {
        this.jbGadRequest = jbGadRequest == null ? null : jbGadRequest.trim();
    }

    public Integer getJbReNum() {
        return jbReNum;
    }

    public void setJbReNum(Integer jbReNum) {
        this.jbReNum = jbReNum;
    }
}