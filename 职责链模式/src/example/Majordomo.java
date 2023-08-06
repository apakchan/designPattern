package example;

//总监类
public class Majordomo extends Manager{

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if("请假".equals(request.getRequestType()) && request.getRequestNumber() <=5){
            System.out.println(this.name + "处理" + request.getRequestType() + "请求，数量 " + request.getRequestNumber() + "批准申请!" );
        }else{
            if(this.superior != null){
                superior.requestApplications(request);
            }
        }
    }
}
