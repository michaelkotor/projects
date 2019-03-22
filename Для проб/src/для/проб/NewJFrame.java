package для.проб;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class NewJFrame extends javax.swing.JFrame 
{
    //Make with StringBuffer Buffer
    private int NUMBERCAR = 0;
    private int NUMBERCLIENT = 0;
    private String whereFileIs = "C:/Users/Michael/Documents/NetBeansProjects/File/";
    private String sx = new String();
    
    private ArrayList<Custemers> client = new ArrayList(); 
    private ArrayList<Cars> car = new ArrayList(); 
    private ArrayList<File> forCar = new ArrayList(); 
    private ArrayList<File> forClients = new ArrayList();
    private ArrayList<PrintWriter> pwsCar = new ArrayList();    
    private ArrayList<PrintWriter> pwsClient = new ArrayList();
    private ArrayList<String> randomFoi = new ArrayList();  
    private ArrayList<String> randomPol = new ArrayList();
    private ArrayList<String> randomAge = new ArrayList();
    private ArrayList<Integer> randomAgeInt = new ArrayList();
    private ArrayList<String> randomMoney = new ArrayList();
    private ArrayList<Integer> randomMoneyInt = new ArrayList();     
    private ArrayList<String> randomMarka = new ArrayList(); 
    private ArrayList<String> randomColor = new ArrayList(); 
    private ArrayList<String> randomPower = new ArrayList(); 
    private ArrayList<Integer> randomPowerInt = new ArrayList(); 
    private ArrayList<String> randomKol = new ArrayList();
    private ArrayList<Integer> randomKolInt = new ArrayList(); 
    private ArrayList<String> randomType = new ArrayList(); 
    private ArrayList<String> randomCena = new ArrayList(); 
    private ArrayList<Integer> randomCenaInt = new ArrayList(); 
    private ArrayList<String> namesFilesCar = new ArrayList(); 
    private ArrayList<String> namesFilesClient = new ArrayList(); 
    private ArrayList<BufferedReader> brs = new ArrayList();
    private ArrayList<BufferedReader> readerForCar = new ArrayList();
    private ArrayList<BufferedReader> readerForClient = new ArrayList();    
    
    public void findNUMBERCAR()
    {
        NUMBERCAR = 0;
        File listFile = new File(whereFileIs);
        File exportFiles[] = listFile.listFiles();
        String[] names = new String[exportFiles.length];
        for (int i = 0; i < names.length; i++) 
        {
            names[i] = exportFiles[i].getName();
        }
        for (int i = 0; i < names.length; i++) 
        {
            for (int j = 0; j < names.length; j++) 
            {
                
                if (names[i].equals("framecar" + j + ".txt"))
                {
                    NUMBERCAR++;
                    break;
                }
            }
        }
        if (NUMBERCAR == 0) 
        {
            NUMBERCAR = 10;
        }
        
        System.out.println("After checking " + NUMBERCAR);
    }
    
    public void findNUMBERCLIENT()
    {
        NUMBERCLIENT = 0;
        File listFile = new File(whereFileIs);
        File exportFiles[] = listFile.listFiles();
        String[] names = new String[exportFiles.length];
        for (int i = 0; i < names.length; i++) 
        {
            names[i] = exportFiles[i].getName();
        }
        for (int i = 0; i < names.length; i++) 
        {
            for (int j = 0; j < names.length; j++)
            {    
            
                if (names[i].equals("frameclient" + j + ".txt"))
                {
                    NUMBERCLIENT++;
                    break;
                }
            }
        }
        if (NUMBERCLIENT == 0)
        {
            NUMBERCLIENT = 10;
        }
        
        System.out.println("After checking " + NUMBERCLIENT);
    }
    
    public void createFiles() throws IOException
    {
        for (int i = 0; i < NUMBERCAR; i++) 
        {
            namesFilesCar.add(whereFileIs + "framecar" + i + ".txt"); //a
        }
        
        for (int i = 0; i < NUMBERCLIENT; i++) 
        {
            namesFilesClient.add(whereFileIs + "frameclient" + i + ".txt"); //a
        }
        
        for (int i = 0; i < 10; i++) 
        {
            forCar.add(new File(namesFilesCar.get(i))); //a
            forCar.get(i).createNewFile(); //a
            forCar.get(i).delete(); //a
        }
        
        for (int i = 0; i < 10; i++) 
        {
            forClients.add(new File(namesFilesClient.get(i))); //a
            forClients.get(i).createNewFile(); //a
            forClients.get(i).delete(); //a
        }
        for (int i = 0; i < 10; i++) 
        {
            forCar.add(new File(namesFilesClient.get(i))); //a
            forCar.get(i).createNewFile(); //a
        }
        
        for (int i = 0; i < 10; i++) 
        {
            forClients.add(new File(namesFilesClient.get(i))); //a
            forClients.get(i).createNewFile(); //a
        }
        
    }
    
    public void createFileCar() throws IOException
    {
        namesFilesCar.add(whereFileIs + "framecar" + NUMBERCAR + ".txt");
        forCar.add(NUMBERCAR, new File(namesFilesCar.get(NUMBERCAR)));
        forCar.get(NUMBERCAR).createNewFile();
    }
    
    public void createFileClient() throws IOException
    {
        namesFilesClient.add(whereFileIs + "frameclient" + NUMBERCLIENT + ".txt");
        forClients.add(NUMBERCLIENT, new File(namesFilesClient.get(NUMBERCLIENT)));
        forClients.get(NUMBERCLIENT).createNewFile();
        
        
    }
    
    public void createInfo()
    {
        for (int i = 0; i < 10; i++) 
        {
            Generate A = new Generate();
            randomFoi.add(i, A.createName()); A.clean();
            randomPol.add(i, A.createName()); A.clean(); 
            randomAge.add(i, A.createName(2)); A.clean(); 
            randomMoney.add(i, A.createName(6)); A.clean(); 
        }
        for (int i = 0; i < 10; i++) 
        {
            Generate A = new Generate();
            randomMarka.add(i, A.createName()); A.clean(); 
            randomColor.add(i, A.createName()); A.clean(); 
            randomPower.add(i, A.createName(6)); A.clean(); 
            randomKol.add(i, A.createName(1)); A.clean(); 
            randomType.add(i, A.createName()); A.clean(); 
            randomCena.add(i, A.createName(6)); A.clean();
        }
    }
    
    public void writeNewCarIntoFile() throws IOException
    {
        for (int i = 10; i < NUMBERCAR; i++) 
        {
            pwsCar.add(i, new PrintWriter(new FileWriter(forCar.get(i - 1), true)));
        }
        
        pwsCar.add(NUMBERCAR, new PrintWriter(new FileWriter(forCar.get(NUMBERCAR), true)));
        System.out.println("Car " + NUMBERCAR + " started to write");
        pwsCar.get(NUMBERCAR).println(randomMarka.get(NUMBERCAR));
        pwsCar.get(NUMBERCAR).println(randomColor.get(NUMBERCAR));
        pwsCar.get(NUMBERCAR).println(randomPower.get(NUMBERCAR));
        pwsCar.get(NUMBERCAR).println(randomKol.get(NUMBERCAR));
        pwsCar.get(NUMBERCAR).println(randomType.get(NUMBERCAR));
        pwsCar.get(NUMBERCAR).println(randomCena.get(NUMBERCAR));
        pwsCar.get(NUMBERCAR).close();
        System.out.println("Car " + NUMBERCAR + " added!");
    }
    
    public void writeNewClientIntoFile() throws IOException
    {
        for (int i = 10; i < NUMBERCLIENT; i++) 
        {
            pwsClient.add(i, new PrintWriter(new FileWriter(forClients.get(i - 1), true)));
        }
        
        pwsClient.add(NUMBERCLIENT, new PrintWriter(new FileWriter(forClients.get(NUMBERCLIENT), true)));         
        pwsClient.get(NUMBERCLIENT).println(randomFoi.get(NUMBERCLIENT)); 
        pwsClient.get(NUMBERCLIENT).println(randomPol.get(NUMBERCLIENT)); 
        pwsClient.get(NUMBERCLIENT).println(randomAge.get(NUMBERCLIENT)); 
        pwsClient.get(NUMBERCLIENT).println(randomMoney.get(NUMBERCLIENT)); 
        pwsClient.get(NUMBERCLIENT).close(); 
        System.out.println("Client " + NUMBERCLIENT + " added!");
    }
    
    public void writeInfoIntoFile() throws IOException
    {
        for (int i = 0; i < 10; i++) 
        {
            pwsClient.add(new PrintWriter(new FileWriter(forClients.get(i), true)));
            pwsClient.get(i).println(randomFoi.get(i));
            pwsClient.get(i).println(randomPol.get(i));
            pwsClient.get(i).println(randomAge.get(i));
            pwsClient.get(i).println(randomMoney.get(i));
            pwsClient.get(i).close();
        }
        
        for (int i = 0; i < 10; i++) 
        {
            pwsCar.add(new PrintWriter(new FileWriter(forCar.get(i), true))); //a
            pwsCar.get(i).println(randomMarka.get(i)); //a
            pwsCar.get(i).println(randomColor.get(i)); //a
            pwsCar.get(i).println(randomPower.get(i)); //a
            pwsCar.get(i).println(randomKol.get(i)); //a
            pwsCar.get(i).println(randomType.get(i)); //a
            pwsCar.get(i).println(randomCena.get(i));
            pwsCar.get(i).close();
        }
    }
    
    public void rewriteInfo()
    {
        for (int i = 0; i < 10; i++) 
        {
            randomAgeInt.add(Integer.parseInt(randomAge.get(i))); //a
            randomMoneyInt.add(Integer.parseInt(randomMoney.get(i))); //a
        }
        
        for (int i = 0; i < 10; i++) 
        {
            randomPowerInt.add(Integer.parseInt(randomPower.get(i))); //a
            randomKolInt.add(Integer.parseInt(randomKol.get(i))); //a
            randomCenaInt.add(Integer.parseInt(randomCena.get(i))); //a
        }
    }
    
    public void readFromFile() throws FileNotFoundException
    {
        for(int i = 0; i < NUMBERCAR; i++)
        {
            try
            {
                String line;
                readerForCar.add(new BufferedReader(new FileReader(namesFilesCar.get(i))));
                line = readerForCar.get(i).readLine();
                System.out.println("line is: " + line);
                randomMarka.add(i, line);
                line = readerForCar.get(i).readLine();
                randomColor.add(i, line);
                line = readerForCar.get(i).readLine();
                randomPower.add(i, line);
                randomPowerInt.add(Integer.parseInt(line));
                line = readerForCar.get(i).readLine();
                randomKol.add(i, line);
                randomKolInt.add(i, Integer.parseInt(line));
                line = readerForCar.get(i).readLine();
                randomType.add(i, line);
                line = readerForCar.get(i).readLine();
                randomCena.add(i, line);
                randomCenaInt.add(Integer.parseInt(line));
                car.add(i, new Cars(randomMarka.get(i), randomColor.get(i), randomPowerInt.get(i), randomKolInt.get(i), randomType.get(i), randomCenaInt.get(i)));
                System.out.println("Car " + i + " added!");
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
        
        for (int i = 0; i < NUMBERCLIENT; i++) 
        {
            try
            {
                String line = new String();
                readerForClient.add(new BufferedReader(new FileReader(namesFilesClient.get(i))));
                line = readerForClient.get(i).readLine();
                randomFoi.add(i, line);
                line = readerForClient.get(i).readLine();
                randomPol.add(i, line);
                line = readerForClient.get(i).readLine();
                randomAge.add(i, line);
                randomAgeInt.add(i, Integer.parseInt(line));
                line = readerForClient.get(i).readLine();
                randomMoney.add(i, line);
                randomMoneyInt.add(i, Integer.parseInt(line));
                client.add(i, new Custemers(randomFoi.get(i), randomPol.get(i), randomAgeInt.get(i), randomCenaInt.get(i)));
                System.out.println("Client " + i + " added!"); 
            }
            catch (IOException e) 
            {
                e.printStackTrace();
                System.out.println("Some has gone wrong...");
            }
        
        }
    }
    
    public void doEvery() throws IOException
    {
        findNUMBERCAR();
        findNUMBERCLIENT();
        createFiles();
        createInfo();
        rewriteInfo();
        writeInfoIntoFile();
        readFromFile();
        
    }

    public NewJFrame()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        jTextField9.setText("jTextField9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ФИО");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Пол");

        jLabel3.setText("Возраст");

        jLabel4.setText("Бюджет");

        jLabel5.setText("Марка");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Цвет");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jLabel7.setText("Тип");

        jLabel8.setText("Стоимость");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel10.setText("Тип");

        jLabel11.setText("kol");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Вывести всех покупателей");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton4.setBackground(new java.awt.Color(100, 100, 100));
        jButton4.setText("Подключиться к файлам");
        jButton4.setMaximumSize(new java.awt.Dimension(337, 410));
        jButton4.setMinimumSize(new java.awt.Dimension(337, 410));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton5.setText("Вывести все машины");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Вывести машины, которые может купить клиент по его имени ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButton1)))
                .addGap(240, 240, 240)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10)
                                .addComponent(jLabel5)
                                .addComponent(jTextField5)
                                .addComponent(jLabel6)
                                .addComponent(jTextField6)
                                .addComponent(jLabel7)
                                .addComponent(jTextField7)
                                .addComponent(jLabel8)
                                .addComponent(jTextField8)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11)
                                    .addGap(89, 89, 89)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))
                                .addGap(176, 176, 176)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3)
                                .addComponent(jTextField12)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(43, 43, 43)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(69, 69, 69))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String foi = jTextField1.getText();
        randomFoi.add(NUMBERCLIENT, foi);
        
        String pol = jTextField2.getText();
        randomPol.add(NUMBERCLIENT, pol);
        
        String age1 = jTextField3.getText();
        int age = Integer.parseInt(age1);
        
        randomAge.add(NUMBERCLIENT, age1);
        randomAgeInt.add(NUMBERCLIENT, age);
        
        String money1 = jTextField4.getText();
        int money = Integer.parseInt(money1);
        
        randomMoney.add(NUMBERCLIENT, money1);
        randomMoneyInt.add(NUMBERCLIENT, money);
        
        client.add(NUMBERCLIENT, new Custemers(randomFoi.get(NUMBERCLIENT), randomPol.get(NUMBERCLIENT), randomAgeInt.get(NUMBERCLIENT), randomMoneyInt.get(NUMBERCLIENT)));
        
        
        //work
        try {
            createFileClient();
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            writeNewClientIntoFile();
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        findNUMBERCAR();
        findNUMBERCLIENT();
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String marka = jTextField5.getText();
        randomMarka.add(NUMBERCAR, marka);
        
        String color = jTextField6.getText();
        randomColor.add(NUMBERCAR, color);
        
        String power1 = jTextField7.getText();
        int power = Integer.parseInt(power1);
        randomPower.add(NUMBERCAR, power1);
        randomPowerInt.add(NUMBERCAR, power);
        
        String kol1 = jTextField7.getText();
        int kol = Integer.parseInt(kol1);
        randomKol.add(NUMBERCAR, kol1);
        randomKolInt.add(NUMBERCAR, kol);
        
        String type = jTextField10.getText();
        randomType.add(NUMBERCAR, type);
        
        String cena1 = jTextField11.getText();
        int cena = Integer.parseInt(cena1);
        randomCena.add(NUMBERCAR, cena1);
        randomCenaInt.add(NUMBERCAR, cena);
        
        car.add(NUMBERCAR, new Cars(randomMarka.get(NUMBERCAR), randomColor.get(NUMBERCAR), randomPowerInt.get(NUMBERCAR), randomKolInt.get(NUMBERCAR), randomType.get(NUMBERCAR), randomCenaInt.get(NUMBERCAR)));
        
        try {
            createFileCar();
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            writeNewCarIntoFile();
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        findNUMBERCAR();
        findNUMBERCLIENT();
        
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextArea1.setText("");
        for (int i = 0; i < client.size(); i++) 
        {
            jTextArea1.append(i + ") " + client.get(i) + " ");
            jTextArea1.append("\n");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            doEvery();
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextArea2.setText("");
        for (int i = 0; i < car.size(); i++) 
        {
            jTextArea2.append(i + ") " + car.get(i) + " ");
            jTextArea2.append("\n");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        sx = jTextField12.getText();
        jTextField12.setText("");
        jTextArea3.setText("");
        int j = -1;
        for (int i = 0; i < client.size(); i++) 
        {
            if (sx.equals(client.get(i).getFoi()))
            {
                j = i;
                break;
            }
        }
        if (j != -1)
        {
           for(int i = 0; i < car.size(); i++)
            {
                if (client.get(j).getMoney() >= car.get(i).getCena()) 
                {
                    jTextArea3.append(car.get(i) + " ");
                    jTextArea3.append("\n");
                }  
            } 
        }
        else
        {
            jTextArea3.append("Client not found");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
