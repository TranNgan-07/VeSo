package HeThongVeSo;

import java.time.LocalDateTime;

import TrangThai.TrangThaiKyquay;

public class KyQuay {
	private String maKyQuay;
	private SanPham sanPham;
	private LocalDateTime thoigianMoBan;
	private LocalDateTime thoiGianDongBan;
	private LocalDateTime thoiGianQuay;
	private TrangThaiKyquay trangThai;
	public KyQuay(String maKyQuay, SanPham sanPham, LocalDateTime thoigianMoBan, LocalDateTime thoiGianDongBan,
			LocalDateTime thoiGianQuay, TrangThaiKyquay trangThai) {
		super();
		this.maKyQuay = maKyQuay;
		this.sanPham = sanPham;
		this.thoigianMoBan = thoigianMoBan;
		this.thoiGianDongBan = thoiGianDongBan;
		this.thoiGianQuay = thoiGianQuay;
		this.trangThai = trangThai;
	}
	public boolean moBan() {
		if (trangThai == TrangThaiKyquay.CHUA_MO_BAN) {
			trangThai = TrangThaiKyquay.DANG_MO_BAN;
			return true;
		}

		return false;
		
	}
	public String getMaKyQuay() {
		return maKyQuay;
	}
	public void setMaKyQuay(String maKyQuay) {
		this.maKyQuay = maKyQuay;
	}
	public boolean dongBan() {
		if (trangThai == TrangThaiKyquay.DANG_MO_BAN) {
			trangThai = TrangThaiKyquay.DA_DONG_BAN;
			return true;
		}

		return false;
		
	}
	public LocalDateTime getThoigianMoBan() {
		return thoigianMoBan;
	}
	public LocalDateTime getThoiGianDongBan() {
		return thoiGianDongBan;
	}
	public LocalDateTime getThoiGianQuay() {
		return thoiGianQuay;
	}
	public TrangThaiKyquay getTrangThai() {
		return trangThai;
	}
	public boolean coTheBanVe() {
		return trangThai == TrangThaiKyquay.DANG_MO_BAN;
		
	}
	public SanPham getSanPham() {
		return sanPham;
	}
	
	
	
}
