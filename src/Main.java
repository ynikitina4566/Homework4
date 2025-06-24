//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //Задача 1

        int year = 16;
        if(year >= 18) {
            System.out.println("Если возраст человека равен " + year + " лет, то он совершеннолетний");
        }
            else {
            System.out.println("Если возраст человека равен " + year + " лет, то он не достиг совершеннолетия, нужно немного подождать");
        }
        //Задача 2

        int temp = 8;
            if(temp > 5) {
                System.out.println("На улице " + temp + " градусов. Сегодня тепло, можно идти без шапки");
            }
            else {
                System.out.println("На улице " + temp + " градусов. На улице холодно, нужно надеть шапку");
            }

        //Задача 3

        int speed = 180;
            if(speed > 60) {
                System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
            }
            else {
                System.out.println("Если скорость " + speed + ", можно ездить спокойно");
            }

        //Задача 4

        int age = 9;
            if(age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
            }
        if(age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if(age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if(age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходит на работу");
        }

        //Задача 5
        int child = 11;
        if(child < 5) {
            System.out.println("Если возраст ребенка равен " + child + ", то он не может кататься на аттракционе");
        }
        if(child > 5 && child < 14) {
            System.out.println("Если возраст ребенка равен " + child + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if(child > 14) {
            System.out.println("Если возраст ребенка равен " + child + ", то он может кататься без сопровождения взрослого");
        }

        //Задача 6

        int passengers = 83;
        if(passengers < 60) {
            System.out.println("В вагоне остались сидячие места");
        }
        if(passengers >= 60 && passengers < 102) {
            System.out.println("В вагоне остались стоячие места");
        }
        else {
            System.out.println("Вагон полностью забит");
        }

        //Задача 7

        int one = 35;
        int two = 48;
        int three = 254;
        if(one > two && one > three) {
            System.out.println(one + " - больше, чем " + two + " и " + three);
        }
        if(two > one && two > three) {
            System.out.println(two + " - больше, чем " + one + " и " + three);
        }
        else {
            System.out.println(three + " - больше, чем " + one + " и " + two);
        }


    }
}