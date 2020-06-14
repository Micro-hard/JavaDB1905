package Year_2019_8_13_多线程;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class Window extends JFrame {
    String[] students={"王嘉琪","李文涛","郝旭宝","赵宇","高祥斌","姜朝瀚","王佳欢","徐亚男","崔洪峻","张士斌","王佳伟","盖雨鑫","任春辉","李晶旭","项英浩","李青儒","张为峰","田思远","闫梦婷","张震","白金泽","李智","苗振伟","张健","李光鑫","于淼泽","刘鑫","张天宇","郑瑞麒","黄东旭","董强","王思宇","史欣雨","宋美玉","何飘","杜江舟","姜海龙"};
    private List<String> list;
    private JButton ok;
    private JTextField countTxt;
    private JLabel jLabel;
    private Font font = new Font("微软雅黑",Font.BOLD,26);
    private boolean clicked=false;//用于暂停
    public Window(){
        list = Arrays.asList(students);
        ok = new JButton("ok");
        jLabel = new JLabel();
        countTxt = new JTextField(2);
        ok.setFont(font);
        jLabel.setFont(font);
        countTxt.setFont(font);
        setLayout(new FlowLayout());
        setVisible(true);//设置窗体可见
        setDefaultCloseOperation(3);//设置关闭按钮是否退出程序
        //四个参数分别为
        //X轴
        //Y 轴
        //宽
        //高
        setBounds(
                300,
                300,
                300,200
                );//设置窗口大小
        //where is haha point?
        add(countTxt);
        add(ok);
        add(jLabel);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                Set<String> sets = new HashSet<String>();
//                int count = 0;
//                if("".equals(countTxt.getText())){
//                    JOptionPane.showMessageDialog(null,"没有输入数量","提示",1);
//                    return;
//                }
//                count = Integer.parseInt(countTxt.getText());
//                Collections.shuffle(list);//打乱集合
//                while(sets.size() < count){
//
//                    sets.add(list.get(new Random().nextInt(students.length)));
//                }
//                String names = "";
//                for(String name : sets){
//                    names+=name+",";
//                }
//                jLabel.setText(names.substring(0,names.length()-1));
//
               clicked=!clicked;
               Runnable t=new Runnable() {
                    public void run(){
                        /*Set<String> sets = new HashSet<String>();
                        int count = 0;
                        if("".equals(countTxt.getText())){
                           JOptionPane.showMessageDialog(null,"没有输入数量","提示",1);
                            return;
                        }
                        count = Integer.parseInt(countTxt.getText());
                        Collections.shuffle(list);//打乱集合
                        while(sets.size() < count){
                            sets.add(list.get(new Random().nextInt(students.length)));
                        }
                        String names = "";
                        for(String name : sets){
                            names+=name+",";
                        }*/
                        //jLabel.setText(names.substring(0,names.length()-1));
                    while(clicked){
                        for (int i = 0; i <students.length&&clicked; i++) {
                            try {
                                Thread.sleep(new Random().nextInt(100));
                                System.out.println(Thread.currentThread().getName());
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                            //jLabel.setText(names.substring(0,names.length()-1));
                            jLabel.setText(students[i]);
                        }
                    }
                    }
                };
               new Thread(t).start();
            }
        });
    }

    public static void main(String[] args) {
        Window w1 = new Window();
    }
}
