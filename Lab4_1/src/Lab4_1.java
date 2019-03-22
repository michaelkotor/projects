
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Lab4_1 
{
    public static void main(String [] args) throws IOException 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<String> mainMass = new ArrayList<>(5); //главный массив, который содержит то, что ввели
        ArrayList<String> extraMass = new ArrayList<>(1); //доп массив, содержит только один эдемент, есди есть нарушения
        boolean flag = false;
        
        for(int i = 0; i < 5; i++) 
        {
            mainMass.add(reader.readLine());//считываем
        }

        for(int i = 0; i < mainMass.size() - 1; i++) //идем циклом по всему массиву
        { 
            if (mainMass.get(i).length() > mainMass.get(i + 1).length()) //сверяем длины строк
            {
                extraMass.add(mainMass.get(i + 1)); //получаем ту, которая лишняя
                flag = true;
                break; //если нашли, то выходим полность из цикла 
            }
        }
        if (flag) //сравнение, null - значит не прошло присвоение и все хорошо
        {
            System.out.println(extraMass.get(0)); //вывод
        }
        
    }
}