import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PrincipalProjeto {
    
    public static void main(String[] args) {
        
        Carros v1;
        Motos  m1;

        Scanner leia = new Scanner(System.in);
        ArrayList <Veiculo>lista= new ArrayList<Veiculo>();
        int id,ano,somaCarro,somaMoto;
        String marca,comb,modelo,c,cam,car,t,cc;
        char resp;
        int tipo,tipoComb,tipo2,tipoCambio,tipoCarroceria,tipoMoto,tipoConsulta;
        
        somaCarro=0; 
        somaMoto=0;   
            do{
                System.out.println("O que deseja fazer?\n1 - Adicionar Veiculo\n2 - Consultar Veiculos Cadastrados\n3 - Encerrar o Programa");
                tipo = leia.nextInt();
                if (tipo == 3){
                    System.out.println("Obrigado por utilizar!!!");
                }
                switch(tipo){
                    
                    case 1:
                    System.out.println("Qual o Tipo de Veiculo ?\n1 - Carro\n2 - Moto");
                    tipo2= leia.nextInt();
                        if(tipo2==1){
                            System.out.println("digite o ID: ");;
                            id=leia.nextInt();
                            leia.nextLine();
                            System.out.println("Modelo: ");
                            modelo =leia.nextLine();
                            System.out.println("Marca: ");
                            marca =leia.nextLine();
                            System.out.println("Combustivel:\n1 - Flex\n2 - Gasolina\n3 - Alcool");
                            tipoComb = leia.nextInt();
                            comb="";
                            if(tipoComb==1){
                                System.out.println(comb = "Flex");
                            }else if(tipoComb==2){
                                System.out.println(comb = "Gasolina");
                            }else if(tipoComb==3){
                                System.out.println(comb = "Alcool");
                            }
                            System.out.println("Ano: ");
                            ano = leia.nextInt();
                            leia.nextLine();
                            System.out.println("Cor: ");
                            c= leia.nextLine();
                            System.out.println("Cambio: \n1 - Automatico \n2 - Manual");
                            tipoCambio = leia.nextInt();
                            cam ="";
                            if(tipoCambio==1){
                                System.out.println(cam="Automático");
                            }else{
                                System.out.println(cam="Manual");
                            }
                            System.out.println("Carroceria: \n1 - Hatch \n2 - Sedan \n3 - Utilitário");
                            tipoCarroceria=leia.nextInt();
                            car ="";
                            if(tipoCarroceria==1){
                                System.out.println(car="Hatch");
                            }else if(tipoCarroceria==2){
                                System.out.println(car ="Sedan");
                            }else{
                                System.out.println(car = "Utilitário");
                            }
                             
                            v1= new Carros(id, ano, modelo, comb, marca, c, cam,car);
                            lista.add(v1);
                            JOptionPane.showMessageDialog(null, v1.retornadadosCarro());
                            
                            break;
                        }else if(tipo2==2){
                            System.out.println("digite o ID: ");;
                            id=leia.nextInt();
                            leia.nextLine();
                            System.out.println("Modelo: ");
                            modelo =leia.nextLine();
                            System.out.println("Marca: ");
                            marca =leia.nextLine();
                            System.out.println("Combustivel:\n1 - Flex\n2 - Gasolina\n3 - Alcool");
                            tipoComb = leia.nextInt();
                            comb="";
                            if(tipoComb==1){
                                System.out.print(comb = "Flex");
                            }else if(tipoComb==2){
                                System.out.print(comb = "Gasolina");
                            }else if(tipoComb==3){
                                System.out.print(comb = "Alcool");
                            }
                            leia.nextLine();
                            System.out.println("Ano: ");
                            ano = leia.nextInt();
                            leia.nextLine();
                            System.out.println("Cor: ");
                            c= leia.nextLine();
                            System.out.println("Tipo: \n1 - Estrada \n2 - Cidade\n3 - Speed");
                            tipoMoto=leia.nextInt();
                            t="";
                            if(tipoMoto==1){
                                System.out.println(t="Estrada");
                            }else if(tipoMoto==2){
                                System.out.println(t="Cidade");
                            }else{
                                System.out.println(t="Speed");
                            }
                            leia.nextLine();
                            System.out.println("Digite a Cilindrada: ");
                            cc=leia.nextLine();
                            m1 = new Motos(id, ano, modelo, comb, marca, c, cc, t);
                            lista.add(m1);
                            JOptionPane.showMessageDialog(null,m1.retornadadosMoto());

                            break; 
                        }   
                    case 2: 
                            System.out.println("1-Carro \n2 - Motos");     
                            tipoConsulta=leia.nextInt(); 
                            
                            if(tipoConsulta==1){
                                for(int l=0; l < lista.size(); l++){
                                    somaCarro++;
                                    System.out.println("\n)");
                                    System.out.println(lista.get(l).retornadadosCarro());
                                    System.out.println("\n)");
                                    }System.out.println("Carros em estoque: "+somaCarro);
                                    break;

                            }else if(tipoConsulta==2){
                                for (int l=0; l<lista.size();l++){
                                    somaMoto++;
                                    System.out.println("\n)");
                                    System.out.println(lista.get(l).retornadadosMoto());
                                    System.out.println("\n)");
                                    }System.out.println("Motos: "+somaMoto);
                                    break;
                                }break;
                        
                      }  System.out.println("Deseja adicionar novo objeto?(S/N)");
                        resp= leia.next().charAt(0);

          }while  (resp=='s' || resp =='S');
            if (resp=='n' || resp =='N'){
                System.out.println("Obrigado por Usar o Sistema ");
            }
              
    }  
}   
