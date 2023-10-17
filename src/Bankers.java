import java.util.Scanner;

public class Bankers {
    public void menu() {
        System.out.println("\n\t\t!!Bankers Algorithm!!");
        System.out.println("\n\t\t1. Accept");
        System.out.println("\n\t\t2. Display");
        System.out.println("\n\t\t3. Safe Sequence");
        System.out.println("\n\t\t4. Enter Request");
        System.out.println("\n\t\t5. Exit");
    }

    void accept(int[][] a, int p, int r) {
        int i, j;
        for (i = 0; i < p; i++) {
            for (j = 0; j < r; j++) {
                System.out.println("\nEnter Resource R" + (j + 1) + " allocated to Process P" + (i + 1) + " : ");
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
    }

    void display(int[][] a, int p, int r) {
        int i, j;
        for (i = 0; i < r; i++) {
            System.out.println("R" + i);
            for (j = 0; j < p; j++) { // Changed 'i' to 'j'
                System.out.println("\n\t P" + j);
                for (int k = 0; k < r; k++) {
                    System.out.println("\t" + a[j][k]);
                }
            }
        }
    }

    void acceptTotal(int[] total, int r) {
        int i;
        for (i = 0; i < r; i++) {
            System.out.println("\nEnter total R" + (i + 1) + " : ");
            total[i] = new Scanner(System.in).nextInt();
        }
    }

    void displayTotal(int[] total, int r) {
        int i;
        System.out.println("\n\t");
        for (i = 0; i < r; i++) {
            System.out.println("\tR" + i);
            System.out.println("\n\t");
            System.out.println("\t" + total[i]);
        }
    }

    void calculateNeed(int[][] need, int[][] max, int[][] allocation, int p, int r) {
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                need[i][j] = max[i][j] - allocation[i][j];
            }
        }
    }

    void calAvailable(int[] available, int[] total, int[][] allocation, int p, int r) {
        for (int j = 0; j < r; j++) {
            int sum = 0;
            for (int i = 0; i < p; i++) {
                sum = sum + allocation[i][j];
            }
            available[j] = total[j] - sum;
        }
    }

    int safeSequence(int[] available, int[][] need, int[][] allocation, int p, int r) {
        int[] seq = new int[p];
        int[] work = new int[r];
        int i, j, flag = 0, k = 0;
        int[] finish = new int[p];
        for (i = 0; i < r; i++) {
            work[i] = available[i];
        }
        while (flag == 0) {
            flag = 1;
            for (i = 0; i < p; i++) {
                if (finish[i] == 0) {
                    for (j = 0; j < r; j++) {
                        if (need[i][j] > work[j]) {
                            break;
                        }
                    }
                    if (j == r) {
                        for (j = 0; j < r; j++) {
                            work[j] = work[j] + allocation[i][j];
                        }
                        finish[i] = 1;
                        flag = 0;
                        seq[k++] = i;
                    }
                }
            }
        }

        if (k == p) {
            System.out.println("\n\t\tSystem is in Safe Sequence & Safe Sequence is : ");
            for (i = 0; i < p; i++) {
                System.out.println("\tP" + seq[i]);
            }
            return 1;
        }
        return 0;
    }

    void request(int[][] all, int[][] max, int[][] need, int[] available, int p, int r) {
        int i, j, pid, flag = 0;
        int[] req = new int[r];
        System.out.println("\n\t\tEnter Process ID : ");
        pid = new Scanner(System.in).nextInt();
        for (i = 0; i < r; i++) {
            System.out.println("\n\t\tEnter Request for R" + (i + 1) + " : ");
            req[i] = new Scanner(System.in).nextInt();
        }
        for (i = 0; i < r; i++) {
            if (req[i] > need[pid][i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("\n\t\tRequest Exceeds Max Need");
        } else {
            for (i = 0; i < r; i++) {
                if (req[i] > available[i]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("\n\t\tResources are not available");
            } else {
                for (i = 0; i < r; i++) {
                    available[i] = available[i] - req[i];
                    all[pid][i] = all[pid][i] + req[i];
                    need[pid][i] = need[pid][i] - req[i];
                }
                flag = safeSequence(available, need, all, p, r);
                if (flag == 0) {
                    System.out.println("\n\t\tRequest can't be granted");
                    for (i = 0; i < r; i++) {
                        available[i] = available[i] + req[i];
                        all[pid][i] = all[pid][i] - req[i];
                        need[pid][i] = need[pid][i] + req[i];
                    }
                } else {
                    System.out.println("\n\t\tRequest Granted");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] all = new int[40][40];
        int[][] max = new int[40][40];
        int[][] need = new int[40][40];
        int p = 0, r = 0;
        int[] available = new int[40];
        int[] total = new int[40];
        int ch = 0, x;

        while (ch != 5) {
            Bankers b = new Bankers();
            b.menu();
            System.out.println("\n\t\tEnter your choice : ");
            ch = new Scanner(System.in).nextInt();
            switch (ch) {
                case 1:
                    System.out.println("\n\t\tEnter the number of processes : ");
                    p = new Scanner(System.in).nextInt();
                    System.out.println("\n\t\tEnter the number of resources : ");
                    r = new Scanner(System.in).nextInt();
                    all = new int[p][r];
                    max = new int[p][r];
                    need = new int[p][r];
                    b.accept(all, p, r);
                    b.accept(max, p, r);
                    b.acceptTotal(total, r);
                    b.calculateNeed(need, max, all, p, r);
                    b.calAvailable(available, total, all, p, r);
                    break;
                case 2:
                    b.display(all, p, r);
                    b.display(max, p, r);
                    b.displayTotal(total, r);
                    b.display(need, p, r);
//                    b.display(available, p, r);
                    break;
                case 3:
                    x = b.safeSequence(available, need, all, p, r);
                    if (x == 0) {
                        System.out.println("\n\t\tSystem is in Unsafe State");
                    } else {
                        System.out.println("\n\t\tSystem is in Safe State");
                    }
                    break;
                case 4:
                    b.request(all, max, need, available, p, r);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\t\tInvalid Choice");
            }
        }
    }
}
