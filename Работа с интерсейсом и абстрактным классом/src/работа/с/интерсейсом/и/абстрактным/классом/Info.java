/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package работа.с.интерсейсом.и.абстрактным.классом;

/**
 *
 * @author Michael
 */
public class Info extends Book implements Writing
{
    private double weight;
    private int kol;
    private String theme;
    private int pagenow;
    
    Info()
    {
        
    }
    
    Info(String name, String color, double weight, int kol, String theme)
    {
        super(name, color);
        this.kol = kol;
        this.theme = theme;
        this.weight = weight;
        pagenow = 0;
    }

    public void nextPage() 
    {
        pagenow++;
        System.out.println("Next page is turned");
    }

    public void previousPage() 
    {
        pagenow--;
        System.out.println("Previous page is turned");
    }

    public void showExit()
    {
        
        System.out.println(EXIT);
        
    }
    
    public void closeInfo() 
    {
        System.out.println("We are closing it now...");
        System.exit(0);
    }
    
    public void closeBook(Info info)
    {
        System.out.println("Book is closed");
        System.out.println("Heavy book...");
        info.delete(info);
    }
    
    public void openBook()
    {
        Info info = new Info();
        info.closeBook(info);
    }
    
    public void delete(Info info)
    {
        info.color = null;
        info.kol = -1;
        info.pagenow = -1;
        info.theme = null;
        info.weight = -1;
        System.out.println("We cleared the info and is null now");
    }
    
    public String toString()
    {
        return weight + " " +  kol + " " + " " + theme + " " + pagenow;
    }

}
