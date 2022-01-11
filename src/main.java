import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args){
        System.out.println("Завдання №1:");
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));

        for (int i=0; i<listOfIntegers.size(); i++)
        {
            if (listOfIntegers.get(i)%3==0)
            {
                listOfIntegers.remove(i);
                i--;
            }
        }
        System.out.println("Результат після видалення всіх чисел кратних трьом:"+listOfIntegers);
    }

}
