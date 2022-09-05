import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
       //ex2
        Person person1 = new Person();
        person1.setName("Mihai");
        person1.setAge(40);
        person1.setIsMarried(true);
        System.out.println(person1.getName() + person1.getAge() + person1.isMarried());

        Person person2 = new Person();
        person2.setName("Ioana");
        person2.setAge(30);
        person2.setIsMarried(false);
        System.out.println(person2.getName() + person2.getAge() + person2.isMarried());

        Person person3 = new Person();
        person3.setName("Maria");
        person3.setAge(20);
        person3.setIsMarried(false);
        System.out.println(person3.getName() + person3.getAge() + person3.isMarried());

        //ex 4
        Product product1 = new Product("creion",10.3,800,"papetarie");
        Product product2 = new Product("pix", 23.5,3000,"papetarie");
        Product product3 = new Product("surubelnita",12.3,0,"unelte");

        System.out.println(String.format("Produsul %s cu pretul de %f in cantitate de %d  face parte din categoria %s", product1.getName(), product1.getPrice(),product1.getQuantity(), product1.getCategory()));
        System.out.println(String.format("Produsul %s cu pretul de %f in cantitate de %d  face parte din categoria %s", product2.getName(), product2.getPrice(),product2.getQuantity(), product2.getCategory()));
        System.out.println(String.format("Produsul %s cu pretul de %f in cantitate de %d  face parte din categoria %s", product3.getName(), product3.getPrice(),product3.getQuantity(), product3.getCategory()));


        System.out.println("Stocul pentru " + product1.getName() + " este " + product1.hasStock());
        System.out.println("Stocul pentru " + product2.getName() + " este " + product2.hasStock());
        System.out.println("Stocul pentru " + product3.getName() + " este " + product3.hasStock());


        System.out.println("Categoria pentru produsul " + product1.getName() + " este " + product1.isCategory("papetarie"));
        System.out.println("Categoria pentru produsul " + product2.getName() + " este " + product2.isCategory("unelte"));
        System.out.println("Categoria pentru produsul " + product3.getName() + " este " + product2.isCategory("patiserie"));


        //ex 5

        Bottle bottle = new Bottle(2,1,false);

        Bottle bottle1 = new Bottle();

        System.out.println("Bottle has capacity " + bottle.getTotalCapacity());
        System.out.println("Bottle has more licquid is " +bottle.isMoreLiquid(6));

        System.out.println("Bottle 1 has capacity " +bottle1.getTotalCapacity());
        System.out.println("Bottle 1 has more licquid is " +bottle.isMoreLiquid(1));


        System.out.println(bottle.openBottle());
        System.out.println(bottle.drinksLiquid(12));

    }
}
