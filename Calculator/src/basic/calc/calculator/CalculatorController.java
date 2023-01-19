package basic.calc.calculator;

import basic.calc.calculator.model.CalcInput;
import basic.calc.calculator.model.OperationHistory;
import basic.calc.calculator.repo.CalcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

  @RestController    // incoming request 
  @RequestMapping("/api/v1")    //next 

public class CalculatorController {
	
	 
		    @Autowired
		    private CalcRepository calcRepository;


		    @PostMapping("/calculate")     //uri call the front end input front resouce from the server saving some createing  data new resouce
		    public double processCalculation(@RequestBody CalcInput input) {
		        OperationHistory operationHistory=calculate(input); 
		        calcRepository.save(operationHistory);
		        return operationHistory.getResult();
		    }

		    private OperationHistory calculate(CalcInput input) {  // call method
		        OperationHistory operationHistory=new OperationHistory();  // creating opertion history  using new 

		        if(input!=null){
		            double result = 0;
		            switch (input.getOperation()){
		                case "ADD":
		                    result=input.getInput_1()+input.getInput_2();
		                    break;
		                case "SUB":
		                    result=input.getInput_1()-input.getInput_2();
		                    break;
		                case "MUL":
		                    result=input.getInput_1()*input.getInput_2();
		                    break;
		                case "DIV":
		                    result=input.getInput_1()/input.getInput_2();
		                    break;
		                default:
		                    throw new RuntimeException("Operation not supported");
		            }
		            operationHistory.setOperation(input.getOperation());
		            operationHistory.setResult(result);
		            operationHistory.setInput_1(input.getInput_1());
		            operationHistory.setInput_2(input.getInput_2());
		            operationHistory.setCreatedOn(new Date());
		        }
		        return operationHistory;
		    }

		}
	