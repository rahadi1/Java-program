import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DuaTombol{

	JFrame frame;
	JLabel label;

	public static void main(String [] args){

		DuaTombol tombol = new DuaTombol();
		tombol.go();
	}

	public void go(){

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JButton tombolWarna = new JButton("Ubah Warna");
		tombolWarna.addActionListener(new ColorListener());

		JButton tombolLabel = new JButton("Ubah Label");
		tombolLabel.addActionListener(new LabelListener());

		label = new JLabel("Saya Label");
		MyDrawPanel draw = new MyDrawPanel();

		//add widget to the frame
		frame.getContentPane().add(BorderLayout.SOUTH, tombolWarna);
		frame.getContentPane().add(BorderLayout.NORTH, tombolLabel);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.getContentPane().add(BorderLayout.CENTER, draw);

		//display the frame
		frame.setSize(400, 400);
		frame.setVisible(true);
		
	}

	class ColorListener implements ActionListener{

		public void actionPerformed(ActionEvent event){

			frame.repaint();
		}
	}

	class LabelListener implements ActionListener{

		public void actionPerformed(ActionEvent event){

			label.setText("Label Berubah");
		}
	}
}
