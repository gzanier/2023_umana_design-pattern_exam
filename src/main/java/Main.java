import oldFashionPound.MoneyOperation;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println(args[0]);

        String[] tokens = args[0].split(" ");
        ArrayList<Integer> n1 = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>();
        Integer n3 = 0;

        GestioneInput gestioneInput = new GestioneInput(args[0]);


        String operation = tokens[3];
        //switch (operation) {
        if (operation.equals("+")) {
            System.out.println("sum");
            String[] s1 = tokens[0].split("p");
            n1.add(Integer.parseInt(s1[0]));
            s1 = tokens[1].split("s");
            n1.add(Integer.parseInt(s1[0]));
            s1 = tokens[2].split("d");
            n1.add(Integer.parseInt(s1[0]));
            s1 = tokens[4].split("p");
            n2.add(Integer.parseInt(s1[0]));
            s1 = tokens[5].split("s");
            n2.add(Integer.parseInt(s1[0]));
            s1 = tokens[6].split("d");
            n2.add(Integer.parseInt(s1[0]));

            MoneyOperation moneyOperation = new MoneyOperation(n1, n2);
            moneyOperation.addMoney(n1, n2);
        } else if (operation.equals("-")) {

            System.out.println("sutraction");
            String[] s1 = tokens[0].split("p");
            n1.add(Integer.parseInt(s1[0]));
            s1 = tokens[1].split("s");
            n1.add(Integer.parseInt(s1[0]));
            s1 = tokens[2].split("d");
            n1.add(Integer.parseInt(s1[0]));
            s1 = tokens[4].split("p");
            n2.add(Integer.parseInt(s1[0]));
            s1 = tokens[5].split("s");
            n2.add(Integer.parseInt(s1[0]));
            s1 = tokens[6].split("d");
            n2.add(Integer.parseInt(s1[0]));
            MoneyOperation moneyOperation = new MoneyOperation(n1, n2);
            moneyOperation.subMoney(n1, n2);
        } else if (operation.equals("*")) {
            System.out.println("multiplication");
            String[] s1 = tokens[0].split("p");
            n1.add(Integer.parseInt(s1[0]));
            s1 = tokens[1].split("s");
            n1.add(Integer.parseInt(s1[0]));
            s1 = tokens[2].split("d");
            n1.add(Integer.parseInt(s1[0]));
            s1[0] = tokens[4];
            n3 = Integer.parseInt(s1[0]);
            //n2.add(Integer.parseInt(s1[0]));
            MoneyOperation moneyOperation = new MoneyOperation(n1, n3);
            moneyOperation.multMoney(n1, n3);
        } else if (operation.equals("/")) {
            System.out.println("division");
            String[] s1 = tokens[0].split("p");
            n1.add(Integer.parseInt(s1[0]));
            s1 = tokens[1].split("s");
            n1.add(Integer.parseInt(s1[0]));
            s1 = tokens[2].split("d");
            n1.add(Integer.parseInt(s1[0]));
            s1[0] = tokens[4];
            n3 = Integer.parseInt(s1[0]);
            //n2.add(Integer.parseInt(s1[0]));
            MoneyOperation moneyOperation = new MoneyOperation(n1, n3);
            moneyOperation.divMoney(n1, n3);
        }


    }

}
