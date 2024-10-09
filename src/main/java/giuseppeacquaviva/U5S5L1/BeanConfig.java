package giuseppeacquaviva.U5S5L1;

import giuseppeacquaviva.U5S5L1.entities.Drink;
import giuseppeacquaviva.U5S5L1.entities.Menu;
import giuseppeacquaviva.U5S5L1.entities.Pizza;
import giuseppeacquaviva.U5S5L1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanConfig {
    @Bean(name = "tomato_topping")
    public Topping tomatoTopping() {
        return new Topping(0.10, 10, "Tomato");
    }
    @Bean(name = "cheese_topping")
    public Topping cheeseTopping() {
        return new Topping(1,22, "Cheese");
    }
    @Bean(name = "ham_topping")
    public Topping hamTopping() {
        return new Topping(2,12,"Ham");
    }
    @Bean(name = "pineapple_topping")
    public Topping pineappleTopping() {
        return new Topping(1.2, 23, "Pineapple");
    }
    @Bean(name = "salami_toppings")
    public Topping salamiTopping() {
        return new Topping(2, 8, "Salami");
    }

    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargherita() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(tomatoTopping());
        toppings.add(cheeseTopping());
        return new Pizza("Pizza Margherita", toppings, false);
    }

    @Bean(name = "hawaiian_pizza")
    public Pizza pizzaHawaiian() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(tomatoTopping());
        toppings.add(cheeseTopping());
        toppings.add(hamTopping());
        toppings.add(pineappleTopping());
        return new Pizza("Hawaiian Pizza", toppings, false);
    }

    @Bean(name = "salami_pizza")
    public Pizza pizzaSalami() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(tomatoTopping());
        toppings.add(cheeseTopping());
        toppings.add(salamiTopping());
        return new Pizza("Salami Pizza", toppings, false);
    }

    @Bean(name = "salami_pizza_xl")
    public Pizza pizzaSalamiXl() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(tomatoTopping());
        toppings.add(cheeseTopping());
        toppings.add(salamiTopping());
        return new Pizza("Salami Pizza XL", toppings, true);
    }

    @Bean(name = "lemonade")
    public Drink lemonade() {
        return new Drink("Lemonade", 2,200);
    }

    @Bean(name = "water")
    public Drink water() {
        return new Drink("Water", 1, 10);
    }

    @Bean(name = "wine")
    public Drink wine() {
        return new Drink("Wine", 10, 70);
    }

    @Bean(name = "menu")
    public Menu menuBean() {
        List<Pizza> pizzaList = new ArrayList<>();
        List<Drink> drinkList = new ArrayList<>();
        List<Topping> toppingsList = new ArrayList<>();

        pizzaList.add(pizzaMargherita());
        pizzaList.add(pizzaHawaiian());
        pizzaList.add(pizzaSalami());
        pizzaList.add(pizzaSalamiXl());

        drinkList.add(lemonade());
        drinkList.add(water());
        drinkList.add(wine());

        toppingsList.add(tomatoTopping());
        toppingsList.add(cheeseTopping());
        toppingsList.add(salamiTopping());
        toppingsList.add(hamTopping());
        toppingsList.add(pineappleTopping());

        return new Menu(pizzaList, drinkList, toppingsList);
    }
}
