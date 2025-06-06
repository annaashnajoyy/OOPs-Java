/*
 * Program: CPU Details with Inner Classes
 * 
 * This program defines a Cpu class with price attribute,
 * an inner Processor class with core count and manufacturer,
 * and a static inner Ram class with memory size and manufacturer.
 * It takes user input to create objects and displays the details.
 */

import java.util.Scanner;

class Cpu {
    private int price;

    public Cpu(int price) {
        this.price = price;
        System.out.println("CPU Price: " + this.price);
    }

    public class Processor {
        private int core;
        private String manuf;

        Processor(int core, String manuf) {
            this.core = core;
            this.manuf = manuf;
            System.out.println("No. of Cores: " + this.core);
            System.out.println("Processor Manufacturer: " + this.manuf);
        }
    }

    public static class Ram {
        private int memory;
        private String manufa;

        public Ram(int memory, String manufa) {
            this.memory = memory;
            this.manufa = manufa;
            System.out.println("Memory Size: " + this.memory + " GB");
            System.out.println("RAM Manufacturer: " + this.manufa);
        }
    }
}

public class CpuDetails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Price of CPU: ");
        int price = in.nextInt();

        System.out.print("Enter No. of Cores: ");
        int core = in.nextInt();
        in.nextLine();

        System.out.print("Enter Processor Manufacturer: ");
        String manuf = in.nextLine();

        System.out.print("Enter Memory (GB): ");
        int mem = in.nextInt();
        in.nextLine();

        System.out.print("Enter RAM Manufacturer: ");
        String manufa = in.nextLine();

        Cpu c1 = new Cpu(price);
        Cpu.Processor p1 = c1.new Processor(core, manuf);
        Cpu.Ram r1 = new Cpu.Ram(mem, manufa);

        in.close();
    }
}
