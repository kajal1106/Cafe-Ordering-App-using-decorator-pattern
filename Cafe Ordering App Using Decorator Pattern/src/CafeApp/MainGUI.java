package CafeApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

public class MainGUI extends JFrame {

	private JPanel contentPane;
	private OrderInterface orderObj;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainGUI() {
		setTitle("McCafe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 712);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(128, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 940, 672);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel HotBeverage = new JPanel();
		HotBeverage.setBackground(new Color(255, 255, 255));
		HotBeverage.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Hot Beverages", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 0, 0)));
		HotBeverage.setBounds(12, 23, 450, 205);
		panel.add(HotBeverage);
		HotBeverage.setLayout(null);
		
		JCheckBox americano = new JCheckBox("Americano\r\n");
		americano.setForeground(new Color(0, 0, 128));
		americano.setFont(new Font("Arial", Font.BOLD, 17));
		americano.setBackground(new Color(255, 255, 255));
		americano.setBounds(19, 31, 113, 25);
		HotBeverage.add(americano);
		
		JCheckBox rdbtnCappuccino = new JCheckBox("Cappuccino\r\n");
		rdbtnCappuccino.setForeground(new Color(0, 0, 128));
		rdbtnCappuccino.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnCappuccino.setBackground(Color.WHITE);
		rdbtnCappuccino.setBounds(150, 31, 123, 25);
		HotBeverage.add(rdbtnCappuccino);
		
		JCheckBox rdbtnLatte = new JCheckBox("Latte\r\n");
		rdbtnLatte.setForeground(new Color(0, 0, 128));
		rdbtnLatte.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnLatte.setBackground(Color.WHITE);
		rdbtnLatte.setBounds(277, 32, 123, 25);
		HotBeverage.add(rdbtnLatte);
		
		JCheckBox mocha = new JCheckBox("Mocha");
		mocha.setForeground(new Color(0, 0, 128));
		mocha.setFont(new Font("Arial", Font.BOLD, 17));
		mocha.setBackground(Color.WHITE);
		mocha.setBounds(19, 70, 123, 25);
		HotBeverage.add(mocha);
		
		JCheckBox rdbtnFlatWhite = new JCheckBox("Flat White");
		rdbtnFlatWhite.setForeground(new Color(0, 0, 128));
		rdbtnFlatWhite.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnFlatWhite.setBackground(Color.WHITE);
		rdbtnFlatWhite.setBounds(150, 71, 123, 25);
		HotBeverage.add(rdbtnFlatWhite);
		
		JCheckBox rdbtnHotChocolate = new JCheckBox("Hot Chocolate");
		rdbtnHotChocolate.setForeground(new Color(0, 0, 128));
		rdbtnHotChocolate.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnHotChocolate.setBackground(Color.WHITE);
		rdbtnHotChocolate.setBounds(277, 71, 141, 25);
		HotBeverage.add(rdbtnHotChocolate);
		
		JCheckBox rdbtnStrawberryGreenTea = new JCheckBox("Strawberry Green Tea");
		rdbtnStrawberryGreenTea.setForeground(new Color(0, 0, 128));
		rdbtnStrawberryGreenTea.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnStrawberryGreenTea.setBackground(Color.WHITE);
		rdbtnStrawberryGreenTea.setBounds(19, 111, 218, 25);
		HotBeverage.add(rdbtnStrawberryGreenTea);
		
		JCheckBox rdbtnMasalaChaiLatte = new JCheckBox("Masala Chai Latte");
		rdbtnMasalaChaiLatte.setForeground(new Color(0, 0, 128));
		rdbtnMasalaChaiLatte.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnMasalaChaiLatte.setBackground(Color.WHITE);
		rdbtnMasalaChaiLatte.setBounds(277, 111, 167, 25);
		HotBeverage.add(rdbtnMasalaChaiLatte);
		
		JCheckBox mintgreentea = new JCheckBox("Macron Mint Green Tea");
		mintgreentea.setForeground(new Color(0, 0, 128));
		mintgreentea.setFont(new Font("Arial", Font.BOLD, 17));
		mintgreentea.setBackground(Color.WHITE);
		mintgreentea.setBounds(19, 151, 218, 25);
		HotBeverage.add(mintgreentea);
		
		JCheckBox holybasilchai = new JCheckBox("Holy Basil Chai");
		holybasilchai.setForeground(new Color(0, 0, 128));
		holybasilchai.setFont(new Font("Arial", Font.BOLD, 17));
		holybasilchai.setBackground(Color.WHITE);
		holybasilchai.setBounds(277, 152, 167, 25);
		HotBeverage.add(holybasilchai);
		
		JPanel ColdBeverage = new JPanel();
		ColdBeverage.setBackground(new Color(255, 255, 255));
		ColdBeverage.setForeground(new Color(0, 0, 0));
		ColdBeverage.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cold Beverages", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 0, 0)));
		ColdBeverage.setBounds(477, 23, 450, 205);
		panel.add(ColdBeverage);
		ColdBeverage.setLayout(null);
		
		JCheckBox rdbtnCookieCrumble = new JCheckBox("Cookie Crumble");
		rdbtnCookieCrumble.setForeground(new Color(0, 0, 128));
		rdbtnCookieCrumble.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnCookieCrumble.setBackground(Color.WHITE);
		rdbtnCookieCrumble.setBounds(19, 31, 153, 25);
		ColdBeverage.add(rdbtnCookieCrumble);
		
		JCheckBox rdbtnFrappuccinno = new JCheckBox("Frappuccinno");
		rdbtnFrappuccinno.setForeground(new Color(0, 0, 128));
		rdbtnFrappuccinno.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnFrappuccinno.setBackground(Color.WHITE);
		rdbtnFrappuccinno.setBounds(225, 32, 141, 25);
		ColdBeverage.add(rdbtnFrappuccinno);
		
		JCheckBox rdbtnLemonIceTea = new JCheckBox("Lemon Ice Tea");
		rdbtnLemonIceTea.setForeground(new Color(0, 0, 128));
		rdbtnLemonIceTea.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnLemonIceTea.setBackground(Color.WHITE);
		rdbtnLemonIceTea.setBounds(19, 71, 153, 25);
		ColdBeverage.add(rdbtnLemonIceTea);
		
		JCheckBox rdbtnBerryLemonadeSplash = new JCheckBox("Berry Lemonade Splash");
		rdbtnBerryLemonadeSplash.setForeground(new Color(0, 0, 128));
		rdbtnBerryLemonadeSplash.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnBerryLemonadeSplash.setBackground(Color.WHITE);
		rdbtnBerryLemonadeSplash.setBounds(225, 71, 217, 25);
		ColdBeverage.add(rdbtnBerryLemonadeSplash);
		
		JCheckBox rdbtnGreenAppleTea = new JCheckBox("Green Apple Tea");
		rdbtnGreenAppleTea.setForeground(new Color(0, 0, 128));
		rdbtnGreenAppleTea.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnGreenAppleTea.setBackground(Color.WHITE);
		rdbtnGreenAppleTea.setBounds(19, 111, 173, 25);
		ColdBeverage.add(rdbtnGreenAppleTea);
		
		JCheckBox rdbtnVeganspressoShake = new JCheckBox("Veganspresso Shake");
		rdbtnVeganspressoShake.setForeground(new Color(0, 0, 128));
		rdbtnVeganspressoShake.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnVeganspressoShake.setBackground(Color.WHITE);
		rdbtnVeganspressoShake.setBounds(225, 112, 193, 25);
		ColdBeverage.add(rdbtnVeganspressoShake);
		
		JCheckBox shareshake = new JCheckBox("Share Shake Espresso & Brownie Overload");
		shareshake.setForeground(new Color(0, 0, 128));
		shareshake.setFont(new Font("Arial", Font.BOLD, 17));
		shareshake.setBackground(Color.WHITE);
		shareshake.setBounds(19, 151, 369, 25);
		ColdBeverage.add(shareshake);
		
		JPanel Sides = new JPanel();
		Sides.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Sides", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 0, 0)));
		Sides.setBackground(new Color(255, 255, 255));
		Sides.setBounds(12, 230, 450, 238);
		panel.add(Sides);
		Sides.setLayout(null);
		
		JCheckBox rdbtnFries = new JCheckBox("Cheese Overloaded Fries");
		rdbtnFries.setForeground(new Color(0, 0, 128));
		rdbtnFries.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnFries.setBackground(Color.WHITE);
		rdbtnFries.setBounds(19, 31, 243, 25);
		Sides.add(rdbtnFries);
		
		JCheckBox rdbtnVegPizzaMcpuff = new JCheckBox("Veg Pizza McPuff");
		rdbtnVegPizzaMcpuff.setForeground(new Color(0, 0, 128));
		rdbtnVegPizzaMcpuff.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnVegPizzaMcpuff.setBackground(Color.WHITE);
		rdbtnVegPizzaMcpuff.setBounds(272, 32, 167, 25);
		Sides.add(rdbtnVegPizzaMcpuff);
		
		JCheckBox rdbtnTomatoBasilAnd = new JCheckBox("Tomato Basil And Cheese");
		rdbtnTomatoBasilAnd.setForeground(new Color(0, 0, 128));
		rdbtnTomatoBasilAnd.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnTomatoBasilAnd.setBackground(Color.WHITE);
		rdbtnTomatoBasilAnd.setBounds(19, 71, 243, 25);
		Sides.add(rdbtnTomatoBasilAnd);
		
		JCheckBox rdbtnChickenNuggets = new JCheckBox("Chicken Nuggets");
		rdbtnChickenNuggets.setForeground(new Color(0, 0, 128));
		rdbtnChickenNuggets.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnChickenNuggets.setBackground(Color.WHITE);
		rdbtnChickenNuggets.setBounds(272, 72, 167, 25);
		Sides.add(rdbtnChickenNuggets);
		
		JCheckBox Periperi = new JCheckBox("Peri Peri French Fries");
		Periperi.setForeground(new Color(0, 0, 128));
		Periperi.setFont(new Font("Arial", Font.BOLD, 17));
		Periperi.setBackground(Color.WHITE);
		Periperi.setBounds(19, 111, 243, 25);
		Sides.add(Periperi);
		
		JCheckBox rdbtnBruschetta = new JCheckBox("Bruschetta");
		rdbtnBruschetta.setForeground(new Color(0, 0, 128));
		rdbtnBruschetta.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnBruschetta.setBackground(Color.WHITE);
		rdbtnBruschetta.setBounds(272, 112, 141, 25);
		Sides.add(rdbtnBruschetta);
		
		JCheckBox rdbtnMasalaWedges = new JCheckBox("Masala Wedges");
		rdbtnMasalaWedges.setForeground(new Color(0, 0, 128));
		rdbtnMasalaWedges.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnMasalaWedges.setBackground(Color.WHITE);
		rdbtnMasalaWedges.setBounds(19, 151, 167, 25);
		Sides.add(rdbtnMasalaWedges);
		
		JCheckBox rdbtnGarlicBread = new JCheckBox("Garlic Bread");
		rdbtnGarlicBread.setForeground(new Color(0, 0, 128));
		rdbtnGarlicBread.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnGarlicBread.setBackground(Color.WHITE);
		rdbtnGarlicBread.setBounds(272, 152, 167, 25);
		Sides.add(rdbtnGarlicBread);
		
		JCheckBox rdbtnChilliCheeseToast = new JCheckBox("Chilli Cheese Toast");
		rdbtnChilliCheeseToast.setForeground(new Color(0, 0, 128));
		rdbtnChilliCheeseToast.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnChilliCheeseToast.setBackground(Color.WHITE);
		rdbtnChilliCheeseToast.setBounds(19, 191, 197, 25);
		Sides.add(rdbtnChilliCheeseToast);
		
		JCheckBox smosa = new JCheckBox("Samosa");
		smosa.setForeground(new Color(0, 0, 128));
		smosa.setFont(new Font("Arial", Font.BOLD, 17));
		smosa.setBackground(Color.WHITE);
		smosa.setBounds(272, 192, 167, 25);
		Sides.add(smosa);
		
		JPanel Desserts = new JPanel();
		Desserts.setForeground(new Color(128, 0, 0));
		Desserts.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Desserts", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 0, 0)));
		Desserts.setBackground(new Color(255, 255, 255));
		Desserts.setBounds(477, 230, 450, 238);
		panel.add(Desserts);
		Desserts.setLayout(null);
		
		JCheckBox rdbtnVanillaChocolateMuffin = new JCheckBox("Chocolate Truffle");
		rdbtnVanillaChocolateMuffin.setForeground(new Color(0, 0, 128));
		rdbtnVanillaChocolateMuffin.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnVanillaChocolateMuffin.setBackground(Color.WHITE);
		rdbtnVanillaChocolateMuffin.setBounds(19, 33, 173, 25);
		Desserts.add(rdbtnVanillaChocolateMuffin);
		
		JCheckBox cheesecake = new JCheckBox("Cheesecake");
		cheesecake.setForeground(new Color(0, 0, 128));
		cheesecake.setFont(new Font("Arial", Font.BOLD, 17));
		cheesecake.setBackground(Color.WHITE);
		cheesecake.setBounds(211, 34, 173, 25);
		Desserts.add(cheesecake);
		
		JCheckBox rdbtnChocolateChipMuffin = new JCheckBox("Choco Chip Muffin");
		rdbtnChocolateChipMuffin.setForeground(new Color(0, 0, 128));
		rdbtnChocolateChipMuffin.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnChocolateChipMuffin.setBackground(Color.WHITE);
		rdbtnChocolateChipMuffin.setBounds(19, 71, 180, 25);
		Desserts.add(rdbtnChocolateChipMuffin);
		
		JCheckBox rdbtnChocoMarbleSlice = new JCheckBox("Choco Marble Slice Cake");
		rdbtnChocoMarbleSlice.setForeground(new Color(0, 0, 128));
		rdbtnChocoMarbleSlice.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnChocoMarbleSlice.setBackground(Color.WHITE);
		rdbtnChocoMarbleSlice.setBounds(211, 72, 231, 25);
		Desserts.add(rdbtnChocoMarbleSlice);
		
		JCheckBox rdbtnChocolateCookie = new JCheckBox("Chocolate Cookie");
		rdbtnChocolateCookie.setForeground(new Color(0, 0, 128));
		rdbtnChocolateCookie.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnChocolateCookie.setBackground(Color.WHITE);
		rdbtnChocolateCookie.setBounds(19, 112, 180, 25);
		Desserts.add(rdbtnChocolateCookie);
		
		JCheckBox rdbtnDoubleChocolateCookie = new JCheckBox("Double Chocolate Cookie");
		rdbtnDoubleChocolateCookie.setForeground(new Color(0, 0, 128));
		rdbtnDoubleChocolateCookie.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnDoubleChocolateCookie.setBackground(Color.WHITE);
		rdbtnDoubleChocolateCookie.setBounds(211, 113, 231, 25);
		Desserts.add(rdbtnDoubleChocolateCookie);
		
		JCheckBox rdbtnWalnutBrownie = new JCheckBox("Walnut Brownie");
		rdbtnWalnutBrownie.setForeground(new Color(0, 0, 128));
		rdbtnWalnutBrownie.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnWalnutBrownie.setBackground(Color.WHITE);
		rdbtnWalnutBrownie.setBounds(19, 152, 180, 25);
		Desserts.add(rdbtnWalnutBrownie);
		
		JCheckBox rdbtnDeathByChcolate = new JCheckBox("Death By Chcolate");
		rdbtnDeathByChcolate.setForeground(new Color(0, 0, 128));
		rdbtnDeathByChcolate.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnDeathByChcolate.setBackground(Color.WHITE);
		rdbtnDeathByChcolate.setBounds(211, 153, 231, 25);
		Desserts.add(rdbtnDeathByChcolate);
		
		JCheckBox rdbtnMintyMidnight = new JCheckBox("\r\nMinty Midnight");
		rdbtnMintyMidnight.setForeground(new Color(0, 0, 128));
		rdbtnMintyMidnight.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnMintyMidnight.setBackground(Color.WHITE);
		rdbtnMintyMidnight.setBounds(19, 191, 152, 25);
		Desserts.add(rdbtnMintyMidnight);
		
		JCheckBox rdbtnTiramisu_1_1 = new JCheckBox("Tiramisu");
		rdbtnTiramisu_1_1.setForeground(new Color(0, 0, 128));
		rdbtnTiramisu_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnTiramisu_1_1.setBackground(Color.WHITE);
		rdbtnTiramisu_1_1.setBounds(172, 191, 101, 25);
		Desserts.add(rdbtnTiramisu_1_1);
		
		JCheckBox rdbtnRedvelvetCake = new JCheckBox("Red-velvet cake");
		rdbtnRedvelvetCake.setForeground(new Color(0, 0, 128));
		rdbtnRedvelvetCake.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnRedvelvetCake.setBackground(Color.WHITE);
		rdbtnRedvelvetCake.setBounds(277, 192, 152, 25);
		Desserts.add(rdbtnRedvelvetCake);
		
		JPanel size = new JPanel();
		size.setBackground(new Color(255, 255, 255));
		size.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Size", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 0, 0)));
		size.setBounds(22, 481, 440, 100);
		panel.add(size);
		size.setLayout(null);
		
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		rdbtnSmall.setBounds(19, 23, 111, 40);
		rdbtnSmall.setToolTipText("");
		rdbtnSmall.setForeground(new Color(0, 0, 128));
		rdbtnSmall.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnSmall.setBackground(Color.WHITE);
		size.add(rdbtnSmall);
		
		JRadioButton rdbtnRegular = new JRadioButton("Regular");
		rdbtnRegular.setToolTipText("");
		rdbtnRegular.setForeground(new Color(0, 0, 128));
		rdbtnRegular.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnRegular.setBackground(Color.WHITE);
		rdbtnRegular.setBounds(145, 23, 111, 40);
		size.add(rdbtnRegular);
		
		JRadioButton rdbtnGrande = new JRadioButton("Grande");
		rdbtnGrande.setToolTipText("");
		rdbtnGrande.setForeground(new Color(0, 0, 128));
		rdbtnGrande.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnGrande.setBackground(Color.WHITE);
		rdbtnGrande.setBounds(291, 23, 99, 40);
		size.add(rdbtnGrande);
		
		JPanel size_1 = new JPanel();
		size_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Toppings", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 0, 0)));
		size_1.setBackground(new Color(255, 255, 255));
		size_1.setBounds(487, 481, 440, 100);
		panel.add(size_1);
		size_1.setLayout(null);
		
		JRadioButton rdbtnCream = new JRadioButton("Cream");
		rdbtnCream.setToolTipText("");
		rdbtnCream.setForeground(new Color(0, 0, 128));
		rdbtnCream.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnCream.setBackground(Color.WHITE);
		rdbtnCream.setBounds(19, 25, 99, 40);
		size_1.add(rdbtnCream);
		
		JRadioButton rdbtnHazelnut = new JRadioButton("Hazelnut");
		rdbtnHazelnut.setToolTipText("");
		rdbtnHazelnut.setForeground(new Color(0, 0, 128));
		rdbtnHazelnut.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnHazelnut.setBackground(Color.WHITE);
		rdbtnHazelnut.setBounds(139, 29, 99, 40);
		size_1.add(rdbtnHazelnut);
		
		JRadioButton rdbtnMint = new JRadioButton("Peppermint");
		rdbtnMint.setToolTipText("");
		rdbtnMint.setForeground(new Color(0, 0, 128));
		rdbtnMint.setFont(new Font("Arial", Font.BOLD, 17));
		rdbtnMint.setBackground(Color.WHITE);
		rdbtnMint.setBounds(273, 25, 127, 40);
		size_1.add(rdbtnMint);
		
		JButton checkout = new JButton("CHECKOUT");
		checkout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				orderObj = new Order("Order",0);
				if(americano.isSelected()) {
					orderObj = new Americano(orderObj);
				}
				if(rdbtnCappuccino .isSelected()) {
					orderObj = new Cappuccino(orderObj);
				}
				if(mocha.isSelected()) {
					orderObj = new Mocha(orderObj);
				}
				if(rdbtnLatte .isSelected()) {
					orderObj = new Latte(orderObj);
				}
				if(rdbtnStrawberryGreenTea.isSelected()) {
					orderObj = new StrawberryGreenTea(orderObj);
				}
				if(mintgreentea.isSelected()) {
					orderObj = new MintGreenTea(orderObj);
				}
				if(rdbtnFlatWhite.isSelected()) {
					orderObj = new FlatWhite(orderObj);
				}
				if(rdbtnHotChocolate.isSelected()) {
					orderObj = new HotChocolate(orderObj);
				}
				if(rdbtnMasalaChaiLatte .isSelected()) {
					orderObj = new MasalaChaiLatte(orderObj);
				}
				if(holybasilchai.isSelected()) {
					orderObj = new HolyBasilChai(orderObj);
				}
				if(shareshake	 .isSelected()) {
					orderObj = new EspressoShake(orderObj);
				}
				if(rdbtnCookieCrumble	.isSelected()) {
					orderObj = new CookieCrumble(orderObj);
				}
				if(rdbtnFrappuccinno	.isSelected()) {
					orderObj = new Frappuccino(orderObj);
				}
				if(rdbtnLemonIceTea	.isSelected()) {
					orderObj = new Lemonicetea(orderObj);
				}
				if(rdbtnBerryLemonadeSplash	.isSelected()) {
					orderObj = new BerryLemonade(orderObj);
				}
				if(rdbtnGreenAppleTea	 .isSelected()) {
					orderObj = new GreenAppleTea(orderObj);
				}
				if(rdbtnVeganspressoShake	.isSelected()) {
					orderObj = new Veganspresso(orderObj);
				}
				if(rdbtnFries		 .isSelected()) {
					orderObj = new Fries(orderObj);
				}
				if(rdbtnVegPizzaMcpuff		.isSelected()) {
					orderObj = new VegPuff(orderObj);
				}
				if(rdbtnMasalaWedges		.isSelected()) {
					orderObj = new MasalaWedges(orderObj);
				}
				if(rdbtnTomatoBasilAnd	.isSelected()) {
					orderObj = new BasilCheese(orderObj);
				}
				if(rdbtnChickenNuggets		.isSelected()) {
					orderObj = new Nuggets(orderObj);
				}
				if(Periperi	 .isSelected()) {
					orderObj = new PeriperiFries(orderObj);
				}
				if(rdbtnBruschetta	.isSelected()) {
					orderObj = new Bruschetta(orderObj);
				}
				
				if(rdbtnGarlicBread		.isSelected()) {
					orderObj = new GarlicBread(orderObj);
				}
				if(rdbtnChilliCheeseToast		.isSelected()) {
					orderObj = new ChilliCheeseToast(orderObj);
				}
				if(smosa			.isSelected()) {
					orderObj = new Samosa(orderObj);
				}
				if(rdbtnVanillaChocolateMuffin	 .isSelected()) {
					orderObj = new ChocolateTruffle(orderObj);
				}
				if(rdbtnChocolateChipMuffin	 .isSelected()) {
					orderObj = new ChocochipMuffin(orderObj);
				}
				if(rdbtnChocolateCookie	.isSelected()) {
					orderObj = new ChocolateCookie(orderObj);
				}
				if(rdbtnWalnutBrownie	 .isSelected()) {
					orderObj = new Brownie(orderObj);
				}
				if(rdbtnMintyMidnight	.isSelected()) {
					orderObj = new MintyMidnight(orderObj);
				}
				if(cheesecake	.isSelected()) {
					orderObj = new Cheescake(orderObj);
				}
				if(rdbtnChocoMarbleSlice	.isSelected()) {
					orderObj = new ChocoMarble(orderObj);
				}
				if(rdbtnDoubleChocolateCookie	.isSelected()) {
					orderObj = new ChocolateCookie(orderObj);
				}
				if(rdbtnDeathByChcolate	 .isSelected()) {
					orderObj = new DeathByChocolate(orderObj);
				}
				if(rdbtnRedvelvetCake	.isSelected()) {
					orderObj = new RedVelvateCake(orderObj);
				}
				if(rdbtnTiramisu_1_1		 .isSelected()) {
					orderObj = new Tiramisu(orderObj);
				}
				if(rdbtnSmall.isSelected()) {
					orderObj = new Small(orderObj);
				}
				if(rdbtnRegular.isSelected()) {
					orderObj = new Regular(orderObj);
				}
				if(rdbtnGrande.isSelected()) {
					orderObj = new Grande(orderObj);
				}
				if(rdbtnCream.isSelected()) {
					orderObj = new Cream(orderObj);
				}
				if(rdbtnHazelnut.isSelected()) {
					orderObj = new Hazelnut(orderObj);
				}
				if(rdbtnMint.isSelected()) {
					orderObj = new Peppermint(orderObj);
				}
				JOptionPane.showMessageDialog(null, "Total cost of Order is "+orderObj.cost());
			}
		});
		checkout.setFont(new Font("Arial Black", Font.PLAIN, 17));
		checkout.setBackground(new Color(255, 255, 255));
		checkout.setBounds(419, 605, 155, 35);
		panel.add(checkout);
		
		JLabel datetime = new JLabel("");
		datetime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		datetime.setBounds(692, 5, 216, 20);
		panel.add(datetime);
		 SimpleDateFormat SimpleDate = new SimpleDateFormat("dd MMMM yyyy");
		SimpleDateFormat SimpleTime = new SimpleDateFormat("H:mm:ss");

	    Timer SimpleTimer = new Timer(1000, new ActionListener(){
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	            	     datetime.setText(SimpleTime.format(new Date()) + " " + SimpleDate.format(new Date()));
	        }
	    });
	    SimpleTimer.start();
//		datetime.setText();
	}
}
