import java.util.Locale;

public class Furniture {
    private String type_of_furniture; //название мебели
    private int number_of_furniture; //количество мебели данного типа
    private double price; //цена
    private static int countAllFurniture; //общее количество мебели на складе
    private StringBuilder description;//описание мебели

    //конструктор с названием, количеством и ценой
    public Furniture(String type_of_furniture, int number_of_furniture, double price) {
        this.type_of_furniture = type_of_furniture;
        this.number_of_furniture = number_of_furniture;
        this.price = price;
        this.description = new StringBuilder("");
        countAllFurniture += number_of_furniture ;
    }

    //конструктор с названием и количеством
    public Furniture(String type_of_furniture, int number_of_furniture) {
        this(type_of_furniture, number_of_furniture, 0) ;
    }

    //конструктор с названием
    public Furniture(String type_of_furniture) {
        this(type_of_furniture, 0, 0);
    }

        //устанавливает/меняет цену
    public void setPrice(double price) {
        if(price >= 0) this.price = price;
        else System.out.println("Цена за " + this.type_of_furniture.toLowerCase(Locale.ROOT) +" указана неверно");
        }


        //добавить описание мебели
    public void setDescription(String description) {
            this.description.append(description);
        }


    public void aboutFurniture() {
        System.out.println(type_of_furniture + ": " + number_of_furniture + " шт. по " + price + " руб.");

    }

    public void descriptionText() {
        System.out.println(type_of_furniture);
        System.out.println(description);

    }
/*
    public void changeDescription(String str1, String str2) {
        Pattern pattern = Pattern.compile(str1);
        Matcher matcher = pattern.matcher(description);
        if(matcher.find())
            description.replace(0,description.length()-1, matcher.replaceAll(str2));
    }
*/
        public static void store() {
            System.out.println("Всего мебели в наличии "+ countAllFurniture + " единиц.");
        }
    }
