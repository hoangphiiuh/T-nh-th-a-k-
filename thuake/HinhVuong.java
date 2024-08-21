package thuake;

/**
 * Lớp HinhVuong kế thừa từ lớp HinhHoc
 * Tính thừa kế: Kế thừa thuộc tính 'ten' và phương thức từ lớp cha HinhHoc.
 */
public class HinhVuong extends HinhHoc {
    private double canh;

    /**
     * Constructor để khởi tạo thuộc tính 'ten' và 'canh'.
     * @param ten Tên của hình vuông
     * @param canh Chiều dài cạnh của hình vuông
     * @throws IllegalArgumentException nếu giá trị 'canh' nhỏ hơn hoặc bằng 0.
     */
    public HinhVuong(String ten, double canh) {
        super(ten);
        if (canh <= 0) {
            throw new IllegalArgumentException("Cạnh của hình vuông phải lớn hơn 0.");
        }
        this.canh = canh;
    }

    /**
     * Cài đặt phương thức getDienTich để tính diện tích hình vuông.
     * @return Diện tích của hình vuông
     */
    @Override
    public double getDienTich() {
        return canh * canh;
    }
}