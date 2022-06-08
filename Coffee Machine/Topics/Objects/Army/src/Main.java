class Army {

    public static void createArmy() {
        // Create all objects here
        General custer = new General("Custer");
        Doctor doctor = new Doctor("Einstein");
        Knight knight1 = new Knight("Knight1");
        Knight knight2 = new Knight("Knight2");
        Knight knight3 = new Knight("Knight3");
        Unit unit1 = new Unit("Soldier1");
        Unit unit2 = new Unit("Soldier2");
        Unit unit3 = new Unit("Soldier3");
        Unit unit4 = new Unit("Soldier4");
        Unit unit5 = new Unit("Soldier5");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}