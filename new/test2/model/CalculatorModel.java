package test2.model;

public class CalculatorModel {
    private double Answer;
    private double fstValue;
    private double sndValue;
    public CalculatorModel(){
       
    }
    public double getAnswer(){
        return this.Answer;
    }
    public void setAnswer(double answer){
        this.Answer=answer;

    }
    public double getfstValue(){
        return this.fstValue;
    }
    public void setfstValue(double fstValue){
        this.fstValue = fstValue;
    }
    public double getsndValue(){
        return this.sndValue;
    }
    public void setsndValue(double sndValue){
        this.sndValue = sndValue;
    }
    public void plus(){
        this.Answer = this.fstValue + this.sndValue;
    }
    public void minus(){
        this.Answer = this.fstValue - this.sndValue;
    }
    public void multiple(){
        this.Answer = this.fstValue * this.sndValue;
    }
    public void devide(){
        this.Answer = this.fstValue / this.sndValue;
    }
    public void square(){
        this.Answer = Math.pow(this.fstValue, this.sndValue);
    }
    public void mod(){
        this.Answer = this.fstValue % this.sndValue;
    }
}
