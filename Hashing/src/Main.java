
public class Main {
    static int[] keys = {1234, 8234, 7867, 1009, 5438, 4312, 3420, 9487, 5418, 5299,
            5078, 8239, 1208, 5098, 5195, 5329, 4543, 3344, 7698, 5412,
            5567, 5672, 7934, 1254, 6091, 8732, 3095, 1975, 3843, 5589,
            5439, 8907, 4097, 3096, 4310, 5298, 9156, 3895, 6673, 7871,
            5787, 9289, 4553, 7822, 8755, 3398, 6774, 8289, 7665, 5523};
            //{20, 34, 45, 70, 56};
// {50, 700, 76, 85, 92, 73, 101};

    public static void main(String[] args) {
        System.out.println("Keys Length : " + keys.length);

       /* HF1(keys);

        HF2(keys);*/

        //HF3(keys);

       // HF4(keys);
        HF5(keys);


    }

    private static void HF2(int[] keys) {
        int[][] Table = new int[keys.length][2];
        System.out.println("Table Length : " + Table.length);
        for (int key : keys) {
            int modPosition = (key % keys.length);
            //System.out.println(key + " - " + modPosition);
            if (Table[modPosition][0] == 0) {
                // Table[modPosition] = new int[2];
                Table[modPosition][0] = key;
                Table[modPosition][1] = 0;
            } else {
                int prob = 0;
                int newPosition = modPosition;
                int i = 0;
                while (Table[newPosition][0] != 0) {
                    prob++;
                    i++;
                    newPosition = modPosition + (i * i);
                    if (newPosition >= keys.length) {
                        newPosition = newPosition % keys.length;
                    }
                }
                Table[newPosition][0] = key;
                Table[newPosition][1] = prob;
            }
        }

        System.out.println(" ------ Displaying ------");
        displayArray(Table);

        //Add all probes

        addProbes(Table);
    }

    private static void displayArray(int[][] Table) {
        for (int i = 0; i < Table.length; i++) {
            System.out.println("Index - " + i + ", Key - " + Table[i][0] + ", Probes - " + Table[i][1]);
        }
    }

    public static void HF1(int[] keys) {
        int[][] Table = new int[keys.length][2];
        System.out.println("Table Length : " + Table.length);
        for (int key : keys) {
            int modPosition = (key % keys.length);
            //System.out.println(key + " - " + modPosition);
            if (Table[modPosition][0] == 0) {
                // Table[modPosition] = new int[2];
                Table[modPosition][0] = key;
                Table[modPosition][1] = 0;
            } else {
                int prob = 0;
                int index = modPosition;
                while (Table[index][0] != 0) {
                    prob++;
                    index++;
                    if (index == Table.length) {
                        index = 0;
                    }
                }
                Table[index][0] = key;
                Table[index][1] = prob;
            }
        }


        System.out.println(" ------ Displaying ------");
        displayArray(Table);

        //Add all probes

        addProbes(Table);


    }

    private static void addProbes(int[][] Table) {
        int totalOfProbes = 0;
        for (int i = 0; i < Table.length; i++) {
            totalOfProbes = totalOfProbes + Table[i][1];
        }
        System.out.println("Sum of probe values = " + totalOfProbes + " probes");
    }

    private static void HF3(int[] keys) {
        int[][] Table = new int[keys.length][2];

        System.out.println("Table Length : " + Table.length);
        for (int key : keys) {
            int firstHash = (key % Table.length);
            if (Table[firstHash][0] == 0) {
                // Table[modPosition] = new int[2];
                Table[firstHash][0] = key;
                Table[firstHash][1] = 0;
            } else {
                // calculate second hash
                int finalIndex = firstHash;
                int index = 0;

                int secondHash = 30 - (key % 25);
                while (index <= 50 && Table[finalIndex][0] != 0) {
                    index++;
                    finalIndex = (firstHash + (index * secondHash)) % Table.length;

                }
                if (Table[finalIndex][0] == 0) {
                    Table[finalIndex][0] = key;
                    Table[finalIndex][1] = index;
                } else if (index >= 50) {
                    System.out.println("Unable to hash key " + key + " to the table");
                }


            }
        }
        System.out.println(" ------ Displaying ------");
        displayArray(Table);

        addProbes(Table);
    }

    private static int proposedHashFunction4(int key) { //using linear probing 187
        int[] primes = {2,3,5,7,11,13,17,21,23,27,31,37,41,43};
        int hashValue = 0;
        String stringKey = "" + key;
        for(int i = stringKey.length() - 1; i >= 0; i--) {
            int intAtPosition =  stringKey.charAt(i) - '0';
            hashValue +=  intAtPosition * primes[i % primes.length];
        }
        return hashValue % 50;
    }

    private static void HF4(int[] keys) {
        int[][] Table = new int[keys.length][2];

        System.out.println("Table Length : " + Table.length);
        for (int key : keys) {
            int firstHash = (key % 47);
            if (Table[firstHash][0] == 0) {
                // Table[modPosition] = new int[2];
                Table[firstHash][0] = key;
                Table[firstHash][1] = 0;
            } else {
                // calculate second hash
                int finalIndex = firstHash;
                int index = 0;

                int secondHash = 23 - (key % 11);
                while (index <= 50 && Table[finalIndex][0] != 0) {
                    index++;
                    finalIndex = (firstHash + (index * secondHash)) % Table.length;

                }
                if (Table[finalIndex][0] == 0) {
                    Table[finalIndex][0] = key;
                    Table[finalIndex][1] = index;
                } else if (index >= 50) {
                    System.out.println("Unable to hash key " + key + " to the table");
                }


            }
        }
        System.out.println(" ------ Displaying ------");
        displayArray(Table);

        addProbes(Table);
    }

    private static void HF5(int[] keys) {
        int[][] Table = new int[keys.length][2];

        System.out.println("Table Length : " + Table.length);
        for (int key : keys) {
            int firstHash = proposedHashFunction4(key);
            System.out.println("Index :" + firstHash +" for key : " + key);
            if (Table[firstHash][0] == 0) {
                // Table[modPosition] = new int[2];
                Table[firstHash][0] = key;
                Table[firstHash][1] = 0;
            } else {
                // calculate second hash
                int finalIndex = firstHash;
                int index = 0;

                int secondHash = 29 - (key % 30);
                while (index <= 50 && Table[finalIndex][0] != 0) {
                    index++;
                    finalIndex = (firstHash + (index * secondHash)) % Table.length;

                }
                if (Table[finalIndex][0] == 0) {
                    Table[finalIndex][0] = key;
                    Table[finalIndex][1] = index;
                } else if (index >= 50) {
                    System.out.println("Unable to hash key " + key + " to the table");
                }


            }
        }
        System.out.println(" ------ Displaying ------");
        displayArray(Table);

        addProbes(Table);
    }
}