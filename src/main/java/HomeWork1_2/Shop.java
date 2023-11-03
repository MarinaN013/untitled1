package HomeWork1_2;
// Ваша задача - добавить два новых метода в класс Shop:
//        Метод sortProductsByPrice(), который сортирует список продуктов по стоимости.
//        Метод getMostExpensiveProduct(), который возвращает самый дорогой продукт.
//        Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
//        (правильное количество продуктов, верное содержимое корзины).
//        Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
//        Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
//        Используйте класс Product для создания экземпляров продуктов и класс Shop для написания методов сортировки и тестов.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {

        //private List<Product> products;

        //public Shop() {
        List<Product> products = new ArrayList<>();
        //}

        public void addProduct(Product product) {
            products.add(product);
        }

//        public void removeProduct(Product product) {
//            products.remove(product);
//        }

        public List<Product> getProducts() {
            return products;
        }

        public void sortProductsByPrice() {
            products.sort(Comparator.comparingInt(Product::getPrice));
        }

        public Product getMostExpensiveProduct() {
            if (products.isEmpty()) {
                return null;
            }

            Product mostExpensiveProduct = products.get(0);

            for (Product product : products) {
                if (product.getPrice() > mostExpensiveProduct.getPrice()) {
                    mostExpensiveProduct = product;
                }
            }
            return mostExpensiveProduct;
        }

}

