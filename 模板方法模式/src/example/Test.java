package example;

public class Test {
    public static void main(String[] args) {
        System.out.println("学生A的试卷：");
        TestPaper a;
        a = new TestPaperA();
        a.question1();
        a.question2();
        a.question3();

        System.out.println("学生B的试卷");
        TestPaper b;
        b = new TestPaperB();
        b.question1();
        b.question2();
        b.question3();
    }
}
