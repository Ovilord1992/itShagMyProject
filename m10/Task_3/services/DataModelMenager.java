package Task_3.services;

import Task_3.Calculation;
import Task_3.model.CalcModel;
import Task_3.textworcker.TextParser;

import java.io.IOException;

public class DataModelMenager {
    CalcModel calcModel = new CalcModel();
    TextParser textParser = new TextParser();
    public int add(int num1, int num2, char sumbol) throws IOException {
        calcModel.setNum1(num1);
        calcModel.setNum2(num2);
        calcModel.setSum(sumbol);
        textParser.record(calcModel, Calculation.summ(calcModel));
        return Calculation.summ(calcModel);
    }
}
