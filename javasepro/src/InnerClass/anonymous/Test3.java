package InnerClass.anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    /*通过GUI编程，理解匿名内部类的使用*/
    public static void main(String[] args) {
        //创建窗口
        JFrame win = new JFrame("log in interface");
        JPanel p = new JPanel();
        win.add(p);

        //创建一个按钮对象
        JButton btn = new JButton("Log In");

        /*
        * 重点！！！！！！！！！！！！！！！！！！！！！！！！！！！！
        * 匿名内部类的使用
        * */
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win, "hit me");
            }
        });

        //把按钮对象添加到窗口上展示
        p.add(btn);

        //展示窗口
        win.setSize(400,300);
        win.setLocationRelativeTo(null); //居中
        win.setVisible(true);
    }
}
