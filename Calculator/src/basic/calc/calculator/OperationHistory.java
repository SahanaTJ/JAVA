package basic.calc.calculator;

import java.util.Date;

//@Document(collection = "operation_history")
public class OperationHistory {
    private float input_1;
    private float input_2;

    private double result;
    private String operation;

    private Date createdOn;

    public OperationHistory() {

    }

    public OperationHistory(float input_1, float input_2, long result, String operation, Date createdOn) {
        this.input_1 = input_1;
        this.input_2 = input_2;
        this.result = result;
        this.operation = operation;
        this.createdOn = createdOn;
    }

    public float getInput_1() {
        return input_1;
    }

    public void setInput_1(float input_1) {
        this.input_1 = input_1;
    }

    public float getInput_2() {
        return input_2;
    }

    public void setInput_2(float input_2) {
        this.input_2 = input_2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

}



