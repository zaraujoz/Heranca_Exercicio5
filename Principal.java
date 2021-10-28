public class Principal {
    

    public static void main(String args[]){
    
    Novo novo=new Novo();
    Velho velho=new Velho();
    
    novo.setEndereco("Rua José Pereira Mendes");
    novo.setPreco(250000);
    novo.setAdicionalPreco(0.2*novo.getPreco());
    System.out.println(novo.getPreco()+novo.getAdiconalPreco());
    
    System.out.println("Imóvel usado");

    velho.setEndereco("Rua Douglas Pinheiro");
    velho.setPreco(230000);
    velho.setDescontoPreco(0.1*velho.getPreco());
    System.out.println("Preço imóvel velho:"+(velho.getPreco()-velho.getDescontoPreco()));    
    }
}