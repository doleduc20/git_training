package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.CounterView;

public class CounterController implements ActionListener {
	private CounterView ctv;
	 public CounterController(CounterView ctv) {
		 this.ctv=ctv;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Up")) {
			this.ctv.increment();
		}else if(src.equals("Down")) {
			this.ctv.decrement();
		}else if(src.equals("Reset")) {
			this.ctv.reset();
		}
	}
	
}
