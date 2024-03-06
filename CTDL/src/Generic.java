// dùng ký tự ? để chỉ ra một kiểu dữ liệu không chính xác trong generic
/**
 * Các kiểu tham số thông dng
 * T - type (kiểu dữ liệu bất kì thuộc wrapper class: String, Interger, Long, Float, ...)
 * E - element(phần tử - được sử dụng phổ biến trong conllection framework
 * K - key(khóa)
 * V - value(giá trị)
 * N - number(kiểu số: INterger, Float, Double)
 * U, S, I, G, .... tùy người dùng đặt
 * */
public class Generic {
    public static <T> double tinhTBC(T[] arr) {
        double tong = 0;
        for(int i=0; i<arr.length; i++) {
            double value = Double.valueOf(arr[i] + "");
            tong += value;
        }
        return tong/arr.length;
    }

    public static void main(String[] args) {
        Integer[] arrInt = {5, 10, 15};
        System.out.println("TBC int: " + tinhTBC(arrInt));

        Float[] arrFloat = {1.5f, 4.5f};
        System.out.println("TBC int: " + tinhTBC(arrFloat));


        String[] arrString = {"5", "10", "15"};
        System.out.println("TBC int: " + tinhTBC(arrString));
    }
}
