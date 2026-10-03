package HeThongVeSo;

import java.util.List;

public class QuyTacGiaiThuong {
	private String maQuyTac;
	private String tenQuyTac;
	private SanPham sanPham;
	List<GiaiThuong> danhSachGiaiThuong;
	public QuyTacGiaiThuong(String maQuyTac, String tenQuyTac, SanPham sanPham) {
		super();
		this.maQuyTac = maQuyTac;
		this.tenQuyTac = tenQuyTac;
		this.sanPham = sanPham;
	}
	public boolean themGiaiThuong(GiaiThuong giaiThuong) {
		return false;
		
	}
	public boolean xoaGiaiThuong(String maGiaiThuong) {
		return false;
		
	}
	public GiaiThuong timGiaiThuong(String maGiaiThuong) {
		return null;
		
	}
}
