package template;

public abstract class Handler {
    //继任者
    protected Handler successor;

    //设置继任者
    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    //处理请求
    public abstract void handleRequest(int request);
}
