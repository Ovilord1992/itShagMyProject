package Task_3;

import Task_3.model.CalcModel;

public class Calculation {
    public static int summ(CalcModel calcModel){
        int o;
        switch (calcModel.getSum()){
            case '+' -> o = calcModel.getNum1() + calcModel.getNum2();
            case '-' -> o = calcModel.getNum1() - calcModel.getNum2();
            case '/' -> o = calcModel.getNum1() / calcModel.getNum2();
            case '*' -> o = calcModel.getNum1() * calcModel.getNum2();
            default -> throw new IllegalStateException("Unexpected value: " + calcModel.getSum());
        }
        return o;
    }
}
