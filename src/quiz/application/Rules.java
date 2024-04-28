package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Brainy Quest");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(128,0,125));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Embrace the challenge like a coder debugging a complex algorithm - with patience and perseverance" + "<br><br>" +
                "2. In this quiz, curiosity is your compass and knowledge your map. Navigate wisely" + "<br><br>" +
                "3. Just as a well-commented code is easy to understand, provide clear and concise answers" + "<br><br>" +
                "4. Every question is a doorway to new knowledge. Step through boldly" + "<br><br>" +
                "5. Let your answers shine brighter than a well-optimized code - precise, efficient, and effective" + "<br><br>" +
                "6.Remember, every challenge is an opportunity to grow. Embrace it with open arms" + "<br><br>" +
                "7. In this quiz, every correct answer is a victory - celebrate your triumphs, no matter how small" + "<br><br>" +
                "8. In the realm of knowledge, there are no shortcuts. Forge ahead with determination." + "<br><br>" +
            "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(128,0,125));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(128,0,125));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}