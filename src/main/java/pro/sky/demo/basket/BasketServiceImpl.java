package pro.sky.demo.basket;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService{

    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    public String hello() {
        return "Вы находитесь в корзине. Используйте /add для добавления товаров и /get для просмотра всего заказа";
    }
    public void add(List<Integer> ids) {
        basket.addItems(ids);
    }

    public List<Item> get() {
       return basket.getBasket();
    }


}
