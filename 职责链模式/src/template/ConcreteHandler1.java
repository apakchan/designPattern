package template;

public class ConcreteHandler1 extends Handler{
    @Override
    public void handleRequest(int request) {
        if(request >= 0 && request < 10){
            System.out.println(this.getClass().getName() + "处理请求" + request);
        }
        else if(successor != null) {
            successor.handleRequest(request);
        }
    }
}
