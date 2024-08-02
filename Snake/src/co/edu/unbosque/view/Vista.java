package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.unbosque.controller.Controller;

public class Vista extends JFrame{
	private JPanel inicio;
	private JButton bt1,bt2,bt3,bt4;
	private JLabel snk;
	private int corx=10,cory=10;
	public static String DERECHA ="derecha";
	public static String IZQUIERDA="izquiierda";
	public static String ARRIBA="arriba";
	public static String ABAJO="abajo";
	
	public Vista(Controller controller ) {
		setSize(500,500);
		setLocationRelativeTo(null);
		setTitle("SNAK3");
		inicio=crearInicio(controller);
		setVisible(true);
		add(inicio);
	}
	public JPanel crearInicio(Controller controller) {
		JPanel p = new JPanel();
		p.setBackground(Color.BLACK);		
		p.setLayout(null);
		snk=new JLabel("<:");
		snk.setBackground(Color.green);
		snk.setOpaque(true);
		snk.setBounds(corx, cory, 30, 30);
		p.add(snk);
		
		bt1=new JButton(DERECHA);
		bt1.setBounds(20,400,100,30);
		bt1.addActionListener(controller);
		bt2=new JButton(IZQUIERDA);
		bt2.setBounds(150,400,100,30);
		bt2.addActionListener(controller);
		p.add(bt1);
		p.add(bt2);
	return p;
		
	}
	public void moverderecha() {
		setCorx(getCorx()+10);
		getSnk().setBounds(corx,cory,30,30);
		getInicio().repaint();
	}
	public JPanel getInicio() {
		return inicio;
	}
	public void setInicio(JPanel inicio) {
		this.inicio = inicio;
	}
	public JButton getBt1() {
		return bt1;
	}
	public void setBt1(JButton bt1) {
		this.bt1 = bt1;
	}
	public JButton getBt2() {
		return bt2;
	}
	public void setBt2(JButton bt2) {
		this.bt2 = bt2;
	}
	public JButton getBt3() {
		return bt3;
	}
	public void setBt3(JButton bt3) {
		this.bt3 = bt3;
	}
	public JButton getBt4() {
		return bt4;
	}
	public void setBt4(JButton bt4) {
		this.bt4 = bt4;
	}
	public JLabel getSnk() {
		return snk;
	}
	public void setSnk(JLabel snk) {
		this.snk = snk;
	}
	public int getCorx() {
		return corx;
	}
	public void setCorx(int corx) {
		this.corx = corx;
	}
	public int getCory() {
		return cory;
	}
	public void setCory(int cory) {
		this.cory = cory;
	}
	public static String getDERECHA() {
		return DERECHA;
	}
	public static void setDERECHA(String dERECHA) {
		DERECHA = dERECHA;
	}
	public static String getIZQUIERDA() {
		return IZQUIERDA;
	}
	public static void setIZQUIERDA(String iZQUIERDA) {
		IZQUIERDA = iZQUIERDA;
	}
	public static String getARRIBA() {
		return ARRIBA;
	}
	public static void setARRIBA(String aRRIBA) {
		ARRIBA = aRRIBA;
	}
	public static String getABAJO() {
		return ABAJO;
	}
	public static void setABAJO(String aBAJO) {
		ABAJO = aBAJO;
	}
	
}
