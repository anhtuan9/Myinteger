public class Myinteger {
    private int value;

    public Myinteger() {
        this.value = 0;
    }

    public Myinteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isOdd() {
        if (value % 2 != 0) {
            return true;
        }
        return false;
    }

    public boolean isPrime() {
        if (value < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isEven(int i) {
        if (i % 2 == 0) {
            return true;
        }
        return false;
    }

    static boolean isOdd(int i) {
        if (i % 2 != 0) {
            return true;
        }
        return false;
    }

    static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;

    }

    static boolean isEven(Myinteger i) {
        if (i.value % 2 == 0) {
            return true;
        }
        return false;
    }

    static boolean isOdd(Myinteger i) {
        if (i.value % 2 != 0) {
            return true;
        }
        return false;
    }

    static boolean isPrime(Myinteger a) {
        if (a.value < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(a.value); i++) {
            if (a.value % i == 0) {
                return false;
            }
        }
        return true;

    }

    public boolean equals(int i) {
        if (i == value) {
            return true;
        }
        return false;
    }

    public boolean equals(Myinteger e) {
        if (e.value == value) {
            return true;
        }
        return false;
    }

    static int[] Parselnt(char[] e) {
        int[] a = new int[e.length];
        for (int i = 0; i < e.length; i++) {
            a[i] = (int) e[i];
        }
        return a;
    }

    static int Parselnt(String e) {
        return Integer.parseInt(e);
    }
}

