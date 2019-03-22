/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package работа.с.интерсейсом.и.абстрактным.классом;

import static работа.с.интерсейсом.и.абстрактным.классом.Book.changeEXIT;

/**
 *
 * @author Michael
 */
public class РаботаСИнтерсейсомИАбстрактнымКлассом {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Info info = new Info("Michael Born", "red", 100, 100, "Michael Born. Lessons of cooking.");
        info.nextPage();
        info.nextPage();
        info.previousPage();
        info.showExit();
        System.out.println(info);
        changeEXIT();
        info.showExit();
        info.openBook();
        info.closeBook(info);
        info.closeInfo();
    }
    
}
