/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogoda2;

import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author milan
 */
public class Pogoda2 
{
    
    private static Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}");
    private static String getDateFromString(String stringDate) throws Exception
    {
        Matcher matcher = pattern.matcher(stringDate);
        if (matcher.find()) 
        {
            return matcher.group();
        }
        throw new Exception("Error");
    }
    
    private static Document getPage() throws  IOException
    {
        String url = "http://pogoda.spb.ru/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }
    
    private static int printPartValues(Elements values, int index)
    {
        int intrerationCount = 4;
        if (index == 0) 
        {
            Element valueLine = values.get(index);
            
            boolean isMorning = valueLine.text().contains("Утро");
            
            if (isMorning) 
            {
                intrerationCount = 3;
            }
        }
        
        for (int i = 0; i < intrerationCount; i++) 
        {
            Element valueLine = values.get(index + i);
            for (Element td : valueLine.select("td")) 
            {
                System.out.print(td.text() + "    ");
            }
            System.out.println("");
        }
        
        return intrerationCount;
    }
    
    public static void main(String[] args) throws IOException, Exception 
    {
        Document page = getPage();
        Element tableWth = page.select("table[class=wt]").first();
        Elements names = tableWth.select("tr[class=wth]");
        Elements values = tableWth.select("tr[valign=top]");
        
        int index = 0;
        
        for(Element name : names)
        {
            String dateString = name.select("th[id=dt]").text();
            String date = getDateFromString(dateString);
            System.out.println(date + "      Явления     Температура     Давление      Влежность     Ветер");
            int intrerationCount = printPartValues(values, index);
            index = index + intrerationCount;
        }
        
        
            
    }
    
}
