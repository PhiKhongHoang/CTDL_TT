// length: trả về độ dài mảng
// clone(): tạo 1 bản sao của mảng
public class Array {
    public static void main(String[] args) {
        // khai báo mảng số nguyên
        int []numbers;
        // khởi tạo mảng với kích thước 5
        numbers = new int[5];

        // khai báo và khởi tạo mảng với kích thước là 3
        int []number = new int[3];

        // khai báo và khởi tạo mảng với giá trị ban đầu
        int []nums = {1, 2, 3};

        // khai báo mảng và khởi tạo từ mảng có sẵn
        int []copyNumbers = numbers.clone();

        // mảng 2 chiều
        int [][]matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    }
}
