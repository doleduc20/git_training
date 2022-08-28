package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.MiniCalculatorView;

public class MiniCalculatorController implements ActionListener {
	private MiniCalculatorView miniCalculatorView;
	
	

	public MiniCalculatorController(MiniCalculatorView miniCalculatorView) {
		
		this.miniCalculatorView = miniCalculatorView;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("+")) {
			this.miniCalculatorView.plus();
		}else if(src.equals("-")) {
			this.miniCalculatorView.minus();
		}else if(src.equals("*")) {
			this.miniCalculatorView.multiple();
		}else if(src.equals("/")) {
			this.miniCalculatorView.devide();
		}else if(src.equals("^")) {
			this.miniCalculatorView.square();
		}else if(src.equals("%")) {
			this.miniCalculatorView.mod();
		}
		
	}
}
