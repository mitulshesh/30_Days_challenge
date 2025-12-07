package Java8;

public class SwitchDemo {

    public static void main(String[] args) {


        String type = "Avocado";

        //traditional switch
       /* switch(type){

            case "Tomato" : {
                System.out.println("Vegetable");
                break;
            }
            case "Mango","Banana" : {
                System.out.println("Fruit");
                break;
            }
            default: System.out.println("I am executed by default");
        }*/

        //Modern Switch java 14+

        switch (type){
            case "Tomato" -> System.out.println("Vegetable");
            case "Mango","Banana" -> System.out.println("Fruit");
            default -> System.out.println("I am executing by default");

        }





    }
}
