import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static  BanhoMaquina PetMaquina = new BanhoMaquina();
    
    public static void main(String[] args) {
        var option = "10";

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verifica água da máquina");
            System.out.println("5 - Verifica shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - exit");
            option = scanner.next();

            switch (option) {
                case "1" -> PetMaquina.takeashower();
                case "2" -> PetMaquina.addwater();
                case "3" -> PetMaquina.addshampoo();
                case "4" -> System.out.println("Água atual: " + PetMaquina.getWater() + "L");
                case "5" -> System.out.println("Shampoo atual: " + PetMaquina.getShampoo() + "L");
                case "6" -> cheackIfhasPetInmachine();

                case "7" -> setPetInPetMachine();
                case "8" -> PetMaquina.removePet();
                case "9" -> PetMaquina.wash();
                case "0" -> System.out.println("Saindo do sistema... Até mais!");
                default -> System.out.println("❌ Opção inválida! Tente novamente.");
            }

        } while (!option.equals("0"));


    }

    private static void cheackIfhasPetInmachine() {
        var haspet = PetMaquina.haspet();
        System.out.println(haspet ? "tem pet maquina": "não tem pet na maquina");
    }

    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet");
            name = scanner.next();
        }
        var pet = new Pet(name);
        PetMaquina.setPet(pet);
        System.out.println("O pet " + pet.getName() + " está na Máquina!");
    }
}
