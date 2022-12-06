// Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной пользовательской записи. 
// Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
// Например:
// 5 4 3 - + => 5 1 + => 6
import java.util.Stack;
import java.util.Scanner;
public class DZ3 {
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {   
    //var exp = "5 4 3 - +".split(" ");
    
    Scanner Scaner = new Scanner(System.in,"cp866");  
    System.out.print("данные и операции в обратной пользовательской записи Пример(для 5 + 4 - 3) запись 5 4 3 - + :");
    String[] exp = Scaner.nextLine().split(" ");   
    Scaner.close();
    int res = 0;
        
        
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}

