package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import co.edu.unbosque.controller.Controller;

public class Vista extends JFrame{
	private JPanel inicio;
	public Vista(Controller controller ) {
		setSize(500,500);
		setLocationRelativeTo(null);
		setVisible(true);
		inicio=crearInicio();
		add(inicio);
	}
	public JPanel crearInicio() {
		JPanel p = new JPanel();
		p.setBackground(Color.red);
		return p;
		
	}
	public JPanel getInicio() {
		return inicio;
	}
	public void setInicio(JPanel inicio) {
		this.inicio = inicio;
	}

}
