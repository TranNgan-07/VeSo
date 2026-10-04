package HeThongVeSo;

import java.time.LocalDateTime;

import TrangThai.TrangThaiKyquay;
import TrangThai.TrangThaiVe;

public class VeSo {
	private String maVe;
	private SanPham sanPham;
	private KyQuay kyQuay;
	private DiemBan diemBan;
	private int[] boSo;
	private long giaVe;
	private LocalDateTime thoiGianMua;
	private TrangThaiVe trangThai;
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
		if (sanPham == null || kyQuay == null || diemBan == null
				|| boSo == null || thoiGianMua == null) {
			return false;
		}
		if (trangThai != TrangThaiVe.HOP_LE) {
			return false;
		}

		if (sanPham != kyQuay.getSanPham()) {
			return false;
		}

		if (giaVe != sanPham.getGiaVe()) {
			return false;
		}

		if (!sanPham.kiemTraBoSoHopLe(boSo)) {
			return false;
		}

		if (thoiGianMua.isBefore(kyQuay.getThoigianMoBan())
				|| thoiGianMua.isAfter(kyQuay.getThoiGianDongBan())) {
			return false;
		}

		return true;
	}
	public boolean huyVe() {
		if (trangThai == TrangThaiVe.HOP_LE) {
			trangThai = TrangThaiVe.DA_HUY;
			return true;
		}

		return false;
		
	}
	public boolean coTheThamGiaQuay() {
		if (!kiemTraHopLe()) {
			return false;
		}

		return kyQuay.getTrangThai() == TrangThaiKyquay.DA_DONG_BAN;
		
	}
}
