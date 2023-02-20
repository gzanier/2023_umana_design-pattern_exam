package oldFashionPound;

import java.util.ArrayList;

public class MoneyOperation {

    private int pence;
    private int shilling;
    private int pound;

    private ArrayList<Integer> n1;
    private ArrayList<Integer> n2;
    private Integer n3;

    public MoneyOperation(ArrayList<Integer> n1, ArrayList<Integer> n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public MoneyOperation(ArrayList<Integer> n1, Integer n3) {
        this.n1 = n1;
        this.n3 = n3;
    }

    public void addMoney(ArrayList<Integer> n1, ArrayList<Integer> n2) {

        pence = (n1.get(2) + n2.get(2)) % 12;
        shilling = ((n1.get(2) + n2.get(2)) / 12 + n1.get(1) + n2.get(1)) % 20;
        pound = ((n1.get(2) + n2.get(2)) / 12 + n1.get(1) + n2.get(1)) / 20 + n1.get(0) + n2.get(0);
        //return pound,shilling,pence
        System.out.println(Integer.toString(pound) + "p" + Integer.toString(shilling) + "s" + Integer.toString(pence) + "d");
    }

    public void subMoney(ArrayList<Integer> n1, ArrayList<Integer> n2) {
        pound = ((n1.get(0) * 240 + n1.get(1) * 12 + n1.get(2)) - (n2.get(0) * 240 + n2.get(1) * 12 + n2.get(2))) / 240;
        shilling = ((n1.get(0) * 240 + n1.get(1) * 12 + n1.get(2)) - (n2.get(0) * 240 + n2.get(1) * 12 + n2.get(2))) % 240 / 12;
        pence = (((n1.get(0) * 240 + n1.get(1) * 12 + n1.get(2)) - (n2.get(0) * 240 + n2.get(1) * 12 + n2.get(2))) % 240) % 12;
        //return pound,shilling,pence
        System.out.println(Integer.toString(pound) + "p" + Integer.toString(shilling) + "s" + Integer.toString(pence) + "d");
    }

    public void multMoney(ArrayList<Integer> n1, Integer n3) {
        pound = ((n1.get(0) * 240 + n1.get(1) * 12 + n1.get(2)) * n3) / 240;
        shilling = ((n1.get(0) * 240 + n1.get(1) * 12 + n1.get(2)) * n3) % 240 / 12;
        pence = (((n1.get(0) * 240 + n1.get(1) * 12 + n1.get(2)) * n3) % 240) % 12;
        //return pound,shilling,pence
        System.out.println(Integer.toString(pound) + "p" + Integer.toString(shilling) + "s" + Integer.toString(pence) + "d");

    }

    public void divMoney(ArrayList<Integer> n1, Integer n3) {
        pound = ((n1.get(0) * 240 + n1.get(1) * 12 + n1.get(2)) / n3) / 240;
        shilling = ((n1.get(0) * 240 + n1.get(1) * 12 + n1.get(2)) / n3) % 240 / 12;
        pence = (((n1.get(0) * 240 + n1.get(1) * 12 + n1.get(2)) / n3) % 240) % 12;
        //return pound,shilling,pence
        System.out.println(Integer.toString(pound) + "p" + Integer.toString(shilling) + "s" + Integer.toString(pence) + "d");

        pound = ((n1.get(0) * 240 + n1.get(1) * 12 + n1.get(2)) % n3) / 240;
        shilling = ((n1.get(0) * 240 + n1.get(1) * 12 + n1.get(2)) % n3) % 240 / 12;
        pence = (((n1.get(0) * 240 + n1.get(1) * 12 + n1.get(2)) % n3) % 240) % 12;
        //return pound,shilling,pence
        System.out.println(Integer.toString(pound) + "p" + Integer.toString(shilling) + "s" + Integer.toString(pence) + "d");
    }


}
