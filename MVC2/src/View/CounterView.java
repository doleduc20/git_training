package View;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Controller.CounterController;
import Model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel ctm;
	private JButton jButton_up;
	private JButton jButton_down;
	private JButton jButton_reset;
	private JLabel jLabel;

	public CounterView() {
		this.ctm = new CounterModel();
		this.init();
		this.setVisible(true);
	}

	/**
	 * 
	 */
	public void init() {
		this.setTitle("Counter");
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		ActionListener ac = new CounterController(this);
		jButton_up = new JButton("Up");
		jButton_up.addActionListener(ac);
		jButton_down = new JButton("Down");
		jButton_down.addActionListener(ac);
		jButton_reset = new JButton("Reset");
		jButton_reset.addActionListener(ac);
		jLabel = new JLabel(this.ctm.getValue() + "", JLabel.CENTER);

		JPanel jPanel_1 = new JPanel();
		jPanel_1.setLayout(new BorderLayout());
		jPanel_1.add(jButton_up, BorderLayout.WEST);
		jPanel_1.add(jButton_down, BorderLayout.EAST);
		jPanel_1.add(jLabel, BorderLayout.CENTER);
		jPanel_1.add(jButton_reset, BorderLayout.NORTH);

		this.setLayout(new BorderLayout());
		this.add(jPanel_1, BorderLayout.CENTER);

	}

	public void increment() {
		this.ctm.increment();
		this.jLabel.setText(this.ctm.getValue() + "");
	}

	public void decrement() {
		this.ctm.decrement();
		this.jLabel.setText(this.ctm.getValue() + "");
	}

	public void reset() {
		this.ctm.reset();
		this.jLabel.setText(this.ctm.getValue() + "");
	}
}
