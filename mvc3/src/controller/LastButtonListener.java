package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LastButtonView;

public class LastButtonListener implements ActionListener {
	private LastButtonView lastButtonView;
	
	public LastButtonListener(LastButtonView lastButtonView) {
		this.lastButtonView = lastButtonView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("1")) {
			this.lastButtonView.set_num1();
		}else if(src.equals("2")) {
			this.lastButtonView.set_num2();
		}else if(src.equals("3")) {
			this.lastButtonView.set_num3();
		}else if(src.equals("4")) {
			this.lastButtonView.set_num4();
		}
		
	}
	
	
}
