package HeThongVeSo;

import java.time.LocalDateTime;

import TrangThai.TrangThaiVe;

public class VeSo {
	private String maVe;
	private SanPham sanPham;
	private KyQuay kyQuay;
	private DiemBan diemBan;
	private int[] boSo;
	private long giaVe;
	private LocalDateTime thoiGianMua;
	TrangThaiVe trangThai;
	public VeSo(String maVe, SanPham sanPham, KyQuay kyQuay, DiemBan diemBan, int[] boSo, long giaVe,
			LocalDateTime thoiGianMua, TrangThaiVe trangThai) {
		super();
		this.maVe = maVe;
		this.sanPham = sanPham;
		this.kyQuay = kyQuay;
		this.diemBan = diemBan;
		this.boSo = boSo;
		this.giaVe = giaVe;
		this.thoiGianMua = thoiGianMua;
		this.trangThai = trangThai;
	}
	public boolean kiemTraHopLe() {
		return false;
		
	}
	public boolean huyVe() {
		return false;
		
	}
	public boolean coTheThamGiaQuay() {
		return false;
		
	}
}
