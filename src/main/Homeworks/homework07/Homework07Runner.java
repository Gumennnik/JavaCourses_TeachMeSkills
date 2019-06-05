package homework07;

public class Homework07Runner {

    /*  1)- Создать собственное исключение
        Создать класс Car c полями (марка, скорость, цена), конструкторы (с параметрами и default) гетеры-сетеры.
        Создать метод старт в котором пытаетесь завести автомобиль. В методе старт генерируете случайное число от 0 до 20, если полученное число оказалось четным, то выбрасываете созданное ранее вами исключение и передаете его к месту откуда вызывали метод старт. Если все хорошо и исключение не вылетело, то выводить в консоль сообщение что автомобиль с такой-то маркой завелся.

        В main создаете парочку автомобилей и пытаетесь их завести. И обрабатываете исключение которое может вылететь при старте автомобиля*/

    public static void main(String[] args) throws CarStartFailException {
//        //Exercise 1
//
//        Car canOne = new Car("Volvo",20000,100);
//        Car canTwo = new Car("Mercedes", 30000,150);
//        Car canThree = new Car("Lada", 40000,200);
//
//        try {
//            if (canOne.startEngine()) {
//                System.out.println("First cars engine started");
//            }
//        } catch (CarStartFailException e) {
//            System.out.println("First cars engine start failed on number " + e.getFailNumber());
//        }
//
//        try {
//            if (canTwo.startEngine()) {
//                System.out.println("Second cars engine started");
//            }
//        } catch (CarStartFailException e) {
//            System.out.println("Second cars engine start failed on number " + e.getFailNumber());
//        }
//
//        try {
//            if (canThree.startEngine()) {
//                System.out.println("Third cars engine started");
//            }
//        } catch (CarStartFailException e) {
//            System.out.println("Third cars engine start failed on number " + e.getFailNumber());
//        }

        //Exercise 2

        Calculator calculator = new Calculator();
        calculator.calculate();









    }

}
