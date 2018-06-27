package jobboy.utils;
import java.util.HashMap;
/*

设计通用json返回数据
 */
public class Msg {
    //100成功 ,200失败
    private int code;
    //状态消息
    private String msg;
    private HashMap<String,Object> extend = new HashMap<String, Object>();

    public static  Msg SUCCESS(){
        Msg re = new Msg();
        re.setCode(100);
        re.setMsg("Success!");
        return re;
    }
    public static  Msg Fail(){
        Msg re = new Msg();
        re.setCode(200);
        re.setMsg("fail!");
        return re;
    }
    public Msg add(String key,Object value){
        this.getExtend().put(key,value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HashMap<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(HashMap<String, Object> extend) {
        this.extend = extend;
    }
}
