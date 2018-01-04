Public class Asterisk4 {
    public static void main(String[] args) {
        int n = 5;
        int x = 1;
        String s = "*";

        while (x<n+1) {
            String sr = new String(new char[x]).replace("\0", "*");
            System.out.println(sr);
            x++;
        }
    }
}