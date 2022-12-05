package ProjFinal;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;

public class screen implements ActionListener {

    public screen(){
        JFrame jFrame= new JFrame(   "Psicologa Marta");
        jFrame.setVisible(true);
        jFrame.setSize(800,500);
        jFrame.setTitle("Psicologa Marta");
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);

        jFrame.setLayout(null);

        JButton jButton = new JButton("começar");
        jButton.setBounds(100,200,250,70);
        jButton.setFont(new Font("Arial",Font.ITALIC,40));
        jButton.setForeground(new Color(237,241,238));
        jButton.setBackground(new Color(9,10,9));

        jFrame.add(jButton);


        JButton jButton2 = new JButton("sair");
        jButton2.setBounds(500,200,250,70);
        jButton2.setFont(new Font("Arial",Font.ITALIC,40));
        jButton2.setForeground(new Color(237,241,238));
        jButton2.setBackground(new Color(9,10,9));


        jFrame.add(jButton2);

        jButton.addActionListener(this);

        jButton2.addActionListener(this);





    }



    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Bom dia agradeça a Deus");

        // TODO Auto-generated method stub

    }
    public void action(java.awt.event.ActionEvent e) {
        JOptionPane.showMessageDialog(null, "deseja mesmo sair?");

        // TODO Auto-generated method stub

    }

}

