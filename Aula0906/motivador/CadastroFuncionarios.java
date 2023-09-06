import java.util.ArrayList;

public class CadastroFuncionarios{
    private ArrayList<Funcionario> funcionarios;

    private void carregaFuncionarios(){
        funcionarios.add(new Funcionario("A3212","Huguinho Pato",1890.0));
        funcionarios.add(new Funcionario("A3312","Zezinho Pato",3720.0));
        funcionarios.add(new Funcionario("A3412","Luizinho Pato",8940.0));
        funcionarios.add(new Funcionario("B9931","Lala Pata",4220.0));
        funcionarios.add(new Funcionario("B9932","Lele Pata",1283.0));
        funcionarios.add(new Funcionario("B9933","Lili Pata",12438.0));

        funcionarios.add(new Funcionario("B9943","John Doe",  2438.0, "risco"));
        funcionarios.add(new Funcionario("B9944","Mary Doe",  2381.0, "RiScO"));
        funcionarios.add(new Funcionario("B9945","Tiradentes",24138.0, "Arrisco"));
        funcionarios.add(new Funcionario("B9946","Sacadentes",21438.0, "Risc0"));
        funcionarios.add(new Funcionario("B9947","Arrancadentes",1438.0, " risco "));

        funcionarios.add(new Funcionario("B9840","Newton",5000.0, 1));
        funcionarios.add(new Funcionario("B9841","Angelo",5000.0, 2));
        funcionarios.add(new Funcionario("B9842","Jose",  5000.0, 3));
    }

    public CadastroFuncionarios(){
        funcionarios = new ArrayList<>();
        carregaFuncionarios();
    }

    public void cadastraFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public Funcionario recuperaPorMatricula(String matricula){
        for(Funcionario func:funcionarios){
            if (func.getMatricula().equals(matricula)){
                return func;
            }
        }
        return null;
    }
}