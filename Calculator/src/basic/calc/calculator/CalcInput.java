package basic.calc.calculator;

import java.util.Date;

	public class CalcInput {
	    private float input_1;
	    private float input_2;
	    private String operation;

	    public CalcInput() {
	    }

	    public CalcInput(float input_1, float input_2, long result, String operation, Date createdOn) {
	        this.input_1 = input_1;
	        this.input_2 = input_2;
	        this.operation = operation;
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

	    public String getOperation() {
	        return operation;
	    }

	    public void setOperation(String operation) {
	        this.operation = operation;
	    }
	}