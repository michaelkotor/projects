/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package наследование1уровень;

/**
 *
 * @author Michael
 */

class Text
{
    String Title;
    String Text;
    
    Text()
    {
        this.Title = "broo";
        this.Text = "bebe";
    }
    
    void PrintTitle(Text ob)
    {
        System.out.println(ob.Title);
    }
    
    void PrintText(Text ob)
    {
        System.out.println(ob.Text);
    }
    void EditText(Text t, Sentence s)
    {
        t.Text = t.Text + " " + s.Text;
    }
    void EditTitle(Text t, Word w)
    {
        t.Title = w.Title;
    }
}

class Sentence extends Text
{
    String Text;
    
    Sentence()
    {
        super();
        Text = "abra kedra";
    }
    Sentence(String s)
    {
        super();
        this.Text = s;
    }
}

class Word extends Text
{
    String Title;
    
    Word()
    {
        super();
        Title = "rg";
    }
    Word(String s)
    {
        super();
        this.Title = s;
    }
}

public class Наследование1уровень 
{
    public static void main(String[] args) 
    {
        Text text = new Text();
        text.PrintTitle(text);
        text.PrintText(text);
        Sentence sentence = new Sentence(" and Normal Text");
        text.EditText(text, sentence);
        text.PrintText(text);
        Word word = new Word("Normal Title");
        text.EditTitle(text, word);
        text.PrintTitle(text);
        
        
    }
    
}
