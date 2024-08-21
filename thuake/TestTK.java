package thuake;

/**
 * Lớp DemoTK để chạy thử các lớp HinhVuong và HinhChuNhat.
 */
public class TestTK {
    public static void main(String[] args) {
        try {
            // Tạo đối tượng HinhVuong và HinhChuNhat
            HinhHoc hinhVuong = new HinhVuong("Hình Vuông", 5.0);
            HinhHoc hinhChuNhat = new HinhChuNhat("Hình Chữ Nhật", 4.0, 6.0);

            // Hiển thị diện tích của các hình
            System.out.println(hinhVuong.ten + " có diện tích: " + hinhVuong.getDienTich());
            System.out.println(hinhChuNhat.ten + " có diện tích: " + hinhChuNhat.getDienTich());
            
            // Thử tạo hình với giá trị không hợp lệ
            HinhHoc hinhVuongSai = new HinhVuong("Hình Vuông Sai", -2.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}