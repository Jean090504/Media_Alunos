import java.util.Scanner;

public class Calculadora {

    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;
    private float peso1;
    private float peso2;
    private float peso3;
    private float media;
    private String resultado;


    public void entradaDeDados(){
        Scanner leitorFloat = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);

        System.out.print("Insira o Nome do Aluno: ");
        nome = leitorString.nextLine();

        System.out.print("Insira a primeira nota do Aluno: ");
        nota1 = leitorFloat.nextFloat();

        System.out.print("Insira o peso da primeira nota do Aluno: ");
        peso1 = leitorFloat.nextFloat();

        System.out.print("Insira a segunda nota do Aluno: ");
        nota2 = leitorFloat.nextFloat();

        System.out.print("Insira o peso da segunda nota do Aluno: ");
        peso2 = leitorFloat.nextFloat();

        System.out.print("Insira a terceira nota do Aluno: ");
        nota3 = leitorFloat.nextFloat();

        System.out.print("Insira o peso da terceira nota do Aluno: ");
        peso3 = leitorFloat.nextFloat();

        calcularDados();

        exibirDados();
    }


    private void calcularDados(){
        media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        if (media >= 7){
            resultado = "APROVADO";
        } else if (media >=5 && media < 7){
            resultado = "RECUPERAÇÃO";
        } else{
            resultado = "REPROVADO";
        }


    }


    private void exibirDados(){
        System.out.println("*****************************");
        System.out.println("NOME DO ALUNO: " + nome);
        System.out.printf("MÉDIA DO ALUNO: %.2f\n", media);
        System.out.println("SITUAÇÃO DO ALUNO: " + resultado);
        System.out.println("*****************************");
    }

}