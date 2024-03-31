public class TesteEstudante {
    public static void main(String[] args) {
        Estudante e = new Estudante(2004001, "Maria Silva", 'F');

        e.setNotas(new double[]{7.0, 8.2, 6.0, 5.5});

        System.out.println("Dados do Estudante:");
        System.out.println("Matrícula: " + e.getMatricula());
        System.out.println("Nome: " + e.getNome());
        System.out.println("Sexo: " + e.getSexo());

        System.out.println("\nNotas do Estudante:");
        double[] notas = e.getNotas();
        for (int i = 0; i < notas.length; i++) {
            System.out.print("nota " + (i + 1) + ": " + notas[i] + "\n");
        }
    }
}
