package test2.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import test2.controller.CalculatorListener;
import test2.model.CalculatorModel;
public class CalculatorView extends JFrame {
    private CalculatorModel calculatorModel;
    private JTextField jTextField_fsField;
    private JTextField jTextField_snField;
    private JTextField jTextField_ansField;
    public CalculatorView(){
        this.calculatorModel = new CalculatorModel();
        this.init();
    }
    public void init(){
        this.setTitle("Calculator");
        this.setSize(500,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Font font = new Font("Arial",Font.BOLD,40);
     
        JPanel jPanel_toPanel = new JPanel();
        jPanel_toPanel.setLayout(new GridLayout(3,2));
        JLabel jLabel_fsJLabel = new JLabel("First Value");
        JLabel jLabel_snJLabel = new JLabel("Second Value");
        JLabel jLabel_ansJLabel = new JLabel("Answer");
        jTextField_fsField = new JTextField();
        jTextField_fsField.setFont(font);
         jTextField_snField = new JTextField();
         jTextField_snField.setFont(font);
         jTextField_ansField = new JTextField();
         jTextField_ansField.setFont(font);

        jPanel_toPanel.add(jLabel_fsJLabel);
        jPanel_toPanel.add(jTextField_fsField);
        jPanel_toPanel.add(jLabel_snJLabel);
        jPanel_toPanel.add(jTextField_snField);
        jPanel_toPanel.add(jLabel_ansJLabel);
        jPanel_toPanel.add(jTextField_ansField);
        CalculatorListener calculatorListener = new CalculatorListener(this);
        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2,3));
        JButton jbutton_plus = new JButton("+");
        jbutton_plus.addActionListener(calculatorListener);
        JButton jbutton_minus = new JButton("-");
        jbutton_minus.addActionListener(calculatorListener);
        JButton jbutton_multiple = new JButton("*");
        jbutton_multiple.addActionListener(calculatorListener);
        JButton jbutton_devide = new JButton("/");
        jbutton_devide.addActionListener(calculatorListener);
        JButton jbutton_square = new JButton("^");
        jbutton_square.addActionListener(calculatorListener);
        JButton jbutton_mod = new JButton("%");
        jbutton_mod.addActionListener(calculatorListener);
        jPanel_footer.add(jbutton_plus);
        jPanel_footer.add(jbutton_minus);
        jPanel_footer.add(jbutton_multiple);
        jPanel_footer.add(jbutton_devide);
        jPanel_footer.add(jbutton_square);
        jPanel_footer.add(jbutton_mod);
        this.setLayout(new BorderLayout());
        this.add(jPanel_toPanel,BorderLayout.CENTER);
        this.add(jPanel_footer,BorderLayout.SOUTH);
        this.setVisible(true);
    }
    public void plus(){
        double firstValue = Double.valueOf(jTextField_fsField.getText());
        double secondValue = Double.valueOf(jTextField_snField.getText());
        this.calculatorModel.setfstValue(firstValue);
        this.calculatorModel.setsndValue(secondValue);
        this.calculatorModel.plus();
        jTextField_ansField.setText(this.calculatorModel.getAnswer()+"");
        
    }
    public void minus(){
        double firstValue = Double.valueOf(jTextField_fsField.getText());
        double secondValue = Double.valueOf(jTextField_snField.getText());
        this.calculatorModel.setfstValue(firstValue);
        this.calculatorModel.setsndValue(secondValue);
        this.calculatorModel.minus();
        jTextField_ansField.setText(this.calculatorModel.getAnswer()+"");
        
    }
    public void multiple(){
        double firstValue = Double.valueOf(jTextField_fsField.getText());
        double secondValue = Double.valueOf(jTextField_snField.getText());
        this.calculatorModel.setfstValue(firstValue);
        this.calculatorModel.setsndValue(secondValue);
        this.calculatorModel.multiple();
        jTextField_ansField.setText(this.calculatorModel.getAnswer()+"");
        
    }
    public void devide(){
        double firstValue = Double.valueOf(jTextField_fsField.getText());
        double secondValue = Double.valueOf(jTextField_snField.getText());
        this.calculatorModel.setfstValue(firstValue);
        this.calculatorModel.setsndValue(secondValue);
        this.calculatorModel.devide();
        jTextField_ansField.setText(this.calculatorModel.getAnswer()+"");
        
    }
    public void square(){
        double firstValue = Double.valueOf(jTextField_fsField.getText());
        double secondValue = Double.valueOf(jTextField_snField.getText());
        this.calculatorModel.setfstValue(firstValue);
        this.calculatorModel.setsndValue(secondValue);
        this.calculatorModel.square();
        jTextField_ansField.setText(this.calculatorModel.getAnswer()+"");
        
    }
    public void mod(){
        double firstValue = Double.valueOf(jTextField_fsField.getText());
        double secondValue = Double.valueOf(jTextField_snField.getText());
        this.calculatorModel.setfstValue(firstValue);
        this.calculatorModel.setsndValue(secondValue);
        this.calculatorModel.mod();;
        jTextField_ansField.setText(this.calculatorModel.getAnswer()+"");
        
    }
}