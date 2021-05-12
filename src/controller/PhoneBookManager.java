package controller;

import model.PhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookManager {
    private List<PhoneBook>phoneBooks = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);


    public PhoneBookManager() {
    }
PhoneBook phoneBook = new PhoneBook();
    //them danh ba
    public void addPhoneBook(){
        System.out.println("Mời nhập lần lượt các thông tin dưới đây");
        System.out.println("Số điện thoại cần tạo");
        String numberPhone;
        do {
            numberPhone = sc.next();
            if(!checknumberPhoneSake(numberPhone)) System.out.println("Số nay đã tồn tại mời nhập lại");
        }while (!checknumberPhoneSake(numberPhone));
      phoneBooks.add(phoneBook);
    }
//checck danh ba
    private boolean checknumberPhoneSake(String numberPhone) {
        boolean check = true;
        for (PhoneBook phoneBook:phoneBooks
        ) {
            if(phoneBook.getNumberphone().equals(numberPhone))
                check = false;
        }
        return check;
    }

    //thay doi thong tin theo so dien thoai
public void setPhoneBooks(){
    System.out.println("Mời số điện thoại cần sửa");
    String phoneNumber = sc.nextLine();
    for (int i = 0; i < phoneBooks.size(); i++) {
        if(phoneBook.getNumberphone().equals(phoneNumber)){
            boolean loop = true;
            while (loop){
                System.out.println("Mời nhập lựa chọn \n 1. Thay đổi so dien thoai  \n 2. Thay đổi ten" +
                        " \n 3. thay doi dia chi \n 4. thay doi email \n 5.thay doi facebook \n 6.thoat");
                int choose = sc.nextInt();
                switch (choose){
                    case 1:
                        System.out.println("Mời nhập số điện thoại mới ");
                        String newnumberPhone;
                        do {
                            newnumberPhone = sc.next();
                            if(!checknumberPhoneSake( newnumberPhone))
                                System.out.println("Số điên thoai đã tồn tại mời nhập lai");
                        }while (!checknumberPhoneSake( newnumberPhone));
                        phoneBook.setNumberphone(newnumberPhone);
                        break;
                    case 2:
                        System.out.println("Mời bạn nhập tên mới ");
                        phoneBook.setName(sc.nextLine());
                        break;
                    case 3:
                        System.out.println("Mời bạn thay đổi địa chỉ");
                      phoneBook.setAddress(sc.nextLine());
                        break;
                    case 4:
                        String email;
                        System.out.println("Nhập email mới");
                        do {
                            email = sc.next();
                            if(!CheckInput.validate(email)) System.out.println("Nhập sai định dạng email mời nhập lại");
                        }while (!CheckInput.validate(email));
                      phoneBook.getEmail(sc.nextLine());
                        break;
                    case  5:
                        System.out.println("Mời bạn nhập fabook mơi ");
                        phoneBook.setNameFacebook(sc.nextLine());
                        break;
                    case 6:
                        loop = false;
                        break;
                    default:
                        System.out.println("Nhập sai lựa chọn rồi mời nhập lại!!!");
                        break;

                }
            }
        }
    }
}
   // xoa danh ba
   public void remotePhoneBook(){
       System.out.println("nhập số điện thoại cần xoá");
       String phoneNumber = sc.nextLine();
       for (int i = 0; i < phoneBooks.size(); i++) {
           if(phoneBooks.get(i).getNumberphone().equals(phoneNumber)){
               phoneBooks.remove(phoneBooks.get(i));
           }
       }
   }
//hien thi danh ba
public void showPhoneBook(){
    System.out.println(phoneBooks);
}
// quanlydanhba
public void phoneBookMenu(){
            boolean loop = true;
            while (loop){
                System.out.println("Mời lựa chọn: \n 1. Thêm danh ba \n 2. Sửa thông tin danh ba \n 3. Xoá danh ba theo sdt" +
                        "\n 4.Hien thi thong tin danh ba  \n 5.Thoát ra ngoài");
                int choose = sc.nextInt();
                switch (choose){
                    case 1:
                        addPhoneBook();
                        break;
                    case 2:
                       setPhoneBooks();
                        break;
                    case 3:
                        remotePhoneBook();
                        break;
                    case 4:
                        showPhoneBook();
                        break;
                    case 5:
                        loop=false;
                        break;
                    default:
                        System.out.println("Nhập sai lựa chọn rồi mời nhập lại!!!");
                        break;
                }
            }
    }
}


