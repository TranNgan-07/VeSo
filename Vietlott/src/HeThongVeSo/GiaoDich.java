package HeThongVeSo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import TrangThai.TrangThaiGiaoDich;

public class GiaoDich {
    private String maGiaoDich;
    private DiemBan diemBan;
    private LocalDateTime thoiGianGiaoDich;
    private long tongTien;
    private TrangThaiGiaoDich trangThai;
    private List<ChiTietGiaoDich> danhSachChiTiet;

    public GiaoDich(String maGiaoDich, DiemBan diemBan) {
        this.maGiaoDich = maGiaoDich;
        this.diemBan = diemBan;
        this.thoiGianGiaoDich = LocalDateTime.now();
        this.tongTien = 0;
        this.trangThai = TrangThaiGiaoDich.CHO_XU_LY;
        this.danhSachChiTiet = new ArrayList<>();
    }
    public boolean themChiTiet(ChiTietGiaoDich chiTiet) {
        if (chiTiet == null) {
            return false;
        }
        if (trangThai == TrangThaiGiaoDich.DA_HUY) {
            return false;
        }
        VeSo veSo = chiTiet.getVeSo();
        if (veSo == null || !veSo.kiemTraHopLe()) {
            return false;
        }
        if (diemBan != veSo.getDiemBan()) {
            return false;
        }
        danhSachChiTiet.add(chiTiet);
        tinhTongTien();
        return true;
    }
    public long tinhTongTien() {
        tongTien = 0;
        for (ChiTietGiaoDich chiTiet : danhSachChiTiet) {
            if (chiTiet != null) {
                tongTien += chiTiet.tinhThanhTien();
            }
        }
        return tongTien;
    }
    public boolean xacNhanGiaoDich() {
        if (trangThai != TrangThaiGiaoDich.CHO_XU_LY) {
            return false;
        }
        if (danhSachChiTiet.isEmpty()) {
            return false;
        }
        trangThai = TrangThaiGiaoDich.DA_XAC_NHAN;
        return true;
    }
    public boolean huyGiaoDich() {
        if (trangThai != TrangThaiGiaoDich.CHO_XU_LY) {
            return false;
        }
        trangThai = TrangThaiGiaoDich.DA_HUY;
        return true;
    }
    public long getTongTien() {
        return tongTien;
    }
    public TrangThaiGiaoDich getTrangThai() {
        return trangThai;
    }
    public List<ChiTietGiaoDich> getDanhSachChiTiet() {
        return danhSachChiTiet;
    }
}
