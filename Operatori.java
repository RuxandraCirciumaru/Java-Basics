/*
Operatori:
aritmetici: +,-,==,%-modulo,aflam restul impartirii,/
logici:&&- si, ||- sau
de comparare: < >,<=,>=,!=,==
Flow control = if/else
 */

public class Operatori {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        a = b;//suprascriere
        System.out.println(a != b);// 5 diferit de 5? - false
        System.out.println(a==b);// 5 egal cu 5? - true
        System.out.println(a % b);//5 impartit la 5? - 0
        System.out.println(8>b && 5> b);//voi primi true doar in cazul in care sunt amandoua adevarate
        System.out.println(8>b || 5>b);//voi primi true daca una din ele este adevarata



    }
}
