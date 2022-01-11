import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args){
        System.out.println("Завдання №1:");
        List<Integer> list1zavd = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));

        for (int i=0; i<list1zavd.size(); i++)
        {
            if (list1zavd.get(i)%3==0)
            {
                list1zavd.remove(i);
                i--;
            }
        }
        System.out.println("Результат після видалення всіх чисел кратних трьом:"+list1zavd);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("\nЗавдання №2:");

        ArrayList<String> listOfFruits = new ArrayList<>(Arrays.asList("Apple", "Orange", "Strawberry", "Kiwi", "Avokado"));

        if (listOfFruits.contains("Orange")) {
            for (String fructs : listOfFruits) {
                if (fructs.equals("Orange")) {
                    listOfFruits.set(listOfFruits.indexOf(fructs), "Grape");
                }
            }
            System.out.println(listOfFruits.toString());
        }
        else {
            System.out.println("Orange value not present");
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\nЗавдання №3:");
        List<Integer> list3zavd1 = new ArrayList<>(Arrays.asList(2, 9, 11, 18, 20, 22));
        List<Integer> list3zavd2 = new ArrayList<>(Arrays.asList(2, 23, 12, 34, 13, 38));

        System.out.println(list3zavd1);
        System.out.println(list3zavd2);

        int a=0;
        for (int i:list3zavd1)
        {
            for (int j:list3zavd2)
            {
                if (i==j)
                {
                    a++;
                }
            }
        }
        if(a!=0)
        {
            System.out.println("Спільний елемент:"+a);
        } else{
            System.out.println("Немає спільних елементів");
        }
    }