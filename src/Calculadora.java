import java.util.Scanner;

public class Calculadora {

    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;
    private float pesoNota1;
    private float pesoNota2;
    private float pesoNota3;
    private float mediaFinal;
    private String resultado;


    public void entradaDeDados(){
        Scanner leitorFloat = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);

        System.out.print("Insira o Nome do Aluno: ");
        nome = leitorString.nextLine();

        System.out.print("Insira a primeira nota do Aluno: ");
        nota1 = leitorFloat.nextFloat();

        System.out.print("Insira o peso da primeira nota do Aluno: ");
        pesoNota1 = leitorFloat.nextFloat();

        System.out.print("Insira a segunda nota do Aluno: ");
        nota2 = leitorFloat.nextFloat();

        System.out.print("Insira o peso da segunda nota do Aluno: ");
        pesoNota2 = leitorFloat.nextFloat();

        System.out.print("Insira a terceira nota do Aluno: ");
        nota3 = leitorFloat.nextFloat();

        System.out.print("Insira o peso da terceira nota do Aluno: ");
        pesoNota3 = leitorFloat.nextFloat();

        calcularDados();

        exibirDados();
    }


    private void calcularDados(){
        mediaFinal = (nota1 * pesoNota1 + nota2 * pesoNota2 + nota3 * pesoNota3) / (pesoNota1 + pesoNota2 + pesoNota3);

        if (mediaFinal >= 7){
            resultado = "APROVADO";
        } else if (mediaFinal >=5 && mediaFinal < 7){
            resultado = "RECUPERAÇÃO";
        } else{
            resultado = "REPROVADO";
        }


    }


    private void exibirDados(){
        System.out.println("*****************************");
        System.out.println("NOME DO ALUNO: " + nome);
        System.out.printf("MÉDIA DO ALUNO: %.2f\n", mediaFinal);
        System.out.println("SITUAÇÃO DO ALUNO: " + resultado);
        System.out.println("*****************************");
    }

}