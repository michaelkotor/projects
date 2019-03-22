package введение.в.классы;


public class ВведениеВКлассы 
{

    public static void main(String[] args) 
    {
        class Box
        {
            double width;
            double height;
            double depth;
            
            double volume()
            {
                return width * height * depth;
            }
            
            Box()
            {
                System.out.println("Процесс запущен!");
                width = 10;
                height = 10;
                depth = 10;
            }
            
            Box(int width, int height, int depth)
            {
                this.width = width;
                this.height = height;
                this.depth = depth;
            }
            
            
            int s(int i)
            {
                return i * i;
            }
        }
        
        class Stack
        {
            int stck[] = new int[10];
            int tos;
            
            Stack()
            {
                tos = -1;
            }
            void push(int item)
            {
                if (tos == 9)
                {
                    System.out.println("Стек заполнен");
                }
                else
                {
                    stck[++tos] = item;
                }
            }
            int pop()
            {
                if (tos < 0)
                {
                    System.out.println("Стек не загружен");
                    return 0;
                }
                else
                {
                    return stck[tos--];
                }
            }
            
        }
        
        class Michael
        {
            double height;
            double weight;
            int age;
            
            Michael()
            {
                height = 190;
                weight = 70;
                age = 17;
            }
            
            Michael(Michael l)
            {
                height = l.height;
                weight = l.weight;
                age = l.age;
            }
            
            Michael(double h, double w, int a)
            {
                height = h;
                weight = w;
                age = a;
            }
            
        }
        
        class Test
        {
            int a;
            Test(int a)
            {
                a = a;
            }
            Test incByTen()
            {
                Test temp = new Test(a + 10);
                return temp;
            }
            
        }
        
        class Factorial
        {
            int fact(int n)
            {
                int result;
                if (n == 1)
                {
                    return 1;
                }
                result = fact(n - 1) * n;
                return result;
            }
        }
        
        class RecTest
        {
            int values[];
            RecTest(int i)
            {
                values = new int[i];
            }
            
            void print(int i)
            {
                if (i == 0) return;
                else print(i - 1);
                System.out.println(values[i - 1]);
            }
        }
        
        RecTest ob = new RecTest(10);
        int i;
        for(i = 0; i < 10; i++)
        {
            ob.values[i] = i;
        }
        ob.print(10);
        
    }
    
}
