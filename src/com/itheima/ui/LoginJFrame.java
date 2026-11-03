package com.itheima.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //关于登录界面的所有代码，都要写到这个里边
    public LoginJFrame(){
        //设置界面的宽高
        this.setSize(488,430);
        //设置界面标题
        this.setTitle("拼图游戏|登录界面");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //让显示显示出来
        this.setVisible(true);
    }
}
