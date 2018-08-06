package pl.pwlctk.tasks.program;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        InstructionLoader instructionLoader = new InstructionLoader("(\\d+)\\s+([A-Z]+)\\s+(.*)");
        List<Instruction> instructions = instructionLoader.loadInstructionsFromDisk();

        System.out.println("Lista wszystkich instrukcji:");
        System.out.println(instructions);

        //Ewaluator instrukcji PRINT, metoda statyczna, bo chyba tak jest wygodniej
        Print.printer(instructions.get(1));
    }
}
