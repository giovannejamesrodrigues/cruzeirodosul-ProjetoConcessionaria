public class Carros extends Veiculo {
    private String cambio;
    private String carroceria;

       Carros(int id,int ano,String modelo,String comb,String marca,String c,String cam,String car){
           super(id, modelo, comb, marca, ano, c);
            cambio = cam;
            carroceria = car;
        }

        public String getCambio(){
            return cambio;
        }

        public String getCarroceria(){
            return carroceria;
        }

        public void setCambio(String cam){
            this.cambio = cam;
        }
        public void setCarroceria(String car){
            this.carroceria=car;
        }

        public String retornadadosCarro(){
            String texto = ("ID do Veículo: "+this.getIDVeiculo()+"\nModelo: "+this.getModeloVeiculo()+"\nMarca: "+this.getMarcaVeiculo()+"\nCombustivel: "+this.getCombustivel()+"\nAno de Fabricação: "+this.getAnoFabricacao()+"\nCor: "+this.getCor()+"\nCarroceria: "+this.carroceria+"\nTipo de Câmbio: "+this.cambio);
            return texto;

        }
    }        
