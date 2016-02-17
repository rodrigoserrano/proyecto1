mport javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;

public class Ventana{

	private JPanel panelUsuario, panelPassword, panelBotones;
	private JLabel etiquetaU, etiquetaP;
	private JTextField cajaTexto;
	private JPasswordField cajaPass;
	private JButton botonAceptar, botonCancelar;
	private JFrame frame;

		public void PanelUsuario(){
		panelUsuario= new JPanel();
		etiquetaU= new JLabel("Usuario");
		cajaTexto= new JTextField(10);
		panelUsuario.setLayout( new BoxLayout(panelUsuario, BoxLayout.X_AXIS));
		panelUsuario.add(etiquetaU);
		panelUsuario.add(cajaTexto);
		}

		public void PanelPassword(){
		panelPassword=new JPanel();
        	etiquetaP= new JLabel("Password");
       	 	cajaPass = new JPasswordField(10);
        	panelPassword.setLayout(new BoxLayout(panelPassword, BoxLayout.X_AXIS));
        	panelPassword.add(etiquetaP);
        	panelPassword.add(cajaPass);
		}


		public void PanelBotones(){
		panelBotones= new JPanel();
		botonAceptar= new JButton("OK");
		botonCancelar= new JButton("Cancel");
		panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.X_AXIS));
		panelBotones.add(botonAceptar);
		panelBotones.add(botonCancelar);
		}

		public void Ventana(){
		frame= new JFrame();
		frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
		frame.add(panelUsuario);
		frame.add(panelPassword);
		frame.add(panelBotones);
		frame.pack();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}

		public VentanaJava(){
		PanelUsuario();
		PanelPassword();
		PanelBotones();
		Ventana();
		}

	public static void main (String [] arg){
	new VentanaJava();
	}
	}
