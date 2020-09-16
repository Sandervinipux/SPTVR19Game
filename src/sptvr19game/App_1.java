/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19game;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("Игра:Sander Rubenkov!");
        System.out.println("Угадай число и получи приз(Цитата)");
        System.out.println("-------------------------");
        int myNumber = 2;
        System.out.println("Задумано число от 0 - 5. Угадай!");
        Scanner scanner = new Scanner(System.in);
        int gamerNumber = scanner.nextInt();
        if(myNumber == gamerNumber) {
            System.out.println("Ты выиграл");
            System.out.println("Если наша жизнь не такова, какой мы хотим её видеть,");
            System.out.println("просто абсурдно считать себя неподражаемыми умниками и умницами");
        }else {
            System.out.println("Ты проиграл. задуманное число: "+myNumber);
        }
    }
}
