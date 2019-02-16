import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Implementa heran�a de classe JFrame
public class HelloSwing extends JFrame {
	
	//Construtor da classe
	public HelloSwing() {
		super("Minha Janela");
		//Definir dimensao
		setSize(300,120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Cria��o de objeto Jlabel
		JLabel jlabel = new JLabel("Hello Java`s Visual World");
		JButton botaoNorth = new JButton("Norte");
		JButton botaoSouth = new JButton("Sul");
		JButton botaoEast = new JButton("Leste");
		JButton botaoWest= new JButton("Oeste");
		JButton botaoCenter = new JButton("Centro");
		
		
		add(botaoNorth,BorderLayout.NORTH);
		add(botaoSouth,BorderLayout.SOUTH);
	    add(botaoEast,BorderLayout.EAST);
		add(botaoWest,BorderLayout.WEST);
		add(botaoCenter,BorderLayout.CENTER);
		
		
		botaoCenter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Click Bot�o Centro");
			}
		});		botaoCenter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Click Bot�o Centro");
			}
		});
		botaoNorth.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Click Bot�o Norte");
			}
		});
		botaoSouth.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Click Bot�o Sul");
			}
		});
		botaoEast.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Click Bot�o Leste");
			}
		});
		botaoWest.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Click Bot�o Oeste");
			}
		});
		
		//Habilitar visibilidade do frameap�s inicializar componentes
		setVisible(true);
		System.out.println(botaoNorth.getHeight());
	}
	
	public static void main(String[] args) {
		new HelloSwing();
	}
}
