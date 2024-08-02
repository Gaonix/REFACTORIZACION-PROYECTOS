package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.Vista;

public class Controller  implements ActionListener{
	private Vista vis;
	public Controller() {

	vis= new Vista(this);
			}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equalsIgnoreCase(vis.getDERECHA())) {	
			vis.moverderecha();
			vis.getInicio().repaint();
		}
	}

}
