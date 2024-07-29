import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.DoubleBuffer;

public class Main {
    public static void main(String[] args) {

        JFrame frm = new JFrame();
        frm.setTitle("PUAN HESAPLAMA ROBOTU");
        frm.setLayout(null);
        frm.setDefaultCloseOperation(3);

        frm.setBounds(200, 200, 800, 400);
        frm.setResizable(false);
        ImageIcon img = new ImageIcon("src/logo.png");
        frm.setIconImage(img.getImage());

        Border b1 = BorderFactory.createLineBorder(Color.gray, 1);
        JLabel l1 = new JLabel();
        JLabel l2 = new JLabel("TÜRKÇE");
        JLabel l3 = new JLabel("MATEMATİK");
        JLabel l4 = new JLabel("FEN BİLGİSİ");
        JLabel l5 = new JLabel("SOSYAL BİLGİLER");
        JLabel l6 = new JLabel("İNGİLİZCE");
        JLabel l7 = new JLabel("DOĞRU");
        JLabel l8 = new JLabel("YANLIŞ");
        JLabel l9 = new JLabel("NET");
        JLabel l10 = new JLabel();
        JLabel l11 = new JLabel();
        JLabel l12 = new JLabel();
        JLabel l13 = new JLabel();
        JLabel l14 = new JLabel();

        JButton btn1 = new JButton("NET HESAPLA");
        JButton btn2 = new JButton("PUAN HESAPLA");
        btn1.setBounds(200, 250, 140, 30);
        btn2.setBounds(200, 290, 140, 30);
        frm.add(btn1);
        frm.add(btn2);


        l1.setBounds(350, 290, 120, 30);
        l2.setBounds(200, 50, 120, 30);
        l3.setBounds(200, 90, 120, 30);
        l4.setBounds(200, 130, 120, 30);
        l5.setBounds(200, 170, 120, 30);
        l6.setBounds(200, 210, 120, 30);
        l7.setBounds(330, 15, 60, 30);
        l8.setBounds(400, 15, 60, 30);
        l9.setBounds(470, 15, 60, 30);
        l10.setBounds(470, 50, 60, 30);
        l11.setBounds(470, 90, 60, 30);
        l12.setBounds(470, 130, 60, 30);
        l13.setBounds(470, 170, 60, 30);
        l14.setBounds(470, 210, 60, 30);

        l1.setBorder(b1);
        l2.setBorder(b1);
        l3.setBorder(b1);
        l4.setBorder(b1);
        l5.setBorder(b1);
        l6.setBorder(b1);
        l7.setBorder(b1);
        l8.setBorder(b1);
        l9.setBorder(b1);
        l10.setBorder(b1);
        l11.setBorder(b1);
        l12.setBorder(b1);
        l13.setBorder(b1);
        l14.setBorder(b1);

        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l3.setHorizontalAlignment(SwingConstants.CENTER);
        l4.setHorizontalAlignment(SwingConstants.CENTER);
        l5.setHorizontalAlignment(SwingConstants.CENTER);
        l6.setHorizontalAlignment(SwingConstants.CENTER);

        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();
        JTextField tf4 = new JTextField();
        JTextField tf5 = new JTextField();
        JTextField tf6 = new JTextField();
        JTextField tf7 = new JTextField();
        JTextField tf8 = new JTextField();
        JTextField tf9 = new JTextField();
        JTextField tf10 = new JTextField();

        tf1.setBounds(330, 50, 60, 30);
        tf2.setBounds(330, 90, 60, 30);
        tf3.setBounds(330, 130, 60, 30);
        tf4.setBounds(330, 170, 60, 30);
        tf5.setBounds(330, 210, 60, 30);

        tf6.setBounds(400, 50, 60, 30);
        tf7.setBounds(400, 90, 60, 30);
        tf8.setBounds(400, 130, 60, 30);
        tf9.setBounds(400, 170, 60, 30);
        tf10.setBounds(400, 210, 60, 30);

        frm.add(tf1);
        frm.add(tf2);
        frm.add(tf3);
        frm.add(tf4);
        frm.add(tf5);
        frm.add(tf6);
        frm.add(tf7);
        frm.add(tf8);
        frm.add(tf9);
        frm.add(tf10);

        tf1.setText("0");
        tf2.setText("0");
        tf3.setText("0");
        tf4.setText("0");
        tf5.setText("0");
        tf6.setText("0");
        tf7.setText("0");
        tf8.setText("0");
        tf9.setText("0");
        tf10.setText("0");


        frm.add(l1);
        frm.add(l2);
        frm.add(l3);
        frm.add(l4);
        frm.add(l5);
        frm.add(l6);
        frm.add(l7);
        frm.add(l8);
        frm.add(l9);
        frm.add(l10);
        frm.add(l11);
        frm.add(l12);
        frm.add(l13);
        frm.add(l14);

        frm.setVisible(true);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double td, ty, tn, md, my, mn, fd, fy, fn, sd, sy, sn, id, iy, in;
                td = Double.parseDouble(tf1.getText());
                ty = Double.parseDouble(tf6.getText());
                md = Double.parseDouble(tf2.getText());
                my = Double.parseDouble(tf7.getText());
                fd = Double.parseDouble(tf3.getText());
                fy = Double.parseDouble(tf8.getText());
                sd = Double.parseDouble(tf4.getText());
                sy = Double.parseDouble(tf9.getText());
                id = Double.parseDouble(tf5.getText());
                iy = Double.parseDouble(tf10.getText());

                tn = td - (ty / 3);
                mn = md - (my / 3);
                fn = fd - (fy / 3);
                sn = sd - (sy / 3);
                in = id - (iy / 3);

                l10.setText(Double.toString(tn));
                l11.setText(Double.toString(mn));
                l12.setText(Double.toString(fn));
                l13.setText(Double.toString(sn));
                l14.setText(Double.toString(in));


            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double tn, mn, fn, sn, in, puan;
                tn = Double.parseDouble(l10.getText());
                mn = Double.parseDouble(l11.getText());
                fn = Double.parseDouble(l12.getText());
                sn = Double.parseDouble(l13.getText());
                in = Double.parseDouble(l14.getText());
                puan = 195 + tn * 4.3 + sn * 1.8 + in * 1.5 + mn * 4.25 + fn * 4.12;
                l1.setText(Double.toString(puan));

            }
        });


    }
}