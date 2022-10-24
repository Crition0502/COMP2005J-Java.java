package Week10.JOptionPane_Swing;

import javax.swing.*;

public class BasicTest {
    public static void main(String[] args) {

        //1.三种基本模式
        JOptionPane.showConfirmDialog(null , "我的新世界");
        JOptionPane.showInputDialog(null , "My world");
        JOptionPane.showMessageDialog(null , "My world!");

        //2.消息类型 MessageType 共有五种
        //错误
        JOptionPane.showMessageDialog(null , "错误" , "提示" , JOptionPane.ERROR_MESSAGE);
        //警示
        JOptionPane.showMessageDialog(null , "警告" , "提示" , JOptionPane.WARNING_MESSAGE);
        //普通信息
        JOptionPane.showMessageDialog(null , "普通" , "提示" , JOptionPane.INFORMATION_MESSAGE);
        //询问信息
        JOptionPane.showMessageDialog(null , "提问信息" , "提示" , JOptionPane.QUESTION_MESSAGE);
        //不带图标信息
        JOptionPane.showMessageDialog(null , "不带图标" , "提示" , JOptionPane.PLAIN_MESSAGE);

        /**
         * 4.可选按钮optionType(存在效果相同的参数变量)
         * JOptionPane.showConfirmDialog(null, “我的新世界”, “提示”,JOptionPane.OK_OPTION);
         * JOptionPane.showConfirmDialog(null, “我的新世界”, “提示”,JOptionPane.YES_OPTION);
         * JOptionPane.showConfirmDialog(null, “我的新世界”, “提示”,JOptionPane.YES_NO_OPTION);
         *
         * 5.在输入对话框设置下拉菜单选择框
         * Object[] fruits = {“苹果”,”梨子”,”香蕉”,”西瓜”,”荔枝”};
         * JOptionPane.showInputDialog(null,”你喜欢什么水果”,”标题”,JOptionPane.QUESTION_MESSAGE,null,fruits,fruits[2]);
         * 最后一个参数是预选项，你希望显示出来的选项。
         *
         * 6.在选择对话框设置选项
         * Object[] fruits = {“苹果”,”梨子”,”香蕉”,”西瓜”,”荔枝”};
         * JOptionPane.showOptionDialog(null, “你喜欢什么水果”, “标题”,JOptionPane.YES_NO_CANCEL_OPTION ,JOptionPane.QUESTION_MESSAGE,null, fruits, fruits[0]);
         *
         * 7.对消息框传递的消息进行接收
         * 接收输入框输入的信息
         * String str = (String)JOptionPane.showInputDialog(null);
         *
         * 接收并判断点击的按钮是哪个,用int对象op接收对话框返回的值，并用if语句判断
         * int op = JOptionPane.showConfirmDialog(null,”新世界”，”提示”，JOptionPane.YES_NO_CANCEL_OPTION);
         * if(op==JOptionPane.YES_OPTION){
         * }else if(op==JOptionPane.NO_OPTION){
         * }
         * 接收选择对话框的消息（必须用数组下标接收）
         * Object[] fruits = {“苹果”,”梨子”,”香蕉”,”西瓜”,”荔枝”};
         * int op = JOptionPane.showOptionDialog(null, “你喜欢什么水果”, “标题”,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, fruits, fruits[0]);
         * System.out.print((String)fruits[op]);
         *
         * 接收输入对话框带有下拉列表框的信息（必须用字符串接收）
         * Object[] fruits = {“苹果”,”梨子”,”香蕉”,”西瓜”,”荔枝”};
         * String op = (String)JOptionPane.showInputDialog(null,”你喜欢什么水果”,”标题”,
         * JOptionPane.QUESTION_MESSAGE,null,fruits,fruits[2]);
         *
         */


        String name = JOptionPane.showInputDialog (null , " What is your name ?") ;

        //输入年龄并转化为int number
        String ageString = JOptionPane.showInputDialog(null , "What's your age?");
        int age = Integer.parseInt(ageString);
        System.out.println(age);

    }
}
