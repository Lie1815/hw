package hw;

import java.util.Scanner;

public class Docs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] clients = {"Иван", "Петр", "Вика"};
        String[] docs = {"паспорт", "водительское удостоверение", "свидетельство о рождении"};

        System.out.println("Ввести количество доков");
        int docsclients = sc.nextInt();

        if( docsclients != docs.length){
            System.out.println("Ошибка: нехватает документов " );
        } else {
            System.out.println("документы загруженны");
        }
    }
}
