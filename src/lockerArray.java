public class lockerArray {
    // Main method
    public static void main(String[] args) {
        String[] lockers = new String[100];

        //Close all the lockers
        AllLockersClosed(lockers);

        //Invoke the studentLockerChanges method
        studentLockerChanges(lockers);

        //Display all open locker numbers
        Print(lockers);

    }

    // isOpen return true if l is the string "OPEN". Otherwise false
    public static boolean isOpen(String l){
        return l == "OPEN";
    }

    // closeAllLockers fills the array with the string "CLOSED"
    public static void AllLockersClosed(String[] lockers){
        for (int k = 0; k < lockers.length; k++){
            lockers[k] = "CLOSED";
        }
    }
    // studentLockerChanges changes the string in each element from "CLOSED" to "OPEN" or vice versa
    public static void studentLockerChanges(String[] lockers){
        int start = 0; // Locker student begins with
        for (int r = 1; r <= lockers.length; r++){
            for (int l = 0; l < lockers.length; l += r){
                if (isOpen(lockers[l]))
                        lockers[l] = "CLOSED";
                else
                        lockers[l] = "OPEN";
            }
            start++;
        }
    }
    // Print displays all open locker numbers separated by exactly one space
    public static void Print(String[] lockers){
        for (int k = 0; k < lockers.length; k++){
            if (isOpen(lockers[k])){
                    System.out.print("L" + (k + 1) + " ");
            }
        }
        System.out.println();
    }
}

