public class Dictionary_generic_test {
    public static void main(String[] args) {
        Dictionary_generic<String, String> d1 = new Dictionary_generic<>("Hello", "Xin chao");
        System.out.println(d1.toString());

        Dictionary_generic<String, String>[] tuDien = new Dictionary_generic[10];
        tuDien[0] = new Dictionary_generic<>("Hi", "Xin chao");
        tuDien[1] = new Dictionary_generic<>("Tobii", "Xin chao 1");
        tuDien[2] = new Dictionary_generic<>("ktn3_group", "Xin chao 2");
        tuDien[3] = new Dictionary_generic<>("Khong", "Xin chao 3");

        for(int i=0; i<4; i++) {
            System.out.println(tuDien[i].toString());
        }

        Dictionary_generic<Integer, Character> d2 = new Dictionary_generic<>(65, 'A');
        System.out.println(d2);
    }
}
