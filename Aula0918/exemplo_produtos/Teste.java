import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Produto p1 = new Produto("produto1", 1.99);
        System.out.println(p1);
        ProdutoPerecivel p2 = new ProdutoPerecivel("produto2", 2.5, LocalDate.of(2018,9,20));
        System.out.println(p2);

        System.out.println(p1 instanceof Object);
        System.out.println(p1 instanceof Produto);
        System.out.println(p1 instanceof ProdutoPerecivel);
        System.out.println(p2 instanceof  Object);
        System.out.println(p2 instanceof  Produto);
        System.out.println(p2 instanceof  ProdutoPerecivel);

        //-=-=-=-=-=-=-=-=-=-

        p1 = p2;
        Object obj;
        System.out.println(p1);
        obj = new Produto("Produto qualquer", 1.99);

        p2 = (ProdutoPerecivel) p1;
        System.out.println(p2);

        p1 = (Produto) obj;
        System.out.println(p1);

        //p2 = (ProdutoPerecivel) p1;
        //System.out.println(p2);

        //-=-=-=-=-=-=-=-=-
        p2 = new ProdutoPerecivel("Um produto perecívle", 4.57, LocalDate.of(2023,9,18));
        System.out.println(p2.getDataValidade());
        p1=p2;

        System.out.println(( (ProdutoPerecivel) p1 ).getDataValidade());

        System.out.println(p1 instanceof Object);
        System.out.println(p1 instanceof Produto);
        System.out.println(p1 instanceof ProdutoPerecivel);

        System.out.println((ProdutoPerecivel) p1);
        System.out.println((Produto) p1);

    }
}
