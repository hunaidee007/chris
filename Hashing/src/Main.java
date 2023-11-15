
public class Main {
    static int[] keys = {1234, 8234, 7867, 1009, 5438, 4312, 3420, 9487, 5418, 5299,
            5078, 8239, 1208, 5098, 5195, 5329, 4543, 3344, 7698, 5412,
            5567, 5672, 7934, 1254, 6091, 8732, 3095, 1975, 3843, 5589,
            5439, 8907, 4097, 3096, 4310, 5298, 9156, 3895, 6673, 7871,
            5787, 9289, 4553, 7822, 8755, 3398, 6774, 8289, 7665, 5523};
// {50, 700, 76, 85, 92, 73, 101};

    public static void main(String[] args) {
        System.out.println("Keys Length : " + keys.length);

        //HF1(keys);

        HF2(keys);


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
}