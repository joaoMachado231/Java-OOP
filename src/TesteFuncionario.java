public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario nico = new Funcionario();

        nico.setName("Nico Steppat");
        nico.setCpf("11111111111");
        nico.setSalario(2600.00);

        System.out.println(nico.getName());
        System.out.println(nico.getBonus());
    }

}
