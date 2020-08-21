// ------------------------------------------------------------------------------
// Herança / Abstração e Polimorfismo em Java
//
// -------- TAREFAS ---------
// 1) Instalar Programa Dockerstation para rodar uma aplicação SPARK para o treinamento
// https://dockstation.io/
//
// 2) Instalar Programa Dbeaver para criar bancos de dados para o treinamento
// https://dbeaver.io/
//
// Treinamento em Java - OOP
// Academia de Algoritmos https://github.com/AcademiaDeAlgoritmos/grupo-de-estudos
// github: Mila Zangirolame
//
// -------------------------------------------------------------------------------

//--------------------
// Encapsulamento
// -------------------
// Gera-se os atributos privados (private)
// cria-se os métodos setters para as variáveis receberem novos valores
// ex: para a variável nome o setter setNome() e o getter é getNome().
// get() e set() compõem a linguagem java no nível da seus objetos (classes padrão como String, double..)

public class Funcionario {
  public static void main(String[] args){

    private double salario;
    private String nome;

    // metodo getter retorna o que estiver dentro da variável privada nome da classe funcionário
    public String getNome() {
        return nome;
    }

    // metodo setter para variável privada 'nome' da classe Funcionário (que é uma string)

    public void setNome(String nome) {
        this.nome = nome;
    }


    // metodo setter para salário
    public void setSalario(double salario) {
        this.salario = salario;
    }


    // metodo getter para salário

    public double getSalario() {
        return salario;
    }
}
