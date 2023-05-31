public class FirstClass {

    final String name ;
    final String age ;
    final String phone ;

    public FirstClass(String name, String age, String phone) {

        this.name = name;
        this.age = age;
        this.phone = phone
    }

    public static void main (String args[]) {

        FirstClass obj1 = new FirstClass("John","58", "9721111111") ;
        FirstClass obj2 = new FirstClass("Jim", "45", "9722222222") ;
        FirstClass obj3 = new FirstClass("Joe", "51", "9723333333") ;

        System.out.println(obj1.name + obj1.age + obj1.phone);
        System.out.println(obj2.name + obj2.age + obj2.phone);
        System.out.println(obj3.name + obj3.age + obj3.phone);


    }
}
