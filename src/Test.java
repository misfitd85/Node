public class Test{
    public static void main(String[] args){

        Node nde = new Node(7);

        nde.printInOrder();
        nde.insert(6);
        nde.printInOrder();
        System.out.println(nde.contains(7));
        System.out.println(nde.contains(1000));


    }
}