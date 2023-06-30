// Привет мир
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        int age = 18;
        if (age >= 18) {
            System.out.println("То он достиг совершеннолетия");}
        else {System.out.println(" возраст совершеннолетия еще не наступил и нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println(" Задача 2 ");
        int temperature = -7;
        if (temperature < 5) {
            System.out.println(" На улице  " + temperature +" холодно нужно надеть шапку");
        }
        int temperature1 = 5;
        if (temperature1 >= 5) {
            System.out.println(" Сегодня "+ temperature1 + " тепло можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        int speed = 61;
        if (speed > 60) {
            System.out.println(" Если скорость больше " + speed + " , то придется платить штраф");
        } else {
            System.out.println(" Если скорость " + speed + " , то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println(" Задача 4 ");
        int age = 15;
        System.out.println(" Возраст детины = " + age);
        if (age < 2) {
            System.out.println(" Ему пора спать");}
        if (age >= 2 && age <= 6) {
            System.out.println(" То ему нужно ходить в детский сад");}
        if (age >= 7 && age <= 18) {
            System.out.println(" То ему нужно ходить в школу");}
        if (age >= 18 && age <= 24) {
            System.out.println(" Его место в университете");}
        if (age >= 24 && age < 60) {
            System.out.println(" То ему пора ходить на работу");}
        if (age >= 60) {
            System.out.println(" То он может отдохнуть");}
    }

    public static void task5() {
        System.out.println(" Задача 5 ");
        int age = 15;
        System.out.println(" Возраст ребенка = " + age);
        if (age < 5) {
            System.out.println(" Если возвраст ребенка меньше 5, то он не может кататься на атракционах");
        }
        if (age == 5 || age < 14) {
            System.out.println(" Если возраст ребенка ровно 5 лет или больше, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя ");
        }
        if (age > 14) {
            System.out.println(" Если возраст ребенка старше 14 лет, то он может кататься без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println(" Задача 6 ");
        int capacityOfOneWagon = 102;
        System.out.println(" Вместимость одного вагона поезда = " + capacityOfOneWagon);
        int theNumberOfPeopleInTheCarriage = 55;
        System.out.println(" Колличество людей в поезде = " + theNumberOfPeopleInTheCarriage);
        if (theNumberOfPeopleInTheCarriage >= 1 && theNumberOfPeopleInTheCarriage <= 60) {
            System.out.println(" Есть место сидячее ");
        } else {
            if (theNumberOfPeopleInTheCarriage > 60 && theNumberOfPeopleInTheCarriage < 102) {
                System.out.println(" Есть место стоячее");
            } else {
                System.out.println(" Вагон полностью забит");
            }
        }
    }
    public static void task7() {System.out.println(" Задача 7 ");
        int one = 1;System.out.println(" = " + one);
        int two = 2;System.out.println(" = " + two);
        int three = 3;System.out.println(" = " + three);
        if (three > one && three > two) {System.out.println(" Большее из трех чисел - 3");
        } else {
            if (one > two && one > three) {System.out.println(" Большее из трех чисел - 1");
            } else {
                if (two > one && two > three) {System.out.println(" Большее из трех чисел - 2");}
            }
        }
    }
}