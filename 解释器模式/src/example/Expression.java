package example;

import org.junit.Test;

public abstract class Expression {
    //解释器
    public void interpret(Context context){
        if (context.getText().length() == 0){
            return;
        }
        else{
            //获取当前演奏文本的第一条命令
            //如O 3 E 0.5 G 0.5 A 3
            //获取O
            String playKey = context.getText().substring(0,1);
            context.setText(context.getText().substring(2));
            //获取参数值
            double playValue = Double.parseDouble(context.getText().substring(0,context.getText().indexOf(" ")));
            context.setText(context.getText().substring(context.getText().indexOf(" ")+1));

            excute(playKey,playValue);
        }
    }
    //执行
    public abstract void excute(String key,double value);

}


