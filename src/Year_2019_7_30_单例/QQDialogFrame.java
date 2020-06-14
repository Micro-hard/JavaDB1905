package Year_2019_7_30_单例;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QQDialogFrame extends JFrame {
    private JTextField txt=new JTextField(11);
    private JButton btn=new JButton("发送");
    public QQDialogFrame(String tmp){
        //流式布局，有多款用多宽，不够就往下窜
        setTitle("和"+tmp+"聊天");
        setLayout(new FlowLayout());
        add(txt);
        add(btn);
        Container c =getContentPane();//窗器
        c.setBackground(Color.GREEN);
        setVisible(true);
        setBounds(200,200,1000,200);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg=txt.getText();
                //得到文本框的内容
                switch(tmp){
                    case"文章":
                            QQMainFrame.getInstance().getBtn1().setText(msg);
                            break;
                    case"姚晨":
                            QQMainFrame.getInstance().getBtn2().setText(msg);
                            break;
                    case"马伊利":
                        QQMainFrame.getInstance().getBtn3().setText(msg);
                        break;
                    default:
                        System.out.println(0.0);
                }
            }
        });
    }
}
