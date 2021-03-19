public class Principal {

    public static void main (String [] args) {
    Aluno aluno1 = new Aluno();
    Professor professor1 = new Professor();

    aluno1.setNome("Bruno");
    aluno1.setMatricula("04066065");
    aluno1.setAltura("1.82");
    aluno1.setIdade(25);

    System.out.println("Nome: " + aluno1.getNome());
    System.out.println("Matricula: " + aluno1.getMatricula());
    System.out.println("Altura: " + aluno1.getAltura());
    System.out.println("Idade: " + aluno1.getIdade());

    professor1.setSalario(1000.00);

    System.out.println("O salario é: " + professor1.getSalario());

    }
}
