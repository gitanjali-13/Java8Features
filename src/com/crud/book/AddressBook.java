package com.crud.book;

import java.util.*;

public class AddressBook {
    Scanner scanner ;
    ArrayList<Book> list = new ArrayList<>();
    public static void main(String[] args) {

        AddressBook ab = new AddressBook();
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        while (choice != 4){
            System.out.println("Enter choice : \n1.Insert name :\n2.Display :\n3.Edit Name :\n4.exit\n");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    ab.insertName();
                    break;
                case 2:
                    ab.display();
                    break;
                case 3:
                    ab.editName();
                default:
                    break;
            }
        }
    }
    public void insertName(){
        scanner = new Scanner(System.in);
        System.out.println("Insert name : ");
        String name = scanner.nextLine();
        System.out.println("Insert author name :");
        String author = scanner.nextLine();
        list.add(new Book(name,author));


    }

    public void display(){
        System.out.println(list+"\n");
//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
    }
    private void editName(){
        scanner= new Scanner(System.in);
        System.out.println("Enter book name to edit book name :");
        String editName = scanner.next();
        Book book = getBook(editName);



    }
    private Book getBook(String editName){
        Iterator itr = list.iterator();
        Book book;
        while (itr.hasNext()){
            for (int i = 0; i< list.size();i++){
                book =(Book)itr.next();
                if (book.name.equalsIgnoreCase(editName)){
                    return book;
                }
            }
        }

        return null;
    }
}
