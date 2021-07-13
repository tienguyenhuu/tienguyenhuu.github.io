import java.util.ArrayList;
import java.util.Collections;

public class AppSp {
    public static void main(String[] args) {
        ArrayList<Sp> sps = new ArrayList<>();
        sps.add(new Sp(01, "Thịt lợn" ,"nạc",100000,30,2000000));
        sps.add(new Sp(02, "Thịt Bò" ,"nạc",400000,20,6000000));
        sps.add(new Sp(03, "Thịt Gà" ,"nạc",500000,100,7000000));
        sps.add(new Sp(04, "Thịt Chó" ,"nạc",1200000,10,2000000));
        show(sps);
        Collections.sort(sps, (o1, o2) -> {
            return o1.getname().compareTo(o2.getname());
        });
        System.out.println("Danh sách sau khi sắp xếp");
        show(sps);

        Collections.sort(sps, (o1, o2) -> {
            int a = (int)o1.getamountSale();
            int b = (int)o2.getamountSale();
            return  a-b;
        });
        System.out.println("Danh sách theo soos lượng bán được");
        show(sps);
        
        System.out.println("Danh sách có giá trên một triệu");
        sps.stream().filter(Sp -> Sp.getprice() > 1000000)
        .forEach(Sp -> System.out.println(Sp));

        System.out.println("Danh sách hàng hóa và tổng tiền bán đươc");
        sps.stream().map(Sp -> Sp.getname())
        .forEach(Sp -> System.out.println("/%n"+ Sp));
        sps.stream().map(Sp -> Sp.getamountSale())
        .forEach(Sp -> System.out.println(Sp));
    }
    public static void show(ArrayList<Sp> sps) {
        sps.forEach((sp) -> {System.out.println(sp);});
    }
}