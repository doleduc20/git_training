package Controller;

import View.SignupView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class SignupController implements ActionListener {
    private SignupView signupView;
    public SignupController(SignupView signupView){
        this.signupView = signupView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Login")){
            String username = this.signupView.jTextField_username.getText();
            String password = new String(this.signupView.jPasswordField.getPassword());
            StringBuilder sb = new StringBuilder();
            if(username.equals("")){
                sb.append("Username is empty\n");
            }
            if(password.equals("")){
                sb.append("Password is empty\n");
            }
            if(sb.length()>0){
                JOptionPane.showMessageDialog(signupView, sb.toString(), "login failure", JOptionPane.ERROR_MESSAGE);
            }
            if(username.equals("doleduc") && password.equals("123456a@")){
                sb.append("Login ok");
                this.signupView.jCheckBox.isSelected();
                sb.append("Your password is remember");
            }else{
                sb.append("Username or Password iscorect");
            }
        }else if(src.equals("Reset")){
            this.signupView.jTextField_username.setText("");
            this.signupView.jPasswordField.setText("");
        }
          
        
    }
}
