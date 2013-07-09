import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField a_tf;
	private JButton berechne_btn;
	private JTextField c_tf;
	private JTextField d_tf;
	private JTextField d1_tf;
	private JTextField d2_tf;
	private JTextField d3_tf;
	private JTextField d4_tf;
	private JTextField e_tf;
	private JTextField f_tf;
	private JTextField g_tf;
	private JTextField h_tf;
	private ImageIcon imageIcon;
	private JTextField l_tf;
	private final int minHight = 600;
	private final int minWidth = 900;
	private JTextField s_tf;
	private final Variable variables;

	public GUI(final Variable theVariables) {
		setTitle("Spindel Drehmoment Calculator");
		variables = theVariables;
		initWindow();
	}

	private JTextField getA_tf() {
		a_tf = new JTextField();
		return a_tf;
	}

	private JButton getBerechne_btn() {
		berechne_btn = new JButton("Berechne");
		berechne_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				// TODO Auto-generated method stub
				setVariables();

			}

			private value from(final JTextField tf) {
				return new value(Double.parseDouble(tf.getText()));
			}

			private void setVariables() {
				variables.setA(from(a_tf));
				variables.setC(from(c_tf));
				variables.setD(from(d_tf));
				variables.setD1(from(d1_tf));
				variables.setD2(from(d2_tf));
				variables.setD3(from(d3_tf));
				variables.setD4(from(d4_tf));
				variables.setE(from(e_tf));
				variables.setF(from(f_tf));
				variables.setG(from(g_tf));
				variables.setH(from(h_tf));
				variables.setL(from(l_tf));
				variables.setS(from(s_tf));
			}
		});
		return berechne_btn;
	}

	private JTextField getC_tf() {
		c_tf = new JTextField();
		return c_tf;
	}

	private JTextField getD_tf() {
		d_tf = new JTextField();
		return d_tf;
	}

	private JTextField getD1_tf() {
		d1_tf = new JTextField();
		return d1_tf;
	}

	private JTextField getD2_tf() {
		d2_tf = new JTextField();
		return d2_tf;
	}

	private JTextField getD3_tf() {
		d3_tf = new JTextField();
		return d3_tf;
	}

	private JTextField getD4_tf() {
		d4_tf = new JTextField();
		return d4_tf;
	}

	private JTextField getE_tf() {
		e_tf = new JTextField();
		return e_tf;
	}

	private JTextField getF_tf() {
		f_tf = new JTextField();
		return f_tf;
	}

	private JTextField getG_tf() {
		g_tf = new JTextField();
		return g_tf;
	}

	private JTextField getH_tf() {
		h_tf = new JTextField();
		return h_tf;
	}

	private JTextField getL_tf() {
		l_tf = new JTextField();
		return l_tf;
	}

	private JTextField getS_tf() {
		s_tf = new JTextField();
		return s_tf;
	}

	private void initImage() {
		try {
			final File imgFile = new File("skizze.jpg");
			final BufferedImage bimg = ImageIO.read(imgFile);
			imageIcon = new ImageIcon(bimg);
			imageIcon = scaleImageIcon(imageIcon,
					(int) (900.0 / (imageIcon.getIconWidth()) * 70.0));
			final JLabel image = new JLabel(imageIcon);
			add(image, BorderLayout.WEST);
		} catch (final MalformedURLException e) {
			e.printStackTrace();
			add(new JLabel("Image could not be added"));
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private void initVariableFormular() {
		final JPanel varPanel = new JPanel(new GridLayout(13, 2, 10, 10));
		varPanel.add(new JLabel("Horizontaler Abstand D4 zu D1 (A):"));
		varPanel.add(getA_tf());
		varPanel.add(new JLabel("Länge des Kipphebels (C):"));
		varPanel.add(getC_tf());
		varPanel.add(new JLabel("Vertikaler Abstand D1 zu D4 (D):"));
		varPanel.add(getD_tf());
		varPanel.add(new JLabel("(D1):"));
		varPanel.add(getD1_tf());
		varPanel.add(new JLabel("Rollendurchmesser des Ziehkeils (D2):"));
		varPanel.add(getD2_tf());
		varPanel.add(new JLabel("Rollendurchmesser des Kipphebels (D3):"));
		varPanel.add(getD3_tf());
		varPanel.add(new JLabel("Lagerdurchmesser des Muldengelenks (D4):"));
		varPanel.add(getD4_tf());
		varPanel.add(new JLabel("Abstand Spindel zu D1 (E):"));
		varPanel.add(getE_tf());
		varPanel.add(new JLabel("Muldenüberstand zu D4 (F):"));
		varPanel.add(getF_tf());
		varPanel.add(new JLabel("Schwerpunkt des Schüttguts (G):"));
		varPanel.add(getG_tf());
		varPanel.add(new JLabel("(H):"));
		varPanel.add(getH_tf());
		varPanel.add(new JLabel("Mulden- bzw. Schüttguthöhe (L):"));
		varPanel.add(getL_tf());
		varPanel.add(new JLabel("Masse des Schüttguts (S):"));
		varPanel.add(getS_tf());

		add(varPanel);
	}

	private void initWindow() {
		setMinimumSize(new Dimension(minWidth, minHight));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(10, 10));

		initImage();
		initVariableFormular();
		add(getBerechne_btn(), BorderLayout.SOUTH);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	}

	private ImageIcon scaleImageIcon(ImageIcon imageIcon, final int percent) {
		final Image img = imageIcon.getImage();
		final Image newimg = img.getScaledInstance(imageIcon.getIconWidth()
				* percent / 100, imageIcon.getIconHeight() * percent / 100,
				java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(newimg);
		return imageIcon;
	}
}
