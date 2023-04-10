package hash;

// Este código foi criado para averiguar o funcionamento da implementação, foi coisa minha mesmo

public class Main {

    public static void main(String[] args) {
        EstruturaHashTable tabela = new EstruturaHashTable();

        // Insert
        System.out.println(tabela.insert(22));
        System.out.println(tabela.insert(22));
        System.out.println(tabela.insert(9));
        System.out.println(tabela.insert(0));  
        System.out.println(tabela.insert(500));

        System.out.println("-------------");

        // Search
        
        System.out.println(tabela.search(0));
        System.out.println(tabela.search(6));
        System.out.println(tabela.search(9));
        System.out.println(tabela.search(22)); 
        System.out.println(tabela.search(100));

        System.out.println("-------------");

        // Delete + Search (deletando e verificando se ainda está lá)
        System.out.println(tabela.delete(22)); 
        System.out.println(tabela.search(22));
        System.out.println(tabela.delete(9));
        System.out.println(tabela.delete(9));
        System.out.println(tabela.search(9));
        System.out.println(tabela.delete(500)); 
        System.out.println(tabela.search(500)); 
    }
    
}
