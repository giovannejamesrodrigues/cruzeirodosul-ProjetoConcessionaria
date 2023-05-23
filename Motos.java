public class Motos extends Veiculo{

        private String cilindradas;
        private String tipo;

        Motos(int id,int ano,String modelo,String comb,String marca,String c,String cc,String t){
            super(id, modelo, comb, marca, ano, c);
            cilindradas=cc;
            tipo=t;
        }
        public String getCilindradas(){
            return cilindradas;
        }
        public String getTipo(){
            return tipo;
        }
        public void setCilindradas(String cc){
            this.cilindradas=cc;
        }
        public void setTipo(String t){
            this.tipo=t;
        }

        public String retornadadosMoto(){
            String texto = ("ID do Veículo: "+this.getIDVeiculo()+"\nModelo: "+this.getModeloVeiculo()+"\nMarca: "+this.getMarcaVeiculo()+"\nCombustivel: "+this.getCombustivel()+"\nAno de Fabricação: "+this.getAnoFabricacao()+"\nCor: "+this.getCor()+"\nTipo de moto: "+this.tipo+"\nCilindradas: "+this.cilindradas+" cc");
            return texto;

        }


}
