package HeThongVeSo;

import TrangThai.TrangThaiSanPham;
import java.util.HashSet;
public class SanPham {
	private String maSanPham;
	private String tenSanPham;
	private long giaVe;
	private int soLuongSo;
	private int soNhoNhat;
	private int soLonNhat;
	private TrangThaiSanPham trangthai;

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

	public String getMaSanPham() {
		return maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public long getGiaVe() {
		return giaVe;
	}

	public int getSoLuongSo() {
		return soLuongSo;
	}

	public int getSoNhoNhat() {
		return soNhoNhat;
	}

	public int getSoLonNhat() {
		return soLonNhat;
	}

	public TrangThaiSanPham getTrangthai() {
		return trangthai;
	}

	// kiểm tra một bộ số có phù hợp với quy định của sản phẩm hay không
	public boolean kiemTraBoSoHopLe(int[] boSo) {
		 if (boSo == null || boSo.length != soLuongSo) {
		        return false;
		    }

		    HashSet<Integer> daCo = new HashSet<>();

		    for (int so : boSo) {
		        if (so < soNhoNhat || so > soLonNhat) {
		            return false;
		        }

		        if (!daCo.add(so)) {
		            return false;
		        }
		    }

		    return true;

	}

	public void kichHoat() {
		 if (trangthai == TrangThaiSanPham.TAM_NGUNG) {
		        trangthai = TrangThaiSanPham.DANG_HOAT_DONG;
		    }
	}

//tạm thới không cho sản phẩm được sử dụng, nhưng vẫn có thể kích hoạt lại
	public void tamNgung() {
		if (trangthai == TrangThaiSanPham.DANG_HOAT_DONG) {
	        trangthai = TrangThaiSanPham.TAM_NGUNG;
	    }
	}

//trạng thái kết thúc, không kích hoạt lại
	public void ngungHoatDong() {
		 if (trangthai == TrangThaiSanPham.DANG_HOAT_DONG
		            || trangthai == TrangThaiSanPham.TAM_NGUNG) {
		        trangthai = TrangThaiSanPham.NGUNG_HOAT_DONG;
		    }
	}
}
