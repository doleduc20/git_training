package View;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.CounterListener;
import Model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JButton jButton_Up;
	private JButton jButton_Down;
	private JLabel jLabel_Value;

	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Counter");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		ActionListener ac = new CounterListener(this);

		this.jButton_Up = new JButton("Up");
		jButton_Up.addActionListener(ac);

		this.jButton_Down = new JButton("Down");
		jButton_Down.addActionListener(ac);
		this.jLabel_Value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jButton_Up, BorderLayout.WEST);
		jPanel.add(jButton_Down, BorderLayout.EAST);
		jPanel.add(jLabel_Value, BorderLayout.CENTER);

		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);

	}

	public void increment() {
		this.counterModel.increment();
		this.jLabel_Value.setText(this.counterModel.getValue() + "");
	}

	public void decrement() {
		this.counterModel.decrement();
		this.jLabel_Value.setText(this.counterModel.getValue() + "");
	}
}
