package HeThongVeSo;

import java.time.LocalDateTime;

public class HoSoNhanThuong {
    private String maHoSo;
    private YeuCauNhanThuong yeuCauNhanThuong;
    private String hoTenNguoiNhan;
    private String soGiayTo;
    private String loaiGiayTo;
    private LocalDateTime thoiGianTiepNhan;

    public HoSoNhanThuong(String maHoSo,YeuCauNhanThuong yeuCauNhanThuong,String hoTenNguoiNhan,String soGiayTo,String loaiGiayTo) {
        this.maHoSo = maHoSo;
        this.yeuCauNhanThuong = yeuCauNhanThuong;
        this.hoTenNguoiNhan = hoTenNguoiNhan;
        this.soGiayTo = soGiayTo;
        this.loaiGiayTo = loaiGiayTo;
    }
    public boolean kiemTraThongTin() {
        if (yeuCauNhanThuong == null) {
            return false;
        }
        if (hoTenNguoiNhan == null || hoTenNguoiNhan.trim().isEmpty()) {
            return false;
        }
        if (soGiayTo == null || soGiayTo.trim().isEmpty()) {
            return false;
        }
        if (loaiGiayTo == null || loaiGiayTo.trim().isEmpty()) {
            return false;
        }
        return true;
    }
    public boolean kiemTraVe() {
        if (yeuCauNhanThuong == null) {
            return false;
        }
        KetQuaTrungThuong ketQua = yeuCauNhanThuong.getKetQuaTrungThuong();
        if (ketQua == null) {
            return false;
        }
        return ketQua.coTheNhanThuong();
    }
    public boolean xacMinh() {
        if (!kiemTraThongTin()) {
            return false;
        }
        if (!kiemTraVe()) {
            return false;
        }
        if (!yeuCauNhanThuong.coTheXuLy()) {
            return false;
        }
        thoiGianTiepNhan = LocalDateTime.now();
        return yeuCauNhanThuong.xacNhanHoSo();
    }
    public LocalDateTime getThoiGianTiepNhan() {
        return thoiGianTiepNhan;
    }
}
