/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vkparse;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 *
 * @author milan
 */
public class Parse 
{
    private String url;
    private Document getPage(String url) throws IOException
    {
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;    
    }
    
    public Parse(String url)
    {
        this.url = url;
    }
    
    public String start() throws IOException
    {
        Document page = getPage(url);
        Elements e1 = page.select("span[class=pp_last_activity_text]");
        System.out.println(e1.text());
        return e1.text();
        
    };
}
