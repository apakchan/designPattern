package example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {
    private List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish dish){
        if(dish instanceof Meet){
            System.out.println("抱歉，红烧肉做完了，请点羊肉串吧。");
            return;
        }
        dishes.add(dish);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("增加订单 : " + dish.getClass().getName() + "，当前时间为：" + sdf.format(new Date()) );
    }

    public void cancerDish(Dish dish){
        dishes.remove(dish);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("取消订单 : " + dish.getClass().getName() + "，当前时间为：" + sdf.format(new Date()));
    }

    public void notifyAllDo(){
        for (Dish dish : dishes) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.print("执行订单 : " + dish.getClass().getName() + "，当前时间为：" + sdf.format(new Date()) + "  ");
            dish.execute();
        }
    }
}
