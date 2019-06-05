package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StartScreen extends JFrame {

	private JPanel contentPane;
	private JTextArea textDescription;
	private JComboBox comboIdeology;
	private String[] descriptions;
	private String[] ideoList;
	private String[] ballList;

	private boolean selected;
	private JLabel label = new JLabel();
	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {
	//	EventQueue.invokeLater(new Runnable() {
	//		public void run() {
	//			try {
	//				StartScreen frame = new StartScreen(null);
	//				frame.setVisible(true);
	//			} catch (Exception e) {
	//				e.printStackTrace();
	//			}
	//		}
	//	});
//	}

	/**
	 * Create the frame.
	 * @param eASYCLAP 
	 */
	public StartScreen(Country EASYCLAP) {
		ballList = new String[] {"Images/Cool Boi.png","Images/Neoconservaball.png", "Images/Conservaball.png", "Images/Centrism.png", "Images/Liberalism.png", "Images/Neoliberalism.png", "Images/rightboy.png", "Images/Social Democracy Ball.png", "Images/socialism.png", "Images/communism.png", "Images/libertarian.png"};
		descriptions = new String[] {"Welcome to " + EASYCLAP.getName(),
				"A form of Conservatism advocating for Free Market Capitalism and extremely right wing social policies, bordering on being reactionaries. Neoconservatives are often war hawks, and will gladly go to war if it is in their country's interests. A few notable Neoconservatives are George Bush and Ronald Reagan.",
				"Conservatism is popular right-wing ideology that advocates for capitalism, but unlike Neoconservatives they will occasionally recognize the need for the government to intervene in the economy. The foundation of Conservatism is right-wing social policy, but right wing economics are still a must. Some notable Conservatives are Andrew Scheer, Stephen Harper and most reasonable American Republicans",
				"Centrism is an ideology that supports a balance between all parts of a parties ideology. Centrists believe that either extreme is bad, and this view is reflected in their policies. Leftist social services may accepted, but balanced out by support of a free market. There is no bias towards nationalism and globalism, patriotism and support for your country are welcomed, but not at the expense of other countries. There is no significant lean libertarian or authoritarian either, and social policy is again centrist. Occasionally a progressive ideal is supported if mainstream, but rarely a conservative one.",
				"Liberalism advocates for centrist economics, but differs from Centrism in that it will take a side on social issues as well as civil issues. Liberals lean libertarian and believe in personal liberty, often the reason for their progressive social ideals. Liberals rarely posess ideals considered radical. Liberals and leftists are not to be conflated. Some well known liberals are Barack Obama and Hillary Clinton ",
				"Neoliberalism is an odd ideology because it advocates for rightist economics but progressive social policy. Neoliberalism is often a disagreeable ideology to those who do not subscribe to it because it conflicts with most other ideologies in as many ways as it agrees. Right-wingers dislike Neoliberals due to their progressive ideals, and the agreement over economic policies are not enough to bridge that gap. Leftists dislike Neoliberals due to their disagreements over economic policy, and their agreement over social policies cannot even begin to bridge the gap over economic policies. Centrists dislike Neoliberals due to them taking sides on two different issues. The fact that they've taken a right-wing stance on one issue and a left-wing stance on the other does not balance it out. Liberals are generally quite accepting of Neoliberals as their main concern is progressive social policy, the minor economic differences are of no concern here. A well known Neoliberal is Joe Biden."
				, "Fascism is an extremely authoritarian, nationalist, and reactionary system. It is infamous due to the fact that it has been the chief cause of countless genocides and world war II. Contrary to popular belief, Fascism is generally not extremely right wing economically, industries are often nationalized and social programs set up. Fascists generally support centrist to center right economics. Some notable fascists are Adolf Hitler and Mussolini   ", 
				"Social Democracy is a political ideology spawned from the belief that while capitalism is deeply flawed, socialism is either unworkable or unattainable. Social Democrats are as far left as possible while still remaining capitalist. Under Social Democracy capitalism is restrained by numerous socialist reforms, the state is responsible for maintaining the wellbeing of all citizens, social programs are the main method of acheiving this. Social Democrats are internationally minded and are extremely opposed to war. While Social Democrats believe government intervention in the economy is necessary they are not authoritarians, they do not believe the government should intervene in the lives of individuals and are extremely progressive. Some notable Social Democrats are Jack Layton and Bernie Sanders.",
				"Socialism is the belief in a society where the means of production are socially owned. This should theoretically lead to inequality and poverty being abolished, and the average person should benefit much more from his labour. Socialists generally believe that those who work harder should still benefit in some way or another. Socialists are almost always extremely progressive, but their stances on civil liberties are inconstant. Some Socialists are extreme autoritarians, while others believe that civil liberties are of the utmost important, even to the point of anarchism. Similarly, socialists also vary on how nationalist they are. Some are isolationist and believe self-sufficiency is an absolute must, others believe that international trade is a necessity and beneficial.",
				"Communism believes in social ownership of the means of production, but goes further than socialism in that it seeks to abolish social classes, money and in some cases the state. Communism is so widely varied that there are often no shared beliefs outside of economy. Stalinists and Maoists are totalitarian, meanwhile Anarcho-commmunists believe in the abolition of the state, Trotskyists are more globalist while most other communists are relatively nationalist.", "Libertarianism is the belief that civil liberties must be protected, particulary from the state. For the purposes of this game it is being used as a catch-all term for any rightwinger with libertarian views, leftist anarchists should be treated as communists for the purpose of this game."};
		selected = false;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textDescription = new JTextArea();
		textDescription.setEditable(false);
		textDescription.setBounds(239, 17, 256, 377);
		contentPane.add(textDescription);
		textDescription.setColumns(10);
		textDescription.setText(descriptions[0]);
		textDescription.setWrapStyleWord(true);
		textDescription.setLineWrap(true);
		textDescription.setEditable(false);
		
		comboIdeology = new JComboBox();
		comboIdeology.setFont(new Font("Sitka Heading", Font.PLAIN, 18));
		comboIdeology.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange()==ItemEvent.SELECTED){
					update();
				}
			}
		});
		comboIdeology.setModel(new DefaultComboBoxModel(new String[] {"Choose Your Ideology","Neoconservatism", "Conservatism", "Centrism", "Liberalism", "Neoliberalism", "Fascism", "Social Democracy", "Socialism", "Communism", "Libertarianism "}));
		comboIdeology.setSelectedIndex(0);
		comboIdeology.setBounds(20, 11, 198, 35);
		contentPane.add(comboIdeology);
		
	
		JButton btnNewButton = new JButton("Start Game");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(selected){
					openWindow();
				}
			}
			
		});
	
		btnNewButton.setBounds(40, 315, 128, 44);
		contentPane.add(btnNewButton);
		
		
		
		ImageIcon imgThisImg = new ImageIcon("Images/Cool Boi.png");
		label.setIcon(imgThisImg);
		label.setBounds(10, 55, 220, 250);
		contentPane.add(label);
		
		
	}
	
	public void update(){
		int index = comboIdeology.getSelectedIndex();
		
		
		if(selected == false){

			selected = true;
			int selectedIndex = comboIdeology.getSelectedIndex();
			ballList = new String[] {"Images/Neoconservaball.png", "Images/Conservaball.png", "Images/Centrism.png", "Images/Liberalism.png", "Images/Neoliberalism.png", "Images/rightboy.png", "Images/Social Democracy Ball.png", "Images/socialism.png", "Images/communism.png", "Images/libertarian.png"};
			ImageIcon imgThisImg = new ImageIcon(ballList[selectedIndex-1]);
			label.setIcon(imgThisImg);
			
			descriptions = new String[] {"A form of Conservatism advocating for Free Market Capitalism and extremely right wing social policies, bordering on being reactionaries. Neoconservatives are often war hawks, and will gladly go to war if it is in their country's interests. A few notable Neoconservatives are George Bush and Ronald Reagan.",
					"Conservatism is popular right-wing ideology that advocates for capitalism, but unlike Neoconservatives they will occasionally recognize the need for the government to intervene in the economy. The foundation of Conservatism is right-wing social policy, but right wing economics are still a must. Some notable Conservatives are Andrew Scheer, Stephen Harper and most reasonable American Republicans",
					"Centrism is an ideology that supports a balance between all parts of a parties ideology. Centrists believe that either extreme is bad, and this view is reflected in their policies. Leftist social services may accepted, but balanced out by support of a free market. There is no bias towards nationalism and globalism, patriotism and support for your country are welcomed, but not at the expense of other countries. There is no significant lean libertarian or authoritarian either, and social policy is again centrist. Occasionally a progressive ideal is supported if mainstream, but rarely a conservative one.",
					"Liberalism advocates for centrist economics, but differs from Centrism in that it will take a side on social issues as well as civil issues. Liberals lean libertarian and believe in personal liberty, often the reason for their progressive social ideals. Liberals rarely posess ideals considered radical. Liberals and leftists are not to be conflated. Some well known liberals are Barack Obama and Hillary Clinton ",
					"Neoliberalism is an odd ideology because it advocates for rightist economics but progressive social policy. Neoliberalism is often a disagreeable ideology to those who do not subscribe to it because it conflicts with most other ideologies in as many ways as it agrees. Right-wingers dislike Neoliberals due to their progressive ideals, and the agreement over economic policies are not enough to bridge that gap. Leftists dislike Neoliberals due to their disagreements over economic policy, and their agreement over social policies cannot even begin to bridge the gap over economic policies. Centrists dislike Neoliberals due to them taking sides on two different issues. The fact that they've taken a right-wing stance on one issue and a left-wing stance on the other does not balance it out. Liberals are generally quite accepting of Neoliberals as their main concern is progressive social policy, the minor economic differences are of no concern here. A well known Neoliberal is Joe Biden."
					, "Fascism is an extremely authoritarian, nationalist, and reactionary system. It is infamous due to the fact that it has been the chief cause of countless genocides and world war II. Contrary to popular belief, Fascism is generally not extremely right wing economically, industries are often nationalized and social programs set up. Fascists generally support centrist to center right economics. Some notable fascists are Adolf Hitler and Mussolini   ", 
					"Social Democracy is a political ideology spawned from the belief that while capitalism is deeply flawed, socialism is either unworkable or unattainable. Social Democrats are as far left as possible while still remaining capitalist. Under Social Democracy capitalism is restrained by numerous socialist reforms, the state is responsible for maintaining the wellbeing of all citizens, social programs are the main method of acheiving this. Social Democrats are internationally minded and are extremely opposed to war. While Social Democrats believe government intervention in the economy is necessary they are not authoritarians, they do not believe the government should intervene in the lives of individuals and are extremely progressive. Some notable Social Democrats are Jack Layton and Bernie Sanders.",
					"Socialism is the belief in a society where the means of production are socially owned. This should theoretically lead to inequality and poverty being abolished, and the average person should benefit much more from his labour. Socialists generally believe that those who work harder should still benefit in some way or another. Socialists are almost always extremely progressive, but their stances on civil liberties are inconstant. Some Socialists are extreme autoritarians, while others believe that civil liberties are of the utmost important, even to the point of anarchism. Similarly, socialists also vary on how nationalist they are. Some are isolationist and believe self-sufficiency is an absolute must, others believe that international trade is a necessity and beneficial.",
					"Communism believes in social ownership of the means of production, but goes further than socialism in that it seeks to abolish social classes, money and in some cases the state. Communism is so widely varied that there are often no shared beliefs outside of economy. Stalinists and Maoists are totalitarian, meanwhile Anarcho-commmunists believe in the abolition of the state, Trotskyists are more globalist while most other communists are relatively nationalist.", 
					"Libertarianism is the belief that civil liberties must be protected, particulary from the state. For the purposes of this game it is being used as a catch-all term for any rightwinger with libertarian views, leftist anarchists should be treated as communists for the purpose of this game."};
			comboIdeology.setModel(new DefaultComboBoxModel(new String[] {"Neoconservatism", "Conservatism", "Centrism", "Liberalism", "Neoliberalism", "Fascism", "Social Democracy", "Socialism", "Communism", "Libertarianism "}));
			comboIdeology.setSelectedIndex(selectedIndex-1);
			ideoList = new String[] {"Neoconservatism", "Conservatism", "Centrism", "Liberalism", "Neoliberalism", "Fascism", "Social Democracy", "Socialism", "Communism", "Libertarianism "};
			
			
		}else{
			textDescription.setText(descriptions[index]);
			ImageIcon imgThisImg = new ImageIcon(ballList[index]);
			label.setIcon(imgThisImg);
		}
		
	}
	
	public void openWindow(){
		this.setVisible(false);
		Main.setUp("TEST", ideoList[comboIdeology.getSelectedIndex()], false, 45,100000);
		
		
		
	}
}
