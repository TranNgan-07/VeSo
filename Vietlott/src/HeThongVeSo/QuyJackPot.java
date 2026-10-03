package HeThongVeSo;

import java.time.LocalDateTime;

public class QuyJackPot {
	private String maQuyJackPot;
	private SanPham sanPham;
	private long soTienHienTai;
	private LocalDateTime thoiGianCapNhat;
	public QuyJackPot(String maQuyJackPot, SanPham sanPham, long soTienHienTai, LocalDateTime thoiGianCapNhat) {
		super();
		this.maQuyJackPot = maQuyJackPot;
		this.sanPham = sanPham;
		this.soTienHienTai = soTienHienTai;
		this.thoiGianCapNhat = thoiGianCapNhat;
	}
	public void congTien(long soTien) {
		soTienHienTai += soTien;
	}
	public void truTien(long soTien) {
		
	}
	public long laySoTienHienTai() {
		return soTienHienTai;
		
	}
}
