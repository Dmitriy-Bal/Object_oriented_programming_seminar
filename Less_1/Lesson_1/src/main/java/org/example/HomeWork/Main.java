package org.example.HomeWork;

import java.util.ArrayList;

/**
 * 1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * 2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 * 3)Создать класс Basket, содержащий массив купленных товаров.
 * 4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
 * 5)Вывести на консоль каталог продуктов. (все продукты магазина)
 * 6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар,
 * а из магазина - удаляется)
 */

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();

        System.out.println("Товары в магазине: \n");

        Category category1 = new Category("Бытовая химия");
        category1.addProduct(new Product("Средства личной гигиены", 200.99, 10));
        category1.addProduct(new Product("Чистящие средства", 150.99, 8));

        Category category2 = new Category("Бытовая техника");
        category2.addProduct(new Product("Мелкобытовая техника", 15000.90, 9));
        category2.addProduct(new Product("Крупнобытовая техника", 230000.90, 7));
        category2.addProduct(new Product("Аудио-видео техника", 100000.90, 6));
        category2.addProduct(new Product("Цифровая техника", 25000.90, 5));

        Category category3 = new Category("Посуда");
        category3.addProduct(new Product("Столовая посуда", 300.90, 3));
        category3.addProduct(new Product("Кастрюли/сковороды", 800.90, 4));

        shop.addCategory(category1);
        shop.addCategory(category2);
        shop.addCategory(category3);

        shop.printCatalog();

        User user1 = new User("Егорова А.В.", "123456");
        User user2 = new User("Прохоров И.Б.", "654321");
        User user3 = new User("Галкин А.Г.", "123321");

        user1.getBasket().addProduct(category1.getProducts().get(1));
        user1.getBasket().addProduct(category3.getProducts().get(0));
        user2.getBasket().addProduct(category2.getProducts().get(1));
        user2.getBasket().addProduct(category3.getProducts().get(1));
        user3.getBasket().addProduct(category1.getProducts().get(0));
        user3.getBasket().addProduct(category2.getProducts().get(2));
        user3.getBasket().addProduct(category2.getProducts().get(0));
        user3.getBasket().addProduct(category3.getProducts().get(0));

        category1.getProducts().remove(1);
        category1.getProducts().remove(0);
        category2.getProducts().remove(1);
        category2.getProducts().remove(2);
        category2.getProducts().remove(0);
        category3.getProducts().remove(1);
        category3.getProducts().remove(0);

        System.out.println("\n Покупки: \n");

        System.out.println(user1.getLogin() + " Покупка: ");
        ArrayList<Product> user1Products = user1.getBasket().getProducts();
        for (Product product : user1Products) {
            System.out.println(" - " + product.getSku() + " - " + product.getPrice() +
                    " - " + product.getRating());
        }

        System.out.println(user2.getLogin() + " Покупка: ");
        ArrayList<Product> user2Products = user2.getBasket().getProducts();
        for (Product product : user2Products) {
            System.out.println(" - " + product.getSku() + " - " + product.getPrice() +
                    " - " + product.getRating());
        }

        System.out.println(user3.getLogin() + " Покупка: ");
        ArrayList<Product> user3Products = user3.getBasket().getProducts();
        for (Product product : user3Products) {
            System.out.println(" - " + product.getSku() + " - " + product.getPrice()
                    + " - " + product.getRating());
        }
        System.out.println("\n Остаток товара после покупок: \n");
        shop.printCatalog();
    }
}