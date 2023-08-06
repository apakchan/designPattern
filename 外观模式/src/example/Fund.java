package example;

/**
 * @author 陈柏宇
 * 基金类，使用了外观模式
 */

public class Fund {
    Stock1 stock1;
    Stock2 stock2;
    Stock3 stock3;
    NationalDebt1 nationalDebt1;
    NationalDebt2 nationalDebt2;
    public Fund()
    {
        stock1 = new Stock1();
        stock2 = new Stock2();
        stock3 = new Stock3();
        nationalDebt1 = new NationalDebt1();
        nationalDebt2 = new NationalDebt2();
    }

    public void BuyFund()
    {
        stock1.buy();
        stock2.buy();
        stock3.buy();
        nationalDebt2.buy();
        nationalDebt1.buy();
    }

    public void SellFund()
    {
        stock1.sell();
        stock2.sell();
        stock3.sell();
        nationalDebt1.sell();
        nationalDebt2.sell();
    }
}
