/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package для.проб;

/**
 *
 * @author Michael
 */
class Custemers
{
    private String foi;
    private String pol;
    private int age;
    private int money;
    
    Custemers(String foi, String pol, int age, int money)
    {
        this.foi = foi;
        this.pol = pol;
        this.age = age;
        this.money = money;
    }
    
    void setFoi(String foi)
    {
        this.foi = foi;
    }
    void setPol(String pol)
    {
        this.pol = pol;
    }
    void setAge(int age)
    {
        this.age = age;
    }
    void setMoney(int money)
    {
        this.money = money;
    }
    
    String getFoi()
    {
        return foi;
    }
    
    String getPol()
    {
        return pol;
    }
    int getAge()
    {
        return age;
    }
    int getMoney()
    {
        return money;
    }
    
    public String toString()
    {
        return foi + " " + pol + " " + age + " " + money;
    }
}
