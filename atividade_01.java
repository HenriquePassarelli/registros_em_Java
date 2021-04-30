
import java.util.*;
import java.io.*;

class Worker {
    public String name; // campo chave
    public String depart;
    public double age;
    public String gender;
    public double time;
    public double salary;
}

class Record {

    private Worker[] v;
    private Worker[] copy;
    private int n;

    public Record(int size) {
        copy = new Worker[size];
        v = new Worker[size];
        n = 0;
    }

    public void insert(String name, String depart, String gender, Double time, double age, Double salary) {
        v[n] = new Worker();
        v[n].name = name;
        v[n].age = age;
        v[n].depart = depart;
        v[n].gender = gender;
        v[n].time = time;
        v[n].salary = salary;
        n++;
    }

    public void seek(String key) {
        for (int i = 0; i < n; i++) {
            if (v[i].name.equalsIgnoreCase(key)) {

                System.out.println("Nome: " + v[i].name);
                System.out.println("Departamento: " + v[i].depart);
                System.out.println("Idade: " + (int) v[i].age);
                System.out.println("Genero: " + v[i].gender);
                System.out.println("Tempo: " + (int) v[i].time);
                System.out.println("Sálario: " + v[i].salary);
                System.out.println("\n****************");
                return;
            }
        }
    }

    public void seekDepart(String key) {
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key)) {
                x = x + 1;
            }
        }
        System.out.println(x + " - funcionarios");
        System.out.println("\n****************");
        return;
    }

    public void seekFemale() {
        int x = 0;
        String key = "feminino";
        for (int i = 0; i < n; i++) {
            if (v[i].gender.equalsIgnoreCase(key)) {
                x = x + 1;
            }
        }
        System.out.println(x + " - Mulheres");
        System.out.println("\n****************");
        return;
    }

    public void ordernation() {

        for (int z = 0; z < n; z++) {

            copy[z] = v[z];
        }

        int i, j, min;
        Worker troca;
        for (i = 0; i < n - 1; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (copy[j].time < copy[min].time) {
                    min = j;
                }
            }
            troca = copy[i];
            copy[i] = copy[min];
            copy[min] = troca;
        }

        for (int y = 0; y < n; y++) {
            if (copy[0].time == v[y].time) {

                System.out.println("\nMenor tempo :");
                System.out.println("Nome: " + v[y].name);
                System.out.println("Departamento: " + v[y].depart);
                System.out.println("Idade: " + (int) v[y].age);
                System.out.println("Genero: " + v[y].gender);
                System.out.println("Tempo: " + (int) v[y].time);
                System.out.println("Sálario: " + v[y].salary);
                System.out.println("\n****************");
            }
        }

        for (int y = 0; y < n; y++) {
            if (copy[n - 1].time == v[y].time) {

                System.out.println("\nMaior tempo :");
                System.out.println("Nome: " + v[y].name);
                System.out.println("Departamento: " + v[y].depart);
                System.out.println("Idade: " + (int) v[y].age);
                System.out.println("Genero: " + v[y].gender);
                System.out.println("Tempo: " + (int) v[y].time);
                System.out.println("Sálario: " + v[y].salary);
                System.out.println("\n****************");
            }
        }

    }

    public void averageSalary() {
        int x = 0, x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, x6 = 0, x7 = 0;
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0;
        String key = "ti";
        String key1 = "rh";
        String key2 = "logistica";
        String key3 = "Producao";
        String key4 = "suporte";
        String key5 = "admistrativo";
        String key6 = "financeiro";
        String key7 = "comercial";

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key)) {
                x = (int) v[i].salary + x;
                cont1++;
            }
        }
        if (cont1 != 0) {
            System.out.println("A media dos slários de Ti: " + x / (cont1));
            System.out.println("\n****************");
        }

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key1)) {
                x1 = (int) v[i].salary + x1;
                cont2++;
            }
        }
        if (cont2 != 0) {
            System.out.println("A media dos slários de Rh: " + x1 / (cont2));
            System.out.println("\n****************");
        }

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key2)) {
                x2 = (int) v[i].salary + x2;
                cont3++;
            }
        }
        if (cont3 != 0) {
            System.out.println("A media dos slários de logistica: " + x2 / (cont3));
            System.out.println("\n****************");
        }

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key3)) {
                x3 = (int) v[i].salary + x3;
                cont4++;
            }
        }
        if (cont4 != 0) {
            System.out.println("A media dos slários de Producao: " + x3 / (cont4));
            System.out.println("\n****************");
        }

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key4)) {
                x4 = (int) v[i].salary + x4;
                cont5++;
            }
        }
        if (cont5 != 0) {
            System.out.println("A media dos slários de Suporte: " + x4 / (cont5));
            System.out.println("\n****************");
        }

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key5)) {
                x5 = (int) v[i].salary + x5;
                cont6++;
            }
        }
        if (cont6 != 0) {
            System.out.println("A media dos slários de Admistrativo: " + x5 / (cont6));
            System.out.println("\n****************");
        }

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key6)) {
                x6 = (int) v[i].salary + x6;
                cont7++;
            }
        }
        if (cont7 != 0) {
            System.out.println("A media dos slários de Financeiro: " + x6 / (cont7));
            System.out.println("\n****************");
        }

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key7)) {
                x7 = (int) v[i].salary + x7;
                cont8++;
            }
        }
        if (cont8 != 0) {
            System.out.println("A media dos slários de Comercial: " + x7 / (cont8));
            System.out.println("\n****************");
        }
        return;
    }

    public void averageAage() {
        int x = 0, x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, x6 = 0, x7 = 0;
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0;
        String key = "ti";
        String key1 = "rh";
        String key2 = "logistica";
        String key3 = "Producao";
        String key4 = "suporte";
        String key5 = "admistrativo";
        String key6 = "financeiro";
        String key7 = "comercial";

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key)) {
                x = (int) v[i].age + x;
                cont1++;
            }
        }
        if (cont1 != 0) {
            System.out.println("A media das Idades de Ti: " + x / (cont1));
            System.out.println("\n****************");
        }

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key1)) {
                x1 = (int) v[i].age + x1;
                cont2++;
            }
        }
        if (cont2 != 0) {
            System.out.println("A media das Idades de Rh: " + x1 / (cont2));
            System.out.println("\n****************");
        }

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key2)) {
                x2 = (int) v[i].age + x2;
                cont3++;
            }
        }
        if (cont3 != 0) {
            System.out.println("A media das Idades de logistica: " + x2 / (cont3));
            System.out.println("\n****************");
        }

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key3)) {
                x3 = (int) v[i].age + x3;
                cont4++;
            }
        }
        if (cont4 != 0) {
            System.out.println("A media das Idades de Producao: " + x3 / (cont4));
            System.out.println("\n****************");
        }

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key4)) {
                x4 = (int) v[i].age + x4;
                cont5++;
            }
        }
        if (cont5 != 0) {
            System.out.println("A media das Idades de Suporte: " + x4 / (cont5));
            System.out.println("\n****************");
        }

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key5)) {
                x5 = (int) v[i].age + x5;
                cont6++;
            }
        }
        if (cont6 != 0) {
            System.out.println("A media das Idades de Admistrativo: " + x5 / (cont6));
            System.out.println("\n****************");
        }

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key6)) {
                x6 = (int) v[i].age + x6;
                cont7++;
            }
        }
        if (cont7 != 0) {
            System.out.println("A media das Idades de Financeiro: " + x6 / (cont7));
            System.out.println("\n****************");
        }

        for (int i = 0; i < n; i++) {
            if (v[i].depart.equalsIgnoreCase(key7)) {
                x7 = (int) v[i].age + x7;
                cont8++;
            }
        }
        if (cont8 != 0) {
            System.out.println("A media das Idades de Comercial: " + x7 / (cont8));
            System.out.println("\n****************");
        }
        return;
    }

    public void ageSeek() {
        int f = 0;

        for (int i = 0; i < n; i++) {

            if (v[i].age >= 29 && v[i].age <= 35) {
                f++;
            }

        }
        System.out.println(
                "O numero de funcionários do sexo masculino e feminino, com idade entre 29 e 35 anos é : " + f);
        return;
    }
}

public class atividade_01 {
    public static void main(String[] args) throws IOException {
        Scanner le = new Scanner(System.in);
        Record v = new Record(4);
        String name, depart, gender;
        double salary, time, age;
        System.out.println("Departamentos: Ti, RH, Logistica, Producao, Suporte, Admistrativo, Financeiro, Comercial");
        System.out.println("Genero: Masculino, Feminino");
        System.out.println("Forneca os dados dos funcionários: ");
        for (int j = 0; j < 4; j++) {
            System.out.println("\nNovo funcionario - ");
            System.out.print("\nNome: ");
            name = readStr();
            System.out.print("\nDepartamento: ");
            depart = readStr();
            System.out.print("\nTempo de Empresa em meses: ");
            time = le.nextDouble();
            System.out.print("\nIdade: ");
            age = le.nextDouble();
            System.out.print("\nGenero: ");
            gender = readStr();
            System.out.print("\nSalário: ");
            salary = le.nextDouble();
            v.insert(name, depart, gender, time, age, salary);
        }

        System.out.print("\nForneca o nome do funcionario para pesquisa: ");
        name = readStr();
        v.seek(name);
        System.out.print("Forneca o nome do departamento para pesquisa: ");
        depart = readStr();
        v.seekDepart(depart);

        v.seekFemale();
        v.ordernation();

        v.averageSalary();
        v.averageAage();
        v.ageSeek();

    }

    public static String readStr() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
