import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class StudenRun {
    private ArrayList<SinhVien> listSv = new ArrayList<>();

    public StudenRun() {
        listSv = new ArrayList<>();
    }

    public ArrayList<SinhVien> getListSv() {
        return listSv;
    }

    public void setListSv(ArrayList<SinhVien> listSv) {
        this.listSv = listSv;
    }

    public ArrayList addStudent(SinhVien sv) {
        sv.nhap();

        listSv.add(sv);
        return listSv;
    }

    public void xuat() {
        System.out.println(listSv);
    }

    public boolean delete(SinhVien sv) {
        boolean isFound = false;
        int size = listSv.size();
        for (int i = 0; i < size; i++) {
            if (listSv.get(i).getId() == sv.getId()) {
                sv = listSv.get(i);
                isFound = true;
                break;
            }
        }
        if (isFound) {
            listSv.remove(sv);
            return true;
        }
        return false;
    }

    public void xapSep() {
        Collections.sort(listSv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiemTb() > o2.getDiemTb()) {
                    return 1;
                }
                return -1;
            }
        });
    }

    public void sua(int index, String name) {

        listSv.get(index).setName(name);
    }

    public void ghiFile(ArrayList<SinhVien> dsst) {
        try {
            FileOutputStream fileOut = new FileOutputStream("dssv.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(dsst);
            objectOut.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void docFile() {
        ArrayList<SinhVien> list = new ArrayList<>();
        try {
            FileInputStream fin = new FileInputStream("dssv.dat");
            ObjectInputStream objectIn = new ObjectInputStream(fin);
            Object objlistsv = objectIn.readObject();
            objectIn.close();
            list.addAll((ArrayList<SinhVien>) objlistsv);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
}
