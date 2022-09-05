package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import Controller.MenuController;
import Controller.MenuMouseListener;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class MenuView extends JFrame {
    private JLabel jLabel;
    private JMenuItem jMenuItem_cut;
    private JMenuItem jMenuItem_copy;
    private JMenuItem jMenuItem_open;
    private JMenuItem jMenuItem_exit;
     public JPopupMenu jPopupMenu;
    private JMenuItem jMenuItem_view;
    private JMenuItem jMenuItem_select;
    private JMenuItem jMenuItem_terminal;
    public MenuView(){
        this.init();
    }
    /**
     * 
     */
    public void init(){
        this.setTitle("Menu example");
        this.setSize(500,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        MenuController menuController = new MenuController(this);
        MenuMouseListener menuMouseListener = new MenuMouseListener(this);
         this.addMouseListener(menuMouseListener);
    

        JMenuBar jMenuBar = new JMenuBar();
        JToolBar jToolBar = new JToolBar();
        
        JMenu jMenu_file = new JMenu("File");
         jMenuItem_open = new JMenuItem("Open",KeyEvent.VK_O);
         jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
         jMenuItem_open.addActionListener(menuController);
         jMenuItem_exit = new JMenuItem("Exit",KeyEvent.VK_X);
         jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
         jMenuItem_exit.addActionListener(menuController);
        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);

        JMenu jMenu_edit = new JMenu("Edit");
         jMenuItem_cut = new JMenuItem("Cut",KeyEvent.VK_X);
         jMenuItem_cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));
         jMenuItem_cut.addActionListener(menuController);
         jMenuItem_copy = new JMenuItem("Copy",KeyEvent.VK_C);
         jMenuItem_copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.ALT_DOWN_MASK));
         jMenuItem_copy.addActionListener(menuController);
        jMenu_edit.add(jMenuItem_cut);
        jMenu_edit.addSeparator();
        jMenu_edit.add(jMenuItem_copy);

        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_edit);

        JButton jButton_undo = new JButton("Undo");
        jButton_undo.setToolTipText("click to cumback");
        jToolBar.add(jButton_undo);
        jButton_undo.addActionListener(menuController);

        JButton jButton_redo = new JButton("Redo");
        jButton_redo.setToolTipText("click to next");
        jToolBar.add(jButton_redo);
        jButton_redo.addActionListener(menuController);

        JButton jButton_go = new JButton("Go");
        jButton_go.setToolTipText("click to go");
        jToolBar.add(jButton_go);
        jButton_go.addActionListener(menuController);

        JButton jButton_run = new JButton("Run");
        jButton_run.setToolTipText("click to run");
        jToolBar.add(jButton_run);
        jButton_run.addActionListener(menuController);

        
         jPopupMenu = new JPopupMenu();
         JMenu jMenu_sete = new JMenu("sete");
          jMenuItem_view = new JMenuItem("View");
          jMenuItem_view.addActionListener(menuController);
          
          
          jMenuItem_select = new JMenuItem("Select");
          jMenuItem_select.addActionListener(menuController);
          jMenuItem_terminal = new JMenuItem("Terminal");
          jMenuItem_terminal.addActionListener(menuController);

            jMenu_sete.add(jMenuItem_select);
            jMenu_sete.add(jMenuItem_terminal);

            jPopupMenu.add(jMenu_sete);
         jPopupMenu.add(jMenuItem_view);
         
         
        
         
         jLabel = new JLabel();
         
        this.setLayout(new BorderLayout());
        this.setJMenuBar(jMenuBar);
        this.add(jPopupMenu);
        this.add(jLabel,BorderLayout.CENTER);
        this.add(jToolBar,BorderLayout.NORTH);
       
        this.setVisible(true);
    }
    public void setJlabel(String s){
        this.jLabel.setText(s);
    }
}
