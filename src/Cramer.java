import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.awt.Font;

@SuppressWarnings("serial")
public class Cramer extends JFrame {

	private JPanel contentPane;
	private JTextField fields[] = new JTextField[12];
	private float values[] = new float[12];
	private JLabel solution = new JLabel("");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cramer frame = new Cramer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public Cramer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 493);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		for(int i = 0; i < fields.length; i++) {
			fields[i] = new JTextField();
		}
		
		
		JLabel lblNewLabel = new JLabel("x");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(87, 59, 28, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("x");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(87, 90, 28, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("x");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(87, 121, 28, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblY = new JLabel("y");
		lblY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblY.setBounds(182, 59, 8, 20);
		contentPane.add(lblY);
		
		JLabel lblY_1 = new JLabel("y");
		lblY_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblY_1.setBounds(182, 90, 8, 20);
		contentPane.add(lblY_1);
		
		JLabel lblY_2 = new JLabel("y");
		lblY_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblY_2.setBounds(182, 121, 8, 20);
		contentPane.add(lblY_2);
		
		JLabel lblNewLabel_3 = new JLabel("+");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(111, 59, 28, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("+");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(111, 90, 28, 20);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("+");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(111, 121, 28, 20);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("+");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_3.setBounds(212, 59, 28, 20);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("+");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_4.setBounds(212, 90, 28, 20);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("+");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_5.setBounds(212, 121, 28, 20);
		contentPane.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("=");
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_3_1.setBounds(307, 59, 28, 20);
		contentPane.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("=");
		lblNewLabel_3_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_3_1_1.setBounds(307, 90, 28, 20);
		contentPane.add(lblNewLabel_3_3_1_1);
		
		JLabel lblNewLabel_3_3_1_2 = new JLabel("=");
		lblNewLabel_3_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_3_1_2.setBounds(307, 119, 28, 20);
		contentPane.add(lblNewLabel_3_3_1_2);
		
		JLabel lblZ = new JLabel("z");
		lblZ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblZ.setBounds(285, 59, 8, 20);
		contentPane.add(lblZ);
		
		JLabel lblZ_1 = new JLabel("z");
		lblZ_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblZ_1.setBounds(285, 90, 8, 20);
		contentPane.add(lblZ_1);
		
		JLabel lblZ_2 = new JLabel("z");
		lblZ_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblZ_2.setBounds(285, 121, 8, 20);
		contentPane.add(lblZ_2);
		
		fields[0] = new JTextField();
		fields[0].setBounds(38, 59, 45, 20);
		fields[0].setColumns(10);
		contentPane.add(fields[0]);
		
		
		fields[1] = new JTextField();
		fields[1].setColumns(10);
		fields[1].setBounds(131, 59, 45, 20);
		contentPane.add(fields[1]);
		
		fields[2] = new JTextField();
		fields[2].setColumns(10);
		fields[2].setBounds(230, 59, 45, 20);
		contentPane.add(fields[2]);
		
		fields[3] = new JTextField();
		fields[3].setColumns(10);
		fields[3].setBounds(331, 59, 45, 20);
		contentPane.add(fields[3]);
		
		fields[4] = new JTextField();
		fields[4].setColumns(10);
		fields[4].setBounds(38, 90, 45, 20);
		contentPane.add(fields[4]);
		
		fields[5] = new JTextField();
		fields[5].setColumns(10);
		fields[5].setBounds(131, 90, 45, 20);
		contentPane.add(fields[5]);
		
		fields[6] = new JTextField();
		fields[6].setColumns(10);
		fields[6].setBounds(230, 90, 45, 20);
		contentPane.add(fields[6]);
		
		fields[7] = new JTextField();
		fields[7].setColumns(10);
		fields[7].setBounds(331, 90, 45, 20);
		contentPane.add(fields[7]);
		
		fields[8] = new JTextField();
		fields[8].setColumns(10);
		fields[8].setBounds(38, 121, 45, 20);
		contentPane.add(fields[8]);
		
		fields[9] = new JTextField();
		fields[9].setColumns(10);
		fields[9].setBounds(131, 121, 45, 20);
		contentPane.add(fields[9]);
		
		fields[10] = new JTextField();
		fields[10].setColumns(10);
		fields[10].setBounds(230, 121, 45, 20);
		contentPane.add(fields[10]);
		
		fields[11] = new JTextField();
		fields[11].setColumns(10);
		fields[11].setBounds(331, 121, 45, 20);
		contentPane.add(fields[11]);
		
		JButton calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		calculateButton.setBounds(163, 163, 89, 23);
		contentPane.add(calculateButton);
		
		solution.setFont(new Font("Tahoma", Font.PLAIN, 18));
		solution.setBounds(82, 217, 551, 153);
		contentPane.add(solution);
		
		
	}
	
	public void calculate() {
		for(int i = 0; i < fields.length; i++) {
			values[i] = Integer.valueOf(fields[i].getText());
		}

		float detA = (values[0] * values[5] * values[10]) + (values[1] * values[6] * values[8]) + (values[2] * values[4] * values[9]) - (values[8] * values[5] * values[2]) - (values[9] * values[6] * values[0]) - (values[10] * values[4] * values[1]);
		
		float detA1 = (values[3] * values[5] * values[10]) + (values[1] * values[6] * values[11]) + (values[2] * values[7] * values[9]) - (values[11] * values[5] * values[2]) - (values[9] * values[6] * values[3]) - (values[10] * values[7] * values[1]);
		
		float detA2 = (values[0] * values[7] * values[10]) + (values[3] * values[6] * values[8]) + (values[2] * values[4] * values[11]) - (values[8] * values[7] * values[2]) - (values[11] * values[6] * values[0]) - (values[10] * values[4] * values[3]);

		float detA3 = (values[0] * values[5] * values[11]) + (values[1] * values[7] * values[8]) + (values[3] * values[4] * values[9]) -(values[8] * values[5] * values[3]) - (values[9] * values[7] * values[0]) - (values[11] * values[4] * values[1]);
		
		
		float x = detA1 / detA;
		float y = detA2 / detA;
		float z = detA3 / detA;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		solution.setText("x = " + x + ",y = " + y + ", 	z = " + z);
		
		
	}
}
