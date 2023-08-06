package example;

public class Request {
    //申请类别
    private String requestType;
    //申请内容
    private String requsetContext;
    //申请数量
    private Integer requestNumber;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequsetContext() {
        return requsetContext;
    }

    public void setRequsetContext(String requsetContext) {
        this.requsetContext = requsetContext;
    }

    public Integer getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(Integer requestNumber) {
        this.requestNumber = requestNumber;
    }

    public Request(String requestType, String requsetContext, Integer requestNumber) {
        this.requestType = requestType;
        this.requsetContext = requsetContext;
        this.requestNumber = requestNumber;
    }
}
