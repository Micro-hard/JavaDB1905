package Year_2019_7_30_单例;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QQMainFrame extends JFrame {
    private static QQMainFrame instance;
    private JButton btn1=new JButton("文章");
    private JButton btn2=new JButton("姚晨");
    private JButton btn3=new JButton("马伊利");

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public void setBtn3(JButton btn3) {
        this.btn3 = btn3;
    }

    public JButton getBtn1() {

        return btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    private QQMainFrame(){
        setTitle("主窗体");
        add(btn1,BorderLayout.NORTH);
        add(btn3,BorderLayout.SOUTH);
        add(btn2,"Center");
        setBounds(200,200,400,400);
        setVisible(true);
        setDefaultCloseOperation(3);
        btn1.addActionListener(new ActionListener() {  //匿名实例
           // boolean isChuangjian;
            @Override
            public void actionPerformed(ActionEvent e) {
               // if (isChuangjian==false) {
                    new QQDialogFrame("文章");
                  //  isChuangjian = true;
              //  }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new QQDialogFrame("姚晨");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new QQDialogFrame("马伊利");
            }
        });
    }
    public static QQMainFrame getInstance(){
        if (instance==null)
            instance=new QQMainFrame();
        return instance;
    }

    public static void main(String[] args) {
        QQMainFrame qq=QQMainFrame.getInstance();
    }
}
