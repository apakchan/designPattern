package template;

/**
 * @author 陈柏宇
 * 具体主题
 */

public class ConcreteSubject extends Subject{
    //主题状态
    private String subjectState;

    public String getSubjectState()
    {
        return this.subjectState;
    }

    public void setSubjectState(String subjectState)
    {
        this.subjectState = subjectState;
    }

}
