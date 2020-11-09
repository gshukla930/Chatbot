import java.awt.event.*;
import javax.swing.*;


class Chatbot extends JFrame {
	static JTextArea txt = new JTextArea();
	static JTextField field = new JTextField();	
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setTitle("Personal ChatBot.");
		frame.add(field);
		frame.add(txt);
		txt.setLocation(1,1);
		txt.setSize(400,300);
		field.setLocation(1,300);
		field.setSize(400,60);
		field.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String msg = field.getText();
				txt.append("You: "+msg+ "\n");
				field.setText("");
				if(msg.toLowerCase().contains("hi")){
					txt.append("Bot: Hello\n");
				}
				if(msg.toLowerCase().contains("name")){
					txt.append("Bot: Mai Tumhari gf Hu aur tmhe naam bhi ni yaad:(\n");
				}
				if(msg.toLowerCase().contains("love")){
					txt.append("Bot: I Love You Too:)\n");
				}
			}
		});
	}
}