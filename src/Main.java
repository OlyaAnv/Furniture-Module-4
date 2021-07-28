public class Main {
    public static void main(String[] args) {

        Furniture furniture1 = new Furniture("Стол", 2, 300);
        Furniture furniture2 = new Furniture("Стул", 4);
        Furniture furniture3 = new Furniture("Диван");
        Furniture.store();
        furniture1.aboutFurniture();
        furniture2.aboutFurniture();
        furniture3.aboutFurniture();
        furniture3.setPrice(800);
        furniture3.aboutFurniture();
        furniture2.setPrice(-2);
        furniture1.descriptionText();
        furniture1.setDescription("Стол ломберный 790(1180)х590х750, металик серый/Ясень шимо светлый.");
        furniture1.descriptionText();

    }

}
