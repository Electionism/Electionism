package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.event.MouseMotionAdapter;

public class MainGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtMenu;
	private JTextField txtReljigin;
	private JTextField txtGainSupport;
	private JTextField txtEndTurn;
	private JTextField txtAttackOpponents;
	private JTextField txtDebate;
	private JTextField txtInterview;
	private JTextField txtStats;
	private JTextField txtNews;
	private JPanel panel_2;
	static JLabel lblWeek;
	static JLabel lblMoney;
	static JTextArea textDescription;

	/**
	 * Launch the application.
	 */
	/*public static void main(Country EASYCLAP,Party user,Party enemy) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui frame = new MainGui();
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
	public MainGui(Country EASYCLAP,Party user,Party enemy, int turn) {
		setTitle("Election Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 153));
		panel.setForeground(new Color(153, 153, 153));
		panel.setBounds(0, 0, 127, 467);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtMenu = new JTextField();
		txtMenu.setBackground(new Color(102, 102, 102));
		txtMenu.setForeground(new Color(204, 204, 204));
		txtMenu.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenu.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		txtMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtMenu.setText("MENU");
		txtMenu.setEditable(false);
		txtMenu.setBounds(0, 0, 127, 31);
		panel.add(txtMenu);
		txtMenu.setColumns(10);
		
		txtReljigin = new JTextField();
		txtReljigin.setEditable(false);
		txtReljigin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				txtReljigin.setBackground(new Color(133,133,133));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtReljigin.setBackground(new Color(153, 153, 153));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Actions.Fundraise(EASYCLAP, user);
				Main.turn++;
				Main.seePolls();
				
			}
		});
		txtReljigin.setHorizontalAlignment(SwingConstants.CENTER);
		txtReljigin.setText("Make Money");
		//txtReljigin.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtReljigin.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		txtReljigin.setBackground(new Color(153, 153, 153));
		txtReljigin.setBounds(0, 94, 127, 31);
		panel.add(txtReljigin);
		txtReljigin.setColumns(10);
		
		txtGainSupport = new JTextField();
		txtGainSupport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				txtGainSupport.setBackground(new Color(133,133,133));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtGainSupport.setBackground(new Color(153, 153, 153));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Actions.Campaign(EASYCLAP, user);
				user.setFunds(user.getFunds()-25000);
				Main.turn++;
				Main.seePolls();
			}
		});
		txtGainSupport.setEditable(false);
		txtGainSupport.setText("Gain Support");
		txtGainSupport.setHorizontalAlignment(SwingConstants.CENTER);
		txtGainSupport.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		txtGainSupport.setColumns(10);
		txtGainSupport.setBackground(new Color(153, 153, 153));
		txtGainSupport.setBounds(0, 125, 127, 31);
		panel.add(txtGainSupport);
		
		txtEndTurn = new JTextField();
		txtEndTurn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				txtEndTurn.setBackground(new Color(133,133,133));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtEndTurn.setBackground(new Color(153, 153, 153));
			}}
		);
		txtEndTurn.setEditable(false);
		txtEndTurn.setText("End Turn");
		txtEndTurn.setHorizontalAlignment(SwingConstants.CENTER);
		txtEndTurn.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		txtEndTurn.setColumns(10);
		txtEndTurn.setBackground(new Color(153, 153, 153));
		txtEndTurn.setBounds(0, 334, 127, 31);
		panel.add(txtEndTurn);
		
		txtAttackOpponents = new JTextField();
		txtAttackOpponents.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				txtAttackOpponents.setBackground(new Color(133,133,133));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtAttackOpponents.setBackground(new Color(153, 153, 153));
			}			@Override
			public void mouseClicked(MouseEvent arg0) {
				Actions.Attack(EASYCLAP, enemy);
				user.setFunds(user.getFunds()-25000);
				Main.turn++;
				Main.seePolls();
			}
}
		);
		txtAttackOpponents.setEditable(false);
		txtAttackOpponents.setText("Attack");
		txtAttackOpponents.setHorizontalAlignment(SwingConstants.CENTER);
		txtAttackOpponents.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		txtAttackOpponents.setColumns(10);
		txtAttackOpponents.setBackground(new Color(153, 153, 153));
		txtAttackOpponents.setBounds(0, 156, 127, 31);
		panel.add(txtAttackOpponents);
		
		txtDebate = new JTextField();
		txtDebate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				txtDebate.setBackground(new Color(133,133,133));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtDebate.setBackground(new Color(153, 153, 153));
			}}
		);
		txtDebate.setEditable(false);
		txtDebate.setText("Debate");
		txtDebate.setHorizontalAlignment(SwingConstants.CENTER);
		txtDebate.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		txtDebate.setColumns(10);
		txtDebate.setBackground(new Color(153, 153, 153));
		txtDebate.setBounds(0, 188, 127, 31);
		panel.add(txtDebate);
		
		txtInterview = new JTextField();
		
		txtInterview.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				txtInterview.setBackground(new Color(133,133,133));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtInterview.setBackground(new Color(153, 153, 153));
			}}
		);
		txtInterview.setEditable(false);
		txtInterview.setText("Interview");
		txtInterview.setHorizontalAlignment(SwingConstants.CENTER);
		txtInterview.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		txtInterview.setColumns(10);
		txtInterview.setBackground(new Color(153, 153, 153));
		txtInterview.setBounds(0, 219, 127, 31);
		panel.add(txtInterview);
		
		txtStats = new JTextField();
		txtStats.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				txtStats.setBackground(new Color(133,133,133));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtStats.setBackground(new Color(153, 153, 153));
			}}
		);
		txtStats.setEditable(false);
		txtStats.setText("Stats");
		txtStats.setHorizontalAlignment(SwingConstants.CENTER);
		txtStats.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		txtStats.setColumns(10);
		txtStats.setBackground(new Color(153, 153, 153));
		txtStats.setBounds(0, 249, 127, 31);
		panel.add(txtStats);
		
		txtNews = new JTextField();
		txtNews.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				txtNews.setBackground(new Color(133,133,133));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtNews.setBackground(new Color(153, 153, 153));
			}
		});
		txtNews.setEditable(false);
		txtNews.setText("News");
		txtNews.setHorizontalAlignment(SwingConstants.CENTER);
		txtNews.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		txtNews.setColumns(10);
		txtNews.setBackground(new Color(153, 153, 153));
		txtNews.setBounds(0, 64, 127, 31);
		panel.add(txtNews);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(126, 30, 379, 436);
		contentPane.add(panel_1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 153, 153));
		panel_2.setBounds(126, 0, 379, 30);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		lblWeek = new JLabel("Week:"+ turn);
		lblWeek.setFont(new Font("Sitka Heading", Font.BOLD, 16));
		lblWeek.setLabelFor(this);
		lblWeek.setBounds(280, 10, 65, 15);
		panel_2.add(lblWeek);
		
		lblMoney = new JLabel("Money: "+ user.getFunds());
		lblMoney.setFont(new Font("Sitka Heading", Font.BOLD, 16));
		lblMoney.setBounds(10, 11, 300, 15);
		panel_2.add(lblMoney);
		
		textDescription = new JTextArea(3,16);
		textDescription.setEditable(false);
		textDescription.setBounds(130, 30,350, 500);
		textDescription.setColumns(10);
		textDescription.setWrapStyleWord(true);
		textDescription.setLineWrap(true);
		textDescription.setEditable(false);
		textDescription.setVisible(true);
		contentPane.add(textDescription);
	}
	public static void letMeEndThis(){

	}
}
