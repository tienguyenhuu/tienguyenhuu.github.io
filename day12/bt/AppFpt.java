import java.util.ArrayList;
import java.util.Scanner;

public class AppFpt {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("01", "Oppo Reno5 8GB-128GB", "Reno5 8GB 128GB", 8390000, 10, 7, "Oppo",
                Catergory.Điệnthoại));
        products.add(
                new Product("02", "Oppo Reno4 Pro", "Oppo Reno4 Pro", 8151000, 25, 10, "Oppo", Catergory.Điệnthoại));
        products.add(new Product("03", "Samsung Galaxy Z Flip", "Samsung Galaxy Z Flip", 13497000, 10, 3, "Samsung",
                Catergory.Điệnthoại));
        products.add(new Product("04", "Oppo A92 - Oppo A92", "Oppo A92 - Oppo A92", 5990000, 30, 15, "Oppo",
                Catergory.Điệnthoại));
        products.add(new Product("05", "Xiaomi Redmi 9 4GB-64GB", "Xiaomi Redmi 9 4GB-64GB", 3190000, 30, 25, "Xiaomi",
                Catergory.Điệnthoại));
        products.add(new Product("06", "Asus Zenbook UX325EA-EG079T", "Asus Zenbook UX325EA-EG079T", 20790000, 10, 6,
                "Asus", Catergory.Laptop));
        products.add(new Product("07", "Dell G3 15 i5 10300H", "Dell G3 15 i5 10300H", 21840000, 15, 4, "Dell",
                Catergory.Laptop));
        products.add(new Product("08", "Dell Inspiron N7501 i7 10750H", "Dell Inspiron N7501 i7 10750H", 28970000, 10,
                1, "Dell", Catergory.Laptop));
        products.add(new Product("09", "iPhone 12 Pro Max 128GB", "iPhone 12 Pro Max 128GB", 30990000, 5, 2, "iPhone",
                Catergory.Điệnthoại));
        products.add(new Product("10", "MacBook Air 13 2020 M1 16GB/256GB", "MacBook Air 13 2020 M1 16GB/256GB",
                33990000, 20, 4, " MacBook", Catergory.appe));
        products.add(new Product("11", "Loa bluetooth Compact 2", "Loa bluetooth Compact 2", 290000, 20, 15, "Xiaomi",
                Catergory.appe));
        products.add(new Product("12", "Loa bluetooth i.value BT116", "Loa bluetooth i.value BT116", 490000, 30, 10,
                "i.value", Catergory.Phụkiện));
        products.add(new Product("13", "Pin sạc dự phòng 10000mAh Mi Ultra Compact",
                "Pin sạc dự phòng 10000mAh Mi Ultra Compact", 710000, 30, 10, " Xiaomi", Catergory.Phụkiện));
        products.add(new Product("14", "Vivo Y20 4GB-64GB", "Vivo Y20 4GB-64GB", 3690000, 15, 10, "Vivo",
                Catergory.Phụkiện));
        Scanner input = new Scanner(System.in);
        while (true) {
            menu();
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(
                            "->>In theo danh mục điện thoại \n------------------------------------------------------------------------------------------");
                    products.stream().filter(Product -> Product.getcatergory() == Catergory.Điệnthoại)
                            .forEach(Product -> System.out.println(Product));
                    System.out.println(
                            "------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println(
                            "->>In theo hãng \n------------------------------------------------------------------------------------------");
                    products.stream().filter(Product -> Product.getmanufacturer() == "Xiaomi")
                            .forEach(Product -> System.out.println(Product));
                    System.out.println(
                            "------------------------------------------------------------------------------------------");
                case 3:
                System.out.println("->>Giá dưới 2tr \n-------------------------------------------------------------------------------");
                products.stream().filter(Product -> Product.getprice() < 2000000)
                            .forEach(Product -> System.out.println(Product));
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("->>Giá từ 2tr đến 4tr \n-------------------------------------------------------------------------------");
                            products.stream().filter(Product -> Product.getprice() < 4000000 && Product.getprice() >2000000)
                            .forEach(Product -> System.out.println(Product));
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("->>Giá từ 4tr đến 7tr \n-------------------------------------------------------------------------------");
                            products.stream().filter(Product -> Product.getprice() < 7000000 && Product.getprice() >4000000)
                            .forEach(Product -> System.out.println(Product));
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("->>Giá từ 7tr đến 13tr \n-------------------------------------------------------------------------------");
                            products.stream().filter(Product -> Product.getprice() < 13000000 && Product.getprice() >7000000)
                            .forEach(Product -> System.out.println(Product));
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("->>Giá từ 7tr đến 13tr \n-------------------------------------------------------------------------------");
                            products.stream().filter(Product -> Product.getprice() > 13000000 )
                            .forEach(Product -> System.out.println(Product));
                System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 4:
                while(true){
                        System.out.println("nhập sản phẩm cần tìm kiếm");
                        String search = input.nextLine();
                        if(search.equals("q")){
                                break;
                        }
                        else{
                        products.stream().filter(Product -> Product.getid() == search)
                        .forEach(Product -> System.out.println(Product));
                        }
                }
                case 0:
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;

            }
        }
    }

    public static void menu() {
        System.out.println("Chọn 1 in thông tin dựa trên danh mục");
        System.out.println("Chọn 2 in thông tin các sản phẩm dựa theo hãng");
        System.out.println("Chọn 3 in thông tin sản phẩm dựa trên mức giá và danh mục.");
        System.out.println("Chọn 0 để thoát");
    }
}
