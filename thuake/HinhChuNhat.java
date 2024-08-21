package thuake;

/**
 * Lớp HinhChuNhat kế thừa từ lớp HinhHoc
 * Tính thừa kế: Kế thừa thuộc tính 'ten' và phương thức từ lớp cha HinhHoc.
 */
public class HinhChuNhat extends HinhHoc {
    private double chieuDai;
    private double chieuRong;

    /**
     * Constructor để khởi tạo thuộc tính 'ten', 'chieuDai' và 'chieuRong'.
     * @param ten Tên của hình chữ nhật
     * @param chieuDai Chiều dài của hình chữ nhật
     * @param chieuRong Chiều rộng của hình chữ nhật
     * @throws IllegalArgumentException nếu 'chieuDai' hoặc 'chieuRong' nhỏ hơn hoặc bằng 0.
     */
    public HinhChuNhat(String ten, double chieuDai, double chieuRong) {
        super(ten);
        if (chieuDai <= 0) {
            throw new IllegalArgumentException("Chiều dài của hình chữ nhật phải lớn hơn 0.");
        }
        if (chieuRong <= 0) {
            throw new IllegalArgumentException("Chiều rộng của hình chữ nhật phải lớn hơn 0.");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    /**
     * Cài đặt phương thức getDienTich để tính diện tích hình chữ nhật.
     * @return Diện tích của hình chữ nhật
     */
    @Override
    public double getDienTich() {
        return chieuDai * chieuRong;
    }
}