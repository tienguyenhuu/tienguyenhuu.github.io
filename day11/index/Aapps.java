public class Aapps {
    public class Aapps {
        public static void main(String[] args) throws Exception {
            ArrayList<Person> list = new ArrayList<>();
            list.add(new Person("Ngoc", 25));
            list.add(new Person("Hoang", 30));
            list.add(new Person("Tuan", 27));
            list.add(new Person("Hoa", 20));
    
            show(list);
            
            System.out.println("Danh sách những người có tuổi lớn hơn 25 là:");
        list.stream().filter(person -> person.getAge() > 25)
        .forEach(person -> System.out.println(person));
        }
        Collections.sort(list, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });

        //Sử dụng lambda sắp xếp theo tên với phương thức compareByName
        Collections.sort(list, (o1, o2) -> Person.compareByName(o1, o2));
        System.out.println("Danh sách sắp xếp theo tên: ");
        show(list);
        
}
}
