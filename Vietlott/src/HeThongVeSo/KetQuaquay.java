package HeThongVeSo;

public class KetQuaquay {
	private String maKetQua;
	private KyQuay kyQuay;
	private int[] boSoTrungThuong;
	public KetQuaquay(String maKetQua, KyQuay kyQuay, int[] boSoTrungThuong) {
		super();
		this.maKetQua = maKetQua;
		this.kyQuay = kyQuay;
		this.boSoTrungThuong = boSoTrungThuong;
	}
	public boolean kiemTraBoSoHopLe() {
		if (kyQuay == null || boSoTrungThuong == null) {
			return false;
		}

		return kyQuay.getSanPham().kiemTraBoSoHopLe(boSoTrungThuong);
		
	}
}
