public class BanhoMaquina {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;

    private Pet pet;





    public void takeashower(){
        if (this.pet == null) {
            System.out.println("❌ Não há nenhum pet na máquina para dar banho!");
            return;
        }
        if (this.water < 10 || this.shampoo < 2) {
            System.out.println("❌ Sem recursos suficientes para realizar o banho.");
            return;
        }
        if (this.clean){
            this.water -= 10;
            this.shampoo -= 2;
            pet.setClean(true);
            System.out.println("🧼 " + pet.getName() + " tomou banho e está limpo!");
        }else {
            System.out.println("maquina não está limpa restire o pet e limpe");
        }

    }
    public void wash(){
        if (this.clean) {
            System.out.println("👍 A máquina já está limpa.");
            return;
        }

        if (this.water < 3 || this.shampoo < 1) {
            System.out.println("❌ Recursos insuficientes para limpar a máquina! (Requer 3L de Água e 1L de Shampoo)");
            return;
        }

        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;
        System.out.println("✨ Máquina limpa com sucesso e pronta para o próximo pet!");
    }
    public void addwater() {
        if (water == 30) {
            System.out.println("Maquina está no maximo de agua");
            return;
        }
        water += 3;
    }
    public void addshampoo() {
        if (shampoo == 10) {
            System.out.println("Maquina está no maximo de shamppom");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean haspet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A maquina está suja, para colocar o pet é necessario limpa-la");
        }
        if (haspet()){
            System.out.println("O pet " + this.pet.getName() + "está na maquina nesse momento");
            return;
        }
        this.pet = pet;
    }
    public void removePet(){
        if (!haspet()) {
            System.out.println("❌ Não há nenhum pet na máquina para retirar.");
            return;
        }
        if (!this.pet.isClean()) {
            this.clean = false;
            System.out.println("⚠️ O pet saiu sujo! "+pet.getName()+" A máquina precisa ser limpa antes do próximo.");
        } else  {
            System.out.println("👋 Pet " + this.pet.getName() + " retirado com sucesso e limpo.");
        }
        this.pet = null;
    }




}
