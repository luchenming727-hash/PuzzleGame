package com.itheima.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //跟注册相关的代码，都要写在这个界面中
    public RegisterJFrame(){
        //设置界面的宽高
        this.setSize(488,500);
        //设置界面标题
        this.setTitle("拼图游戏|注册界面");
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
