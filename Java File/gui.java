package gui;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
public class gui{
    gui() {
        JFrame p=new JFrame();
        p.setSize(500,300);
        p.setTitle("fibonacci numbers");
        p.setResizable(true);

        JLabel b=new JLabel("1 st number");
        b.setBounds(100, 10, 85, 20);

        JLabel c= new JLabel("2nd number");
        c.setBounds(100,60,85,20);

        JLabel s= new JLabel("numeber of terms");
        s.setBounds(300,35,120,20);

        JLabel gg= new JLabel("");
        gg.setBounds(100,180,185,120);
        gg.setFont(new Font("Serif", Font.PLAIN, 20));

        JTextArea d =new JTextArea();
        d.setBounds(100, 30, 85, 20);
        
        JTextArea h =new JTextArea();
        h.setBounds(100, 90, 85, 20);

        JTextArea u =new JTextArea();
        u.setBounds(300,65,120,20);

        JButton a = new JButton("calculate");
        a.setBounds(100, 200, 100, 20);

        p.add(a);
        p.add(b);
        p.add(s);
        p.add(u);
        p.add(d);
        p.add(c);
        p.add(h);
        p.add(gg);
        p.setVisible(true);

        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) { 
                 int q = Integer.parseInt(d.getText());
                 int w = Integer.parseInt(h.getText()); 
                 int z = Integer.parseInt(u.getText());
                 if (z==1){
                    gg.setText(String.valueOf(z) +" st term of the  fibonacci number is = " + String.valueOf(q)); 
                 }
                 else if(z==2) {
                    gg.setText(String.valueOf(z) +" nd term of the  fibonacci number is = " + String.valueOf(w)); 
                 }
                 else{
                    for(int i=0, num3=0; i<= z-3;  i++ ){
                    
                        num3 = q + w;
                        if (q> w) {
                            w = num3;			
                        }else
                        {
                            q = num3;
                        
                        } 
    
                        if (i+3==3){
                            gg.setText(String.valueOf(i+3) +" rd term of the  fibonacci number is = " + String.valueOf(num3)); 
                        }else{
                            gg.setText(String.valueOf(i+3) +" th term of the  fibonacci number is = " + String.valueOf(num3)); 
                        }
    
                                       }
                 }
                 
                                }
             }); 
    }

    public static void main(String[] args) {
        new gui();
    }
}
