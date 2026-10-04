package HeThongVeSo;

public class GiaiThuong {
	private String maGiaiThuong;
	private String tenGiaiThuong;
	private int soLuongSoTrung;
	private long soTienThuong;
	public GiaiThuong(String maGiaiThuong, String tenGiaiThuong, int soLuongSoTrung, long soTienThuong) {
		super();
		this.maGiaiThuong = maGiaiThuong;
		this.tenGiaiThuong = tenGiaiThuong;
		this.soLuongSoTrung = soLuongSoTrung;
		this.soTienThuong = soTienThuong;
		
	}
	public String getMaGiaiThuong() {
		return maGiaiThuong;
	}
	public int getSoLuongSoTrung() {
	    return soLuongSoTrung;
	}

	public long getSoTienThuong() {
	    return soTienThuong;
	}
}
