package edu.xcdq.service;

import edu.xcdq.beans.Customer;
import edu.xcdq.tools.CustomerData;

import java.util.Scanner;

/**
 * @author kangjiafu
 * @date 2021/4/27 17:49
 */
public class LoginService {
    private Scanner sc=null;
    public LoginService(Scanner scanner){
        this.sc=scanner;
    }
    //注册
    public void register(Scanner sc){
        System.out.println("请输入用户的编号：");
        String clienId= sc.next();
        System.out.println("请输入用户的密码");
        String pwd= sc.next();
        System.out.println("请输入用户的名字");
        String name=sc.next();
        System.out.println("请输入年龄");
        int age=sc.nextInt();
        System.out.println("请输入性别");
        String sex=sc.next();
        System.out.println("请输入手机号");
        String phone=sc.next();

        Customer customer= Customer.buider().setCustomerId(clienId).Pwd(pwd);
        customer.setName(name);
        customer.setPhone(phone);
        customer.setSex(sex);
        //把上面的对象保存到数组
        CustomerData.save(customer);


    }
}
