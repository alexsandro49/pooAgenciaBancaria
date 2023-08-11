public class App {
    public static void main(String[] args) throws Exception {
        AgenciaBancaria ag1 = new AgenciaBancaria();
        AgenciaBancaria ag2 = new AgenciaBancaria();

        ContaBancaria c1 = new ContaBancaria("Marcos", ag1);
        ag1.adicionarConta(c1);
        ContaBancaria c2 = new ContaBancaria("Cátia", ag2);
        ag2.adicionarConta(c2);
        ContaBancaria c3 = new ContaBancaria("Paulo", ag2, 400);
        ag2.adicionarConta(c3);

        c1.deposito(100);
        c2.deposito(90);
        c2.saque(20);
        c3.saque(15);
        
        System.out.printf("\n===================\nID DA AGÊNCIA: %s\n", ag1.getId().toString());
        ag1.getContas().forEach(x -> {
            System.out.println("===================");
            System.out.println("ID: " + x.getId().toString());
            System.out.println("Titular: " + x.getTitular());
            System.out.printf("Saldo: R$%.2f%n", x.getSaldo());
            System.out.println("Agência: " + x.getAgencia());
        });

        System.out.printf("\n===================\nID DA AGÊNCIA: %s\n", ag2.getId().toString());
        ag2.getContas().forEach(x -> {
            System.out.println("===================");
            System.out.println("ID: " + x.getId().toString());
            System.out.println("Titular: " + x.getTitular());
            System.out.printf("Saldo: R$%.2f%n", x.getSaldo());
            System.out.println("Agência: " + x.getAgencia());
        });

        System.out.println("===================");
    }
}
