package TimBuchalka.section6;

public class SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public double setFirstNumber(double firstNumber){
        return this.firstNumber = firstNumber;
    }

    public double setSecondNumber(double secondNumber){
        return  this.secondNumber= secondNumber;
    }

    public double getAdditionalResult(){
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult (){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }
        return firstNumber/secondNumber;
    }

}
