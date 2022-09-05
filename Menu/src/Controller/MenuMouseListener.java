package Controller;

import javax.swing.event.MouseInputListener;

import View.MenuView;

public class MenuMouseListener implements MouseInputListener {
    private MenuView menuView;
    public MenuMouseListener(MenuView menuView){
        this.menuView = menuView;
    }
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        
        
    }
    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        if(e.isPopupTrigger()){
            this.menuView.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
        }
        
    }
    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.isPopupTrigger()){
            this.menuView.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }
    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
