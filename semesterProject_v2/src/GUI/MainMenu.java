package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import model.Sale;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vestbjerg Byggecenter");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(119, 10, 205, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Create Sale");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CreateSale_popup newWindow = new CreateSale_popup();
				newWindow.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(38, 58, 139, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSeeSales = new JButton("Find Sales");
		btnSeeSales.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSeeSales.setBounds(259, 58, 139, 29);
		frame.getContentPane().add(btnSeeSales);
		
		JButton btnFindProduct = new JButton("Find product");
		btnFindProduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFindProduct.setBounds(259, 136, 139, 29);
		frame.getContentPane().add(btnFindProduct);
		
		JButton btnCreateLoan = new JButton("Create Loan");
		btnCreateLoan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCreateLoan.setBounds(38, 97, 139, 29);
		frame.getContentPane().add(btnCreateLoan);
		
		JButton btnAddProduct = new JButton("Add Product");
		btnAddProduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddProduct.setBounds(38, 136, 139, 29);
		frame.getContentPane().add(btnAddProduct);
		
		JButton btnFindCustomer = new JButton("Find Customer");
		btnFindCustomer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFindCustomer.setBounds(259, 175, 139, 29);
		frame.getContentPane().add(btnFindCustomer);
		
		JButton btnAddCustomer = new JButton("Add Customer");
		btnAddCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddCustomer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddCustomer.setBounds(38, 175, 139, 29);
		frame.getContentPane().add(btnAddCustomer);
		
		JButton btnFindLoan = new JButton("Find Loan");
		btnFindLoan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFindLoan.setBounds(259, 97, 139, 29);
		frame.getContentPane().add(btnFindLoan);
		
		JButton btnAddContractor = new JButton("Add Contractor");
		btnAddContractor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddContractor.setBounds(38, 214, 139, 29);
		frame.getContentPane().add(btnAddContractor);
		
		JButton btnFindContractor = new JButton("Find Contractor");
		btnFindContractor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFindContractor.setBounds(259, 214, 139, 29);
		frame.getContentPane().add(btnFindContractor);
	}
}
