package HeThongVeSo;

import java.util.List;
import java.util.ArrayList;
public class QuyTacGiaiThuong {
	private String maQuyTac;
	private String tenQuyTac;
	private SanPham sanPham;
	private List<GiaiThuong> danhSachGiaiThuong;
	public QuyTacGiaiThuong(String maQuyTac, String tenQuyTac, SanPham sanPham) {
		super();
		this.maQuyTac = maQuyTac;
		this.tenQuyTac = tenQuyTac;
		this.sanPham = sanPham;
		this.danhSachGiaiThuong = new ArrayList<>();
		
	}
	public boolean themGiaiThuong(GiaiThuong giaiThuong) {
		if (giaiThuong == null) {
			return false;
		}

		if (timGiaiThuong(giaiThuong.getMaGiaiThuong()) != null) {
			return false;
		}

		return danhSachGiaiThuong.add(giaiThuong);
		
	}
	public boolean xoaGiaiThuong(String maGiaiThuong) {
		GiaiThuong giaiThuong = timGiaiThuong(maGiaiThuong);

		if (giaiThuong == null) {
			return false;
		}

		return danhSachGiaiThuong.remove(giaiThuong);
		
	}
	public GiaiThuong timGiaiThuong(String maGiaiThuong) {
		
		for (GiaiThuong giaiThuong : danhSachGiaiThuong) {
			if (giaiThuong.getMaGiaiThuong().equals(maGiaiThuong)) {
				return giaiThuong;
			}
		}

		return null;
		
	}
}
