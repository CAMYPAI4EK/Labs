package labs;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class UI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab4");
		frame.setLocation(400,400);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,1));
		frame.add(panel, BorderLayout.NORTH);
		
		JComboBox<String> box = 
				new JComboBox<String>(Aeroinfo.PLANES);
		
		JTextArea area = new JTextArea();
		area.setText("Выберите самолет");
		area.setEditable(false);
		
		BoxListener myListener =new BoxListener(box, area);
		box.addActionListener(myListener);
		
		JCheckBox check = new JCheckBox("He использовать данные по умолчанию"); 
		JTextField name = new JTextField("Введите имя:");
		JTextField sname = new JTextField("Введите фамилию:"); 
		ButtonGroup group = new ButtonGroup();
		JRadioButton mrb = new JRadioButton("Мужчина");
		JRadioButton frb = new JRadioButton("Женщина"); 
		group.add(mrb);
		group.add(frb); 
		panel.add(check); panel.add(name); panel.add(sname);
		panel.add(mrb); panel.add(frb); 
		
		CheckListener listener = new CheckListener();
		listener.components.add(name); listener.components.add(sname);
		listener.components.add(mrb); listener.components.add(frb);
		check.addActionListener(listener); 

		final JTextField greeting = new JTextField();
		name.addCaretListener(new CaretListener() {
			@Override
			public void caretUpdate(CaretEvent arg0) {}
		});
		sname.addCaretListener(new CaretListener() {
			@Override
			public void caretUpdate(CaretEvent arg0) {
				greeting.setText("Привет, "+ name.getText()+ " " + sname.getText() + "!");
			}
		});
		frame.add(greeting, BorderLayout.WEST);
		frame.add(box,BorderLayout.SOUTH);
		frame.add(area,BorderLayout.CENTER);
		frame.setVisible(true);
	}
}

