package com.javaonlinecourse.b2lesson4.classwork;

import com.javaonlinecourse.b2lesson4.classwork.clients.Client;
import com.javaonlinecourse.b2lesson4.classwork.clients.OrdinaryClient;
import com.javaonlinecourse.b2lesson4.classwork.items.ShopItem;
import com.javaonlinecourse.b2lesson4.classwork.shop.ListOfItems;
import com.javaonlinecourse.b2lesson4.classwork.shop.ShopHelper;
import com.sun.deploy.util.SessionState;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author emitrohin
 * @version 1.0
 *          19.11.2016
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Client client = new OrdinaryClient();
        System.out.println("Добро пожаловать в инет магазин!");
        System.out.println("Ваше количество денег: " + client.getMoney());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ListOfItems listOfItems = new ListOfItems(10);
        ArrayList<ShopItem> basket = new ArrayList<>();

        while (true){
            String command = bufferedReader.readLine();

            if (command.equals("exit"))
            {
                break;
            }
            else if (command.equals("list"))
            {
                listOfItems.printList();
            }
            else if (command.equals("pick"))
            {
                System.out.println("Выберите товар");
                String pickItem = bufferedReader.readLine();

                for (int i = 0; i < listOfItems.getNotebooks().length; i++) {
                    if (pickItem.equals(listOfItems.getNotebooks()[i].getName()))
                    {
                        basket.add(listOfItems.getNotebooks()[i]);
                        System.out.println("Товар добавлен");
                        break;
                    }
                }

                for (int i = 0; i < listOfItems.getPrinters().length; i++) {
                    if (pickItem.equals(listOfItems.getPrinters()[i].getName()))
                    {
                        basket.add(listOfItems.getPrinters()[i]);
                        System.out.println("Товар добавлен");
                        break;
                    }
                }
            }
            else if (command.equals("basket"))
            {
                if (basket.size() == 0)
                {
                    System.out.println("Ваша корзина пуста");
                } else {
                    for (int i = 0; i < basket.size(); i++) {
                        System.out.println(basket.get(i).toString());
                    }
                }
            }
            else if (command.equals("buy"))
            {
                int sum = 0;

                for (int i = 0; i < basket.size(); i++) {
                    sum += basket.get(i).getPrice();
                }

                if (sum == 0)
                {
                    System.out.println("Вы ничего не выбрали");
                } else {
                    if (sum > client.getMoney())
                    {
                        System.out.println("Вы не можете себе этого позволить");
                        basket.clear();
                    } else {
                        client.setMoney( client.getMoney() - sum );
                        System.out.println("Поздравляем с покупкой. Ваше количество денег: " + client.getMoney());

                        basket.clear();

                        if (client.getMoney() == 0)
                        {
                            System.out.println("Приходите к нам еще");
                            break;
                        }
                    }
                }
            }
            else {
                System.out.println("Неизвестная команда");
            }
        }

        System.out.println("Приходите к нам еще");

    }
}
