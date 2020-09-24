import java.util.LinkedList;

public class AddressBook{
    private LinkedList<BuddyInfo> addressBook;

    public AddressBook(){
        addressBook = new LinkedList<>();

    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom",17);
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addBuddy(buddy);
        addressBook1.addBuddy(new BuddyInfo("Tim",17));
        addressBook1.printName();
        addressBook1.removeBuddy(buddy);
    }

    private void addBuddy(BuddyInfo buddy){
        addressBook.add(buddy);
    }

    private void removeBuddy(BuddyInfo buddy){
        addressBook.remove(buddy);
    }

    private void printName(){
        for (BuddyInfo buddy: addressBook
             ) {
            System.out.println(buddy.getName());
        }
    }
}