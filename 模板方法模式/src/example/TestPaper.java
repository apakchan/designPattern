package example;

public abstract class TestPaper {
    public abstract String answer1();

    public abstract String answer2();

    public abstract String answer3();

    public void question1()
    {
        System.out.println("试题1");
        System.out.println("答案：" + answer1());
    }

    public void question2()
    {
        System.out.println("试题2");
        System.out.println("答案：" + answer2());
    }

    public void question3()
    {
        System.out.println("试题3");
        System.out.println("答案：" + answer3());
    }
}
