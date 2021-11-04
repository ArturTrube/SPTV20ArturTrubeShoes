/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Shoes;
import entity.User;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class App {

   public void run() {
   String repeat = "yes";
        Scanner scanner = new Scanner(System.in);
        do{
       System.out.println("Что бы закрыть программу нажмите: 0");
       System.out.println("Что бы добавить покупателя нажмите: 1");
       System.out.println("Что бы добавить модель нажмите: 2");
       System.out.println("Что бы вывести список продаваемых моделей нажмите: 3");
       System.out.println("Что бы вывести список пользователей нажмите: 4");
       System.out.println("Что бы купить обувь нажмите: 5");
       int task = scanner.nextInt(); scanner.nextLine();
       switch  (task)  {
                case 0:
                    repeat="no";
                    break;
                case 1:
                    User user = new User();
                    System.out.println("Введите имя читателя:   ");
                    user.setFirstName(scanner.nextLine());
                    System.out.println("Введитя фамилию читателя:    ");
                    user.setLastName(scanner.nextLine());
                    System.out.println("Введите телефон читателя:   ");
                    user.setPhone(scanner.nextLine());
                    System.out.println("Пользователь инициирован:   "+user.toString());
                    for (int i = 0; i < users.length; i++) {
                     if(users[i] == null){
                         users[i] = user;
                         break;
       }
        }        
                case 2:
                    Shoes shoes = new Shoes();
                    System.out.println("Введите имя производителя:  ");
                    shoes.setMakers(scanner.nextLine());
                    System.out.println("Введите название модели:    ");
                    shoes.setShoesName(scanner.nextLine());
                    System.out.println("Введите год выпуска:    ");
   }
       }
                case 3: 