package example;

//总经理类
public class GeneralManager extends Manager{

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if("请假".equals(request.getRequestType()) && request.getRequestNumber() <= 10){
            System.out.println(this.name + "处理" + request.getRequestType() + "请求，数量 " + request.getRequestNumber() + "批准申请!" );
        }
        else if ("加薪".equals(request.getRequestType()) && request.getRequestNumber() <=500){
            System.out.println(this.name + "处理" + request.getRequestType() + "请求，数量 " + request.getRequestNumber() + "批准申请!" );
        }
        else{
            System.out.println(this.name + "处理" + request.getRequestType() + "请求，数量 " + request.getRequestNumber() + "，再说吧!" );
        }
    }
}
