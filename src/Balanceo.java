import java.util.Stack;

public class Balanceo {
    public static boolean estaBalanceada(String expresion){
        Stack<Character> pila=new Stack<>();
        for (int i=0; i<expresion.length();i++){
            char caracter=expresion.charAt(i);
            if (caracter=='('||caracter=='{'||caracter=='['){
                pila.push(caracter);
            }
            else if (caracter==')'||caracter=='}'||caracter==']'){

                if (pila.isEmpty()){
                    return  false;
                }
                char cima= pila.pop();
                if ((caracter == ')' && cima != '(') ||
                        (caracter == '}' && cima != '{') ||
                        (caracter == ']' && cima != '[')){
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
}
