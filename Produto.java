public class Produto {
    String Nome;
    double Preco;
    int Estoque;
    int Qnt;
    int Codigo;
    
    Produto (int Codigo, String Nome, double Preco, int Estoque, int Qnt) {
        this.Nome = Nome;
        this.Preco = Preco;
        this.Estoque = Estoque;
        this.Qnt = Qnt;
        this.Codigo = Codigo;
    }
    
    int comprarProduto(int x){
        x = x + Qnt;
        return x;
    }
    
    int alterarQnt(int n){
        if(n>0 && n<=Estoque){
            return n;
        }else{
            return 0;
        }
    }
    
    String imprimeDados () {
        return Codigo + ". " + "    Nome: " + Nome + "    Preco: " + Preco + " reais    Estoque: " + Estoque + "\n";
    }
    
    String carrinhoDados () {
        return "Codigo do Produto: "+ Codigo + "    Nome: " + Nome + "    Preco: " + Preco*Qnt + " reais    Quantidade: " + Qnt + "\n";
    }
}
