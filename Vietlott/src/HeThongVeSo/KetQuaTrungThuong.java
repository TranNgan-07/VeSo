package HeThongVeSo;

import TrangThai.TrangThaiTrungThuong;

public class KetQuaTrungThuong {
    private String maKetQuaTrungThuong;
    private VeSo veSo;
    private KyQuay kyQuay;
    private GiaiThuong giaiThuong;
    private int soLuongSoTrung;
    private long soTienDuKien;
    private TrangThaiTrungThuong trangThai;

    public KetQuaTrungThuong(String maKetQuaTrungThuong, VeSo veSo, KyQuay kyQuay, GiaiThuong giaiThuong,
			int soLuongSoTrung, long soTienDuKien, TrangThaiTrungThuong trangThai) {
		super();
		this.maKetQuaTrungThuong = maKetQuaTrungThuong;
		this.veSo = veSo;
		this.kyQuay = kyQuay;
		this.giaiThuong = giaiThuong;
		this.soLuongSoTrung = soLuongSoTrung;
		this.soTienDuKien = soTienDuKien;
		this.trangThai = trangThai;
	}
    public boolean xacNhanTrungThuong() {
        if (veSo == null || kyQuay == null) {
            return false;
        }

        if (giaiThuong == null) {
            trangThai = TrangThaiTrungThuong.KHONG_TRUNG_THUONG;
            soTienDuKien = 0;
            return true;
        }

        if (soLuongSoTrung == giaiThuong.getSoLuongSoTrung()) {
            trangThai = TrangThaiTrungThuong.TRUNG_THUONG;
            tinhSoTienDuKien();
        } else {
            trangThai = TrangThaiTrungThuong.KHONG_TRUNG_THUONG;
            soTienDuKien = 0;
        }

        return true;
    }

    public long tinhSoTienDuKien() {
        if (trangThai != TrangThaiTrungThuong.TRUNG_THUONG
                || giaiThuong == null) {
            soTienDuKien = 0;
            return 0;
        }

        soTienDuKien = giaiThuong.getSoTienThuong();
        return soTienDuKien;
    }

    public boolean coTheNhanThuong() {
        return trangThai == TrangThaiTrungThuong.TRUNG_THUONG;
    }
}
