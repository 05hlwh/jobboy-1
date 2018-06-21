package jobboy.po;

public class User {
    private Integer userId;

    private String userName;

    private String userPasswd;

    private String userGadener;

    private String userEmail;

    private String userMobile;

    private Float userCredit;

    private String userDescrible;

    private String userType;

    private String userImage;

    public User(Integer userId, String userName, String userPasswd, String userGadener, String userEmail, String userMobile, Float userCredit, String userDescrible, String userType, String userImage) {
        this.userId = userId;
        this.userName = userName;
        this.userPasswd = userPasswd;
        this.userGadener = userGadener;
        this.userEmail = userEmail;
        this.userMobile = userMobile;
        this.userCredit = userCredit;
        this.userDescrible = userDescrible;
        this.userType = userType;
        this.userImage = userImage;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd == null ? null : userPasswd.trim();
    }

    public String getUserGadener() {
        return userGadener;
    }

    public void setUserGadener(String userGadener) {
        this.userGadener = userGadener == null ? null : userGadener.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public Float getUserCredit() {
        return userCredit;
    }

    public void setUserCredit(Float userCredit) {
        this.userCredit = userCredit;
    }

    public String getUserDescrible() {
        return userDescrible;
    }

    public void setUserDescrible(String userDescrible) {
        this.userDescrible = userDescrible == null ? null : userDescrible.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
    }
}