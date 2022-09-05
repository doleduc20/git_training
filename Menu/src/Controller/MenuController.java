package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

import View.MenuView;

public class MenuController implements ActionListener  {
private MenuView menuView;
public MenuController(MenuView menuView){
    this.menuView = menuView;
}
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
         if(src.equals("Exit")){
           System.exit(0);
            // this.menuView.setJlabel("this is Exit button");
        } if(src.equals("Toolbar")){
            AbstractButton checkbox = (AbstractButton) e.getSource();
            boolean check = checkbox.getModel().isSelected();
            if(check){
                this.menuView.enableToolbar();
            }else{
                this.menuView.disableToolbar();
            }
        }
        else {
            this.menuView.setJlabel("This is button: "+src);
        }
        
    }
   

   
    
}
