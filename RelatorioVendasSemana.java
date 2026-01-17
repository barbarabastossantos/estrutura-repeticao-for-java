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
public class RelatorioVendasSemana {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
       
       double totalVendidoSemana=0;

      
       
        // Primeira etapa: a coleta dos dados
        for(int i=1;i<=7;i++){
            System.out.println("Qual valor vendeu no dia "+i+" da semana -> ");
             double valorVendaDia=sc.nextDouble();
            
            totalVendidoSemana+=valorVendaDia;
            
            }
               
       double mediaDiaria=totalVendidoSemana/7; // Segunda etapa: o calculo da media 
       
       
       
       
             // Por fim a impressao  do resultado da analise dos dados feita pelo programa
        System.out.println( " RELATORIO DE VENDAS DA SEMANA \n"); 
        System.out.println(" Total de vendas da semana -> R$ "+totalVendidoSemana);
        System.out.println(" Media de vendas diaria -> R$ "+ mediaDiaria);
        System.out.println("  \n RELATORIO FINALIZADO");
        sc.close();
    }
}
