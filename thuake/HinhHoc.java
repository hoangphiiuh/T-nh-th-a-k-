package thuake;

/**
 * Lớp trừu tượng HinhHoc
 * Tính trừu tượng: Định nghĩa phương thức trừu tượng getDienTich mà các lớp con phải triển khai.
 */
public abstract class HinhHoc {
    // Tính đóng gói: Thuộc tính 'ten' được bảo vệ bằng phạm vi protected, có thể truy cập từ các lớp con.
    protected String ten;

    /**
     * Constructor để khởi tạo thuộc tính 'ten'.
     * @param ten Tên của hình học
     */
    public HinhHoc(String ten) {
        this.ten = ten;
    }

    /**
     * Phương thức trừu tượng để tính diện tích.
     * Các lớp con phải cung cấp cài đặt cụ thể cho phương thức này.
     * @return Diện tích của hình học
     */
    public abstract double getDienTich();
}