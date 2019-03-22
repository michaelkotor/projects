/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package легкая.промышленность;

/**
 *
 * @author Michael
 */





public class ЛегкаяПромышленность implements Michael
{
    public static void main(String[] args) 
    {
        Person person = new Person("Gorizont", 1000000, "Cakes", 10000, "Michael", 100);
        System.out.println(person.work());
        System.out.println(person.work(10));
        System.out.println(person.work());
        System.out.println(person.live());
        Zex f = new Person();
        System.out.println(f.work(7));
        System.out.println(f.work());
        
        Michael michael = null;
        MeExt me = new MeExt();
        me.who();
        
    }

    @Override
    public String work() 
    {
        return "working a lot";
    }

    @Override
    public String work(int i) 
    {
        return "working for " + i + " hours";
    }
    
}


