package hash;
public class EstruturaHashTable implements EstruturaDeDados{

    private Integer tabela[];

    public EstruturaHashTable() {
        tabela = new Integer[1000];
    }

    @Override
    public boolean insert(int chave) {

        int indice = chave % 1000;

        if (tabela[indice]!=null){
            return false;
        }
        else{
            tabela[indice] = chave;
            return true;
        }
        
    }

    @Override
    public boolean delete(int chave) {

        int indice = chave % 1000;

        if (tabela[indice] == null){
            return false;
        }

        if (tabela[indice] == chave && tabela[indice] != null){
            tabela [indice] = null;
            return true;
        }
        else{
            return false;
        }
        
    }

    @Override
    public boolean search(int chave) {
        
        int indice = chave % 1000;

        if (tabela[indice] != null && tabela[indice] == chave) {
            return true;
        } else {
            return false;
        }

    }

}
