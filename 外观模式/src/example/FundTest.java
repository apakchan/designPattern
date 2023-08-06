package example;

/**
 * @author 陈柏宇
 * 我们如果采用基金类，那么用户根本就不用知道股票的具体细节，投资基金就可以回家睡觉了，一段时间就可以赎回自己的钱了，
 * 十分方便。
 */

public class FundTest {
    public static void main(String[] args) {

        Fund fund = new Fund();
        fund.BuyFund();
        fund.SellFund();

    }
}
