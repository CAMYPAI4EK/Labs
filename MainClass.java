package lab2;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MainClass {
	public static void main(String[] args) {
	JFrame frame = new JFrame();
	
	final JTextField firstField = new JTextField("Кол-во");
	final JComboBox<String> operationCombo = 
			new JComboBox<String> (new String[] {"BerlinerW","Witbier","Stout"});
	final JTextField secondField = new JTextField("Объем");
	final JButton calcButton = new JButton("узнать цену");
	final JTextField resultField = new JTextField("Итог");
	

	calcButton.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		float x = Float.parseFloat(firstField.getText());
		float y = Float.parseFloat(secondField.getText());
		float result=0;
		if(operationCombo.getSelectedItem().equals("BerlinerW")){
			result= (x*500)*y;
		}
		else if(operationCombo.getSelectedItem().equals("Witbier")) {
			result =x*600*y;
		}
		else if(operationCombo.getSelectedItem().equals("Stout")) {
			result =x*650*y;
		}
		resultField.setText(String.valueOf(result));
	}
	});
	frame.add(firstField);
	frame.add(operationCombo);
	frame.add(secondField);
	frame.add(calcButton);
	frame.add(resultField);
	frame.setSize(600,200);
	frame.setLocation(500,500);
	frame.setVisible(true);
	frame.setTitle("Пиво");
	frame.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
	}
	
}

