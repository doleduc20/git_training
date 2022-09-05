package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



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
        }else {
            this.menuView.setJlabel("This is button: "+src);
        }
        
    }
   

   
    
}
