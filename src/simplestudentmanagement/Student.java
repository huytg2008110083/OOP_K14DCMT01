package simplestudentmanagement;

public class Student {
    String mssv;
    String tenSinhVien;
    String lop;
    String Khoa;
    String Nganh;
    String diemTB;

    //method/function
    //constuctor: phuong thức đặt biệt
    public Student() {
    }
    public Student(String name, String mssv) {
        tenSinhVien = name;
        this.mssv = mssv;
    }
    void show(){
        System.out.println("mã sv: " + mssv);
        System.out.println("ten sinh vien: " + tenSinhVien);
        System.out.println("Điểm TB"+ diemTB);
    }
    void hoc(){
        System.out.println("Hoc....");

    }
    void thamGiaHoatDong(){
        System.out.println("Tham gia hoat dong....");
        
    }
    void phatBieu(){
        System.out.println("phat bieu....");
        
    }
    void thi(){
        System.out.println("thi ");
    }
}


