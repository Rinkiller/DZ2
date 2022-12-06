import java.util.LinkedList;
import java.util.Random;


//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. O(n)
class DZ1{
    private static LinkedList<Integer> reverse(LinkedList<Integer> list){
        LinkedList<Integer> newlst = new LinkedList<Integer>();
        for(int i = 0; i < list.size(); i++)
            newlst.add(list.get(list.size()-i-1));
            
        return newlst;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Random rnd = new Random();
        for(int i = 0; i < 10; i++)
            list.add(rnd.nextInt(10));
        System.out.println(list);
        System.out.println(reverse(list));
        System.out.println(list);
        
    }
}

