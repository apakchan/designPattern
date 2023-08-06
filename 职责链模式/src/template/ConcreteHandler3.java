package template;

public class ConcreteHandler3 extends Handler{
    @Override
    public void handleRequest(int request) {
        if(request >= 20 && request < 30){
            System.out.println(this.getClass().getName() + "处理请求" + request);
        }
        else if(successor != null) {
            successor.handleRequest(request);
        } else{
            System.out.println(this.getClass().getName() + "无法处理请求");
        }
    }
}
