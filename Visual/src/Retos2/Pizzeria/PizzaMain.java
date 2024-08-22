package Retos2.Pizzeria;

public class PizzaMain {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la pizzeria ");
        Pizza pizza1 = new Pizza("Margarita", "mediana");
        Pizza pizza2 = new Pizza("funghi","familiar");
        Pizza pizza3 = new Pizza("cuatro quesos","mediana");
        
        pizza1.mostrarPizza();
        pizza2.servirPizza();
        pizza2.mostrarPizza();
        pizza3.mostrarPizza();
        pizza2.servirPizza();
        System.out.println("pedidas: " + Pizza.getNumeroPizzas());
        System.out.println("servidas: " + Pizza.getTotalPedidas());

    }
    
}
