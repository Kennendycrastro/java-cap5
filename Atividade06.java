 
 //Uma loja utiliza o código V para transação à vista e P para transação a prazo. 
 //Faça um programa que receba
 //o código e o valor de quinze transações, calcule e mostre:
 //■■ o valor total das compras à vista;
 //■■ o valor total das compras a prazo;
 //■■ o valor total das compras efetuadas; e
 //■■ o valor da primeira prestação das compras a prazo juntas, sabendo-se que 
    //serão pagas em três vezes.

import java.util.Scanner;

public class Atividade06 {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //String codigo;
        double totalAVista = 0, totalAPrazo = 0, valorCompra, total;
        char codigo;
      
        for (int i = 0; i < 15; i++) {
            System.out.print("Informe código: "); 
            codigo = entrada.next().charAt(0);
            //codigo = entrada.next().toUpperCase();
    
            System.out.print("Informe valor compra: ");
            valorCompra = entrada.nextDouble();

            if (codigo == 'V' || codigo == 'v') {
                //codigo.equals("V")
                totalAVista = totalAVista + valorCompra;
                //totalAVista += valorCompra
            } else if (codigo == 'P' || codigo == 'p') {
                //codigo.equals("P")
                totalAPrazo = totalAPrazo + valorCompra;
                //totalAPrazo += valorCompra
            } else {
                System.out.println("Código inválido!");
            }

        }
        total = totalAPrazo + totalAVista;

        System.out.println(
            "o valor total das compras à vista: " + totalAVista);
        System.out.println(
            "o valor total das compras a prazo: " + totalAPrazo);
        System.out.println(
            "o valor total das compras efetuadas: " + total);
        System.out.println(
            "o valor total das compras efetuadas: " + totalAPrazo / 3);

        entrada.close();
    }
}