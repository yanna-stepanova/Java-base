package HW.taxipark;

/*
Таксопарк.
● Определить иерархию автомобилей.
● Создать таксопарк.
● Рассчитать стоимость автопарка.
● Провести сортировку автомобилей парка по расходу топлива.
● Найти автомобиль в компании, соответствующий заданному диапазону
параметров.
Требования:
1. Использовать: классы, интерфейсы, наследование, полиморфизм, инкапсуляцию
2. Каждый класс, метод и переменная должны иметь исчерпывающее смысл,
название и информативный состав. Необходимо продумать, какие классы
необходимы для решения задачи
3. Наследование должно применяться только тогда, когда это имеет смысл. Классы
должны быть грамотно разложены по пакетам
4. В каждом классе должны быть поля и методы, которые вы посчитаете
необходимыми.
5. Код должен быть отформатирован и соответствовать Java Code Convention (имена
переменных и методов с маленькой буквы - firstName ; имя метода - действие -
run() ; Имя класса с большой буквы; не забывать нажимать клавиши ctrl+alt+L и
ctrl+alt+O для форматирования текста и удаления ненужных импортов
соответственно)
 */
public class App {
    public static void main(String[] args) {
        Rating businessRating = new Rating("Business");
        businessRating.setTariff(200);
        Car car1 = new Car("Audi", "S3", businessRating);
        car1.setFuelСonsumption(11.8f);
        Taxipark taxiP = new Taxipark(car1, 100);
        System.out.println("Price for " + businessRating.getRating() + " distance = " + taxiP.getDistance() + " is " + taxiP.ratingPrice(businessRating, taxiP.getDistance()));
        Car car2 = new Car("Daewoo", "Gentra", 8.46f);
        car2.setAutoRating("Econom", 30);
        taxiP.setCar(car2);
        taxiP.setDistance(11);
        System.out.println("Price for " + taxiP.getCar(car2).getAutoRating().getRating() + " distance = " + taxiP.getDistance() + " is " + taxiP.carPrice(car2, taxiP.getDistance()));
        Rating standRating = new Rating("Standart", 65);
        taxiP.setAutoClass(standRating);
        taxiP.setCar(new Car("Chevrolet", "Aveo", standRating, 8.9f));
        taxiP.setCar(new Car("Toyota", "Corolla", standRating, 8.7f));
        taxiP.setCar(new Car("Skoda", "Octavia", standRating, 8.1f));
        taxiP.setCar(new Car("Kia", "Optima", standRating, 11.2f));
        taxiP.setCar(new Car("Volkswagen", "Sagitar", standRating, 7.6f));
        taxiP.setCar(new Car("Citroen", "C5", standRating, 8.3f));
        taxiP.setCar(new Car("Nissan", "Juke", standRating, 8.3f));
        taxiP.setCar(new Car("Renault", "Duster", standRating, 6.4f));
        taxiP.setCar(new Car("Skoda", "Fabia", taxiP.getAutoRating("Econom"), 6.5f));
        taxiP.setCar(new Car("Volkswagen", "Caddy", taxiP.getAutoRating("Econom"), 7.4f));
        taxiP.setCar(new Car("Dacia", "Logan", taxiP.getAutoRating("Econom"), 6.2f));
        taxiP.setCar(new Car("Kia", "Carens", taxiP.getAutoRating("Econom"), 9f));
        taxiP.setCar(new Car("Citroen", "Berlingo ", taxiP.getAutoRating("Econom"), 9.6f));
        taxiP.setCar(new Car("Nissan", "Almera  ", taxiP.getAutoRating("Econom"), 11.9f));
        taxiP.setCar(new Car("Renault", "Kangoo   ", taxiP.getAutoRating("Econom"), 5.8f));
        taxiP.setCar(new Car("Lexus", "ES", businessRating, 11f));
        taxiP.setCar(new Car("Volvo", "S60", businessRating, 14.5f));
        taxiP.setCar(new Car("BMW", "X1", businessRating, 10.4f));
        taxiP.setCar(new Car("Bentley ", "Flying Spur", businessRating, 22.4f));
        taxiP.setCar(new Car("Infiniti ", "M-Series", businessRating, 13.3f));
        taxiP.setCar(new Car("Kia ", "M-Quoris", businessRating, 11.4f));
        taxiP.setCar(new Car("Citroen ", "C6", businessRating, 12f));
        taxiP.allRatings();
        taxiP.sortCarsByFuel(taxiP.getCars());
        System.out.println(businessRating.getRating()+" cars with fuel consumption not more than 12:");
        taxiP.findCars(businessRating, 12);
    }
}
