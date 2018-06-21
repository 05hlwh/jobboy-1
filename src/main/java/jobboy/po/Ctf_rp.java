package jobboy.po;

public class Ctf_rp {
    private Integer crId;

    private Integer userId;

    private String crTitle;

    private String crFile;

    public Ctf_rp(Integer crId, Integer userId, String crTitle, String crFile) {
        this.crId = crId;
        this.userId = userId;
        this.crTitle = crTitle;
        this.crFile = crFile;
    }

    public Ctf_rp() {
        super();
    }

    public Integer getCrId() {
        return crId;
    }

    public void setCrId(Integer crId) {
        this.crId = crId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCrTitle() {
        return crTitle;
    }

    public void setCrTitle(String crTitle) {
        this.crTitle = crTitle == null ? null : crTitle.trim();
    }

    public String getCrFile() {
        return crFile;
    }

    public void setCrFile(String crFile) {
        this.crFile = crFile == null ? null : crFile.trim();
    }
}