public class Veiculo{

    private int idVeiculo;
    private String modeloVeiculo;
    private String combustivel;
    private String marcaVeiculo;
    private int anoFabricacao;
    private String cor;
    
    // Construtores
    Veiculo(){}
    Veiculo(int id,String modelo,String comb,String marca,int ano,String c){
        idVeiculo = id;
        modeloVeiculo = modelo;
        combustivel = comb;
        marcaVeiculo = marca;
        anoFabricacao = ano;
        cor= c;

    }

    // Métodos de acesso - leitura
    public int getIDVeiculo(){
        return idVeiculo;
    }
    public String getModeloVeiculo(){
        return modeloVeiculo;
    }
    public String getCombustivel(){
        return combustivel;
    }
    public String getMarcaVeiculo(){
        return marcaVeiculo;
    }
    public int getAnoFabricacao(){
        return anoFabricacao;
    }
    public String getCor(){
        return cor;
    }
    // Métodos de acesso - escrita
    public void setIDVeiculo(int id){
        this.idVeiculo = id;
    }
    public void setCombustivel(String comb){
        this.combustivel=comb;
    }
    public void setMarcaVeiculo(String marca){
        this.modeloVeiculo=marca;
    }
    public void setModeloVeiculo(String modelo){
        this.modeloVeiculo=modelo;
    }
    public void setAnoFabricacao(int ano){
        this.anoFabricacao=ano;
    }
    public void setCor(String c){
        this.cor=c;
    }
    //Método para impressão
    public String retornaDados(){
        String texto = ("ID do Veículo: "+getIDVeiculo()+"\nModelo: "+getModeloVeiculo()+"\nMarca: "+getMarcaVeiculo()+"\nCombustivel: "+getCombustivel()+"\nAno de Fabricação: "+getAnoFabricacao()+"\nCor: "+getCor());
        return texto;
    }
    public String retornadadosMoto() {
        return null;
    }
    public String retornadadosCarro() {
        return null;
    }

   
        }
   


        
    






