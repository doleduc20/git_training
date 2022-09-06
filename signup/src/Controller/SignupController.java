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
            sb.append("Username is empty \n");
        }
        if(password.equals("")){
            sb.append("Password is empty \n");
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(signupView, sb.toString(), "Invalidation", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(username.equals("doleduc") && password.equals("123456a@")){
            JOptionPane.showMessageDialog(signupView, "Login ok");
            if(this.signupView.jCheckBox.isSelected()){
                JOptionPane.showMessageDialog(signupView, "Login information is remember");
            }
        }else{
            JOptionPane.showMessageDialog(signupView, "Invalid username or password", "Failure", JOptionPane.ERROR_MESSAGE);
        }
        
    }else if(src.equals("Reset")){
        this.signupView.jTextField_username.setText("");
        this.signupView.jPasswordField.setText("");
        this.signupView.jCheckBox.setSelected(true);
    }
    }
}
