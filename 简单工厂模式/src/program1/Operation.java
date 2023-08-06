package program1;

/**
 * 抽象的运算符
 *
 * 以及它的四个子类
 *
 */

public abstract class Operation {
    private double _numberA = 0;
    private double _numberB = 0;

    public double get_numberA() {
        return _numberA;
    }

    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }

    public double get_numberB() {
        return _numberB;
    }

    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }

    public abstract double GetResult();
}

class OperationAdd extends Operation{

    @Override
    public double GetResult(){
        return get_numberA()+get_numberB();
    }
}

class OperationSub extends Operation{

    @Override
    public double GetResult(){
        return get_numberA()-get_numberB();
    }
}

class OperationMul extends Operation{

    @Override
    public double GetResult(){
        return get_numberA()*get_numberB();
    }
}

class OperationDiv extends Operation{

    @Override
    public double GetResult(){
      try {
          return get_numberA()/get_numberB();
      }
      catch (NumberFormatException e)
      {
          System.out.println("除数不能为0！");
      }
      return get_numberA()/get_numberB();

    }
}

