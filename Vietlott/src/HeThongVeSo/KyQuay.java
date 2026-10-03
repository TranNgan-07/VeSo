package HeThongVeSo;

import java.time.LocalDateTime;

import TrangThai.TrangThaiKyquay;

public class KyQuay {
	private String maKYQuay;
	private SanPham sanPham;
	private LocalDateTime thoigianMoBan;
	private LocalDateTime thoiGianDongBan;
	private LocalDateTime thoiGianQuay;
	TrangThaiKyquay trangThai;
	public KyQuay(String maKYQuay, SanPham sanPham, LocalDateTime thoigianMoBan, LocalDateTime thoiGianDongBan,
			LocalDateTime thoiGianQuay, TrangThaiKyquay trangThai) {
		super();
		this.maKYQuay = maKYQuay;
		this.sanPham = sanPham;
		this.thoigianMoBan = thoigianMoBan;
		this.thoiGianDongBan = thoiGianDongBan;
		this.thoiGianQuay = thoiGianQuay;
		this.trangThai = trangThai;
	}
	public boolean moBan() {
		return false;
		
	}
	public boolean dongBan() {
		return false;
		
	}
	public boolean coTheBanVe() {
		return false;
		
	}
}
