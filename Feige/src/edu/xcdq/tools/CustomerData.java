package edu.xcdq.tools;

import edu.xcdq.beans.Customer;

import java.util.Arrays;

/**
 * @author kangjiafu
 * @date 2021/4/28 18:34
 */
public class CustomerData {
    private static int SIZE = 10; //一共能存储的用户数
    private static int COUNT = 0; //已经存储的用户
    private static Customer[] CUSTOMERDATA = new Customer[SIZE];

    //把新增的用户保存在数组中
    public static void save(Customer customer) {
        if (COUNT == SIZE) {    //数组满了，扩容为原来的2被
            CUSTOMERDATA = Arrays.copyOf(CUSTOMERDATA, SIZE * 2);
            SIZE *= 2;
        }
        for (int i = 0; i < CUSTOMERDATA.length; i++) {
            if ((null == CUSTOMERDATA[i])) {
                CUSTOMERDATA[i] = customer;
                COUNT++;
                return;
            }
        }
    }
    //从数组中查询用户的信息
    public static Customer get(String customerId, String pwd) {
        for (Customer c : CUSTOMERDATA) {
            if (c.getCustomerId().equals(customerId) && c.getPwd().equals(pwd)){
                return c;
            }
        }
        return null;
    }

    //只根据id查询用户
    public static Customer get(String customerId) {
        for (Customer c : CUSTOMERDATA) {
            if (customerId.equals(c.getCustomerId())) {
                return c;
            }

        }
        return  null;
    }
}
