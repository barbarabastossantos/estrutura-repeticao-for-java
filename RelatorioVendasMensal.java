/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacorepeticaofor;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class RelatorioVendasMensal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        double gastosMensais=0;
        System.out.println(" Controle pessaol de gastos mensais\n");
        
        //Primeira etapa: coleta de dados
        
        for(int i=0;i<4;i++){
            System.out.println(" Digite o valor dos gastos da semana "+(i+1));
            double gastosSemana=sc.nextDouble();
            
            gastosMensais+=gastosSemana;
               
        }
        
        // Segunda etapa: processando os dados(calculo)
        
          double media=gastosMensais/4;  
            
          
        // Etapa final a decisao: o usuario esta dentro do orçarmento ou não.
        
        if(media>500){
            System.out.println(" O gasto medio da semana foi acima do esperado de R$ 500.00 para R$ "+media);
            
        }else{
            System.out.println("O gasto medio semanal esta dentro do orcamento esperado R$ "+media);
        }
        
        
        
        sc.close();
    }
}
