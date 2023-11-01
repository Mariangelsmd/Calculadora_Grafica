import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Start {

	// Declaración de los elementos
	private JFrame frmCalculadora;
	private JTextField caja1;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton boton10;
	private JButton boton11;
	private JButton boton12;
	private JButton boton13;
	private JButton boton14;
	private JButton boton15;
	private JButton boton16;
	private JButton boton17;
	private String numero1 = "";
	private String numero2 = "";
	private String accion = "";
	private float resultado = 0.0f;
	private String contenido = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	// Creación de métodos para bloquear y desbloquear teclas
	private void bloquearOp() {
		boton12.setEnabled(false);
		boton13.setEnabled(false);
		boton14.setEnabled(false);
		boton15.setEnabled(false);
		boton16.setEnabled(false);
	}

	private void bloquearNum() {
		boton1.setEnabled(false);
		boton2.setEnabled(false);
		boton3.setEnabled(false);
		boton4.setEnabled(false);
		boton5.setEnabled(false);
		boton6.setEnabled(false);
		boton7.setEnabled(false);
		boton8.setEnabled(false);
		boton9.setEnabled(false);
		boton10.setEnabled(false);
	}

	private void desbloquear() {
		boton1.setEnabled(true);
		boton2.setEnabled(true);
		boton3.setEnabled(true);
		boton4.setEnabled(true);
		boton5.setEnabled(true);
		boton6.setEnabled(true);
		boton7.setEnabled(true);
		boton8.setEnabled(true);
		boton9.setEnabled(true);
		boton10.setEnabled(true);
		boton12.setEnabled(true);
		boton13.setEnabled(true);
		boton14.setEnabled(true);
		boton15.setEnabled(true);
		boton16.setEnabled(true);
		boton17.setEnabled(true);
	}

	// Inicio del código
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setResizable(false);
		frmCalculadora.setBounds(100, 100, 353, 521);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);

		caja1 = new JTextField();
		caja1.setEditable(false);
		caja1.setForeground(new Color(0, 0, 0));
		caja1.setHorizontalAlignment(SwingConstants.RIGHT);
		caja1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		caja1.setBounds(42, 38, 253, 59);
		frmCalculadora.getContentPane().add(caja1);
		caja1.setColumns(10);

		// Boton C
		boton11 = new JButton("C");
		boton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desbloquear();
				caja1.setForeground(Color.black);
				caja1.setText("");
				numero1 = "";
				numero2 = "";
				resultado = 0.0f;
				accion = "";
				contenido = "";
			}
		});
		boton11.setBounds(42, 129, 50, 50);
		frmCalculadora.getContentPane().add(boton11);

		// Boton PAR
		boton12 = new JButton("Par");
		boton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = caja1.getText().toString();
				try {
					resultado = Float.parseFloat(numero1) % 2;
					if (resultado == 0) {
						caja1.setText("Par");
					} else {
						caja1.setText("Impar");
					}
				} catch (Exception err) {
					caja1.setForeground(Color.red);
					caja1.setText("error");
				}
				bloquearOp();
				bloquearNum();
				boton17.setEnabled(false);
			}
		});
		boton12.setBounds(102, 129, 65, 50);
		frmCalculadora.getContentPane().add(boton12);

		// Botones numéricos
		boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenido = caja1.getText().toString();
				contenido += "1";
				caja1.setText(contenido);
			}
		});
		boton1.setBounds(42, 211, 50, 50);
		frmCalculadora.getContentPane().add(boton1);

		boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenido = caja1.getText().toString();
				contenido += "2";
				caja1.setText(contenido);
			}
		});
		boton2.setBounds(102, 211, 50, 50);
		frmCalculadora.getContentPane().add(boton2);

		boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenido = caja1.getText().toString();
				contenido += "3";
				caja1.setText(contenido);
			}
		});
		boton3.setBounds(165, 211, 50, 50);
		frmCalculadora.getContentPane().add(boton3);

		boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenido = caja1.getText().toString();
				contenido += "4";
				caja1.setText(contenido);
			}
		});
		boton4.setBounds(42, 272, 50, 50);
		frmCalculadora.getContentPane().add(boton4);

		boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenido = caja1.getText().toString();
				contenido += "5";
				caja1.setText(contenido);
			}
		});
		boton5.setBounds(102, 272, 50, 50);
		frmCalculadora.getContentPane().add(boton5);

		boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenido = caja1.getText().toString();
				contenido += "6";
				caja1.setText(contenido);
			}
		});
		boton6.setBounds(165, 272, 50, 50);
		frmCalculadora.getContentPane().add(boton6);

		boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenido = caja1.getText().toString();
				contenido += "7";
				caja1.setText(contenido);
			}
		});
		boton7.setBounds(42, 333, 50, 50);
		frmCalculadora.getContentPane().add(boton7);

		boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenido = caja1.getText().toString();
				contenido += "8";
				caja1.setText(contenido);
			}
		});
		boton8.setBounds(102, 333, 50, 50);
		frmCalculadora.getContentPane().add(boton8);

		boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenido = caja1.getText().toString();
				contenido += "9";
				caja1.setText(contenido);
			}
		});
		boton9.setBounds(165, 333, 50, 50);
		frmCalculadora.getContentPane().add(boton9);

		boton10 = new JButton("0");
		boton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenido = caja1.getText().toString();
				contenido += "0";
				caja1.setText(contenido);
			}
		});
		boton10.setBounds(42, 398, 50, 50);
		frmCalculadora.getContentPane().add(boton10);

		// Boton =
		boton17 = new JButton("=");
		boton17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2 = caja1.getText().toString();
				caja1.setText("");
				try { // Además de un else if para controlar si algúno de los numeros está vacío
						// también incluyo try catch para que en el caso de que surja cualquier error
						// por casting también se pueda recoger y mostrar adecuadamente en pantalla
					if (accion.equals("+")) {
						resultado = Float.parseFloat(numero1) + Float.parseFloat(numero2);
						caja1.setText("" + (int) resultado);
					} else if (accion.equals("-")) {
						resultado = Float.parseFloat(numero1) - Float.parseFloat(numero2);
						caja1.setText("" + (int) resultado);
					} else if (accion.equals("*")) {
						resultado = Float.parseFloat(numero1) * Float.parseFloat(numero2);
						caja1.setText("" + (int) resultado);
					} else if (accion.equals("/")) {
						if (numero2.equals("0")) {
							caja1.setForeground(Color.red);
							caja1.setText("Indeterminación");
						} else {
							resultado = Float.parseFloat(numero1) / Float.parseFloat(numero2);
							caja1.setText("" + resultado);
						}
					} else if (numero1.equalsIgnoreCase("") || numero2.equalsIgnoreCase("")) {
						caja1.setForeground(Color.red);
						caja1.setText("error");
					}
				} catch (Exception err) {
					caja1.setForeground(Color.red);
					caja1.setText("error");
				}
				bloquearOp();
				bloquearNum();
				boton17.setEnabled(false);
			}
		});
		boton17.setBounds(102, 398, 113, 50);
		frmCalculadora.getContentPane().add(boton17);

		// Boton +
		boton13 = new JButton("+");
		boton13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = caja1.getText().toString();
				if (numero1.equalsIgnoreCase("")) {
					caja1.setForeground(Color.red);
					caja1.setText("error");
					boton17.setEnabled(false);
					bloquearNum();
					bloquearOp();

				} else {
					caja1.setText("");
					accion = "+";
					bloquearOp();
				}
			}
		});
		boton13.setBounds(245, 211, 50, 50);
		frmCalculadora.getContentPane().add(boton13);

		// Boton -
		boton14 = new JButton("-");
		boton14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = caja1.getText().toString();
				if (numero1.equalsIgnoreCase("")) {
					caja1.setForeground(Color.red);
					caja1.setText("error");
					boton17.setEnabled(false);
					bloquearNum();
					bloquearOp();
				} else {
					caja1.setText("");
					accion = "-";
					bloquearOp();
				}
			}
		});
		boton14.setBounds(245, 272, 50, 50);
		frmCalculadora.getContentPane().add(boton14);

		// Boton *
		boton15 = new JButton("*");
		boton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = caja1.getText().toString();
				if (numero1.equalsIgnoreCase("")) {
					caja1.setForeground(Color.red);
					caja1.setText("error");
					boton17.setEnabled(false);
					bloquearNum();
					bloquearOp();
				} else {
					caja1.setText("");
					accion = "*";
					bloquearOp();
				}
			}
		});
		boton15.setBounds(245, 333, 50, 50);
		frmCalculadora.getContentPane().add(boton15);

		// Boton /
		boton16 = new JButton("/");
		boton16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = caja1.getText().toString();
				if (numero1.equalsIgnoreCase("")) {
					caja1.setForeground(Color.red);
					caja1.setText("error");
					boton17.setEnabled(false);
					bloquearNum();
					bloquearOp();
				} else {
					caja1.setText("");
					accion = "/";
					bloquearOp();
				}
			}
		});
		boton16.setBounds(245, 398, 50, 50);
		frmCalculadora.getContentPane().add(boton16);
	}

}
