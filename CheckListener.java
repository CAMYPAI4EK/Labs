package labs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import java.util.*;

public class CheckListener implements ActionListener {
	
	public ArrayList<JComponent> components = new ArrayList<JComponent>();
	
	@Override
	public void actionPerformed (ActionEvent arg0) {
		for (JComponent comp: components ) {
			comp.setEnabled(!comp.isEnabled());
		}
	}

}
