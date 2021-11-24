public class TestaFuncionario {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        funcionario.setCargo("Caixa");
        funcionario.setSalario(2000);

        System.out.println(funcionario.getCargo());
        System.out.println(funcionario.getSalario());
    }
}
