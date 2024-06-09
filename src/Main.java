import java.io.Serializable;
import java.lang.classfile.instruction.SwitchCase;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudenRun strun = new StudenRun();
        SinhVien sv;
        System.out.println("xin moi chon menu");
        System.out.println("1. Add student.\n" +
                "2. Edit student by id\n" +
                "3. Delete student by id\n" +
                "4. Sort student by gpa.\n" +
                "5. Show student.\n" +
                "6. .ghi file\n" +
                "7. .Doc file\n" +
                "0. Exit.");
        int n = -1;
        do {
            System.out.println("Lua chon cua ban");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    sv = new SinhVien();
                    strun.addStudent(sv);
                    break;
                case 2:

                    int idEdit;
                    System.out.println("Nhap id can sua");
                    idEdit = sc.nextInt();
                    sc.nextLine();
                    if (idEdit < strun.getListSv().size()) {
                        String nameEdit;
                        nameEdit = sc.nextLine();
                        strun.sua(idEdit, nameEdit);
                    } else System.out.println("ko sua duoc");

                    break;
                case 3:
                    int id;
                    System.out.println("Nhap id can xoa");
                    id = sc.nextInt();
                    if (id < strun.getListSv().size()) {
                        strun.delete(strun.getListSv().get(id));
                        System.out.println("Xoa thanh cong");
                    } else {
                        System.out.println("khong co sinh vien trong danh sach");
                    }
                    break;

                case 4:
                    strun.xapSep();
                    strun.xuat();
                    break;
                case 5:

                    strun.xuat();
                    break;

                case 6:
                    strun.ghiFile(strun.getListSv());
                    break;
                case 7:
                    strun.docFile();
                    break;
            }

        } while (n != 0);
        System.out.println("CHuong trinh ket thuc");
    }
}