package demoJavaSwing;

import javax.swing.*;

public class Form {
    private JFrame frame1;
    private int cout;
    private  int cout1;

    public Form() {
        frame1 = new JFrame("Huy Tu");
    }

    public Form(JFrame frame1) {
        this.frame1 = frame1;
    }

    public void initConfig() {
//        frame1.setTitle("This is jframe");
        frame1.setLayout(null); //Khong su dung trinh quan ly he thong ui
        frame1.setSize(400, 400);
        frame1.setLocation(100, 200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton buttonCal = new JButton("Handle");
        buttonCal.setText("hander" + cout);
        buttonCal.setBounds(100, 100, 100, 50);
        frame1.add(buttonCal);
        JButton btn2 = new JButton("btn 2");
        btn2.setBounds(210, 100, 100, 50);
        frame1.add(btn2);

        JLabel jLabel = new JLabel();
        jLabel.setText("Demo jlabel");
        jLabel.setBounds(150,150,100,100);
        frame1.add(jLabel);
        JTextField textField1 = new JTextField("Email");
        textField1.setBounds(100,50,100,30);
        frame1.add(textField1);
        frame1.addWindowListener(new CustomListenner());
    }

    public void run() {
        frame1.setVisible(true);
    }


}
