package edu.xcdq;

import java.util.Scanner;

/**
 * @author kangjiafu
 * @date 2021/4/28:18.02
 */
public class Main {
    public Main(){}
    Scanner sc=new Scanner(System.in);
    public void login(){
        System.out.println("==================");
        System.out.println("\t\t欢迎使用快递系统\t\t");
        System.out.println("1.用户租车");
        System.out.println("2.登陆系统");
        System.out.println("3.商查看");
        System.out.println("4.退出系统");
        System.out.println("请输入：");

        int fuNo=sc.nextInt();
        switch (fuNo){
            case 1:
                //用户注册
                break;
            case 2:
                //登陆系统
                break;

            case 3:
                //商品查看
                break;
            case 4:
                //退出系统
                break;

            default:
                sc.close();//关闭扫描器资源
                System.exit(0);//0 正常退出 非0 非正常的中断退出
        }
    }

    public static void main(String[] args) {
        new Main().login();
    }
}
