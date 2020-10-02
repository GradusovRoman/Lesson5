package geekbrains.lesson5_homework_oop;

import javax.swing.*;

public class Lesson5_oop {

    public static void main(String[] args) {
        EmployeeData[] persArray = new EmployeeData[5];
        persArray[0] = new EmployeeData("Gradusov Roman", "Java Developer", "monomari86@gmail.com",
                "89639007700", 120000, 33);
        persArray[1] = new EmployeeData("Rudenko Ivan", "Engineer", "ivivan1@mailbox.com",
                "89639007701", 60000, 41);
        persArray[2] = new EmployeeData("Ivanov Alex", "Manager", "AI_box_wrk@mail.ru",
                "89639007702", 50000, 35);
        persArray[3] = new EmployeeData("Mikulin Semen", "System Administrator", "ivivan3@mailbox.com",
                "89639007703", 65000, 34);
        persArray[4] = new EmployeeData("Hlebnikov  Maxim", "Engineer", "ivivan4@mailbox.com",
                "73472465123", 75000, 45);

        System.out.println("Список сотрдуников старше 40 лет:");
        for (EmployeeData employee : persArray) {
          if (employee.GetAge() > 40)  employee.Show();

            }
        }

        }


