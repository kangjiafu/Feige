package edu.xcdq.beans;

/**
 * @author kangjiafu
 * @date 2021/4/28 16:57
 */
public class Customer extends Person{
    private String customerId;
    private String phone;

    public Customer(){
    }

    //构建器 用来构建一个对象
    public static Customer buider(){
        return new Customer();

    }
    public String getCustomerId() {
        return customerId;
    }

    public Customer setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }


   /* public Customer setCustomerIdd(String customerId){
        this.customerId=customerId;
        return this;
    }*/


    public Customer Pwd(String pwd){
        super.setPwd(pwd);
        return this;
    }
    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ",  phone='" + phone + '\'' +
                ",  name='" + getName() + '\'' +
                ",  age='" + getAge() + '\'' +
                ",  pwd='" + getPwd() + '\'' +
                ",  sex='" + getSex() + '\'' +
                '}';
    }
}
