package pro.sky.demo.basket;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Item {
    private final Integer id;

    public Item(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
