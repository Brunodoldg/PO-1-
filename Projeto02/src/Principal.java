public class Principal {

    public static void main (String [] args) {
    Aluno aluno1 = new Aluno();

    aluno1.setNome("Bruno");
    aluno1.setMatricula("04066065");
    aluno1.setAltura("1.82");
    aluno1.setIdade(25);

    System.out.println("Nome: " + aluno1.getNome());
    System.out.println("Matricula: " + aluno1.getMatricula());
    System.out.println("Altura: " + aluno1.getAltura());
    System.out.println("Idade: " + aluno1.getIdade());

    }
}
