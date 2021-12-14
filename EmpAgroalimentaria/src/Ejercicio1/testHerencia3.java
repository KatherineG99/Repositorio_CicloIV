package Ejercicio1;

/**
 *
 * @author Katherine Gomez
 */
public class testHerencia3 {

    public static void main(String[] args) {
        System.out.println("Productos Frescos");
        Frescos prod1 = new Frescos("Tomate", "20 noviembre 2021", "23 noviembre 2021", 00021, "Mexico");
        prod1.Mostrar1();
        System.out.println("");
        Frescos prod2 = new Frescos("almendras", "18 noviembre 2021", "02 enero 2022", 00021, "Alemania");
        prod2.Mostrar1();
        System.out.println("");
        System.out.println("Productos Refrigerados");
        Refrigerados prod3 = new Refrigerados("Gaseosas", "21 enero 2022", 0002145, "25 noviembre 2021", "Estado Unidos", 45, 0065);
        prod3.Mostrar2();
        Refrigerados prod4 = new Refrigerados("Bebida Energetica", "26 febrero 2022", 00561, "28 diciembre 2021", "Alemania", 45, 0065);
        prod4.Mostrar2();
        Refrigerados prod5 = new Refrigerados("yogurt", "28 octubre 2022", 889, "26 noviembre 2021", "Estados Unidos", 85, 589);
        prod5.Mostrar2();
        System.out.println("");
        System.out.println("Productos Congelados");
        Congelados prod6 = new Congelados("Carne", "20 noviembre 2021", 865, "31 octubre 2021", "Mexico", -12, "agua");
        prod6.Mostrar2();
        Congelados prod7 = new Congelados("camarones","18 diciembre 2021",4546,"26 julio 2021","Ecuador",-18,"agua");
        prod7.Mostrar2();
        Congelados prod8 = new Congelados("Pollo","12 Diciembre 2021",256458,"15 Enero 2021","Noruega",-14,"aire");
        prod8.Mostrar2();
        Congelados prod9 = new Congelados("Nugets","12 enero 2022",5647,"22 Diciembre 2021","Inglaterra",-2,"aire");
        prod9.Mostrar2();
        Congelados prod10 = new Congelados("Pescado","26 febrero 2022",54584,"15 noviembre 2021","España",-16,"nitrogeno");
        prod10.Mostrar2();

    }

}
