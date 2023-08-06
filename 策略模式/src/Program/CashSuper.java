package Program;

/**
 * 现金收费抽象父类及其子类
 * 正常收费子类  买了多少钱要多少钱
 * 打折收费子类  打 n 折    0<n<10
 * 返利收费子类  满 n 返 m  n > m   n , m ∈ N
 *
 */

public abstract class CashSuper {
    public abstract double acceptCash(double money);
}

class CashNormal extends CashSuper{

    @Override
    public double acceptCash(double money)
    {
        return money;
    }
}

class CashRebate extends CashSuper
{
    private double moneyRebate = 1;
    public CashRebate(String moneyRebate)
    {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money)
    {
        return money * moneyRebate;
    }
}

class CashReturn extends CashSuper
{
    private double moneyCondition = 0;  //满多少
    private double moneyReturn = 0;  //送多少

    public CashReturn(double moneyCondition, double moneyReturn)
    {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
    @Override
    public double acceptCash(double money)
    {
        double res = money;
        int n = (int) money / (int) moneyCondition;
        money -= n*moneyReturn;
        return money;
    }
}

/**
 * Context类 方法的集合
 *
 */
class CashContext{

    private CashSuper cs = null;

    public CashContext(String type)
    {
        switch (type)
        {
            case "正常收费":
                    cs = new CashNormal();
                    break;
            case "满300返100":
                    cs = new CashReturn(300,100);
                    break;
            case  "打八折":
                    cs = new CashRebate("0.8");
                    break;
        }
    }

    public double GetResult(double money)
    {
        return cs.acceptCash(money);
    }
}


