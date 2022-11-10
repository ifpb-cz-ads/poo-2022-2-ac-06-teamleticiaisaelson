import java.util.Scanner;

class CTAtividade03 {  

 public static void main(String args[]) {

   Scanner sc = new Scanner(System.in);

   float nota;

   float soma = 0;

   for(int i = 1; i <= 10; i++){

     System.out.printf("Insira a %dº nora: ", i);

     nota = sc.nextFloat();

     soma+=nota;
   }
//pra saber se o aluno está acima da média ou abaixo da média
   float media = soma/10;

   if(media <= 7){
     System.out.println("Abaixo da media");
   }else{
     System.out.println("Acima da media");
   }
 }
}