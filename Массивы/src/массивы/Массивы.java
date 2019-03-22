/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package массивы;

import java.util.Scanner;

public class Массивы {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Example
        /*int[] mas1 = {1,3,4,5,6,7,8};
        int sum  =0;
        for (int i = 0; i < mas1.length; i++)
        {
            if (mas1[i] % 2 == 0)
            {
                sum += mas1[i];
            }
        }
        System.out.println(sum);*/
        //7.43
        /*int n = 10;
        int[] mas = new int[n];
        int sum10 = 0;
        int j = 0;
        for (int i = 0; i < n; i++) 
        {
            mas[i] = sc.nextInt();
            if (mas[i] > 10)
            {
                sum10 += mas[i];
                j++;
            }
        }
        System.out.println((double)(sum10 / j));*/
        //7.44
        /*int x = 5;
        int n = 6;
        double sum = 0;
        double j = 0;
        int[] mas = new int[x];
        for (int i = 0; i < x; i++) 
        {
            mas[i] = sc.nextInt();
            if (mas[i] > n)
            {
                sum += mas[i];
                j++;
            }
        }
        System.out.println((double)(sum / j));
         */
        //7.46
        /*int m = 5;
        int n = 6;
        double sum = 0;
        double j = 0;
        int[] mas = new int[m];
        for (int i = 0; i < m; i++) 
        {
            mas[i] = sc.nextInt();
            if (mas[i] % n == 0)
            {
                sum += mas[i];
                j++;
            }
        }
        System.out.println((double)(sum / j));*/
        //7.47
        /*int m = 5;
        int n = 6;
        double summax = 0;
        double summin = 0;
        double max = 0;
        double min = 0;
        int[] mas = new int[m];
        
        for (int i = 0; i < m; i++) 
        {
            mas[i] = sc.nextInt();
            if (mas[i] >= 100)
            {
                summax += mas[i];
                max++;
            }
            else
            {
                summin += mas[i];
                min++;
            }
        }
        System.out.println(summax / max);
        System.out.println(summin / min);*/
        //7.48
        /*int m = 5;
        int n = 6;
        double sumboy = 0;
        double sumgirl = 0;
        double boy = 0;
        double girl = 0;
        int[] mas = new int[m];
        
        for (int i = 0; i < m; i++) 
        {
            mas[i] = sc.nextInt();
            if (mas[i] > 0)
            {
                sumgirl += mas[i];
                girl++;
            }
            else
            {
                sumboy += mas[i];
                boy++;
            }
        }
        System.out.println(sumgirl / girl);
        System.out.println(sumboy / boy);*/
        //7.51 7.52
        /*int n = 6;
        int[] mas = new int[n];
        int min = mas[0];
        int mini = 0;
        int max = mas[0];
        int maxi = 0;
        for (int i = 0; i <= n; i++) 
        {
            if (mas[i] >= max)
            {
                maxi = i;
            }
            if (mas[i] <= min)
            {
                mini = i;
            }
        }*/
        //7.53
        /*double[] a = new double[1000];
        a[0] = 0;
        double max = -1;
        for (int i = 1; i <= 1000; i++) 
        {
            a[i] = sc.nextDouble();
            if (a[i] > max)
            {
                max = a[i];
            }
            System.out.println(max);
        }*/
        //7.56
        /*double[] a = {2, 5, 6, 7, 8, 9};
        double max = 0;
        for (int i = 0; i < a.length; i++) 
        {
            if(a[i] >= max)
            {
                max = a[i];   
            }
            
        }
        System.out.println(Math.pow((max / 3.1415), 1.0 / 2.0));
         */
        //7.57
        /*double[] a = {1, 2, 7, 9, 89, 8};
        double max = 0;
        for (int i = 0; i < 10; i++) 
        {
            if (a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.println(Math.pow(max, 1.0 / 2.0) * Math.pow(2, 1.0 / 2.0));
         */
 /*int[] a = {0, 0, 0, 0, 0, 0, 0};
        int mino = 0;
        int maxi = a.length - 1;
        int h = 0;
        for (int i = 0; i < maxi + 1; i++) 
        {
            if (a[i] == 0)
            {
                h = a[mino];
                a[mino] = a[i];
                a[i] = h;
                if (mino < maxi - 1)
                mino++;
                
                if (i == 0)
                {
                    
                    continue;
                }
                
                    
                
            }
            if (a[i] > 0)
            {
                h = a[maxi];
                a[maxi] = a[i];
                a[i] = h;
                if (maxi > 0)
                maxi--;
                if (i > 0)
                i--;
            }
        }
        
        
        
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " ");
        }
         */
 


        //12.22 a
        /*
        int length = 9;
        int x = 3;
        int[][] a = new int[length][length];
        int k = 0, m = length - 2;
        for (int i = 0; i < length; i++) 
        {
            for (int j = 0; j < length; j++) 
            {
                if ((i == k) && (j == k)) 
                {
                    a[i][j] = x;
                    k++;
                }
                if ((i + j) == length - 1)
                {
                    a[i][j] = 3;
                }
            }
        }
        
        
        
        //Вывод масссива
        
        for (int i = 0; i < length; i++) 
        {
            for (int j = 0; j < length; j++) 
            {
                
                System.out.print(a[i][j] + "  ");
                
            }
            System.out.println();
        
        }
        */
        //12.22 b
        /*
        int length = 8;
        int x = 3;
        int y = length / 2;
        length++;
        int[][] a = new int[length][length];
        int k = 0, m = length - 2;
        for (int i = 0; i < length; i++) 
        {
            for (int j = 0; j < length; j++) 
            {
                if ((i == y) || (y == j)) 
                {
                    a[i][j] = x;
                }
                if ((i == k) && (j == k)) 
                {
                    a[i][j] = x;
                    k++;
                }                
            }
        }
        
        for (int i = length; i >= 0; i--) 
        {
            for (int j = 0; j < length; j++) 
            {
                if ((i == m)) 
                {
                    a[i+1][j] = x;
                    m--;
                    i--;
                    
                }
                
            }
        }
        
        
        //Вывод
        
        for (int i = 0; i < length; i++) 
        {
            for (int j = 0; j < length; j++) 
            {
                
                System.out.print(a[i][j] + "  ");
                
            }
            System.out.println();
        
        }
        */
        
        //12.22 c
        /*
        int length = 7;
        int x = 2;
        int a[][] = new int[length][length];
        int m = 0;
        int y = length / 2;
        y++;
        boolean ans = true;
        for (int i = 0; i < length; i++) 
        {
            for (int j = 0; j < length; j++) 
            {
                for (int k = y; k == -y;)
                {
                    
                    if (k == 1)
                    {
                        ans = false;
                        if (ans == false)
                        {
                            k = 0;
                        }
                        k++;
                    }
                    else
                    {
                        k--;
                    }
                    if (k <= 0)
                    {
                        k--;
                    }
                }
                a[i][j] = x;           
            }
        }
        
        
        
        //Вывод
        
        for (int i = 0; i < length; i++) 
        {
            for (int j = 0; j < length; j++) 
            {
                
                System.out.print(a[i][j] + "  ");
                
            }
            System.out.println();
        
        }
        */
        //12.24
        /*
        int a[][] = new int[6][6];
        for (int i = 0; i < 6; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
                a[i][j] = 1;
            }
        }
        
        for (int i = 1; i < 6; i++) 
        {
            for (int j = 1; j < 6; j++) 
            {
                a[i][j] = a[i - 1][j] + a[i][j - 1];
            }
        }
        
        for (int i = 0; i < 6; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
                
                System.out.print(a[i][j] + "  ");
                
            }
            System.out.println();
        
        }     
        */
        
        //12.25 a
        /*
        int b = 1;
        int a[][] = new int[111][10];
        for (int i = 0; i < 111; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                a[i][j] = b++;
            }
        }
        for (int i = 0; i < 111; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                
                System.out.print(a[i][j] + "  ");
                
            }
            System.out.println();
        
        }
        */
        
        
        //12.25 b
        /*
        int a[][] = new int[12][10];
        int b = 1;
        int c = b;
        for (int i = 0; i < 12; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                a[i][j] = b;
                b = b + 12;
                
            }
            b = c;
            b++;
            c++;
        }
        
        for (int i = 0; i < 12; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                
                System.out.print(a[i][j] + "  ");
                
            }
            System.out.println();
        }
        */
        
        //12.25 c
        
        /*
        int a[][] = new int[12][10]; 
        int b = 10;
        int c = b;
        for (int i = 0; i < 12; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                a[i][j] = b;
                b--;
            }
            b = c;
            c = c + 10;
            b = b + 10;
        }
        
        for (int i = 0; i < 12; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                
                System.out.print(a[i][j] + "  ");
                
            }
            System.out.println();
        }

        */
        
        //12.25 d
        /*
        int a[][] = new int[12][10];
        int b = 12;
        int c = b;
        for (int i = 0; i < 12; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                a[i][j] = b;
                b = b + 12;
            }
            b = c;
            c--;
            b--;
        }
        
        for (int i = 0; i < 12; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                
                System.out.print(a[i][j] + "  ");
                
            }
            System.out.println();
        }
        */
        
        //12.25 e
        
        /*
        int a[][] = new int[10][12];
        int b = 1;
        int c = b;
        boolean ans = true;
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 12; j++) 
            {
                if (ans == true)
                {
                    a[i][j] = b;
                    
                    if (j != 11)
                    {
                        b++;
                    }
                        
                }
                if (ans == false)
                {
                    a[i][j] = b;
                    if (j != 11)
                    {
                        b--;
                    }
                    
                }
            }
            b = b + 12;
            if (ans == true)
            {
                ans = false;
            }
            else
            {
                ans = true;
            }
        }
        
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 12; j++) 
            {
                
                System.out.print(a[i][j] + "  ");
                
            }
            System.out.println();
        }
        */
        
        //12.25 g
        /*
        int a[][] = new int[12][98];
        int b = 1;
        int c = 24;
        int d = c;
        boolean ans = true;
        
        for (int i = 0; i < 12; i++) 
        {
            for (int j = 0; j < 98; j++) 
            {
                if (i == 0)
                {
                    if (j == 0)
                    {
                        a[i][j] = b;
                        
                    } else
                    if (j == 1)
                    {
                        a[i][j] = c;
                    } else
                    if (j == 2)
                    {
                        a[i][j] = d + 1;
                    } else
                    {
                        a[i][j] = a[i][j - 1] + 1;
                    }
                    
                    
                } 
                else
                {
                    if (j % 2 == 0)
                    {
                        ans = true;
                    }
                    else
                    {
                        ans = false;
                    }
                    if (ans == true)
                    {
                        a[i][j] = a[i - 1][j] + 1;
                    }
                    else
                    {
                        a[i][j] = a[i - 1][j] - 1;
                    }
                }
            }
        }
        for (int i = 0; i < 12; i++) 
        {
            for (int j = 0; j < 98; j++) 
            {
                
                System.out.print(a[i][j] + "  ");
                
            }
            System.out.println();
        }
        */
        
        
        
        //12.25 g2
        /*
        Scanner sc1 = new Scanner(System.in);
        
        int lengthdown = sc1.nextInt();
        int lengthright = sc1.nextInt();
        int a[][] = new int[lengthdown][lengthright];
        int b = 0;
        
        for (int i = 0; i < lengthright; i++) 
        {
            if (i % 2 == 0)
            {
                for (int j = 0; j < lengthdown; j++) 
                {
                    a[j][i] = b;
                    b = b + 1;
                }
            }
            if (i % 2 != 0) 
            {
                for (int j = lengthdown - 1; j >= 0; j--) 
                {
                    a[j][i] = b++;
                }
            }
        }
        
        //вывод
        for (int i = 0; i < lengthdown; i++) 
        {
            for (int j = 0; j < lengthright; j++) 
            {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }
        */
        
        //задача про декады
        /*
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int max = 0;
        
        for (int i = 0; i < 29; i++) 
        {
            if ((i >= 0) && (i <= 9)) 
            {
                sum1 = sum1 + a[i];
            }
            if ((i >= 10) && (i <= 19)) 
            {
                sum2 = sum2 + a[i];
            }
            max = Math.max(sum1, sum2);
            //max - max;
            
            if ((i >= 20) && (i <= 29)) 
            {
                sum3 = sum3 + a[i];
            }
            max = Math.max(max, sum3);
            
        }
        
        System.out.println(max);
        */
        
        
        //12.23 c
        /*
        int l = 7;
        int a[][] = new int[l][l];
        
        for (int i = 0; i < l; i++) 
        {
            for (int j = 0; j < l; j++) 
            {
                if (((i <= j) && (i + j <= l - 1)) || ((i >= j) && (i + j >= l - 1)))
                {
                    a[i][j] = 1;
                }
            }
        }
        
        //Вывод
        
        for (int i = 0; i < l; i++) 
        {
            for (int j = 0; j < l; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        */
        
        
        //12.25 ж
        /*
        int lright = 16;
        int ldown = 12;
        int a[][] = new int[ldown][lright];
        int b = 120;
        
        for (int i = 0; i < ldown; i++) 
        {
            if (i % 2 != 0) 
            {
               for (int j = 0; j < lright; j++) 
                {
                    a[i][j] = b--;
                } 
            }
            if (i % 2 == 0) 
            {
                for (int j = lright - 1; j >= 0; j--) 
                {
                    a[i][j] = b--;
                }
            }
        }
        
        for (int i = 0; i < ldown; i++) 
        {
            for (int j = 0; j < lright; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        */
        
        
        //12.25 з
        /*
        int ldown = 12;
        int lright = 10;
        int a[][] = new int[ldown][lright];
        int b = 120;
        
        for (int i = 0; i < lright; i++) 
        {
            for (int j = ldown - 1; j >= 0; j--) 
            {
                a[j][i] = b--;
            }
        }
        
        for (int i = 0; i < ldown; i++) 
        {
            for (int j = 0; j < lright; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        */
        
        //12.25 и
        /*
        int ldown = 12;
        int lright = 10;
        int a[][] = new int[ldown][lright];
        int b= 120;
        
        for (int i = 0; i < ldown; i++) 
        {
            for (int j = 0; j < lright; j++) 
            {
                a[i][j] = b--;
            }
        }
        
        for (int i = 0; i < ldown; i++) 
        {
            for (int j = 0; j < lright; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        */
        
        //12.25 к
        /*
        int ldown = 12;
        int lright = 10;
        int a[][] = new int[ldown][lright];
        int b = 120;
        
        for (int i = 0; i < lright; i++) 
        {
            for (int j = 0; j < ldown; j++) 
            {
                a[j][i] = b--;
            }
        }
        
        for (int i = 0; i < ldown; i++) 
        {
            for (int j = 0; j < lright; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        */
        
        //12.25 н
        /*
        int ldown = 12;
        int lright = 10;
        int a[][] = new int[ldown][lright];
        int b = 120 ;
        
        for (int i = 0; i < lright; i++) 
        {
            if (i % 2 == 0)
            {
                for (int j = 0; j < ldown; j++) 
                {
                    a[j][i] = b--;
                } 
            }
            if (i % 2 != 0) 
            {
                for (int j = ldown -1 ; j >= 0; j--) 
                {
                    a[j][i] = b--;
                }
            }
        }
        
        for (int i = 0; i < ldown; i++) 
        {
            for (int j = 0; j < lright; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        */
        
        //12.25 о
        /*
        int ldown = 12;
        int lright = 10;
        int a[][] = new int[ldown][lright];
        int b = 1;
        
        
        for (int i = 0; i < lright; i++) 
        {
            if (i % 2 != 0)
            {
                for (int j = 0; j < ldown; j++) 
                {
                    a[j][i] = b++;
                }
            }
            if (i % 2 == 0) 
            {
                for (int j = ldown - 1; j >= 0; j--) 
                {
                    a[j][i] = b++;
                }
            }
        }
        
        for (int i = 0; i < ldown; i++) 
        {
            for (int j = 0; j < lright; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        */
        
        //12.25 п
        /*
        int l = 10;
        int ldown = 12;
        int lright = 10;
        int a[][] = new int[ldown][lright];
        int b = 1;
        
        for (int i = ldown - 1; i >= 0; i--) 
        {
            if (i % 2 != 0)
            {
                for (int j = lright - 1; j >= 0; j--) 
                {
                    a[i][j] = b++;
                }
            }
            if (i % 2 == 0) 
            {
                for (int j = 0; j < lright; j++) 
                {
                    a[i][j] = b++;
                }
            }
        }
        
        for (int i = 0; i < ldown; i++) 
        {
            for (int j = 0; j < lright; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        */
        
        //12.25 р
        /*
        int ldown = 12;
        int lright = 10;
        int a[][] = new int[ldown][lright];
        int b = 120;
        
        for (int i = 0; i < lright; i++) 
        {
            if (i % 2 == 0)
            {
                for (int j = ldown - 1; j >= 0; j--) 
                {
                   a[j][i] = b--; 
                }
            }
            if (i % 2 != 0) 
            {
                for (int j = 0; j < ldown; j++) 
                {
                    a[j][i] = b--;
                }
            }
            
        }
        
        for (int i = 0; i < ldown; i++) 
        {
            for (int j = 0; j < lright; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        */
        
        
        //12.176
        /*
        int l =7;
        int a[][] = new int[l][l];
        int min = 1000000;
        
        for (int i = 0; i < l; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                if (i == j)
                    if (a[i][j] < min)
                        min = a[i][j];
            }
        }
        System.out.println(min);
        */
        
        //12.176 b
        /*
        int l = 7;
        int a[][] = new int[l][l];
        int min = 1000000000;
        
        
        for (int i = 0; i < l; i++) 
        {
            for (int j = 0; j < l; j++) 
            {
                if (i + j == l - 1)
                    if(a[i][j] < min)
                    {
                        min = a[i][j];
                    }
            }
        }
        System.out.println(min);
        */
        
        //12.178
        /*
        int n = 7;
        int a[][] = new int[n][n];
        int b[][] = new int[1][0];
        int min = 10000000;
        
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (i == j)
                {
                    if(a[i][j] < min)
                    {
                        min = a[i][j];
                        b[0][0] = i;
                        b[1][0] = j;
                    }
                }
                if (i + j == n - 1)
                {
                    if (a[i][j] < min) 
                    {
                        min = a[i][j];
                        b[0][0] = i;
                        b[1][0] = j;
                    }
                }
            }
        }
        
        if (min != 1000000)
        {
            int minnow = a[n - 1][n - 1];
            a[n - 1][n - 1] = min;
            a[b[0][0]][b[0][1]] = minnow;  
        }
        */
        
        //12.179
        /*
        int n = 9;
        int a[][] = new int[n][n];
        int b = 1;
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (i == j)
                {
                    a[i][j] = 0;
                }
                
            }
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (i > j)
                {
                    a[i][j] = 1;
                }
                if (i < j)
                {
                    a[i][j] = -1;
                }
                
            }
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        */
        
        //12.180
        /*
        int l = 18;
        int a[][] = new int[l][l];
        
        
        for (int i = 0; i < l; i++) 
        {
            for (int j = 0; j < l; j++) 
            {
                if (j > i)
                {
                    
                }
            }
        }
        */
        
        //2.182
        /*
        int n = 15;
        int a[][] = new int[n][n];
        int b = 0;
        
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                a[i][j] = 10;
            }
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (i > j)
                    a[i][j] = 0;
            }
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(i < j) System.out.print(a[i][j] + "\t");
            }
            System.out.println(" ");
        }
        */
        
        //2.183
        /*
        int n = 10;
        int a[][] = new int[n][n];
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                a[i][j] = 10;
            }
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        */
        
        //12.184
        /*
        int x = 14;
        int n = 6;
        int a[][] = new int[n][n];
        int b = 1;
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                a[i][j] = b++;
                if (i == j) 
                {
                    if (a[i][j] == x)
                    {
                        System.out.println("i = " + (i + 1) + ", j = " + (j + 1));
                    }
                }
            }
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }
        */
        
        //12.186
        /*
        int k;
        int n = 8;
        int a[][] = new int[n][n];
        int b = 0;
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                a[i][j] = b--;
                if (i == j && (i != 0)) 
                {
                    if (a[i][j] < a[i - 1][j - 1])
                    {
                        System.out.println((i + 1) + " "  +(j + 1));
                        System.exit(0);
                    }
                }
            }
        }
        */
        
        //12.188
        /*
        int n = 9;
        int a[][] = new int[n][n];
        int b = 0;
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = i; j < n; j++) 
            {
                a[i][j] = b++;
                if (i == j) 
                {
                    a[i][j] = 100;
                    break;
                }
            }
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = i; j < n; j++) 
            {
                if (a[i][j] != a[j][i])
                {
                    System.out.println("Массив не симмитричен");
                }
            }
        }
        
        for (int i = 0; i < n; i++) 
        {
            
        }
        */
        
        //12.215 b
        
        int n = 6;
        int[][] a = new int[n][n];
        int b = 0;
        int c = 0;
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                a[i][j] = b++;
            }
            
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (int j = 0; j < n; j++) 
            {
                c = a[j][0];
                a[j][0] = a[j][n - 2];
                a[j][n - 2] = c;
            }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        
        
    }
}
