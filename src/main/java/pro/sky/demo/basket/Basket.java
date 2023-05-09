package pro.sky.demo.basket;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Item> basket = new ArrayList<>();

    public List<Item> getBasket() {
        return Collections.unmodifiableList(basket);
    }

    public void addItems(List<Integer> ids) {
        for (Integer id: ids) {
            basket.add(new Item(id));
        }

    }

}
