/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package felipe.bazmitsuishi.concorrência_em_java;

import java.util.Scanner;

/**
 *
 * @author fbazm
 */
public class FelipeBazMitsuishiConcorrência_em_Java {
    static int i = 0;
    static int ini1 = 0;
    static int ini2 = 0;
    static int ini3 = 0;
    static int ini4 = 0;
    static int ini5 = 0;
    static int fim1 = 0;
    static int fim2 = 0;
    static int fim3 = 0;
    static int fim4 = 0;
    static int fim5 = 0;
    
    private static void countMe(String str, int num){
        i++;
        System.out.println("A " + str+" adcionou o num " + num);
    }
    
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
    
    public static Runnable primo1 = new Runnable(){
        @Override
        public void run() {
            for(int i = ini1; i < fim1;i++){
                if(ehPrimo(i)){
                    countMe("Thread 1", i);
                }
            }
        }
    };
       
    public static Runnable primo2 = new Runnable(){
        @Override
        public void run() {
            for(int i = ini2; i < fim2;i++){
                if(ehPrimo(i)){
                    countMe("Thread 2", i);
                }
            }
        }
    };
    
    public static Runnable primo3 = new Runnable(){
        @Override
        public void run() {
            for(int i = ini3; i < fim3;i++){
                if(ehPrimo(i)){
                    countMe("Thread 3", i);
                }
            }
        }
    };
    
    public static Runnable primo4 = new Runnable(){
        @Override
        public void run() {
            for(int i = ini4; i < fim4;i++){
                if(ehPrimo(i)){
                    countMe("Thread 4", i);
                }
            }
        }
    };
    
    public static Runnable primo5 = new Runnable(){
        @Override
        public void run() {
            for(int i = ini5; i < fim5;i++){
                if(ehPrimo(i)){
                    countMe("Thread 5", i);
                }
            }
        }
    };
    
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o tamanho do intervalo?");
        int num = leitor.nextInt();
        System.out.println("Qual o numero de Threads desejado de 0 a 5");
        int num_thread = leitor.nextInt();
        while(num_thread < 0 && num_thread > 6){
            System.out.println("Valor incorreto!!");
            System.out.println("Qual o numero de Threads desejado [0 a 5]");
            num_thread = leitor.nextInt();
        }
        
        int divisao = num/num_thread;
        
        
        
        
        
        if(num_thread >= 5){
            
        }
        
        switch (num_thread) {
            case 1:
                ini1 = 2;
                fim1 = num;
                Thread thread1;
                thread1 = new Thread(primo1);
                thread1.start();
                thread1.join();
                System.out.println("Numero de primos é: " + i);
                break;
            case 2:
                ini1 = 2;
                fim1 = divisao*1;
                ini2 = divisao;
                fim2 = num;
                thread1 = new Thread(primo1);
                thread1.start();
                Thread thread2 = new Thread(primo2);
                thread2.start();
                thread1.join();
                thread2.join();
                System.out.println("Numero de primos é: " + i);
                break;
            case 3:
                ini1 = 2;
                fim1 = divisao*1;
                ini2 = divisao;
                fim2 = (divisao*2);
                ini3 = (divisao*2);
                fim3 = num;
                thread1 = new Thread(primo1);
                thread1.start();
                thread2 = new Thread(primo2);
                thread2.start();
                Thread thread3 = new Thread(primo3);
                thread3.start();
                thread1.join();
                thread2.join();
                thread3.join();
                System.out.println("Numero de primos é: " + i);
                break;
            case 4:
                ini1 = 2;
                fim1 = divisao*1;
                ini2 = divisao;
                fim2 = (divisao*2);
                ini3 = (divisao*2);
                fim3 = (divisao*3);
                ini4 = (divisao*3);
                fim4 = num;
                thread1 = new Thread(primo1);
                thread1.start();
                thread2 = new Thread(primo2);
                thread2.start();
                thread3 = new Thread(primo3);
                thread3.start();
                Thread thread4 = new Thread(primo4);
                thread4.start();
                thread1.join();
                thread2.join();
                thread3.join();
                thread4.join();
                System.out.println("Numero de primos é: " + i);
                break;
            case 5:
                ini1 = 2;
                fim1 = divisao*1;
                ini2 = divisao;
                fim2 = (divisao*2);
                ini3 = (divisao*2);
                fim3 = (divisao*3);
                ini4 = (divisao*3);
                fim4 = divisao*4;
                ini5 = (divisao*4);
                fim5 = num;
                thread1 = new Thread(primo1);
                thread1.start();
                thread2 = new Thread(primo2);
                thread2.start();
                thread3 = new Thread(primo3);
                thread3.start();
                thread4 = new Thread(primo4);
                thread4.start();
                Thread thread5 = new Thread(primo5);
                thread5.start();
                thread1.join();
                thread2.join();
                thread3.join();
                thread4.join();
                thread5.join();
                System.out.println("Numero de primos é: " + i);
                break;
        }
    }
    
}
