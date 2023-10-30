import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solucao {

    public static void main(String[] args) {
        List <String> list = Arrays.asList("alpha", "bravo", "charlie", "delta","echo", "foxtrot");

        //item a
        System.out.println("Item A");
        //Grupo 4.1
        //list.stream().forEach(System.out::println);
        //Grupo 3.1
        list.forEach(System.out::println);
        

        //item b        
        System.out.println("\nItem B");
        //Grupo 3.1
        String result = list.stream().map(s -> String.valueOf(s.charAt(0))).reduce("", String::concat);
        System.out.println(result);

        //item c
        System.out.println("\nItem C");
        // grupo 3.1
        //list.replaceAll(String::toUpperCase);
        //System.out.println(list);
        // grupo 1.1
        //list.stream().map(s -> s.toUpperCase()).forEach(System.out :: println);
        //grupo 4.1
        list.stream().map(s -> String.valueOf(s.toUpperCase())).forEach(System.out::println);

        //item d
        System.out.println("\nItem D");
        //grupo 3.1
        List<String> novaMaiuscula  = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(novaMaiuscula);
        //grupo 4.1 
        List<String>list3= list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list3);

        //item e
        System.out.println("\nItem E");
        //grupo 1.1
        long count = list.stream().filter(s -> s.length() >= 6).count();
        System.out.println(count);        
        //grupo 4.1
        long a = list.stream().filter(s -> s.length() >= 6).count();
        System.out.println(a);

    }
    
}