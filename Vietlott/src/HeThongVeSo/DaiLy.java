package HeThongVeSo;

import TrangThai.TrangThaiDaiLy;

public class DaiLy {
	private String maDaiLy;
	private String tenDaiLy;
	private String diaChi;
	private String soDienThoai;
	TrangThaiDaiLy trangThai;
	
	 public DaiLy(String maDaiLy, String tenDaiLy, String diaChi, String soDienThoai, TrangThaiDaiLy trangThai) {
		super();
		this.maDaiLy = maDaiLy;
		this.tenDaiLy = tenDaiLy;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.trangThai = trangThai;
	}

	public boolean kichHoat() {
		return false;
		
	}
	 public boolean tamNgung() {
		return false;
		 
	 }
	 public boolean ngungHoatDong() {
		return false;
		 
	 }

}
