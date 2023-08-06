package example;

//经理类
public class CommonManager extends Manager{

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if("请假".equals(request.getRequestType()) && request.getRequestNumber() < 3 && request.getRequestNumber() > 0){
            System.out.println(this.name + "处理" + request.getRequestType() + "请求，数量 " + request.getRequestNumber() + "批准申请!" );
        }else{
            if(this.superior != null){
                superior.requestApplications(request);
            }
        }
    }
}
