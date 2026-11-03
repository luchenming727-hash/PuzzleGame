package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //GameJFrame这个界面表示的就是游戏的主界面
    //以后跟游戏相关的所有逻辑都在这个类中
    public GameJFrame(){
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();
        //让屏幕显示出来
        this.setVisible(true);
    }

    private void initJMenuBar() {
        //创建整个菜单的对象
        JMenuBar jMenuBar=new JMenuBar();

        //创建菜单上两个选项的对象（功能，关于我们）
        JMenu functionjMenu=new JMenu("功能");
        JMenu aboutjMenu=new JMenu("关于我们");

        //创建每个选项下面的条目选项
        JMenuItem replayItem=new JMenuItem("重新游戏");
        JMenuItem reLoginItem=new JMenuItem("重新登录");
        JMenuItem closeItem=new JMenuItem("关闭游戏");

        JMenuItem aboutItem=new JMenuItem("公众号");

        //将每一个选项下面的条目添加到选项中
        functionjMenu.add(replayItem);
        functionjMenu.add(reLoginItem);
        functionjMenu.add(closeItem);

        aboutjMenu.add(aboutItem);

        //将选项添加到菜单里
        jMenuBar.add(functionjMenu);
        jMenuBar.add(aboutjMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面宽高
        this.setSize(603,680);
        //设置界面标题
        this.setTitle("拼图游戏单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
