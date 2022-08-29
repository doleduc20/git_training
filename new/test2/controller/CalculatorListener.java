package test2.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import test2.view.CalculatorView;

public class CalculatorListener implements ActionListener {
    private CalculatorView calculatorView;
    public CalculatorListener(CalculatorView calculatorView){
        this.calculatorView = calculatorView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       String src = e.getActionCommand();
       if(src.equals("+")){
        this.calculatorView.plus();
       }else if(src.equals("-")){
        this.calculatorView.minus();
       }else if(src.equals("*")){
        this.calculatorView.multiple();
       }else if(src.equals("/")){
        this.calculatorView.devide();
       }else if(src.equals("^")){
        this.calculatorView.square();
       }else if(src.equals("%")){
        this.calculatorView.mod();
       }
        
    }
    
}
