package jobboy.po;

import java.util.Date;

public class Announcement {
    private Integer anId;

    private Integer adId;

    private Date anTime;

    private String anContent;

    public Announcement(Integer anId, Integer adId, Date anTime, String anContent) {
        this.anId = anId;
        this.adId = adId;
        this.anTime = anTime;
        this.anContent = anContent;
    }

    public Announcement() {
        super();
    }

    public Integer getAnId() {
        return anId;
    }

    public void setAnId(Integer anId) {
        this.anId = anId;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Date getAnTime() {
        return anTime;
    }

    public void setAnTime(Date anTime) {
        this.anTime = anTime;
    }

    public String getAnContent() {
        return anContent;
    }

    public void setAnContent(String anContent) {
        this.anContent = anContent == null ? null : anContent.trim();
    }
}