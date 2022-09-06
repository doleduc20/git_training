package View;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controller.SignupController;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import Model.SignupModel;

public class SignupView extends JFrame {
    private SignupModel signupModel;
    public JTextField jTextField_username;
    public JPasswordField jPasswordField;
    private JButton jButton_login;
    public JCheckBox jCheckBox;
    private JButton jButton_reset;

    public SignupView(){
        this.signupModel = new SignupModel();
        this.init();
    }

    private void init() {
        this.setTitle("Signup");
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        SignupController signupController = new SignupController(this);
        Font font = new Font("Arial",Font.BOLD,25);

        JPanel jPanel_north = new JPanel();
        jPanel_north.setLayout(new BorderLayout());
        JLabel jLabel_title = new JLabel("Login form");
        jLabel_title.setFont(font);
        jPanel_north.add(jLabel_title,BorderLayout.CENTER);

        JPanel jPanel_center = new JPanel();
        jPanel_center.setLayout(new GridLayout(2,2));
        JLabel jLabel_username = new JLabel("Username:");
        jLabel_username.setFont(font);
         jTextField_username = new JTextField();
         jTextField_username.setFont(font);
         jTextField_username.setBackground(Color.BLUE);
         jTextField_username.addActionListener(signupController);
        JLabel jLabel_password = new JLabel("Password:");
        jLabel_password.setFont(font);
         jPasswordField = new JPasswordField();
         jPasswordField.setBackground(Color.BLUE);
         jPasswordField.addActionListener(signupController);
        jPanel_center.add(jLabel_username);
        jPanel_center.add(jTextField_username);
        jPanel_center.add(jLabel_password);
        jPanel_center.add(jPasswordField);
        

        JPanel jPanel_south = new JPanel();
        jPanel_south.setLayout(new BorderLayout());
         jCheckBox = new JCheckBox("Remember me?");
         jCheckBox.setFont(font);
         jButton_login = new JButton("Login");
         jButton_login.setFont(font);
         jButton_login.addActionListener(signupController);
         jButton_reset = new JButton("Reset");
         jButton_reset.setFont(font);
         jButton_reset.addActionListener(signupController);
        jPanel_south.add(jCheckBox,BorderLayout.NORTH);
        jPanel_south.add(jButton_login,BorderLayout.EAST);
        jPanel_south.add(jButton_reset,BorderLayout.WEST);

        this.setLayout(new BorderLayout());
        this.add(jPanel_north,BorderLayout.NORTH);
        this.add(jPanel_center,BorderLayout.CENTER);
        this.add(jPanel_south,BorderLayout.SOUTH);




        this.setVisible(true);
    }
    
}
