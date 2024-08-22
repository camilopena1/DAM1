package Tema5.Practica1.ParteA;

public class MainHerencia {
    public static void main(String[] args) {
        ProductosFrescos tomate = new ProductosFrescos("1-1-1", 1, "1-1-1", "colombia");
        ProductosFrescos limon = new ProductosFrescos("1-1-1", 2, "1-1-1", "colombia");
        ProductosRefrigerados yogurt = new ProductosRefrigerados("1-2-1", 1, 1, "1-1-1", 10, "portugal");
        ProductosRefrigerados mantequilla = new ProductosRefrigerados("1-2-1", 1, 1, "1-1-1", 10, "italia");
        ProductosRefrigerados queso = new ProductosRefrigerados("1-2-1", 1, 1, "1-1-1", 10, "francia");
        ProductosCongelados pescado = new CongeladosAgua("2-2-2", 3, "1-1-1", "japon", 0, 20);
        ProductosCongelados pescado1 = new CongeladosAgua("2-2-2", 3, "1-1-1", "japon", 0, 20);
        ProductosCongelados carne = new CongeladosAire("3-3-3", 5, "3-3-3", "EEUU", -5, 10, 2, 1, 2);
        ProductosCongelados costilla = new CongeladosAire("3-3-3", 5, "3-3-3", "EEUU", -5, 10, 3, 4, 1);
        ProductosCongelados patatas = new CongeladosNitrogeno("4-4-4", 3, "1-1-1", "españa", 1, "aire", 10);

        ProductosCongelados[] array = new ProductosCongelados[5];
        array[0] = pescado;
        array[1] = pescado1;
        array[2] = patatas;
        array[3] = costilla;
        array[4] = carne;
        for (ProductosCongelados productosCongelados : array) {
            System.out.println(productosCongelados);
        }

    }
}
