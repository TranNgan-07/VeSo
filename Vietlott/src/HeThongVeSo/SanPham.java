package HeThongVeSo;

import TrangThai.TrangThaiSanPham;

public class SanPham {
	private String maSanPham;
	private String tenSanPham;
	private long giaVe;
	private int soLuongSo;
	private int soNhoNhat;
	private int soLonNhat;
	TrangThaiSanPham trangthai;
	public SanPham(String maSanPham, String tenSanPham, long giaVe, int soLuongSo, int soNhoNhat, int soLonNhat,
			TrangThaiSanPham trangthai) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.giaVe = giaVe;
		this.soLuongSo = soLuongSo;
		this.soNhoNhat = soNhoNhat;
		this.soLonNhat = soLonNhat;
		this.trangthai = trangthai;
	}
	//kiểm tra một bộ số có phù hợp với quy định của sản phẩm hay không
public boolean kiemTraBoSoHopLe(int[] boSo) {
	return false;
	
}
public void kichHoat() {
	
}
//tạm thới không cho sản phẩm được sử dụng, nhưng vẫn có thể kích hoạt lại
public void tamNgung() {
	
}
//trạng thái kết thúc, không kích hoạt lại
public void ngungHoatDong() {
	
}
}
