public class Konkat {
    public static void main(String[] args) {
        char x[] = {'U', 's', 'c'};
        char y[] = {'h', 'i'};
        char[] z = verbinden(x, y); 
        System.out.println(z);

    }

    public static char[] verbinden(char[] f1, char[] f2) {
        int Laenge = f1.length + f2.length;
        char[] z = new char[Laenge];

        for (int i = 0; i < f1.length; i++) {
            z[i] = f1[i];
        }
        for (int i = 0; i < f2.length; i++) {
            z[f1.length + i] = f2[i];
        }
        
        return z;
    }
}