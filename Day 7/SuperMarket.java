public class SuperMarket {
       static String name="MARINA MALL";
        String pname;
        int price;
        int discount;
        //global var,non static,fields
        public static void main(String[] args) {
            int a=20;
            SuperMarket prouduct1=new SuperMarket();
            prouduct1.name="rice";
            prouduct1.discount=50;
            prouduct1.discount=5;
            System.out.println(prouduct1.name);

            SuperMarket product2=new SuperMarket();
            product2.pname="biscuit";
            product2.price=10;
            product2.discount=4;
            System.out.println(product2.pname);
            System.out.println(name);
        }
}
