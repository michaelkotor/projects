/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pars;

/**
 *
 * @author User
 */
public class Parsing {
    String v;
    String [] mas=new String[10];
    String [] mas1=new String[10];
    String [] mas2=new String[10];
    String chislo="";
    String chislo1="";
    String stepen="";
    int n=0,m=0,k=0;
    Parsing(String v){
        this.v=v;
        for (int i = 0; i < 10; i++) {
            mas[i]="";
            mas1[i]="";
            mas2[i]="";
        }
    }
    void p(){
        chislo=chislo+v.charAt(0);
        int i=1;
        while(true){
            if(v.length()==1) {
                mas1[k]=chislo;
                chislo="";
                break;
            }
            char c=v.charAt(i);
            if(c=='+'){
                mas1[k]=chislo;
                k++;
                chislo="";
                chislo=chislo+v.charAt(i);
                i++;
                
                
            }else if(c=='-'){
                mas1[k]=chislo;
                k++;
                chislo="";
                chislo=chislo+v.charAt(i);
                i++;
            }
            else {
               chislo=chislo+v.charAt(i);
                i++;
                if(i==v.length()){
                    mas1[k]=chislo;
                    k++;
                    chislo="";
                    break;
                }
            }
            
            
            if(i==v.length()) break;
        }
        System.out.println("Промежуточный массив в котором сохраняются слагаемые");
        for (int j = 0; j < 10; j++) {
            if(mas1[j]!="")
            System.out.println(mas1[j]);
        }
       
        
    }
    void p1(){
        int i=0;
        int ch=0;
        int a=0;
        int b=0;
        while(true){
            a=0;
            b=0;
            for(int j=0;j<mas1[i].length();j++){
              if(mas1[i].charAt(j)=='x'){
                  a=j;
                  b=1;
              }  
            }
            if(a==0 && b==0){
                mas[i]=mas1[i];
                i++;
                
            }
            if(a==0 && b==1){
                mas[i]="1";
                i++;
            }
            if(a>0){
                for(int j=0;j<a;j++){
                    chislo1=chislo1+mas1[i].charAt(j);
                }
                mas[i]=chislo1;
                i++;
                chislo1="";
            }
//                if(mas1[i].charAt(j)!='x' || j==mas1[i].length()){
//                    chislo1=chislo1+mas1[i].charAt(j);
//                    if(j==mas1[i].length()-1){
//                        mas[i]=chislo1;
//                        chislo1="";
//                    }
//                }else{
//                    if(mas1[i].charAt(0)=='x') {
//                        chislo1=chislo1+'1';
//                        mas[i]=chislo1;
//                        chislo1="";
//                        
//                        
//                    }
//                    mas[i]=chislo1;
//                    chislo1="";
//                }
//            }
//            
//            
//            chislo1="";
//            i++;
//            
            if(mas1[i]=="") break;
        }
        while(true){
            a=0;
            b=0;
            for(int j=0;j<mas1[ch].length();j++){
                if(mas1[ch].charAt(j)=='^'){
                    a=j;
                }
                if(mas1[ch].charAt(j)=='x'){
                    b=1;
                }
                
            }
            if(a==0 && b==0){
                mas2[ch]="0";
                ch++;
            }
            if(a==0 && b>0){
                mas2[ch]="1";
                ch++;
            }
            if(a>0){
                for(int c=a+1;c<mas1[ch].length();c++){
                    chislo1=chislo1+mas1[ch].charAt(c);
                }
                mas2[ch]=chislo1;
                chislo1="";
                ch++;
            }
            
            if(mas1[ch]=="") break;
        }
        
    }
    void mass(){
        
        for (int j = 0; j < 10; j++) {
            if(mas[j].equals("-")|| mas[j].equals("+")) mas[j]=mas[j]+"1";
            //System.out.println(mas[j]);
        }
        System.out.println("Массив в котором хранятся множители");
        for (int i = 0; i < 10; i++) {
            if(mas[i]!="")
                System.out.println(mas[i]);
        }
        System.out.println("");
        System.out.println("Массив в котором хранятся степени");
        for (int j = 0; j < 10; j++) {
            if(mas2[j]!="")
            System.out.println(mas2[j]);
        }
        
       
    }
    
    public String [] getMas(){
        return mas;
    }
    public String [] getMas2(){
        return mas2;
    }
    
}
