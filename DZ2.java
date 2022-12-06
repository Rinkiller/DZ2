// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
import java.util.LinkedList;
import java.util.Random;

class DZ2{
    private static void enqueue(LinkedList<Integer> list, Integer el){
        list.addLast(el);  
    }
    private static Integer dequeue(LinkedList<Integer> list){
        Integer result = list.get(0); 
        list.remove(0);
        return result;
    }
    private static Integer first(LinkedList<Integer> list){
        Integer result = list.get(0); 
        return result;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Random rnd = new Random();
        for(int i = 0; i < 10; i++)
            list.add(rnd.nextInt(10));
        System.out.println(list);
        enqueue(list,9);
        System.out.println(list);
        System.out.println(dequeue(list));
        System.out.println(list);
        System.out.println(first(list));
        System.out.println(list);
        
    }
}