package HeThongVeSo;

import java.time.LocalDateTime;

import TrangThai.TrangThaiDaiLy;
import TrangThai.TrangThaiDiemBan;
import TrangThai.TrangThaiKyquay;
import TrangThai.TrangThaiSanPham;
import TrangThai.TrangThaiTrungThuong;
import TrangThai.TrangThaiVe;

public class Main {
    public static void main(String[] args) {
        System.out.println("       TEST HE THONG VE SO");
        // 1. TẠO ĐẠI LÝ
        System.out.println("\n--- 1. TEST DAI LY ---");
        DaiLy daiLy = new DaiLy("DL01","Dai ly Sai Gon","TP. Ho Chi Minh", "0901234567",TrangThaiDaiLy.DANG_HOAT_DONG);
        
        System.out.println("Trang thai dai ly: " + daiLy.getTrangThai());
        System.out.println("Tam ngung: " + daiLy.tamNgung());
        System.out.println("Trang thai: " + daiLy.getTrangThai());
        System.out.println("Kich hoat lai: " + daiLy.kichHoat());
        System.out.println("Trang thai: " + daiLy.getTrangThai());

        // 2. TẠO ĐIỂM BÁN
        System.out.println("\n--- 2. TEST DIEM BAN ---");
        DiemBan diemBan = new DiemBan("DB01","Diem ban Ben Thanh","Quan 1, TP.HCM","0912345678",daiLy,TrangThaiDiemBan.DANG_HOAT_DONG);

        System.out.println("Co the ban ve: " + diemBan.coTheBanVe());
        System.out.println("Tam ngung diem ban: " + diemBan.tamNgung());
        System.out.println("Co the ban ve: " + diemBan.coTheBanVe());
        System.out.println("Kich hoat diem ban: " + diemBan.kichHoat());
        System.out.println("Co the ban ve: " + diemBan.coTheBanVe());

        // 3. TẠO SẢN PHẨM
        System.out.println("\n--- 3. TEST SAN PHAM ---");
        SanPham sanPham = new SanPham("SP01","Ve so 6/45",10000,6,1,45,TrangThaiSanPham.DANG_HOAT_DONG);

        int[] boSo = {5, 12, 18, 23, 31, 40};
        System.out.println("Bo so hop le: " + sanPham.kiemTraBoSoHopLe(boSo));

        // 4. TẠO KỲ QUAY
        System.out.println("\n--- 4. TEST KY QUAY ---");
        LocalDateTime moBan = LocalDateTime.now().minusHours(2);
        LocalDateTime dongBan = LocalDateTime.now().plusHours(1);
        LocalDateTime thoiGianQuay = LocalDateTime.now().plusHours(2);
        KyQuay kyQuay = new KyQuay("KQ01",sanPham,moBan,dongBan,thoiGianQuay,TrangThaiKyquay.CHUA_MO_BAN);

        System.out.println("Mo ban: " + kyQuay.moBan());
        System.out.println("Co the ban ve: " + kyQuay.coTheBanVe());
        System.out.println("Dong ban: " + kyQuay.dongBan());
        System.out.println("Trang thai ky quay: " + kyQuay.getTrangThai());

        // 5. TẠO VÉ SỐ
        System.out.println("\n--- 5. TEST VE SO ---");
        // Để kiểm tra vé hợp lệ trong khoảng mở/đóng bán
        LocalDateTime thoiGianMua = LocalDateTime.now().minusMinutes(30);

        VeSo veSo = new VeSo("VE01",sanPham,kyQuay,diemBan,boSo,10000,thoiGianMua,TrangThaiVe.HOP_LE);

        System.out.println("Ma ve: " + veSo.getMaVe());
        System.out.println("Ve hop le: " + veSo.kiemTraHopLe());
        System.out.println("Co the tham gia quay: " + veSo.coTheThamGiaQuay());

        // 6. GIAO DỊCH
        System.out.println("\n--- 6. TEST GIAO DICH ---");
        GiaoDich giaoDich = new GiaoDich("GD01", diemBan);
        
        ChiTietGiaoDich chiTiet = new ChiTietGiaoDich("CT01",veSo,10000);

        System.out.println("Them chi tiet: " + giaoDich.themChiTiet(chiTiet));
        System.out.println("Tong tien: " + giaoDich.tinhTongTien());
        System.out.println("Xac nhan giao dich: " + giaoDich.xacNhanGiaoDich());
        System.out.println("Trang thai giao dich: " + giaoDich.getTrangThai());

        // 7. GIẢI THƯỞNG
        System.out.println("\n--- 7. TEST GIAI THUONG ---");
        GiaiThuong giaiThuong = new GiaiThuong("GT01","Giai nhat",6,100000000);

        KetQuaTrungThuong ketQua = new KetQuaTrungThuong("KQTT01",veSo,kyQuay,giaiThuong,6,0,TrangThaiTrungThuong.KHONG_TRUNG_THUONG);

        System.out.println("Xac nhan trung thuong: " + ketQua.xacNhanTrungThuong());
        System.out.println("Trang thai trung thuong: " + ketQua.getTrangThai());
        System.out.println("So tien du kien: " + ketQua.tinhSoTienDuKien());

        // 8. YÊU CẦU NHẬN THƯỞNG
        System.out.println("\n--- 8. TEST YEU CAU NHAN THUONG ---");
        YeuCauNhanThuong yeuCau = new YeuCauNhanThuong("YC01",ketQua);

        System.out.println("Tao yeu cau: " + yeuCau.taoYeuCau());
        System.out.println("Trang thai yeu cau: " + yeuCau.getTrangThai());
        System.out.println("So tien yeu cau: " + yeuCau.getSoTienYeuCau());

        // 9. HỒ SƠ NHẬN THƯỞNG
        System.out.println("\n--- 9. TEST HO SO NHAN THUONG ---");
        HoSoNhanThuong hoSo = new HoSoNhanThuong( "HS01", yeuCau, "Nguyen Van A","079123456789", "CCCD");

        System.out.println("Kiem tra thong tin: " + hoSo.kiemTraThongTin());
        System.out.println("Kiem tra ve: " + hoSo.kiemTraVe());
        System.out.println("Xac minh ho so: " + hoSo.xacMinh());
        System.out.println("Trang thai yeu cau sau xac minh: " + yeuCau.getTrangThai());

        // 10. DUYỆT YÊU CẦU
        System.out.println("\n--- 10. DUYET YEU CAU ---");
        System.out.println("Duyet yeu cau: "
                + yeuCau.duyetYeuCau());
        System.out.println("Trang thai yeu cau: "
                + yeuCau.getTrangThai());

        // 11. THANH TOÁN
        System.out.println("\n--- 11. TEST THANH TOAN ---");
        ThanhToanThuong thanhToan = new ThanhToanThuong("TT01",yeuCau,"Tien mat");

        System.out.println("Thuc hien thanh toan: " + thanhToan.thucHienThanhToan());
        System.out.println("Da thanh toan: " + thanhToan.daThanhToan());
        System.out.println("So tien thanh toan: " + thanhToan.getSoTienThanhToan());
        System.out.println("Trang thai thanh toan: " + thanhToan.getTrangThai());
    }
}