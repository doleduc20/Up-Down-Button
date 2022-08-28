package view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame {
    private CounterModel counterModel;
    private JLabel jLabel_value;

    public CounterView(){
        this.counterModel = new CounterModel();
        this.init();
    }

    private void init() {
        this.setTitle("c0unt3rv13w");
        this.setSize(400, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        CounterListener counterListener = new CounterListener(this);
        Font font = new Font("Arial",Font.BOLD,40);
        JPanel jPanel_1 = new JPanel();
        JButton jButton_up = new JButton("Up");
        jButton_up.setFont(font);
        jButton_up.addActionListener(counterListener);
        JButton jButton_Down = new JButton("Down");
        jButton_Down.setFont(font);
        jButton_Down.addActionListener(counterListener);
        JButton jButton_reset = new JButton("Reset");
        jButton_reset.setFont(font);
        jButton_reset.addActionListener(counterListener);
        jLabel_value = new JLabel("------");
        jLabel_value.setFont(font);
        jPanel_1.setLayout(new BorderLayout());
        jPanel_1.add(jButton_up,BorderLayout.WEST);
        jPanel_1.add(jButton_Down,BorderLayout.EAST);
        jPanel_1.add(jButton_reset,BorderLayout.SOUTH);
        jPanel_1.add(jLabel_value,BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(jPanel_1,BorderLayout.CENTER);

        

        this.setVisible(true);

    }
    public void num_Up(){
        this.counterModel.up_Value();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
    public void num_Down(){
        this.counterModel.down_Value();
        jLabel_value.setText(this.counterModel.getValue()+"");
    }
    public void num_reset(){
        this.counterModel.reset();
        jLabel_value.setText(this.counterModel.getValue()+"");
    }
}
