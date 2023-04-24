import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> employees = new ArrayList<>();

        employees.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        employees.add(new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        employees.add(new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
        employees.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        employees.add(new Funcionario("Alice", LocalDate.of(1995, 1, 05), new BigDecimal("2234.68"), "Recepcionista"));
        employees.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        employees.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
        employees.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        employees.add(new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        employees.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

        removeEmployee(employees, "João");
        printEmployees(employees);
    }

    public static List<Funcionario> removeEmployee(List<Funcionario> list, String name) {
        list.removeIf(employee -> employee.getNome().equals(name));
        return list;
    }

    public static void printEmployees(List<Funcionario> list) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        DecimalFormat decimalFormat = new DecimalFormat("#, ##0.000");

        for(Funcionario employee: list) {
            System.out.println("Nome:" + employee.getNome());
            System.out.println("Data Nascimento:" + employee.getDataNascimento().format(formatter));
            System.out.println("Salário:" + decimalFormat.format(employee.getSalario()));
            System.out.println("Função:" + employee.getFuncao());
        }
    }    
}
